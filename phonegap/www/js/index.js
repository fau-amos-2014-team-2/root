/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
var app = {
    targetUrl: null,
    contentFrame: null,
    // Application Constructor
    initialize: function() {
        this.bindEvents();
        this.contentFrame = document.querySelector("iframe.content-frame");
    },
    // Bind Event Listeners
    //
    // Bind any events that are required on startup. Common events are:
    // 'load', 'deviceready', 'offline', and 'online'.
    bindEvents: function() {
        document.addEventListener('deviceready', this.onDeviceReady, false);
    },
    // deviceready Event Handler
    //
    // The scope of 'this' is the event. In order to call the 'receivedEvent'
    // function, we must explicity call 'app.receivedEvent(...);'
    onDeviceReady: function() {
        app.receivedEvent('deviceready');
    },
    connectToTarget: function(isReconnect) {
        cordova.exec(function (url) {
            app.connectToPage(url, isReconnect);
        }, function() {
            var statusElement = document.querySelector('body .status');
            var textElement = statusElement.querySelector(".text");
            var spinnerElement = statusElement.querySelector(".spinner");
            textElement.innerText = "Einstellungen unvollständig";
            spinnerElement.style.visibility = "hidden";
        }, "settingsBundle", "getTargetUrl", []);
    },
    connectToPage: function(url, isReconnect) {
        var statusElement = document.querySelector('body .status');
        var textElement = statusElement.querySelector(".text");
    
        if (!isReconnect) {
            textElement.innerText = "Verbinden";
        }
    
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status != 0) {
                app.contentFrame.setAttribute("src", url);
                app.contentFrame.setAttribute("style", "display: block");
                app.monitorConfig();
            }
        };
    
        xhr.open("GET", url, true);
        xhr.timeout = 5000;
        xhr.ontimeout = function() {
            if (isReconnect)
                textElement.innerText = "Server wird immer noch nicht erreicht\n" + url
            else
                textElement.innerText = "Server wird nicht erreicht\n" + url;
            app.connectToTarget(true);
        }
        xhr.onerror = function() {
            if (isReconnect)
                textElement.innerText = "Immer noch Fehler beim Herstellen der Verbindung\n" + url
            else
                textElement.innerText = "Fehler beim Herstellen der Verbindung\n" + url;
                
            setTimeout('app.connectToTarget(true)', 5000);
        }
        xhr.send();
    },
    monitorConfig: function() {
        var statusElement = document.querySelector('body .status');
        var textElement = statusElement.querySelector(".text");
        var spinnerElement = statusElement.querySelector(".spinner");
        
        cordova.exec(function (url) {
            if (url != app.targetUrl) {
                app.contentFrame.setAttribute("style", "display: none");
                statusElement.setAttribute("style", "display: block");
                textElement.innerText = "Einstellungen geändert…";
                app.connectToPage(url, false);
                app.targetUrl = url;
            }
            else {
                setTimeout('app.monitorConfig()', 5000);
            }
        }, function() {
            app.contentFrame.setAttribute("style", "display: none");
            statusElement.setAttribute("style", "display: block");
            textElement.innerText = "Einstellungen fehlerhaft";
            spinnerElement.style.visibility = "hidden";
        }, "settingsBundle", "getTargetUrl", []);
    },
    marginForIpad: function() {
        this.contentFrame.style.marginTop = "10px";
    },
    // Update DOM on a Received Event
    receivedEvent: function(id) {
        if (id = 'deviceready') {
            app.connectToTarget(false);
        }
        
        if (navigator.userAgent.toLowerCase().match(/ipad/)) {
            app.marginForIpad();
        }

        console.log('Received Event: ' + id);
    }
};
app.connectToTarget(false);