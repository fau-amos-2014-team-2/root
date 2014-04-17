package com.vaadin.addon.touchkit.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class VTouchKitResources_std_safari_default_InlineClientBundleGenerator implements com.vaadin.addon.touchkit.gwt.client.VTouchKitResources {
  private static VTouchKitResources_std_safari_default_InlineClientBundleGenerator _instance0 = new VTouchKitResources_std_safari_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.vaadin.addon.touchkit.gwt.client.theme.ParkingStyles() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".v-generated-body,.v-app{width:" + ("100%")  + ";height:" + ("100%")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";overflow:" + ("hidden")  + ";}.v-widget{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";text-align:" + ("right")  + ";display:" + ("inline-block")  + ";white-space:") + (("normal")  + ";vertical-align:" + ("bottom")  + ";font-size:" + ("16px")  + ";line-height:" + ("normal")  + ";}.v-absolutelayout-wrapper{position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";}.v-absolutelayout-margin,.v-absolutelayout-canvas{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-absolutelayout.v-has-height>div,.v-absolutelayout.v-has-height>div>div,.v-app{height:" + ("100%")  + ";}.v-absolutelayout.v-has-width>div,.v-absolutelayout.v-has-width>div>div{width:" + ("100%") ) + (";}.v-accordion{position:" + ("relative")  + ";outline:" + ("none")  + ";overflow:" + ("visible")  + ";text-align:" + ("right")  + ";}.v-accordion-item{position:" + ("relative")  + ";display:" + ("inline-block")  + ";width:" + ("100%")  + ";}.v-accordion-item-caption{overflow:" + ("visible")  + ";white-space:" + ("nowrap")  + ";background:" + ("#eee")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-accordion-item-caption .v-caption{cursor:" + ("pointer")  + ";font-size:" + ("16px")  + ";}.v-accordion-item-open .v-accordion-item-caption .v-caption{cursor:" + ("default")  + ";}.v-accordion-item-content{position:" + ("absolute")  + ";width:" + ("100%")  + ";}.v-nativebutton .v-icon{vertical-align:" + ("middle")  + ";margin-left:" + ("3px")  + ";border:" + ("none")  + ";}.v-nativebutton .v-errorindicator{display:" + ("inline-block")  + ";zoom:" + ("1") ) + (";vertical-align:" + ("middle")  + ";float:" + ("none")  + ";display:" + ("inline-block")  + ";zoom:" + ("1")  + ";float:" + ("none")  + ";}.v-nativebutton-link{border:" + ("none")  + ";text-align:" + ("right")  + " !important;background:" + ("transparent")  + ";padding:" + ("0")  + ";color:" + ("inherit")  + ";-khtml-user-select:") + (("text")  + ";-moz-user-select:" + ("text")  + ";-ie-user-select:" + ("text")  + ";user-select:" + ("text")  + ";}.v-nativebutton-link .v-nativebutton-caption{text-decoration:" + ("underline")  + ";color:" + ("inherit")  + ";text-align:" + ("right")  + ";}.v-nativebutton{text-align:" + ("center")  + " !important;cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";margin:" + ("0") ) + (";color:" + ("inherit")  + ";font:" + ("inherit")  + ";line-height:" + ("normal")  + ";}.v-nativebutton .v-nativebutton-caption{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";font:" + ("inherit")  + ";color:" + ("inherit")  + ";}.v-nativebutton .v-icon{vertical-align:" + ("middle")  + ";margin-left:" + ("3px")  + ";}.v-checkbox{display:" + ("block")  + ";vertical-align:") + (("middle")  + ";white-space:" + ("nowrap")  + ";}.v-checkbox label,.v-checkbox input{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.v-checkbox .v-icon{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";margin:" + ("0"+ " " +"2px")  + ";}.v-checkbox .v-errorindicator{float:" + ("none")  + ";display:" + ("inline")  + ";display:" + ("inline-block")  + ";zoom:" + ("1") ) + (";}.v-captionwrapper{text-align:" + ("right")  + ";}.v-caption{overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";font-size:" + ("16px")  + ";}.v-errorindicator{display:" + ("inline-block")  + ";}.v-errorindicator:before{position:" + ("absolute")  + ";content:" + ("\"!\"")  + ";color:" + ("red")  + ";}.v-caption .v-icon{display:" + ("inline-block")  + ";padding-left:" + ("2px")  + ";vertical-align:") + (("middle")  + ";}.v-caption .v-captiontext{display:" + ("inline-block")  + ";overflow:" + ("hidden")  + ";vertical-align:" + ("middle")  + ";}.v-caption .v-required-field-indicator{display:" + ("inline-block")  + ";}e.v-app,.v-window,.v-popupview-popup,.v-label,.v-caption{cursor:" + ("default")  + ";}.v-ui{height:" + ("100%")  + ";width:" + ("100%")  + ";outline:" + ("none")  + ";position:" + ("relative")  + ";}.v-ui.v-ui-embedded{margin-top:" + ("-1px") ) + (";border-top:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";}.v-ui:active,.v-ui:focus,.v-datefield-calendarpanel:focus,.v-inline-datefield-calendarpanel:focus,.v-menubar:focus,.v-menubar-popup:focus,.v-menubar-popup .popupContent:focus,.v-menubar-popup .popupContent .v-menubar-submenu:focus{outline:" + ("none")  + ";}e.v-app select,.v-window select{margin:" + ("0")  + ";}.v-disabled{opacity:" + ("0.3")  + ";cursor:" + ("default")  + ";}.v-disabled *{cursor:" + ("default")  + ";}* html .v-disabled,*+html .v-disabled{zoom:" + ("1")  + ";}.v-disabled .v-disabled{opacity:" + ("1")  + ";}.v-required-field-indicator{padding-right:" + ("2px")  + ";color:" + ("red")  + ";}.v-form fieldset{border:") + (("none")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";height:" + ("100%")  + ";}.v-form-content{height:" + ("100%")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-tooltip{display:" + ("none")  + ";}.v-contextmenu .gwt-MenuItem{cursor:" + ("pointer")  + ";vertical-align:" + ("middle") ) + (";padding:" + ("0")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";}.v-contextmenu .gwt-MenuItem div{cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.v-contextmenu .gwt-MenuItem-selected div{background:" + ("#aaa")  + ";color:" + ("#fff")  + ";}.v-contextmenu table{border-collapse:" + ("collapse")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";}.v-contextmenu .gwt-MenuItem img{margin-left:" + ("1em")  + ";vertical-align:" + ("middle")  + ";}.v-label pre{margin:" + ("0")  + ";}.v-label-undef-w,div.v-layout.v-horizontal.v-widget{white-space:" + ("nowrap")  + ";}.v-label h1,.v-label h2,.v-label h3,.v-label h4,.v-label h5,.v-label h6{line-height:" + ("normal")  + ";}.v-drag-element{z-index:" + ("60000")  + ";position:" + ("absolute")  + " !important;opacity:" + ("0.5")  + ";cursor:" + ("default")  + ";}.v-clip{overflow:" + ("hidden") ) + (";}.v-scrollable{overflow:" + ("auto")  + ";line-height:" + ("normal")  + ";-webkit-overflow-scrolling:" + ("touch")  + ";}.v-overlay-container{width:" + ("0")  + ";height:" + ("0")  + ";}.v-gridlayout.v-layout-margin-top{padding-top:" + ("24px")  + ";}.v-gridlayout,.v-verticallayout,.v-horizontallayout{line-height:" + ("normal")  + ";}.v-gridlayout.v-layout-margin-bottom{padding-bottom:" + ("24px")  + ";}.v-gridlayout.v-layout-margin-left{padding-right:" + ("24px")  + ";}.v-gridlayout.v-layout-margin-right{padding-left:" + ("24px")  + ";}.v-gridlayout .v-layout-spacing-on{padding-right:") + (("12px")  + ";padding-top:" + ("12px")  + ";}.v-spacing{width:" + ("6px")  + ";height:" + ("6px")  + ";}.v-vertical,.v-horizontal{display:" + ("inline-block")  + ";}.v-layout.v-vertical>.v-expand,.v-layout.v-horizontal>.v-expand{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";}.v-slot,.v-spacing{display:" + ("inline-block") ) + (";white-space:" + ("normal")  + ";vertical-align:" + ("top")  + ";}.v-vertical>.v-slot:after{display:" + ("inline-block")  + ";clear:" + ("both")  + ";width:" + ("0")  + ";height:" + ("0")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";}.v-vertical>.v-slot,.v-vertical>.v-expand>.v-slot{display:" + ("block")  + ";clear:" + ("both")  + ";}.v-horizontal>.v-slot,.v-horizontal>.v-expand>.v-slot{height:") + (("100%")  + ";}.v-vertical>.v-spacing,.v-vertical>.v-expand>.v-spacing{width:" + ("0")  + ";display:" + ("block")  + ";clear:" + ("both")  + ";}.v-horizontal>.v-spacing,.v-horizontal>.v-expand>.v-spacing{height:" + ("0")  + ";}.v-align-middle:before,.v-align-bottom:before,.v-expand>.v-align-middle:before,.v-expand>.v-align-bottom:before{content:" + ("\"\"")  + ";display:" + ("inline-block")  + ";height:" + ("100%")  + ";vertical-align:" + ("middle")  + ";width:" + ("0")  + ";}.v-align-middle{white-space:" + ("nowrap") ) + (";vertical-align:" + ("middle")  + ";}.v-align-bottom,.v-caption-on-left,.v-caption-on-right{white-space:" + ("nowrap")  + ";}.v-align-middle>.v-widget{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";}.v-align-bottom>.v-widget,.v-has-caption,.v-has-caption>.v-caption{display:" + ("inline-block")  + ";}.v-align-bottom,.v-align-bottom>.v-widget{vertical-align:" + ("bottom")  + ";}.v-align-center{text-align:" + ("center")  + ";}.v-align-center>.v-widget{margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";}.v-align-right{text-align:" + ("left")  + ";}.v-align-right>.v-widget{margin-right:") + (("auto")  + ";}.v-caption{overflow:" + ("visible")  + ";vertical-align:" + ("middle")  + ";}.v-caption-on-top>.v-caption,.v-caption-on-bottom>.v-caption{display:" + ("block")  + ";}.v-caption-on-left>.v-caption{padding-left:" + ("0.5em")  + ";}.v-caption-on-right>.v-caption{vertical-align:" + ("top")  + ";}.v-caption-on-left>.v-widget,.v-caption-on-right>.v-widget{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";}.v-has-caption.v-has-width>.v-widget{width:" + ("100%")  + " !important;}.v-has-caption.v-has-height>.v-widget{height:" + ("100%")  + " !important;}.v-errorindicator{vertical-align:" + ("middle") ) + (";}div.v-csslayout{display:" + ("block")  + ";}.v-csslayout-margin,.v-csslayout-container,.v-datefield-popupcalendar input.v-datefield-textfield,.v-inline-datefield-popupcalendar input.v-inline-datefield-textfield{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-has-width>.v-csslayout-margin,.v-has-width>.v-csslayout-margin>.v-csslayout-container,.v-has-width>input.v-datefield-textfield,.v-datefield-calendarpanel table,.v-has-width>input.v-inline-datefield-textfield,.v-inline-datefield-calendarpanel table{width:" + ("100%")  + ";}.v-has-height>.v-csslayout-margin,.v-has-height>.v-csslayout-margin>.v-csslayout-container,.v-formlayout.v-has-height>table{height:" + ("100%")  + ";}.v-customcomponent,.v-customlayout{overflow:" + ("hidden")  + ";}.v-datefield{white-space:" + ("nowrap")  + ";display:" + ("inline-block")  + ";}.v-datefield-textfield{vertical-align:" + ("top")  + ";}.v-datefield-button{cursor:") + (("pointer")  + ";vertical-align:" + ("top")  + ";}.v-datefield-prompt .v-datefield-textfield{color:" + ("#999")  + ";font-style:" + ("italic")  + ";}.v-datefield .v-datefield-button-readonly{display:" + ("none")  + ";}.v-datefield-calendarpanel td,.v-inline-datefield-calendarpanel td{padding:" + ("2px")  + ";margin:" + ("0")  + ";}.v-datefield-calendarpanel-header td{text-align:" + ("center")  + ";}.v-datefield-calendarpanel-month{text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";}.v-datefield-calendarpanel-weeknumber{color:" + ("#999") ) + (";border-left:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";font-size:" + ("11.7px")  + ";}.v-datefield-calendarpanel-day{cursor:" + ("pointer")  + ";}.v-datefield-calendarpanel-day-today{cursor:" + ("pointer")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-disabled .v-datefield-calendarpanel-day,.v-disabled .v-datefield-calendarpanel-day-today{cursor:" + ("default")  + ";}.v-datefield-calendarpanel-day-disabled{cursor:" + ("default")  + ";opacity:" + ("0.5")  + ";}.v-datefield-calendarpanel-day-selected{cursor:" + ("default")  + ";background:" + ("#00a3e8")  + ";color:") + (("#fff")  + ";display:" + ("block")  + ";}.v-datefield-calendarpanel-day-offmonth{color:" + ("#666")  + ";}.v-datefield-time{white-space:" + ("nowrap")  + ";}.v-datefield-time .v-label{display:" + ("inline")  + ";}.v-datefield-popup{background:" + ("#fff")  + ";}.v-inline-datefield{white-space:" + ("nowrap")  + ";display:" + ("inline-block")  + ";}.v-inline-datefield-textfield{vertical-align:" + ("top")  + ";}.v-inline-datefield-button{cursor:" + ("pointer")  + ";vertical-align:" + ("top") ) + (";}.v-inline-datefield-prompt .v-inline-datefield-textfield{color:" + ("#999")  + ";font-style:" + ("italic")  + ";}.v-inline-datefield .v-inline-datefield-button-readonly{display:" + ("none")  + ";}.v-inline-datefield-calendarpanel-header td{text-align:" + ("center")  + ";}.v-inline-datefield-calendarpanel-month{text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";}.v-inline-datefield-calendarpanel-weeknumber{color:" + ("#999")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";font-size:" + ("11.7px")  + ";}.v-inline-datefield-calendarpanel-day{cursor:" + ("pointer")  + ";}.v-inline-datefield-calendarpanel-day-today{cursor:") + (("pointer")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-disabled .v-inline-datefield-calendarpanel-day,.v-disabled .v-inline-datefield-calendarpanel-day-today{cursor:" + ("default")  + ";}.v-inline-datefield-calendarpanel-day-disabled{cursor:" + ("default")  + ";opacity:" + ("0.5")  + ";}.v-inline-datefield-calendarpanel-day-selected{cursor:" + ("default")  + ";background:" + ("#00a3e8")  + ";color:" + ("#fff")  + ";display:" + ("block")  + ";}.v-inline-datefield-calendarpanel-day-offmonth{color:" + ("#666")  + ";}.v-inline-datefield-time{white-space:" + ("nowrap") ) + (";}.v-inline-datefield-time .v-label{display:" + ("inline")  + ";}.v-inline-datefield-popup{background:" + ("#fff")  + ";}.v-ddwrapper{padding:" + ("2px")  + ";-moz-border-radius:" + ("4px")  + ";-webkit-border-radius:" + ("4px")  + ";border-radius:" + ("4px")  + ";position:" + ("relative")  + ";}[draggable=\"true\"]{-khtml-user-drag:" + ("element")  + ";-webkit-user-drag:" + ("element")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:") + (("none")  + ";}.v-ddwrapper-over{border:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("#bcdcff")  + ";padding:" + ("0")  + ";background-color:" + ("rgba(" + "169"+ ","+ " " +"209"+ ","+ " " +"255"+ ","+ " " +"0.6" + ")")  + ";}.no-box-drag-hints .v-ddwrapper-over{border:" + ("none")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";}.v-app .v-ddwrapper-over-top,.v-window .v-ddwrapper-over-top,.v-popupview-popup .v-ddwrapper-over-top{border:" + ("none")  + ";border-top:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent") ) + (";padding:" + ("2px")  + ";padding-top:" + ("0")  + ";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0")  + ";}.v-app .v-ddwrapper-over-bottom,.v-window .v-ddwrapper-over-bottom,.v-popupview-popup .v-ddwrapper-over-bottom{border:" + ("none")  + ";border-bottom:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";padding-bottom:" + ("0")  + ";-moz-border-radius:") + (("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0")  + ";}.v-app .v-ddwrapper-over-left,.v-window .v-ddwrapper-over-left,.v-popupview-popup .v-ddwrapper-over-left{border:" + ("none")  + ";border-right:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";padding-right:" + ("0")  + ";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0") ) + (";}.v-app .v-ddwrapper-over-right,.v-window .v-ddwrapper-over-right,.v-popupview-popup .v-ddwrapper-over-right{border:" + ("none")  + ";border-left:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";padding-left:" + ("0")  + ";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0")  + ";}.v-ddwrapper,.v-ddwrapper-over,.v-app .v-ddwrapper-over-top,.v-window .v-ddwrapper-over-top,.v-popupview-popup .v-ddwrapper-over-top,.v-app .v-ddwrapper-over-bottom,.v-window .v-ddwrapper-over-bottom,.v-popupview-popup .v-ddwrapper-over-bottom,.v-app .v-ddwrapper-over-left,.v-window .v-ddwrapper-over-left,.v-popupview-popup .v-ddwrapper-over-left,.v-app .v-ddwrapper-over-right,.v-window .v-ddwrapper-over-right,.v-popupview-popup .v-ddwrapper-over-right{border-color:" + ("rgba(" + "0"+ ","+ " " +"109"+ ","+ " " +"232"+ ","+ " " +"0.6" + ")")  + ";}.v-ddwrapper-over-bottom:after{margin-top:" + ("-2px")  + ";}.v-ddwrapper-over-left:before{background-position:") + (("0"+ " " +"-6px")  + ";margin-top:" + ("-2px")  + ";margin-right:" + ("-4px")  + ";}.v-ddwrapper-over-right:before{background-position:" + ("0"+ " " +"-6px")  + ";margin-top:" + ("-2px")  + ";margin-right:" + ("-4px")  + ";position:" + ("relative")  + ";margin-bottom:" + ("-4px")  + ";margin-left:" + ("-4px")  + ";margin-right:" + ("0")  + ";width:" + ("auto") ) + (";background-position:" + ("0"+ " " +"-6px")  + ";}.no-horizontal-drag-hints .v-ddwrapper-over-left{padding-right:" + ("2px")  + ";border-right:" + ("none")  + ";}.no-horizontal-drag-hints .v-ddwrapper-over-right{padding-left:" + ("2px")  + ";border-left:" + ("none")  + ";}.no-vertical-drag-hints .v-ddwrapper-over-top{padding-top:" + ("2px")  + ";border-top:" + ("none")  + ";}.no-vertical-drag-hints .v-ddwrapper-over-bottom{padding-bottom:" + ("2px")  + ";border-bottom:" + ("none")  + ";}.no-horizontal-drag-hints .v-ddwrapper-over-left:before,.no-horizontal-drag-hints .v-ddwrapper-over-right:before,.no-vertical-drag-hints .v-ddwrapper-over-top:before,.no-vertical-drag-hints .v-ddwrapper-over-bottom:after{display:" + ("none")  + ";}.v-table .v-embedded-image{display:") + (("inline-block")  + ";}.v-formlayout.v-has-width>table{width:" + ("100%")  + ";}.v-formlayout-cell .v-errorindicator{display:" + ("block")  + ";}.v-formlayout-error-indicator{width:" + ("12px")  + ";}.v-formlayout-captioncell{text-align:" + ("left")  + ";white-space:" + ("nowrap")  + ";}.v-formlayout-errorcell,.v-formlayout-captioncell{width:" + ("1px")  + ";}.v-formlayout-captioncell .v-caption{overflow:" + ("visible")  + ";}.v-formlayout-spacing>tbody>.v-formlayout-row>.v-formlayout-captioncell,.v-formlayout-spacing>tbody>.v-formlayout-row>.v-formlayout-contentcell,.v-formlayout-spacing>tbody>.v-formlayout-row>.v-formlayout-errorcell{padding-top:" + ("6px")  + ";}.v-formlayout-spacing>tbody>.v-formlayout-firstrow>.v-formlayout-captioncell,.v-formlayout-spacing>tbody>.v-formlayout-firstrow>.v-formlayout-contentcell,.v-formlayout-spacing>tbody>.v-formlayout-firstrow>.v-formlayout-errorcell{padding-top:" + ("0")  + ";}.v-formlayout-margin-top>tbody>.v-formlayout-firstrow>.v-formlayout-captioncell,.v-formlayout-margin-top>tbody>.v-formlayout-firstrow>.v-formlayout-contentcell,.v-formlayout-margin-top>tbody>.v-formlayout-firstrow>.v-formlayout-errorcell,.v-gridlayout-margin-top{padding-top:" + ("12px") ) + (";}.v-formlayout-margin-bottom>tbody>.v-formlayout-lastrow>.v-formlayout-captioncell,.v-formlayout-margin-bottom>tbody>.v-formlayout-lastrow>.v-formlayout-contentcell,.v-formlayout-margin-bottom>tbody>.v-formlayout-lastrow>.v-formlayout-errorcell,.v-gridlayout-margin-bottom{padding-bottom:" + ("12px")  + ";}.v-formlayout-margin-left>tbody>.v-formlayout-row>.v-formlayout-captioncell,.v-gridlayout-margin-left{padding-right:" + ("12px")  + ";}.v-formlayout-margin-right>tbody>.v-formlayout-row>.v-formlayout-contentcell,.v-gridlayout-margin-right{padding-left:" + ("12px")  + ";}.v-formlayout-captioncell .v-caption .v-required-field-indicator{float:" + ("none")  + ";}.v-gridlayout{position:" + ("relative")  + ";}.v-gridlayout-slot{position:" + ("absolute")  + ";}.v-gridlayout-spacing-on{padding-right:" + ("6px")  + ";padding-top:" + ("6px")  + ";overflow:" + ("hidden")  + ";}.v-gridlayout-spacing{padding-right:" + ("0")  + ";padding-top:") + (("0")  + ";}.v-gridlayout-spacing-off{padding-right:" + ("0")  + ";padding-top:" + ("0")  + ";overflow:" + ("hidden")  + ";}.v-label{overflow:" + ("hidden")  + ";}.v-label.v-has-width{white-space:" + ("normal")  + ";}.v-link{white-space:" + ("nowrap")  + ";}.v-link a{vertical-align:" + ("middle")  + ";text-decoration:" + ("none")  + ";}.v-link span{text-decoration:" + ("underline")  + ";vertical-align:" + ("middle") ) + (";}.v-disabled a{cursor:" + ("default")  + ";}.v-link img{vertical-align:" + ("middle")  + ";border:" + ("none")  + ";}.v-loginform{height:" + ("140px")  + ";width:" + ("200px")  + ";}.v-app-loginpage .v-button{float:" + ("right")  + ";float:" + ("right")  + ";}.v-menubar{display:" + ("inline-block")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.v-menubar .v-menubar-menuitem{cursor:") + (("default")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";display:" + ("inline")  + ";display:" + ("inline-block")  + ";zoom:" + ("1")  + ";}.v-menubar .v-menubar-menuitem-caption .v-icon{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.v-menubar-submenu{background:" + ("#fff")  + ";}.v-menubar-menuitem-selected{background:" + ("#333")  + ";color:" + ("#fff") ) + (";}.v-menubar-submenu .v-menubar-menuitem{cursor:" + ("default")  + ";display:" + ("block")  + ";position:" + ("relative")  + ";padding-left:" + ("1.5em")  + ";}.v-menubar-submenu .v-menubar-menuitem-caption{display:" + ("block")  + ";}.v-menubar-submenu .v-menubar-menuitem *,.v-menubar-submenu .v-menubar-menuitem-caption *{white-space:" + ("nowrap")  + ";}.v-menubar-submenu-indicator{display:" + ("none")  + ";font-family:" + ("arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.v-menubar-submenu .v-menubar-submenu-indicator{display:" + ("block")  + ";position:" + ("absolute")  + ";left:") + (("0")  + ";width:" + ("1em")  + ";height:" + ("1em")  + ";font-size:" + ("11.7px")  + ";}.v-menubar-menuitem-disabled,.v-menubar span.v-menubar-menuitem-disabled:hover,.v-menubar span.v-menubar-menuitem-disabled:focus,.v-menubar span.v-menubar-menuitem-disabled:active{color:" + ("#999")  + ";}.v-menubar-more-menuitem{font-family:" + ("arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.v-menubar-separator{overflow:" + ("hidden")  + ";}.v-menubar-separator span{display:" + ("block")  + ";text-indent:" + ("-9999px")  + ";font-size:" + ("1px")  + ";line-height:" + ("1px") ) + (";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";margin:" + ("3px"+ " " +"0"+ " " +"2px")  + ";overflow:" + ("hidden")  + ";}.v-menubar .v-icon,.v-menubar-submenu .v-icon{margin-left:" + ("3px")  + ";}.v-menubar-submenu-check-column .v-menubar-menuitem{padding-right:" + ("6px")  + ";}.v-menubar-submenu-check-column .v-menubar-menuitem-caption{padding-right:" + ("18px")  + ";}.v-Notification h1,.v-Notification p,.v-Notification-error h1,.v-Notification-error p,.v-Notification-warning h1,.v-Notification-warning p{margin:" + ("0"+ " " +"1em")  + ";}.v-Notification-warning{background:" + ("orange")  + ";}.v-Notification-error{background:" + ("red")  + ";}.v-Notification-tray h1,.v-Notification-tray p{display:" + ("block")  + ";}.v-Notification-system{background-color:") + (("red")  + ";opacity:" + ("0.7")  + ";}.v-Notification-system h1{display:" + ("block")  + ";margin:" + ("0")  + ";}.v-orderedlayout,.v-horizontallayout,.v-verticallayout{position:" + ("relative")  + ";}.v-orderedlayout-spacing-off,.v-horizontallayout-spacing-off,.v-verticallayout-spacing-off{padding-top:" + ("0")  + ";padding-right:" + ("0")  + ";}.v-horizontallayout-slot,.v-verticallayout-slot,.v-shadow{position:" + ("absolute")  + ";}.v-panel{outline:" + ("none")  + ";text-align:" + ("right")  + ";}.v-panel-caption{outline:" + ("none") ) + (";text-align:" + ("right")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";font-weight:" + ("500")  + ";}.v-panel-content{outline:" + ("none")  + ";text-align:" + ("right")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-panel-deco,.v-panel-light,.v-panel-caption-light,.v-panel-content-light,.v-panel-deco-light{outline:" + ("none")  + ";text-align:") + (("right")  + ";}.v-panel-caption .v-errorindicator{float:" + ("none")  + ";display:" + ("inline")  + ";}.v-panel-caption .v-icon{display:" + ("inline")  + ";vertical-align:" + ("middle")  + ";}.v-panel-caption span{vertical-align:" + ("middle")  + ";}.v-panel-nocaption{overflow:" + ("hidden")  + ";}.v-panel.v-has-width>.v-panel-content{width:" + ("100%")  + ";}.v-panel.v-has-height>.v-panel-content{height:" + ("100%")  + ";}.v-popupview{cursor:" + ("pointer")  + ";text-decoration:" + ("underline") ) + (";white-space:" + ("nowrap")  + ";}.v-popupview-popup{overflow:" + ("auto")  + ";}.v-progressindicator,.v-progressbar{width:" + ("150px")  + ";}.v-progressindicator-wrapper,.v-progressbar-wrapper{height:" + ("7px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-progressindicator-indicator,.v-progressbar-indicator{height:" + ("7px")  + ";background:" + ("#ddd")  + ";}.v-progressindicator-indeterminate .v-progressindicator-wrapper,.v-progressindicator-indeterminate .v-progressindicator-indicator,.v-progressindicator-indeterminate-disabled .v-progressindicator-wrapper,.v-progressindicator-indeterminate-disabled .v-progressindicator-indicator,.v-progressbar-indeterminate .v-progressbar-wrapper,.v-progressbar-indeterminate .v-progressbar-indicator,.v-progressbar-indeterminate-disabled .v-progressbar-wrapper,.v-progressbar-indeterminate-disabled .v-progressbar-indicator{display:" + ("none")  + ";}div.v-progressindicator-indeterminate-disabled{height:" + ("20px")  + ";width:" + ("20px")  + ";background:") + (("transparent")  + ";}.v-select-optiongroup .v-select-option{display:" + ("block")  + ";white-space:" + ("nowrap")  + ";}.v-select-optiongroup .v-icon{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";margin:" + ("0"+ " " +"2px")  + ";}.v-select-twincol{white-space:" + ("nowrap")  + ";}.v-select-twincol-options{float:" + ("right")  + ";}.v-select-twincol-caption-left{float:" + ("right")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis") ) + (";}.v-select-twincol-selections{font-weight:" + ("500")  + ";}.v-select-twincol-caption-right{float:" + ("left")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.v-select-twincol-buttons{float:" + ("right")  + ";text-align:" + ("center")  + ";}.v-select-twincol-buttons .v-select-twincol-deco{clear:" + ("both")  + ";}.v-select-twincol .v-textfield{display:" + ("block")  + ";float:" + ("right")  + ";clear:" + ("right")  + ";}.v-select-twincol .v-button{float:") + (("right")  + ";}.v-select-twincol-buttons .v-button{float:" + ("none")  + ";}.v-slider{margin:" + ("5px"+ " " +"0")  + ";}.v-slider-vertical{width:" + ("2px")  + ";height:" + ("auto")  + ";margin:" + ("0"+ " " +"5px")  + ";border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#cccfd0")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#cccfd0")  + ";}.v-slider-vertical .v-slider-base{width:" + ("2px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#eee") ) + (";border-left:" + ("none")  + ";}.v-slider-vertical .v-slider-handle{width:" + ("12px")  + ";height:" + ("12px")  + ";font-size:" + ("0")  + ";margin-right:" + ("-5px")  + ";}.v-slider-feedback{padding:" + ("2px"+ " " +"5px")  + ";background:" + ("#444")  + ";color:" + ("#fff")  + ";font-size:" + ("11px")  + ";line-height:" + ("13px")  + ";font-weight:") + (("500")  + ";font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";border-radius:" + ("4px")  + ";-webkit-border-radius:" + ("4px")  + ";-moz-border-radius:" + ("4px")  + ";margin:" + ("-2px"+ " " +"2px"+ " " +"0"+ " " +"0")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#000")  + ";}.v-splitpanel-horizontal,.v-splitpanel-vertical{overflow:" + ("hidden")  + ";}.v-splitpanel-hsplitter{width:" + ("6px")  + ";}.v-splitpanel-hsplitter div{width:" + ("6px")  + ";position:" + ("absolute") ) + (";top:" + ("0")  + ";bottom:" + ("0")  + ";background:" + ("#ddd")  + ";cursor:" + ("w-resize")  + ";cursor:" + ("col-resize")  + ";}.v-disabled .v-splitpanel-hsplitter div{cursor:" + ("default")  + ";}.v-splitpanel-vsplitter{height:" + ("6px")  + ";}.v-splitpanel-vsplitter div{height:" + ("6px")  + ";background:" + ("#ddd")  + ";cursor:" + ("s-resize")  + ";cursor:") + (("row-resize")  + ";}.v-disabled .v-splitpanel-vsplitter div{cursor:" + ("default")  + ";}.v-off{color:" + ("#ddd")  + ";}.v-table-drag .v-table-body{border-color:" + ("#1d9dff")  + ";}.v-table-row-drag-middle .v-table-cell-content{background-color:" + ("#bcdcff")  + ";}.v-table-row-drag-top .v-table-cell-content{border-top:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";}.v-table-row-drag-top .v-table-cell-wrapper{margin-top:" + ("-2px")  + ";}.v-table-row-drag-bottom .v-table-cell-content{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";}.v-table-row-drag-bottom .v-table-cell-wrapper{margin-bottom:" + ("-2px")  + ";}.v-tabsheet,.v-tabsheet-content,.v-tabsheet-deco{outline:" + ("none")  + ";text-align:" + ("right") ) + (";}.v-tabsheet-tabs{empty-cells:" + ("hide")  + ";border-collapse:" + ("collapse")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border:" + ("0")  + ";width:" + ("100%")  + ";overflow:" + ("hidden")  + ";}.v-tabsheet-tabitemcell:focus,input.v-textfield-readonly:focus,textarea.v-textarea-readonly:focus{outline:" + ("none")  + ";}.v-tabsheet-tabitemcell{margin:" + ("0")  + ";padding:" + ("0")  + ";vertical-align:") + (("bottom")  + ";}.v-tabsheet-spacertd{margin:" + ("0")  + ";padding:" + ("0")  + ";vertical-align:" + ("bottom")  + ";width:" + ("100%")  + ";}.v-tabsheet-spacertd div{border-right:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";height:" + ("1em")  + ";padding:" + ("0.2em"+ " " +"0")  + ";}.v-tabsheet-hidetabs>.v-tabsheet-tabcontainer,.v-disabled .v-tabsheet-scroller{display:" + ("none")  + ";}.v-tabsheet-scroller{white-space:" + ("nowrap") ) + (";text-align:" + ("left")  + ";margin-top:" + ("-1em")  + ";}.v-tabsheet-scrollerPrev,.v-tabsheet-scrollerNext,.v-tabsheet-scrollerPrev-disabled,.v-tabsheet-scrollerNext-disabled{border:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";background:" + ("#fff")  + ";width:" + ("12px")  + ";height:" + ("1em")  + ";cursor:" + ("pointer")  + ";}.v-tabsheet-scrollerPrev-disabled,.v-tabsheet-scrollerNext-disabled{opacity:" + ("0.5")  + ";cursor:" + ("default")  + ";}.v-tabsheet-tabs .v-caption,.v-tabsheet-tabs .v-caption span{white-space:" + ("nowrap")  + ";}.v-tabsheet-caption-close{display:") + (("inline")  + ";display:" + ("inline-block")  + ";zoom:" + ("1")  + ";width:" + ("16px")  + ";height:" + ("16px")  + ";text-align:" + ("center")  + ";font-weight:" + ("bold")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";user-select:" + ("none")  + ";-khtml-user-select:" + ("none") ) + (";-ms-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.v-tabsheet .v-disabled .v-tabsheet-caption-close{cursor:" + ("default")  + ";visibility:" + ("hidden")  + ";}.v-tabsheet-tabitem:hover .v-tabsheet-caption-close,div table.v-treetable-animation-clone tr.v-table-row,div table.v-treetable-animation-clone tr.v-table-row-odd,div table.v-treetable-animation-clone tr.v-table-row td.v-table-cell-content,div table.v-treetable-animation-clone tr.v-table-row-odd td.v-table-cell-content{visibility:" + ("visible")  + ";}.v-tabsheet-tabitem{border:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";border-left:" + ("none")  + ";cursor:" + ("pointer")  + ";padding:" + ("0.2em"+ " " +"0.5em")  + ";}.v-tabsheet-tabitem .v-caption{cursor:") + (("inherit")  + ";}.v-tabsheet.v-disabled .v-tabsheet-tabitem,.v-tabsheet-tabitemcell-disabled .v-tabsheet-tabitem{cursor:" + ("default")  + ";}.v-tabsheet-tabitem-selected{cursor:" + ("default")  + ";border-bottom-color:" + ("#fff")  + ";}.v-tabsheet-tabitem-selected .v-caption{cursor:" + ("default")  + ";}.v-tabsheet-content{border:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";border-top:" + ("none")  + ";border-bottom:" + ("none")  + ";position:" + ("relative")  + ";}.v-tabsheet-deco{height:" + ("1px")  + ";background:" + ("#aaa") ) + (";overflow:" + ("hidden")  + ";}.v-tabsheet-hidetabs .v-tabsheet-content{border:" + ("none")  + ";}.v-tabsheet-hidetabs .v-tabsheet-deco{height:" + ("0")  + ";}.v-textfield{text-align:" + ("right")  + ";}.v-textarea{resize:" + ("none")  + ";white-space:" + ("pre-wrap")  + ";}input.v-textfield-prompt,textarea.v-textarea-prompt{color:" + ("#999")  + ";font-style:" + ("italic")  + ";}input.v-textfield-readonly,textarea.v-textarea-readonly{background:" + ("transparent")  + ";border:" + ("none")  + ";resize:") + (("none")  + ";}input.v-disabled,textarea.v-disabled{resize:" + ("none")  + ";}input:focus,textarea:focus{outline-width:" + ("medium")  + ";}.v-tree{text-align:" + ("right")  + ";padding:" + ("1px"+ " " +"0")  + ";outline:" + ("none")  + ";}.v-tree-node-caption:focus,.v-window-contents>div,.v-button:focus{outline:" + ("none")  + ";}div.v-tree-node-leaf{background:" + ("transparent")  + ";}.v-tree-node-caption{margin-right:" + ("1em")  + ";}.v-tree-node span{cursor:" + ("pointer")  + ";}.v-tree-node-caption div,.v-upload{white-space:" + ("nowrap") ) + (";}.v-tree-node-caption span,.v-tree-node-caption .v-icon,.v-window-header .v-icon{vertical-align:" + ("middle")  + ";}.v-tree-node-selected span{background:" + ("#999")  + ";color:" + ("#fff")  + ";}.v-tree-node-children{padding-right:" + ("1em")  + ";}.v-tree .v-tree-node-drag-top{border-top:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";margin-top:" + ("-1px")  + ";padding-top:" + ("0")  + ";background-position:" + ("5px"+ " " +"-38px")  + ";}.v-tree .v-tree-node-drag-bottom{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";margin-bottom:" + ("-1px")  + ";padding-bottom:") + (("0")  + ";}.v-tree .v-tree-node-drag-bottom:after{margin-top:" + ("-2px")  + ";}.v-tree .v-tree-node-caption-drag-center:after{margin-right:" + ("14px")  + ";}.v-tree .v-tree-node-drag-top.v-tree-node-expanded{background-position:" + ("-5px"+ " " +"-11px")  + ";}.v-tree .v-tree-node-caption-drag-center div{border:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";-moz-border-radius:" + ("4px")  + ";-webkit-border-radius:" + ("4px")  + ";border-radius:" + ("4px")  + ";margin:" + ("-2px"+ " " +"-2px"+ " " +"-2px"+ " " +"2px")  + ";background-color:" + ("#bcdcff")  + ";background-color:" + ("rgba(" + "169"+ ","+ " " +"209"+ ","+ " " +"255"+ ","+ " " +"0.6" + ")") ) + (";border-color:" + ("rgba(" + "0"+ ","+ " " +"109"+ ","+ " " +"232"+ ","+ " " +"0.6" + ")")  + ";}.v-tree .v-tree-node-drag-top,.v-tree .v-tree-node-drag-bottom{border-color:" + ("rgba(" + "0"+ ","+ " " +"109"+ ","+ " " +"232"+ ","+ " " +"0.6" + ")")  + ";}.v-treetable .v-checkbox{display:" + ("inline-block")  + ";padding-bottom:" + ("4px")  + ";}.v-treetable .v-table-row .v-table-cell-content,.v-treetable .v-table-row-odd .v-table-cell-content{position:" + ("relative")  + ";z-index:" + ("10")  + ";}.v-treetable .v-table-cell-wrapper{position:" + ("relative")  + ";}.v-treetable .v-table-body .v-table-table .v-table-row-animating{zoom:" + ("1")  + ";z-index:" + ("1")  + ";background:" + ("transparent")  + ";}.v-treetable .v-table-body .v-table-table .v-table-row-animating .v-table-cell-content{background:") + (("transparent")  + ";}.v-treetable-animation-clone{border-spacing:" + ("0")  + ";zoom:" + ("1")  + ";}div.v-treetable-animation-clone-wrapper{position:" + ("absolute")  + ";z-index:" + ("2")  + ";background-color:" + ("#fff")  + ";}div.v-treetable-animation-clone-wrapper table.v-treetable-animation-clone{background-color:" + ("#fff")  + ";}.v-upload-immediate{position:" + ("relative")  + ";margin:" + ("0")  + ";overflow:" + ("hidden")  + ";}.v-upload-immediate input{opacity:" + ("0") ) + (";z-index:" + ("2")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";height:" + ("21px")  + ";text-align:" + ("left")  + ";border:" + ("none")  + ";background:" + ("transparent")  + ";}.v-upload-immediate button{position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";width:") + (("100%")  + ";text-align:" + ("right")  + ";}.v-window{background:" + ("#fff")  + ";}.v-window-contents{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-window.v-has-width>div.popupContent,.v-window.v-has-width .v-window-wrap,.v-window.v-has-width .v-window-contents,.v-window.v-has-width .v-window-contents>div{width:" + ("100%")  + ";}.v-window.v-has-height>div.popupContent,.v-window.v-has-height .v-window-wrap,.v-window.v-has-height .v-window-contents,.v-window.v-has-height .v-window-contents>div{height:" + ("100%")  + ";}.v-window-outerheader{padding:" + ("0.3em"+ " " +"1em")  + ";height:" + ("1.6em")  + ";position:" + ("relative") ) + (";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";cursor:" + ("move")  + ";}.v-window-draggingCurtain{cursor:" + ("move")  + ";}.v-window-header{font-weight:" + ("500")  + ";}div.v-window-header{white-space:" + ("nowrap")  + ";text-overflow:" + ("ellipsis")  + ";-ms-text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";padding:") + (("0")  + ";}.v-window-footer{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";height:" + ("10px")  + ";position:" + ("relative")  + ";cursor:" + ("move")  + ";}.v-window-resizebox{width:" + ("10px")  + ";height:" + ("10px")  + ";background:" + ("#ddd")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute") ) + (";left:" + ("0")  + ";cursor:" + ("sw-resize")  + ";}.v-window-resizingCurtain{cursor:" + ("sw-resize")  + ";}.v-window div.v-window-footer-noresize{height:" + ("0")  + ";}.v-window-resizebox-disabled{cursor:" + ("default")  + ";display:" + ("none")  + ";}.v-window-closebox{position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";width:" + ("1em")  + ";height:") + (("1em")  + ";background:" + ("red")  + ";cursor:" + ("pointer")  + ";overflow:" + ("hidden")  + ";}.v-window-modalitycurtain{top:" + ("0")  + ";right:" + ("0")  + ";background:" + ("#999")  + ";opacity:" + ("0.5")  + ";position:" + ("fixed")  + ";width:" + ("100%")  + ";height:" + ("100%") ) + (";}@font-face{font-family:" + ("\"TkIcons\"")  + ";src:" + ("url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.fontAwesome())).getUrl() + "')"+ " " +"format(" + "\"woff\"" + ")"+ ","+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.fontAwesomeOtf())).getUrl() + "')"+ " " +"format(" + "\"opentype\"" + ")")  + ";font-weight:" + ("normal")  + ";font-style:" + ("normal")  + ";}.v-csslayout{overflow:" + ("visible")  + ";}.v-shadow,.v-shadow-window{display:" + ("none")  + ";}body{font-family:" + ("\"Helvetica Neue\""+ ","+ " " +"Helvetica"+ ","+ " " +"Arial"+ ","+ " " +"Tahoma"+ ","+ " " +"Verdana")  + ";color:" + ("#5e5d55")  + ";font-size:" + ("14px")  + ";line-height:" + ("19px")  + ";-webkit-text-size-adjust:") + (("none")  + ";}input,textarea,select,option{font-family:" + ("\"Helvetica Neue\""+ ","+ " " +"Helvetica"+ ","+ " " +"Arial"+ ","+ " " +"Tahoma"+ ","+ " " +"Verdana")  + ";color:" + ("#5e5d55")  + ";}.v-assistive-device-only{position:" + ("absolute")  + ";top:" + ("-2000px")  + ";right:" + ("-2000px")  + ";width:" + ("10px")  + ";height:" + ("10px")  + ";overflow:" + ("hidden")  + ";}.v-contextmenu{background:" + ("#f5f5f2")  + ";border:" + ("none") ) + (";border-radius:" + ("3px")  + ";-webkit-border-radius:" + ("3px")  + ";-moz-border-radius:" + ("3px")  + ";-o-border-radius:" + ("3px")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"2px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.8" + ")")  + ";overflow:" + ("hidden")  + ";padding:" + ("4px"+ " " +"0")  + ";}.v-contextmenu .gwt-MenuItem{padding:" + ("1px"+ " " +"8px"+ " " +"1px"+ " " +"12px")  + ";height:" + ("30px")  + ";user-select:" + ("none")  + ";-moz-user-select:") + (("none")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";cursor:" + ("default")  + ";}.v-contextmenu .gwt-MenuItem .v-icon{margin-left:" + ("3px")  + ";}.v-contextmenu .gwt-MenuItem-selected div{background:" + ("transparent")  + ";color:" + ("black")  + ";}.v-touchkit-offlinemode-panel{padding-top:" + ("10%")  + ";padding-right:" + ("17%")  + ";padding-left:" + ("17%")  + ";text-align:" + ("center") ) + (";}.v-touchkit-sadface{display:" + ("inline-block")  + ";-webkit-transform:" + ("rotate(" + "90deg" + ")")  + ";transform:" + ("rotate(" + "90deg" + ")")  + ";font-size:" + ("4em")  + ";font-weight:" + ("bold")  + ";height:" + ("1em")  + ";margin-right:" + ("-0.5em")  + ";}.v-app,.v-touchkit-backgroundstripes,.v-touchkit-offlinemode{background:" + ("#f5f5f2")  + ";}.v-loading-indicator,.v-loading-indicator-delay,.v-loading-indicator-wait{pointer-events:" + ("none")  + ";position:" + ("absolute")  + ";z-index:") + (("30000")  + ";top:" + ("20%")  + ";right:" + ("25%")  + ";left:" + ("25%")  + ";margin:" + ("0")  + ";}.v-app-loading{pointer-events:" + ("none")  + ";position:" + ("absolute")  + ";z-index:" + ("30000")  + ";top:" + ("20%")  + ";right:" + ("25%")  + ";left:" + ("25%") ) + (";margin:" + ("0")  + ";text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";}div.v-progressindicator-indeterminate,div.v-progressbar-indeterminate{width:") + (("20px")  + ";}div.v-progressindicator-indeterminate:after,div.v-progressbar-indeterminate:after,.v-app-loading:after,.v-cache-loading-indicator:after,.v-loading-indicator:after{font-family:" + ("\"TkIcons\"")  + ";content:" + ("\"\"")  + ";color:" + ("gray")  + ";font-size:" + ("20px")  + ";line-height:" + ("1em")  + ";}@-webkit-keyframes spinnerRotate {\n	from {\n		-webkit-transform:rotate(0deg);\n	}\n	to {\n		-webkit-transform:rotate(360deg);\n	}\n}@keyframes spinnerRotate {\n	from {\n		transform:rotate(0deg);\n	}\n	to {\n		transform:rotate(360deg);\n	}\n}.v-cache-loading-indicator{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear") ) + (";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";}.v-loading-indicator{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:") + (("2s")  + ";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";opacity:" + ("0.02")  + ";}.v-loading-indicator-delay{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s") ) + (";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";opacity:" + ("0.5")  + ";}.v-loading-indicator-wait{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:") + (("infinite")  + ";animation-timing-function:" + ("linear")  + ";opacity:" + ("1")  + ";}div.v-progressindicator-indeterminate,div.v-progressbar-indeterminate{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:" + ("infinite") ) + (";animation-timing-function:" + ("linear")  + ";}.v-app-loading:after,.v-loading-indicator:after{font-size:" + ("50px")  + ";}.v-button{margin:" + ("0")  + ";border:" + ("none")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";display:" + ("block")  + ";border-radius:" + ("3px")  + ";background:" + ("white")  + ";padding:" + ("3px")  + ";text-align:") + (("center")  + ";position:" + ("relative")  + ";overflow:" + ("hidden")  + ";-webkit-touch-callout:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";-webkit-tap-highlight-color:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0" + ")")  + ";-ms-user-select:" + ("none")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";font-size:" + ("20px")  + ";font-weight:" + ("500")  + ";line-height:" + ("2") ) + (";color:" + ("#00a3e8")  + ";}.v-button:active .v-button-wrap:after{content:" + ("\"\"")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";right:" + ("0")  + ";background-color:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.3" + ")")  + ";border-radius:" + ("inherit")  + ";pointer-events:" + ("none")  + ";-webkit-touch-callout:") + (("none")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";}.v-button-wrap{display:" + ("block")  + ";padding:" + ("0"+ " " +"10px")  + ";white-space:" + ("nowrap")  + ";text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";}.v-button-link,.v-button-link .v-button-wrap,.v-button-link .v-button-caption,.v-button-link:active,.v-button-link.v-pressed,.v-nativebutton-link{display:" + ("inline-block")  + ";border-radius:" + ("0")  + ";background:" + ("transparent") ) + (";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";padding:" + ("0")  + ";height:" + ("auto")  + ";margin:" + ("0")  + ";font-size:" + ("14px")  + ";font-weight:" + ("normal")  + ";color:" + ("#00a3e8")  + ";line-height:" + ("inherit")  + ";}.v-button-link:active .v-button-wrap{background:" + ("transparent")  + ";}.v-button-link .v-button-caption,.v-nativebutton-link .v-button-caption{text-decoration:") + (("none")  + ";line-height:" + ("1")  + ";}a{color:" + ("#00a3e8")  + ";}.icon-arrow-up .v-button-wrap:before,.icon-arrow-down .v-button-wrap:before,.icon-arrow-left .v-button-wrap:before,.icon-arrow-right .v-button-wrap:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"")  + ";font-size:" + ("28px")  + ";}.icon-arrow-up .v-button-wrap:before{content:" + ("\"\"")  + ";}.icon-arrow-down .v-button-wrap:before{content:" + ("\"\"")  + ";}.icon-arrow-left .v-button-wrap:before{content:" + ("\"\"")  + ";}.icon-arrow-right .v-button-wrap:before{content:" + ("\"\"") ) + (";}.v-touchkit-navbar .icon-arrow-up .v-button-caption,.v-touchkit-navbar .icon-arrow-down .v-button-caption,.v-touchkit-navbar .icon-arrow-left .v-button-caption,.v-touchkit-navbar .icon-arrow-right .v-button-caption{display:" + ("none")  + ";}.v-touchkit-navpanel{position:" + ("relative")  + ";overflow:" + ("hidden")  + ";display:" + ("block")  + ";}.v-touchkit-navpanel-wrapper{position:" + ("relative")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";-webkit-transform:" + ("translate3d(" + "0"+ ","+ " " +"0"+ ","+ " " +"0" + ")")  + ";-webkit-transition:" + ("-webkit-transform"+ " " +"0.3s"+ " " +"linear")  + ";transform:" + ("translate3d(" + "0"+ ","+ " " +"0"+ ","+ " " +"0" + ")")  + ";transition:") + (("transform"+ " " +"0.3s"+ " " +"linear")  + ";}.v-touchkit-navpanel-container,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-container{position:" + ("absolute")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";opacity:" + ("0")  + ";-webkit-transition:" + ("opacity"+ " " +"0.15s"+ " " +"linear")  + ";transition:" + ("opacity"+ " " +"0.15s"+ " " +"linear")  + ";}.v-touchkit-navpanel-placeholder,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-placeholder{position:" + ("absolute")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";background:" + ("#f5f5f2") ) + (";}.v-touchkit-navpanel-notransit{-webkit-transition:" + ("none")  + ";transition:" + ("none")  + ";}.v-touchkit-navbutton,.v-button-nav{display:" + ("block")  + ";position:" + ("relative")  + ";font-weight:" + ("500")  + ";color:" + ("#43423d")  + ";line-height:" + ("2")  + ";margin:" + ("0")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"16px")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";white-space:" + ("nowrap")  + ";-webkit-touch-callout:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";}.v-touchkit-verticalcomponentgroup .v-button-nav{margin:" + ("0"+ " " +"-10px")  + ";padding:" + ("0"+ " " +"listlayoutmargin"+ " " +"0"+ " " +"16px")  + ";background:" + ("transparent")  + ";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";text-align:" + ("right") ) + (";border-radius:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-touchkit-navbutton{margin:" + ("0"+ " " +"-10px")  + ";outline:" + ("none")  + ";}.v-button-nav>span{padding:" + ("0"+ " " +"listlayoutmargin"+ " " +"0"+ " " +"16px")  + ";background:" + ("transparent")  + " !important;-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";height:" + ("43px")  + ";}.v-button-nav>span>span{color:" + ("black")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";line-height:" + ("43px")  + " !important;}.v-button-nav:active>span>span{color:" + ("white")  + ";}.v-touchkit-verticalcomponentgroup .v-touchkit-navbutton:active,.v-button-nav:active{background:" + ("#00a3e8")  + ";color:" + ("#fff")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-contentcell{padding-left:" + ("10px")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-contentcell>*{float:" + ("left")  + ";}.v-touchkit-componentgroup-row>.v-caption>.v-icon,.v-touchkit-navbutton .v-icon{height:" + ("30px")  + ";margin-left:" + ("6px")  + ";vertical-align:" + ("-9px")  + ";}.v-touchkit-navbutton-desc{color:" + ("#73787c") ) + (";font-weight:" + ("normal")  + ";float:" + ("left")  + ";margin-left:" + ("22px")  + ";margin-right:" + ("10px")  + ";}.v-touchkit-navbutton-emphasis .v-touchkit-navbutton-desc{color:" + ("#1b699f")  + ";}.v-touchkit-navbutton:active .v-touchkit-navbutton-desc{color:" + ("#fff")  + ";}.v-touchkit-navbutton-pill .v-touchkit-navbutton-desc{color:" + ("#fff")  + ";padding:" + ("1px"+ " " +"10px"+ " " +"2px")  + ";background:" + ("#5d81ab")  + ";border-radius:" + ("1em")  + ";line-height:") + (("1")  + ";margin-top:" + ("12px")  + ";font-weight:" + ("bold")  + ";}.v-touchkit-navbutton-pill:active .v-touchkit-navbutton-desc{background:" + ("#fff")  + ";color:" + ("#5d81ab")  + ";}.v-touchkit-navbutton:after{font-family:" + ("\"TkIcons\"")  + ";content:" + ("\"\"")  + ";color:" + ("#00a3e8")  + ";position:" + ("absolute")  + ";left:" + ("16px")  + ";top:" + ("0") ) + (";bottom:" + ("0")  + ";width:" + ("10px")  + ";margin-left:" + ("-1px")  + ";}.v-touchkit-navbutton:active:after{color:" + ("white")  + ";}.v-touchkit-navbutton.v-touchkit-navbutton-back .v-touchkit-navbutton-desc{margin-right:" + ("0")  + ";margin-left:" + ("0")  + ";}.v-touchkit-navbar-left{position:" + ("absolute")  + ";right:" + ("6px")  + ";top:" + ("6px")  + ";max-width:" + ("35%")  + ";z-index:") + (("1")  + ";padding-left:" + ("4px")  + ";}.v-touchkit-navbar,.v-touchkit-navpanel-placeholder>div,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-placeholder>div{color:" + ("#5e5d55")  + ";display:" + ("block")  + ";height:" + ("43px")  + ";font-size:" + ("20px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";text-align:" + ("center")  + ";position:" + ("relative")  + ";background:" + ("#f9f9f8")  + ";}.v-touchkit-navbar{z-index:" + ("1") ) + (";background:" + ("white")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-navbar .v-touchkit-navbar-caption,.v-touchkit-navpanel-placeholder>div,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-placeholder>div{line-height:" + ("43px")  + ";}.v-touchkit-navbar-caption{display:" + ("block")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";text-align:" + ("center")  + ";}.v-touchkit-navpanel-placeholder>div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.v-touchkit-navbar-right{position:") + (("absolute")  + ";left:" + ("6px")  + ";top:" + ("6px")  + ";max-width:" + ("35%")  + ";padding-right:" + ("4px")  + ";}.v-touchkit-navbar-right>.v-button,.v-touchkit-navbar-left>.v-button{display:" + ("block")  + ";}.v-touchkit-navbar .v-button .v-icon{height:" + ("20px")  + ";margin:" + ("4px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";vertical-align:" + ("top")  + ";}.v-touchkit-navview-notoolbar .v-touchkit-navview-toolbar{display:" + ("none")  + ";}.v-touchkit-navview{position:" + ("relative") ) + (";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("block")  + ";}.v-touchkit-navview-wrapper{position:" + ("absolute")  + ";top:" + ("43px")  + ";bottom:" + ("48px")  + ";right:" + ("0")  + ";left:" + ("0")  + ";overflow:" + ("auto")  + ";}.v-touchkit-navview-notoolbar .v-touchkit-navview-wrapper{bottom:" + ("0")  + ";}.v-touchkit-navview-toolbar{position:") + (("absolute")  + ";height:" + ("48px")  + ";bottom:" + ("0")  + ";right:" + ("0")  + ";left:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";box-shadow:" + ("0"+ " " +"-2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-navview-notoolbar .v-touchkit-navview-toolbar,.v-touchkit-popover .v-window-closebox,.v-touchkit-popover .v-window-outerheader,.v-touchkit-popover .v-window-footer{display:" + ("none")  + ";}.v-slider:focus,.v-touchkit-switch-widget:focus,.v-table-body:focus,.v-table-body-wrapper:focus,.v-filterselect-input:focus,.v-datefield-textfield:focus{outline:" + ("none")  + ";}.v-slider-base{height:" + ("6px")  + ";background:" + ("#f5f5f2") ) + (";border-radius:" + ("4px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";}.v-slider-handle{background:" + ("white")  + ";width:" + ("22px")  + ";height:" + ("22px")  + ";border-radius:" + ("11px")  + ";margin-top:" + ("-9px")  + ";box-shadow:" + ("0"+ " " +"1px"+ " " +"1px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.2" + ")")  + ";border:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.3" + ")")  + ";font-size:" + ("0")  + ";}.v-slider-handle:before{content:") + (("\"\"")  + ";position:" + ("absolute")  + ";margin-right:" + ("7px")  + ";margin-top:" + ("7px")  + ";background:" + ("#00a3e8")  + ";width:" + ("8px")  + ";height:" + ("8px")  + ";border-radius:" + ("4px")  + ";}.v-window-modalitycurtain{background:" + ("#3d3e40")  + ";opacity:" + ("0.7")  + ";}.v-window-modalitycurtain.relative{opacity:" + ("0.02") ) + (";}.v-touchkit-popover.v-touchkit-plain{background:" + ("#fff")  + ";}.v-window-contents{background:" + ("#f5f5f2")  + ";}.v-touchkit-popover.v-touchkit-relative .v-window-wrap{overflow:" + ("visible")  + ";background:" + ("transparent")  + ";position:" + ("relative")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";}.v-touchkit-popover.v-touchkit-relative.v-touchkit-smallscreen .v-window-wrap,.v-touchkit-popover.v-touchkit-relative.v-touchkit-smallscreen .v-window-contents{padding:" + ("0")  + ";border:" + ("none")  + ";border-radius:" + ("0")  + ";}.v-touchkit-popover.v-touchkit-relative.v-touchkit-smallscreen{box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-opacity-transition{-webkit-transition:") + (("opacity"+ " " +"0.1s"+ " " +"linear")  + ";}.v-touchkit-popover-pointer{height:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getHeight() + "px")  + ";width:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getSafeUri().asString() + "\") -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getLeft() + "px -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";margin-top:" + ("0")  + ";width:" + ("45px")  + ";height:" + ("20px")  + ";background-size:" + ("45px"+ " " +"20px")  + ";}.v-touchkit-popover-pointer-bottom{height:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getHeight() + "px") ) + (";width:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getSafeUri().asString() + "\") -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getLeft() + "px -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";margin-top:" + ("1px")  + ";width:" + ("45px")  + ";height:" + ("20px")  + ";background-size:" + ("45px"+ " " +"20px")  + ";}.v-touchkit-switch-widget{display:" + ("block")  + ";height:" + ("24px")  + ";}.v-touchkit-switch-wrapper{width:") + (("60px")  + ";height:" + ("22px")  + ";font-size:" + ("16px")  + ";position:" + ("relative")  + ";background:" + ("#00a1d8")  + ";border-radius:" + ("3px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.15" + ")")  + ";overflow:" + ("hidden")  + ";font-weight:" + ("700")  + ";box-shadow:" + ("inset"+ " " +"0"+ " " +"1px"+ " " +"1px"+ " " +"0"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.05" + ")")  + ";line-height:" + ("1") ) + (";float:" + ("left")  + ";}.v-touchkit-switch-off{background:" + ("#c8c7b5")  + ";}.v-touchkit-switch{right:" + ("0")  + ";width:" + ("150%")  + ";height:" + ("100%")  + ";position:" + ("absolute")  + ";box-sizing:" + ("border-box")  + ";}.v-touchkit-switch:before{text-align:" + ("center")  + ";position:" + ("absolute")  + ";margin:" + ("2px")  + ";color:") + (("white")  + ";content:" + ("\"I\"")  + ";left:" + ("66.6%")  + ";right:" + ("0")  + ";}.v-touchkit-switch:after{text-align:" + ("center")  + ";position:" + ("absolute")  + ";margin:" + ("2px")  + ";color:" + ("white")  + ";content:" + ("\"O\"")  + ";left:" + ("0")  + ";right:" + ("66.6%") ) + (";}.v-touchkit-switch-slider{height:" + ("100%")  + ";right:" + ("33.3%")  + ";left:" + ("33.3%")  + ";text-align:" + ("center")  + ";position:" + ("absolute")  + ";color:" + ("#a09f91")  + ";box-sizing:" + ("border-box")  + ";}.v-touchkit-switch-slider:after{content:" + ("\"| | |\"")  + ";position:" + ("absolute")  + ";background:" + ("#dcdbd0")  + ";box-shadow:") + (("inset"+ " " +"0"+ " " +"1px"+ " " +"2px"+ " " +"0"+ " " +"rgba(" + "255"+ ","+ " " +"255"+ ","+ " " +"255"+ ","+ " " +"0.3" + ")"+ ","+ " " +"0"+ " " +"1px"+ " " +"2px"+ " " +"0"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.3" + ")")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"1px"+ " " +"rgba(" + "255"+ ","+ " " +"255"+ ","+ " " +"255"+ ","+ " " +"1" + ")")  + ";border-radius:" + ("1px")  + ";right:" + ("0")  + ";left:" + ("0")  + ";top:" + ("0")  + ";bottom:" + ("0")  + ";margin:" + ("2px")  + ";font-size:" + ("8px")  + ";line-height:" + ("16px")  + ";word-spacing:" + ("1px") ) + (";}.v-slider-feedback{font-size:" + ("20px")  + ";line-height:" + ("1")  + ";padding:" + ("4px"+ " " +"7px")  + ";-webkit-box-shadow:" + ("0"+ " " +"1px"+ " " +"5px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.5" + ")")  + ";margin-top:" + ("-14px")  + " !important;background:" + ("#5e5d55")  + ";}.v-slider-feedback:after{content:" + ("\"\"")  + ";display:" + ("block")  + ";position:" + ("absolute")  + ";top:" + ("28px")  + ";right:") + (("50%")  + ";margin-right:" + ("-5px")  + ";height:" + ("0")  + ";border-top:" + ("5px"+ " " +"solid"+ " " +"#5e5d55")  + ";border-right:" + ("5px"+ " " +"solid"+ " " +"transparent")  + ";border-left:" + ("5px"+ " " +"solid"+ " " +"transparent")  + ";}.v-touchkit-verticalcomponentgroup .v-checkbox{line-height:" + ("43px")  + ";font-size:" + ("16px")  + ";font-weight:" + ("bold")  + ";}.v-touchkit-tabbar{overflow:" + ("hidden")  + ";position:" + ("relative") ) + (";padding-bottom:" + ("48px")  + ";}.v-touchkit-tabbar .v-csslayout-container,.v-touchkit-tabbar .v-csslayout-margin{height:" + ("100%")  + ";position:" + ("relative")  + ";}.v-touchkit-tabbar-wrapper{overflow:" + ("auto")  + ";-webkit-overflow-scrolling:" + ("touch")  + ";left:" + ("0")  + ";right:" + ("0")  + ";top:" + ("0")  + ";bottom:" + ("48px")  + ";position:" + ("absolute")  + ";}.v-touchkit-tabbar-toolbar .v-touchkit-toolbar{position:") + (("absolute")  + ";bottom:" + ("0")  + ";right:" + ("0")  + ";left:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";box-shadow:" + ("0"+ " " +"-2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-tabbar-toolbar .v-touchkit-toolbar .v-button{background:" + ("#f5f5f2")  + ";color:" + ("#5e5d55")  + ";}.v-touchkit-tabbar-toolbar .v-touchkit-toolbar .v-button-selected{background:" + ("white")  + ";color:" + ("#00a3e8")  + ";}.v-orderedlayout-margin-top,.v-horizontallayout-margin-top,.v-verticallayout-margin-top,.v-gridlayout-margin-top,.v-csslayout-margin-top{padding-top:" + ("10px") ) + (";}.v-orderedlayout-margin-right,.v-horizontallayout-margin-right,.v-verticallayout-margin-right,.v-gridlayout-margin-right,.v-csslayout-margin-right{padding-left:" + ("10px")  + ";}.v-orderedlayout-margin-bottom,.v-horizontallayout-margin-bottom,.v-verticallayout-margin-bottom,.v-gridlayout-margin-bottom,.v-csslayout-margin-bottom{padding-bottom:" + ("10px")  + ";}.v-orderedlayout-margin-left,.v-horizontallayout-margin-left,.v-verticallayout-margin-left,.v-gridlayout-margin-left,.v-csslayout-margin-left{padding-right:" + ("10px")  + ";}.v-csslayout-margin-top{margin-top:" + ("10px")  + ";padding:" + ("0")  + ";}.v-csslayout-margin-right{margin-left:" + ("10px")  + ";padding:" + ("0")  + ";}.v-csslayout-margin-bottom{margin-bottom:" + ("10px")  + ";padding:" + ("0")  + ";}.v-csslayout-margin-left{margin-right:" + ("10px")  + ";padding:") + (("0")  + ";}.v-orderedlayout-spacing-on,.v-horizontallayout-spacing-on,.v-verticallayout-spacing-on,.v-gridlayout-spacing-on{padding-top:" + ("8px")  + ";padding-right:" + ("8px")  + ";}.v-layout>.v-button,.v-layout>.v-touchkit-horizontalbuttongroup{margin:" + ("10px")  + ";}.v-Notification{background:" + ("#737268")  + ";padding:" + ("30px"+ " " +"30px")  + ";text-align:" + ("center")  + ";color:" + ("#fff")  + ";line-height:" + ("normal")  + ";overflow:" + ("hidden")  + ";width:" + ("100%") ) + (";box-sizing:" + ("border-box")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-Notification-error{background:" + ("#fa663e")  + ";}.v-Notification-warning{background:" + ("#f5d000")  + ";color:" + ("#43423d")  + ";}.v-Notification h1{font-weight:" + ("500")  + ";font-size:" + ("20px")  + ";}.v-table{overflow:" + ("hidden")  + ";text-align:" + ("right")  + ";display:" + ("block")  + ";}.v-table-header table,.v-table-table,.v-table-footer table{border:") + (("0")  + ";border-collapse:" + ("separate")  + ";border-spacing:" + ("0")  + ";font-size:" + ("16px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.v-table-header-cell,.v-table-header-cell-rowheader,.v-table-header-cell-asc,.v-table-header-cell-desc{cursor:" + ("pointer")  + ";padding:" + ("0")  + ";}.v-table-footer td{padding:" + ("0")  + ";}.v-table-footer-cell{cursor:" + ("pointer")  + ";}.v-table-footer-container{float:" + ("left") ) + (";height:" + ("16px")  + ";overflow:" + ("hidden")  + ";padding-left:" + ("7px")  + ";white-space:" + ("nowrap")  + ";}.v-table-resizer{background:" + ("transparent")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#acaba5")  + ";cursor:" + ("col-resize")  + ";display:" + ("block")  + ";float:" + ("left")  + ";height:" + ("30px")  + ";overflow:") + (("hidden")  + ";width:" + ("2px")  + ";}.v-table-caption-container{margin-right:" + ("6px")  + ";overflow:" + ("hidden")  + ";padding-left:" + ("4px")  + ";white-space:" + ("nowrap")  + ";line-height:" + ("30px")  + ";}.v-table-caption-container-align-right{float:" + ("left")  + ";text-align:" + ("left")  + ";}.v-table-sort-indicator{background:" + ("transparent")  + ";color:" + ("#c8c7b5") ) + (";float:" + ("left")  + ";height:" + ("30px")  + ";width:" + ("0")  + ";}.v-table-header-cell-asc .v-table-sort-indicator,.v-table-header-cell-desc .v-table-sort-indicator{float:" + ("left")  + ";height:" + ("1.2em")  + ";width:" + ("16px")  + ";}.v-table-body{background:" + ("#fff")  + ";}.v-table-row-spacer{height:" + ("10px")  + ";overflow:" + ("hidden")  + ";}.v-table-row,.v-table-row-odd{background:" + ("#fff")  + ";color:") + (("#43423d")  + ";border:" + ("0")  + ";cursor:" + ("pointer")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.v-table-cell-content{overflow:" + ("hidden")  + ";padding:" + ("6px"+ " " +"6px"+ " " +"6px"+ " " +"7px")  + ";vertical-align:" + ("top")  + ";white-space:" + ("nowrap")  + ";}.v-table .v-selected{background:" + ("#00a3e8")  + ";color:" + ("#fff") ) + (";}.v-table-cell-wrapper{overflow:" + ("hidden")  + ";padding:" + ("5px"+ " " +"0")  + ";white-space:" + ("nowrap")  + ";}.v-table-cell-wrapper-align-right{text-align:" + ("left")  + ";}.v-table-focus-slot-left{background:" + ("transparent")  + ";border-right:" + ("2px"+ " " +"solid"+ " " +"#999")  + ";border-right-color:" + ("#222")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";float:" + ("none")  + ";margin-bottom:" + ("-1.2em")  + ";margin-right:") + (("0")  + ";width:" + ("auto")  + ";}.v-table-focus-slot-right{border-left:" + ("2px"+ " " +"solid"+ " " +"#999")  + ";border-left-color:" + ("#222")  + ";margin-right:" + ("-2px")  + ";margin-left:" + ("0")  + ";}.v-table-header-drag{background:" + ("#efefef")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#eee")  + ";margin-top:" + ("20px")  + ";opacity:" + ("0.9")  + ";position:" + ("absolute") ) + (";z-index:" + ("30000")  + ";}.v-table-scrollposition{background:" + ("transparent")  + ";border:" + ("none")  + ";width:" + ("auto")  + ";}.v-table-scrollposition span{border:" + ("none")  + ";color:" + ("white")  + ";background:" + ("#5e5d55")  + ";opacity:" + ("0.8")  + ";display:" + ("block")  + ";padding:" + ("10px"+ " " +"30px")  + ";position:") + (("relative")  + ";top:" + ("10px")  + ";text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";}.v-table-body.focused{border-color:" + ("#388ddd")  + ";}.v-table-focus .v-table-cell-content{border-bottom:" + ("1px"+ " " +"dotted"+ " " +"#0066bd")  + ";border-top:" + ("1px"+ " " +"dotted"+ " " +"#0066bd")  + ";}.v-table-focus .v-table-cell-wrapper{margin-bottom:" + ("-1px")  + ";margin-top:" + ("-1px")  + ";}.v-table-header-wrap{background:" + ("#78776d")  + ";color:" + ("white") ) + (";height:" + ("30px")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";z-index:" + ("1")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-table-footer-wrap{background:" + ("#78776d")  + ";color:" + ("white")  + ";height:" + ("30px")  + ";overflow:" + ("hidden")  + ";border-top:" + ("none")  + ";}.v-table-header,.v-table-footer,.v-table-footer table{height:") + (("30px")  + ";}.v-table-caption-container .v-icon{height:" + ("16px")  + ";margin:" + ("-4px"+ " " +"0"+ " " +"0"+ " " +"3px")  + ";vertical-align:" + ("middle")  + ";vertical-align:" + ("middle")  + ";}.v-table-row-odd{background:" + ("#f5f5f2")  + ";}.v-table-cell-content:last-child{border-left-color:" + ("transparent")  + ";}.v-table-header-drag img{height:" + ("16px")  + ";margin:" + ("-3px"+ " " +"0"+ " " +"0"+ " " +"3px")  + ";}.v-table.v-disabled .v-table-header-cell,.v-table.v-disabled .v-table-header-cell-asc,.v-table.v-disabled .v-table-header-cell-desc,.v-table.v-disabled .v-table-resizer,.v-table-body-noselection .v-table-row,.v-table-body-noselection .v-table-row-odd,.v-table.v-disabled .v-table-column-selector{cursor:" + ("default")  + ";}.v-table-caption-container-align-center,.v-table-cell-wrapper-align-center{text-align:" + ("center") ) + (";}.v-table-header-drag .v-icon{vertical-align:" + ("middle")  + ";vertical-align:" + ("middle")  + ";}.v-table-header-drag *{vertical-align:" + ("middle")  + ";}.v-table-column-selector{margin-top:" + ("-27px")  + ";width:" + ("20px")  + ";float:" + ("left")  + ";height:" + ("1.2em")  + ";position:" + ("relative")  + ";cursor:" + ("pointer")  + ";line-height:" + ("8px")  + ";font-size:") + (("6px")  + ";text-align:" + ("center")  + ";}.v-table-column-selector:after{content:" + ("\"\\A \\A \"")  + ";font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";white-space:" + ("pre")  + ";}.v-table-header-cell-asc .v-table-sort-indicator:before{content:" + ("\"▲\"")  + ";line-height:" + ("30px")  + ";font-size:" + ("70%")  + ";}.v-table-header-cell-desc .v-table-sort-indicator:before{content:" + ("\"▼\"")  + ";line-height:" + ("30px") ) + (";font-size:" + ("70%")  + ";}.v-filterselect{overflow:" + ("hidden")  + ";background:" + ("#fff")  + ";height:" + ("22px")  + ";min-width:" + ("80px")  + ";}.v-filterselect-input{padding:" + ("0")  + ";}.v-filterselect-prompt{position:" + ("relative")  + ";}.v-filterselect-prompt .v-filterselect-input{position:" + ("absolute")  + ";right:" + ("0")  + ";left:" + ("25px")  + ";}.v-filterselect .v-icon{height:") + (("23px")  + ";margin-top:" + ("2px")  + " !important;}.v-filterselect-suggestmenu{min-width:" + ("290px")  + ";-webkit-tap-highlight-color:" + ("transparent")  + ";}.v-filterselect-suggestpopup,.v-datefield-calendarpanel{border-radius:" + ("4px")  + ";margin-top:" + ("4px")  + " !important;overflow:" + ("hidden")  + ";border:" + ("none")  + ";background:" + ("white")  + ";}.v-filterselect-suggestpopup .v-icon{height:" + ("32px")  + ";vertical-align:" + ("middle") ) + (";}.v-filterselect-suggestpopup .gwt-MenuItem{height:" + ("36px")  + ";line-height:" + ("36px")  + ";padding:" + ("2px"+ " " +"10px")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e0e0e0")  + ";}.v-filterselect-suggestpopup tr:last-child .gwt-MenuItem{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#e0e0e0")  + ";}.v-filterselect-nextpage,.v-filterselect-nextpage-off,.v-filterselect-prevpage-off,.v-filterselect-prevpage{width:" + ("25px")  + ";height:" + ("25px")  + ";overflow:" + ("hidden")  + ";margin:" + ("7px"+ " " +"auto")  + ";}.v-filterselect{position:" + ("relative")  + ";}.v-filterselect-button{left:") + (("0")  + ";top:" + ("0")  + ";height:" + ("25px")  + ";width:" + ("25px")  + ";position:" + ("absolute")  + ";font-size:" + ("18px")  + ";text-align:" + ("left")  + ";}.v-filterselect-button:before{content:" + ("\"\"")  + ";font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";margin-right:" + ("5px") ) + (";}.v-filterselect-button:active{opacity:" + ("1")  + ";}.v-filterselect-nextpage-off span,.v-filterselect-prevpage-off span,.v-filterselect-nextpage span,.v-filterselect-prevpage span{display:" + ("block")  + ";height:" + ("32px")  + ";text-indent:" + ("-9999px")  + ";}.v-filterselect-prevpage:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";}.v-filterselect-nextpage:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"")  + ";}.v-filterselect-prevpage-off:before{font-family:" + ("\"TkIcons\"")  + ";color:") + (("#00a3e8")  + ";}.v-filterselect-nextpage-off:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"")  + ";color:" + ("#f5f5f2")  + ";}.v-filterselect-prevpage:before{content:" + ("\"\"")  + ";}.v-filterselect-prevpage-off:before{content:" + ("\"\"")  + ";color:" + ("#f5f5f2")  + ";}.v-filterselect-status{position:" + ("absolute")  + ";left:" + ("12px")  + ";bottom:" + ("15px") ) + (";color:" + ("#b7b9bb")  + ";font-size:" + ("14px")  + ";}.v-datefield-popupcalendar{clear:" + ("both")  + ";float:" + ("none")  + ";padding:" + ("0")  + ";box-sizing:" + ("border-box")  + ";border-collapse:" + ("collapse")  + ";height:" + ("42px")  + ";}.v-datefield-button{-webkit-appearance:" + ("none")  + ";background:" + ("transparent")  + ";line-height:") + (("42px")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";margin-right:" + ("-25px")  + ";width:" + ("25px")  + ";text-align:" + ("left")  + ";}.v-datefield-button:after{font-family:" + ("\"TkIcons\"")  + ";font-size:" + ("18px")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"") ) + (";}.v-datefield-error{border:" + ("2px"+ " " +"solid"+ " " +"rgba(" + "250"+ ","+ " " +"40"+ ","+ " " +"0"+ ","+ " " +"0.6" + ")")  + ";}.v-datefield-calendarpanel,.v-inline-datefield-calendarpanel{background:" + ("#fff")  + ";border:" + ("none")  + ";}.v-datefield-calendarpanel button,.v-inline-datefield-calendarpanel button{-webkit-appearance:" + ("none")  + ";background:" + ("transparent")  + ";display:" + ("block")  + ";border:" + ("none")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("arial")  + ";font-size:") + (("20px")  + ";font-weight:" + ("bold")  + ";}.v-datefield-calendarpanel-header td,.v-inline-datefield-calendarpanel-header td{background:" + ("#f5f5f2")  + ";line-height:" + ("19px")  + ";height:" + ("25px")  + ";font-size:" + ("20px")  + ";font-weight:" + ("bold")  + ";width:" + ("1px")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.25" + ")")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.5" + ")")  + ";padding:" + ("0"+ " " +"6px"+ " " +"3px") ) + (";}.v-datefield-calendarpanel-header td.v-datefield-calendarpanel-month,.v-inline-datefield-calendarpanel-header td.v-inline-datefield-calendarpanel-month{width:" + ("auto")  + ";min-width:" + ("140px")  + ";}span.v-datefield-calendarpanel-month,span.v-inline-datefield-calendarpanel-month{line-height:" + ("26px")  + ";font-size:" + ("15px")  + ";}.v-datefield-calendarpanel .v-button-nextyear,.v-inline-datefield-calendarpanel .v-button-nextyear{border-left:" + ("none")  + ";}.v-datefield-calendarpanel table,.v-inline-datefield-calendarpanel table{padding:" + ("0"+ " " +"10px")  + ";}.v-datefield-time{padding:" + ("0"+ " " +"10px")  + ";padding-bottom:" + ("10px")  + ";}.v-datefield-calendarpanel td,.v-inline-datefield-calendarpanel td{text-align:" + ("center")  + ";}.v-datefield-popup{overflow:" + ("hidden")  + ";}.v-tree{display:") + (("block")  + ";}.v-tree-node{padding:" + ("4px"+ " " +"0")  + ";}.v-tree-node-caption{margin-right:" + ("35px")  + ";min-height:" + ("35px")  + ";line-height:" + ("28px")  + ";}.v-touchkit-verticalcomponentgroup{display:" + ("block")  + ";position:" + ("relative")  + ";width:" + ("100%")  + ";margin:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc") ) + (";background:" + ("white")  + ";-webkit-box-sizing:" + ("border-box")  + ";box-shadow:" + ("0"+ " " +"1px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";margin-bottom:" + ("10px")  + ";}.v-textfield,.v-textarea,.v-touchkit-numberfield,.v-datefield{-webkit-appearance:" + ("none")  + ";border:" + ("0")  + ";border-radius:" + ("0")  + ";color:" + ("#43423d")  + ";font-weight:") + (("500")  + ";font-size:" + ("16px")  + ";}.v-touchkit-verticalcomponentgroup .v-textfield{background:" + ("transparent")  + ";margin:" + ("0")  + ";height:" + ("42px")  + ";}.v-touchkit-verticalcomponentgroup .v-textarea{background:" + ("transparent")  + ";margin:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-touchkit-numberfield{background:" + ("transparent")  + ";margin:" + ("0")  + ";height:" + ("42px")  + ";}.v-touchkit-verticalcomponentgroup .v-datefield,.v-filterselect-input{background:" + ("transparent") ) + (";margin:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-textfield:focus,.v-touchkit-verticalcomponentgroup .v-textarea:focus,.v-touchkit-verticalcomponentgroup .v-touchkit-numberfield:focus{box-shadow:" + ("inset"+ " " +"0"+ " " +"-3px"+ " " +"#00a3e8")  + ";outline:" + ("none")  + ";}.v-touchkit-verticalcomponentgroup .v-textfield-error{color:" + ("#ed5931")  + ";}.v-touchkit-verticalcomponentgroup input:read-only{color:" + ("#000")  + ";}.v-touchkit-componentgroup-row .v-caption,.v-touchkit-componentgroup-cell>*{margin:" + ("10px"+ " " +"0")  + ";}.v-touchkit-componentgroup-cell>.v-form{margin-right:" + ("-10px")  + ";margin-left:" + ("-10px")  + ";display:" + ("block")  + ";}.v-select,.v-touchkit-datepicker{position:" + ("relative")  + ";padding:") + (("0")  + ";}.v-touchkit-datepicker>input{-webkit-appearance:" + ("none")  + ";border:" + ("none")  + ";color:" + ("#43423d")  + ";font-weight:" + ("500")  + ";font-size:" + ("16px")  + ";background:" + ("transparent")  + ";margin:" + ("0")  + ";display:" + ("block")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"1.5em")  + ";min-height:" + ("22px") ) + (";min-width:" + ("80px")  + ";width:" + ("100%")  + ";}.v-select-select{-webkit-appearance:" + ("none")  + ";border:" + ("none")  + ";color:" + ("#43423d")  + ";font-weight:" + ("500")  + ";font-size:" + ("16px")  + ";background:" + ("transparent")  + ";margin:" + ("0")  + ";display:" + ("block")  + ";padding:") + (("0"+ " " +"0"+ " " +"0"+ " " +"1.5em")  + ";min-height:" + ("22px")  + ";min-width:" + ("80px")  + ";}.v-touchkit-datepicker:after,.v-select:after{content:" + ("\"\"")  + ";text-align:" + ("left")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";width:" + ("1em")  + ";color:" + ("#00a3e8")  + ";pointer-events:" + ("none") ) + (";font-size:" + ("18px")  + ";font-family:" + ("\"TkIcons\"")  + ";}.v-touchkit-datepicker:after{content:" + ("\"\"")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup{margin:" + ("0")  + ";width:" + ("100%")  + ";}.v-touchkit-componentgroup-cell>.v-touchkit-navbutton{padding-right:" + ("10px")  + ";padding-left:" + ("16px")  + ";line-height:" + ("43px")  + ";}.v-touchkit-verticalcomponentgroup .v-slider-base{margin-right:" + ("5px")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option{height:" + ("40px")  + ";position:") + (("relative")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option input{font-size:" + ("large")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option>*{margin:" + ("14px"+ " " +"0")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option>label{display:" + ("block")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";left:" + ("0")  + ";padding-right:" + ("20px")  + ";padding-top:" + ("10px")  + ";margin:" + ("0") ) + (";color:" + ("#43423d")  + ";font-weight:" + ("500")  + ";vertical-align:" + ("top")  + ";line-height:" + ("normal")  + ";font-size:" + ("16px")  + ";height:" + ("30px")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup>.v-select-option:before{content:" + ("\"\"")  + ";display:" + ("block")  + ";position:" + ("absolute")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";right:" + ("0")  + ";left:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup :first-child:before{display:" + ("none")  + ";}.v-touchkit-componentgroup-cell>.v-formlayout{margin:" + ("0"+ " " +"-10px")  + ";width:" + ("auto")  + " !important;display:" + ("block")  + ";}.v-form>fieldset>div:last-child>.v-layout{display:" + ("block")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-captioncell,.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-contentcell,.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-errorcell{padding:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-contentcell{padding-left:" + ("10px") ) + (";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-captioncell{padding-right:" + ("10px")  + ";text-align:" + ("right")  + ";}.v-formlayout-captioncell>.v-caption{font-size:" + ("16px")  + ";color:" + ("#5e5d55")  + ";line-height:" + ("43px")  + ";height:" + ("43px")  + ";margin:" + ("0")  + ";}.v-formlayout-row>td{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";}.v-formlayout-lastrow>td{border-bottom:" + ("none")  + ";}.v-label-grey-title,.v-layout>.v-caption>div{font-size:" + ("16px")  + ";color:") + (("#7d7d6e")  + ";margin:" + ("10px")  + ";margin-top:" + ("15px")  + ";margin-bottom:" + ("5px")  + ";}.v-touchkit-componentgroup-row{position:" + ("relative")  + ";display:" + ("-webkit-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";padding:" + ("0"+ " " +"10px")  + ";}.v-touchkit-componentgroup-row:first-child{border-top:" + ("none") ) + (";}.v-touchkit-componentgroup-row:before{content:" + ("\"\"")  + ";display:" + ("block")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("10px")  + ";left:" + ("10px")  + ";}.v-touchkit-componentgroup-row:first-child:before{display:" + ("none")  + ";}.v-touchkit-componentgroup-row-cap{-webkit-box-align:" + ("center")  + ";min-height:" + ("42px")  + ";}.v-touchkit-componentgroup-row>.v-caption{font-size:") + (("16px")  + ";color:" + ("#5e5d55")  + ";padding-left:" + ("5px")  + ";-webkit-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";white-space:" + ("nowrap")  + ";overflow-x:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.v-touchkit-componentgroup-row-nocap>.v-caption{display:" + ("none")  + ";-webkit-box-flex:" + ("0")  + ";}.v-touchkit-componentgroup-row-nocap>.v-touchkit-componentgroup-cell{-webkit-box-flex:" + ("1") ) + (";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("100%")  + ";padding-right:" + ("0")  + ";}.v-touchkit-componentgroup-row-cap>.v-caption{-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("40%")  + ";}.v-touchkit-componentgroup-row-cap>.v-touchkit-componentgroup-cell{-webkit-box-flex:" + ("0")  + ";-ms-flex:" + ("0")  + ";flex:") + (("0")  + ";}.v-touchkit-componentgroup-row-cap>.v-touchkit-componentgroup-cell>*{float:" + ("left")  + ";}.v-touchkit-componentgroup-row-full>.v-caption{-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("40%")  + ";}.v-touchkit-componentgroup-row-full>.v-touchkit-componentgroup-cell{-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("60%")  + ";}.v-touchkit-componentgroup-row-full>.v-touchkit-componentgroup-cell>*{float:" + ("none") ) + (";}.v-touchkit-componentgroup-cell-fullwrapper .v-touchkit-horizontalbuttongroup{margin-top:" + ("10px")  + ";margin-bottom:" + ("10px")  + ";}.v-vertical.v-margin-left,.v-horizontal.v-margin-left{padding-right:" + ("10px")  + ";}.v-vertical.v-margin-bottom,.v-horizontal.v-margin-bottom{padding-bottom:" + ("10px")  + ";}.v-vertical.v-margin-right,.v-horizontal.v-margin-right{padding-left:" + ("10px")  + ";}.v-vertical.v-margin-top,.v-horizontal.v-margin-top{padding-top:" + ("10px")  + ";}.v-touchkit-navview-wrapper>.v-touchkit-verticalcomponentgroup,.v-touchkit-tabbar-wrapper>.v-touchkit-verticalcomponentgroup,.v-touchkit-swipeview>.v-touchkit-verticalcomponentgroup{width:" + ("auto")  + ";}.v-touchkit-datepopover{background:" + ("white")  + ";box-shadow:" + ("1px"+ " " +"1px"+ " " +"3px"+ " " +"3px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.25" + ")")  + ";cursor:" + ("default")  + ";width:") + (("290px")  + ";border-radius:" + ("3px")  + ";}.v-touchkit-datepopover .gwt-DatePicker{width:" + ("100%")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";}.v-touchkit-datepopover table.datePickerDays{border-collapse:" + ("collapse")  + ";background-color:" + ("#fbfbfb")  + ";width:" + ("289px")  + ";font-size:" + ("18px")  + ";}.v-touchkit-datepopover table.datePickerDays td{border:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";font-weight:" + ("bold") ) + (";color:" + ("#54626d")  + ";}.v-touchkit-datepopover .datePickerMonthSelector{width:" + ("100%")  + ";}.v-touchkit-datepopover .datePickerMonth{text-align:" + ("center")  + ";color:" + ("#7d7d6e")  + ";font-size:" + ("18px")  + ";padding-top:" + ("7px")  + ";font-weight:" + ("bold")  + ";}.v-touchkit-datepopover .datePickerDay,.v-touchkit-datepopover .datePickerWeekdayLabel,.v-touchkit-datepopover .datePickerWeekendLabel{min-width:" + ("40px")  + ";min-height:" + ("40px")  + ";line-height:" + ("40px")  + ";text-align:") + (("center")  + ";outline:" + ("0")  + ";}.v-touchkit-datepopover .datePickerPreviousButton,.v-touchkit-datepopover .datePickerNextButton{min-width:" + ("40px")  + ";min-height:" + ("40px")  + ";line-height:" + ("40px")  + ";text-align:" + ("center")  + ";outline:" + ("0")  + ";color:" + ("#00a3e8")  + ";font-size:" + ("40px")  + ";}.v-touchkit-datepopover table.datePickerDays td.datePickerWeekdayLabel,.v-touchkit-datepopover table.datePickerDays td.datePickerWeekendLabel{border:" + ("none")  + ";}.v-touchkit-datepopover .datePickerPreviousButton>*,.v-touchkit-datepopover .datePickerNextButton>*{outline:" + ("0") ) + (";}.v-touchkit-datepopover-noprev .datePickerPreviousButton,.v-touchkit-datepopover-nonext .datePickerNextButton{opacity:" + ("0.2")  + ";}.v-touchkit-datepopover .datePickerDay:focus{border-width:" + ("0")  + ";}.v-touchkit-datepopover .datePickerWeekdayLabel,.v-touchkit-datepopover .datePickerWeekendLabel{background-color:" + ("#f5f5f2")  + ";font-size:" + ("0.8em")  + ";}.v-touchkit-datepopover .datePickerDay{font-weight:" + ("bold")  + ";color:" + ("#333")  + ";}.v-touchkit-datepopover .datePickerDayIsValue{background-color:" + ("#7d7d6e")  + ";color:" + ("white")  + ";text-shadow:" + ("1px"+ " " +"1px"+ " " +"2px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.4" + ")")  + ";}.v-touchkit-datepopover .datePickerDayIsFiller{opacity:" + ("0.5")  + ";}.v-touchkit-datepopover .datePickerDayIsDisabled{display:") + (("none")  + ";text-decoration:" + ("line-through")  + ";}.v-touchkit-date-ok{font-size:" + ("32px")  + ";color:" + ("#00a3e8")  + ";text-align:" + ("center")  + ";height:" + ("32px")  + ";padding-top:" + ("8px")  + ";margin-right:" + ("28.57%")  + ";}.v-touchkit-date-cancel{font-size:" + ("32px")  + ";color:" + ("#00a3e8")  + ";text-align:" + ("center") ) + (";height:" + ("32px")  + ";padding-top:" + ("8px")  + ";float:" + ("right")  + ";width:" + ("81px")  + ";padding-right:" + ("1px")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"gray")  + ";}.v-touchkit-datepopover-hidedays .datePickerDays{display:" + ("none")  + ";}.v-touchkit-datepopover-time{border-bottom:" + ("1px"+ " " +"solid"+ " " +"gray")  + ";}.v-touchkit-datepopover-time:before{content:" + ("\"\"")  + ";font-family:" + ("\"TkIcons\"")  + ";color:") + (("gray")  + ";margin-right:" + ("115px")  + ";margin-left:" + ("5px")  + ";font-size:" + ("18px")  + ";}.v-touchkit-datepopover-time input{border:" + ("none")  + ";width:" + ("150px")  + ";padding:" + ("0")  + ";height:" + ("40px")  + ";font-size:" + ("18px")  + ";}.v-touchkit-componentgroup-cell .v-button,.v-touchkit-navbar .v-button,.v-touchkit-horizontalbuttongroup,.v-touchkit-navbutton-back,.v-touchkit-navbutton-forward{display:" + ("block")  + ";margin:" + ("0") ) + (";padding:" + ("0")  + ";overflow:" + ("hidden")  + ";-webkit-box-sizing:" + ("border-box")  + ";background:" + ("transparent")  + ";color:" + ("#00a3e8")  + ";box-shadow:" + ("none")  + ";border-radius:" + ("3px")  + ";line-height:" + ("30px")  + ";}.v-touchkit-navbutton-back{padding-right:" + ("10px")  + ";padding-left:" + ("20px")  + ";padding-right:") + (("20px")  + ";padding-left:" + ("10px")  + ";}.v-touchkit-navbutton-back:after{content:" + ("\"\"")  + ";right:" + ("3px")  + ";}.v-touchkit-navbutton-back:active:after{color:" + ("inherit")  + ";}.v-touchkit-horizontalbuttongroup .v-button{display:" + ("inline-block")  + ";border:" + ("0")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";border-radius:" + ("0")  + ";}.v-touchkit-horizontalbuttongroup .v-button:first-child{border-right:" + ("none")  + ";border-top-right-radius:" + ("3px") ) + (";border-bottom-right-radius:" + ("3px")  + ";}.v-touchkit-horizontalbuttongroup .v-button:last-child{border-top-left-radius:" + ("3px")  + ";border-bottom-left-radius:" + ("3px")  + ";}.v-touchkit-navbar .v-button,.v-touchkit-componentgroup-cell>.v-button,.v-touchkit-horizontalbuttongroup .v-button,.v-touchkit-navbutton-back,.v-touchkit-navbutton-forward{margin:" + ("0")  + ";font-size:" + ("14px")  + ";font-weight:" + ("normal")  + ";}.v-touchkit-componentgroup-cell>.v-button{margin:" + ("10px"+ " " +"0")  + ";float:" + ("right")  + ";}.v-touchkit-componentgroup-cell>.v-button>.v-button-wrap{padding:" + ("0")  + ";}.v-touchkit-navbar .v-button-wrap,.v-touchkit-horizontalbuttongroup .v-button-wrap{padding:" + ("0"+ " " +"10px")  + ";}.v-touchkit-horizontalbuttongroup{padding:") + (("0")  + ";display:" + ("inline-block")  + ";overflow:" + ("visible")  + ";}.v-touchkit-componentgroup-cell>.v-touchkit-horizontalbuttongroup{margin:" + ("10px"+ " " +"0")  + ";}.v-touchkit-componentgroup-cell>.v-upload-immediate .v-button{text-align:" + ("right")  + ";font-size:" + ("16px")  + ";line-height:" + ("20px")  + ";font-weight:" + ("500")  + ";color:" + ("#43423d")  + ";}.v-touchkit-componentgroup-cell>.v-upload-immediate .v-button-wrap{padding:" + ("0")  + ";}.v-touchkit-toolbar{background:" + ("#f9f9f8") ) + (";height:" + ("48px")  + ";display:" + ("-webkit-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("flex")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-toolbar .v-button{display:" + ("block")  + ";background:" + ("white")  + ";box-shadow:" + ("none")  + ";-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:") + (("1")  + ";padding:" + ("0")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";border-radius:" + ("0")  + ";color:" + ("#00a3e8")  + ";}.v-touchkit-toolbar .v-button:first-child{border:" + ("none")  + ";}.v-touchkit-toolbar .v-button-wrap{background:" + ("transparent")  + ";height:" + ("auto")  + ";padding:" + ("0")  + ";-webkit-box-shadow:" + ("none")  + ";font-size:" + ("10px") ) + (";line-height:" + ("1")  + ";overflow:" + ("visible")  + ";display:" + ("block")  + ";height:" + ("48px")  + ";background:" + ("transparent")  + ";}.v-touchkit-toolbar .v-button-caption{position:" + ("absolute")  + ";bottom:" + ("4px")  + ";right:" + ("0")  + ";left:" + ("0")  + ";}.v-touchkit-toolbar .v-button .v-icon{height:" + ("24px")  + ";display:") + (("inline")  + ";margin-top:" + ("12px")  + ";}.v-touchkit-tabbar-toolbar .v-button .v-icon{margin-top:" + ("8px")  + ";}.v-touchkit-horizontalbuttongroup .v-button-wrap{background:" + ("none")  + ";border-radius:" + ("0")  + ";}.v-touchkit-navbar .v-button-no-decoration{background:" + ("transparent")  + ";border:" + ("none")  + ";-webkit-box-shadow:" + ("none")  + ";overflow:" + ("visible")  + ";}.v-touchkit-navbar .v-button-no-decoration .v-button-wrap{border:" + ("none")  + ";background:" + ("transparent") ) + (";overflow:" + ("visible")  + ";-webkit-box-shadow:" + ("none")  + ";}.v-button-white .v-button-wrap{background-color:" + ("#fff")  + ";}.v-button-white .v-button-caption{color:" + ("#222")  + ";}.v-button.red{background-color:" + ("#ed5931")  + ";border:" + ("none")  + ";}.v-button.green{background-color:" + ("#0a0")  + ";border:" + ("none")  + ";}.v-button.blue{background-color:" + ("#00a3e8")  + ";border:" + ("none")  + ";}.v-button.red .v-button-wrap,.v-button.green .v-button-wrap,.v-button.blue .v-button-wrap,.v-touchkit-horizontalbuttongroup .v-button-red .v-button-caption,.v-touchkit-horizontalbuttongroup .v-button-blue .v-button-caption,.v-touchkit-horizontalbuttongroup .v-button-green .v-button-caption,.v-touchkit-navbar .v-button-red .v-button-caption,.v-touchkit-navbar .v-button-blue .v-button-caption,.v-touchkit-navbar .v-button-green .v-button-caption{color:") + (("white")  + ";}.v-treetable-treespacer{display:" + ("inline-block")  + ";height:" + ("19px")  + ";width:" + ("18px")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("5px")  + ";text-align:" + ("left")  + ";margin-left:" + ("4px")  + ";}.v-treetable-node-closed:after,.v-tree-node:after{content:" + ("\"▶\"")  + ";}.v-tree-node{position:" + ("relative") ) + (";}.v-treetable-node-open:after,.v-tree-node-expanded:after{content:" + ("\"▼\"")  + ";}.v-tree-node-leaf:after{content:" + ("\"\"")  + ";}.v-tree-node:after,.v-tree-node-expanded:after{position:" + ("absolute")  + ";top:" + ("12px")  + ";right:" + ("6px")  + ";}.v-treetable-node-closed::after,.v-treetable-node-open::after{margin-left:" + ("4px")  + ";}.v-menubar-submenu .v-menubar-menuitem-checked .v-menubar-menuitem-caption:after{content:" + ("\"X\"")  + ";color:" + ("#00a3e8")  + ";}.v-tree .v-tree-node-drag-top:before,.v-tree .v-tree-node-drag-bottom:after,.v-tree .v-tree-node-caption-drag-center:after{display:" + ("block")  + ";position:" + ("absolute")  + ";width:") + (("6px")  + ";height:" + ("6px")  + ";margin-top:" + ("-4px")  + ";background:" + ("transparent"+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.dragSlotDotImage())).getUrl() + "')")  + ";}.v-table-row-drag-top .v-table-cell-content:first-child:before,.v-table-row-drag-bottom .v-table-cell-content:first-child:after{display:" + ("block")  + ";position:" + ("absolute")  + ";width:" + ("6px")  + ";height:" + ("6px")  + ";margin-top:" + ("-4px")  + ";margin-right:" + ("-6px")  + ";background:" + ("transparent"+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.dragSlotDotImage())).getUrl() + "')") ) + (";}.v-ddwrapper-over-top:before,.v-ddwrapper-over-bottom:after,.v-ddwrapper-over-left:before,.v-ddwrapper-over-right:before{display:" + ("block")  + ";position:" + ("absolute")  + ";width:" + ("6px")  + ";height:" + ("6px")  + ";margin-top:" + ("-4px")  + ";margin-right:" + ("-2px")  + ";background:" + ("transparent"+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.dragSlotDotImage())).getUrl() + "')"+ " " +"no-repeat")  + ";}.v-cache-loading-indicator{position:" + ("absolute")  + ";left:" + ("5px")  + ";top:" + ("5px")  + ";}.v-cache-loading-indicator:after{font-size:") + (("10px")  + ";}.GL40WDDAIB{display:" + ("block")  + ";position:" + ("absolute")  + ";left:" + ("10px")  + ";top:" + ("0")  + ";bottom:" + ("0")  + ";}.GL40WDDAIB>div{display:" + ("table")  + ";height:" + ("100%")  + ";}.GL40WDDAIB>div>div{display:" + ("table-row")  + ";}.GL40WDDAIB>div>div>div{display:" + ("table-cell")  + ";vertical-align:" + ("middle") ) + (";text-align:" + ("center")  + ";color:" + ("gray")  + ";font-size:" + ("10px")  + ";font-weight:" + ("bold")  + ";padding:" + ("0"+ " " +"5px")  + ";}")) : ((".v-generated-body,.v-app{width:" + ("100%")  + ";height:" + ("100%")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";overflow:" + ("hidden")  + ";}.v-widget{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";text-align:" + ("left")  + ";display:" + ("inline-block")  + ";white-space:") + (("normal")  + ";vertical-align:" + ("bottom")  + ";font-size:" + ("16px")  + ";line-height:" + ("normal")  + ";}.v-absolutelayout-wrapper{position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";}.v-absolutelayout-margin,.v-absolutelayout-canvas{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-absolutelayout.v-has-height>div,.v-absolutelayout.v-has-height>div>div,.v-app{height:" + ("100%")  + ";}.v-absolutelayout.v-has-width>div,.v-absolutelayout.v-has-width>div>div{width:" + ("100%") ) + (";}.v-accordion{position:" + ("relative")  + ";outline:" + ("none")  + ";overflow:" + ("visible")  + ";text-align:" + ("left")  + ";}.v-accordion-item{position:" + ("relative")  + ";display:" + ("inline-block")  + ";width:" + ("100%")  + ";}.v-accordion-item-caption{overflow:" + ("visible")  + ";white-space:" + ("nowrap")  + ";background:" + ("#eee")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-accordion-item-caption .v-caption{cursor:" + ("pointer")  + ";font-size:" + ("16px")  + ";}.v-accordion-item-open .v-accordion-item-caption .v-caption{cursor:" + ("default")  + ";}.v-accordion-item-content{position:" + ("absolute")  + ";width:" + ("100%")  + ";}.v-nativebutton .v-icon{vertical-align:" + ("middle")  + ";margin-right:" + ("3px")  + ";border:" + ("none")  + ";}.v-nativebutton .v-errorindicator{display:" + ("inline-block")  + ";zoom:" + ("1") ) + (";vertical-align:" + ("middle")  + ";float:" + ("none")  + ";display:" + ("inline-block")  + ";zoom:" + ("1")  + ";float:" + ("none")  + ";}.v-nativebutton-link{border:" + ("none")  + ";text-align:" + ("left")  + " !important;background:" + ("transparent")  + ";padding:" + ("0")  + ";color:" + ("inherit")  + ";-khtml-user-select:") + (("text")  + ";-moz-user-select:" + ("text")  + ";-ie-user-select:" + ("text")  + ";user-select:" + ("text")  + ";}.v-nativebutton-link .v-nativebutton-caption{text-decoration:" + ("underline")  + ";color:" + ("inherit")  + ";text-align:" + ("left")  + ";}.v-nativebutton{text-align:" + ("center")  + " !important;cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";margin:" + ("0") ) + (";color:" + ("inherit")  + ";font:" + ("inherit")  + ";line-height:" + ("normal")  + ";}.v-nativebutton .v-nativebutton-caption{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";font:" + ("inherit")  + ";color:" + ("inherit")  + ";}.v-nativebutton .v-icon{vertical-align:" + ("middle")  + ";margin-right:" + ("3px")  + ";}.v-checkbox{display:" + ("block")  + ";vertical-align:") + (("middle")  + ";white-space:" + ("nowrap")  + ";}.v-checkbox label,.v-checkbox input{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.v-checkbox .v-icon{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";margin:" + ("0"+ " " +"2px")  + ";}.v-checkbox .v-errorindicator{float:" + ("none")  + ";display:" + ("inline")  + ";display:" + ("inline-block")  + ";zoom:" + ("1") ) + (";}.v-captionwrapper{text-align:" + ("left")  + ";}.v-caption{overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";font-size:" + ("16px")  + ";}.v-errorindicator{display:" + ("inline-block")  + ";}.v-errorindicator:before{position:" + ("absolute")  + ";content:" + ("\"!\"")  + ";color:" + ("red")  + ";}.v-caption .v-icon{display:" + ("inline-block")  + ";padding-right:" + ("2px")  + ";vertical-align:") + (("middle")  + ";}.v-caption .v-captiontext{display:" + ("inline-block")  + ";overflow:" + ("hidden")  + ";vertical-align:" + ("middle")  + ";}.v-caption .v-required-field-indicator{display:" + ("inline-block")  + ";}e.v-app,.v-window,.v-popupview-popup,.v-label,.v-caption{cursor:" + ("default")  + ";}.v-ui{height:" + ("100%")  + ";width:" + ("100%")  + ";outline:" + ("none")  + ";position:" + ("relative")  + ";}.v-ui.v-ui-embedded{margin-top:" + ("-1px") ) + (";border-top:" + ("1px"+ " " +"solid"+ " " +"transparent")  + ";}.v-ui:active,.v-ui:focus,.v-datefield-calendarpanel:focus,.v-inline-datefield-calendarpanel:focus,.v-menubar:focus,.v-menubar-popup:focus,.v-menubar-popup .popupContent:focus,.v-menubar-popup .popupContent .v-menubar-submenu:focus{outline:" + ("none")  + ";}e.v-app select,.v-window select{margin:" + ("0")  + ";}.v-disabled{opacity:" + ("0.3")  + ";cursor:" + ("default")  + ";}.v-disabled *{cursor:" + ("default")  + ";}* html .v-disabled,*+html .v-disabled{zoom:" + ("1")  + ";}.v-disabled .v-disabled{opacity:" + ("1")  + ";}.v-required-field-indicator{padding-left:" + ("2px")  + ";color:" + ("red")  + ";}.v-form fieldset{border:") + (("none")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";height:" + ("100%")  + ";}.v-form-content{height:" + ("100%")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-tooltip{display:" + ("none")  + ";}.v-contextmenu .gwt-MenuItem{cursor:" + ("pointer")  + ";vertical-align:" + ("middle") ) + (";padding:" + ("0")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";}.v-contextmenu .gwt-MenuItem div{cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.v-contextmenu .gwt-MenuItem-selected div{background:" + ("#aaa")  + ";color:" + ("#fff")  + ";}.v-contextmenu table{border-collapse:" + ("collapse")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";}.v-contextmenu .gwt-MenuItem img{margin-right:" + ("1em")  + ";vertical-align:" + ("middle")  + ";}.v-label pre{margin:" + ("0")  + ";}.v-label-undef-w,div.v-layout.v-horizontal.v-widget{white-space:" + ("nowrap")  + ";}.v-label h1,.v-label h2,.v-label h3,.v-label h4,.v-label h5,.v-label h6{line-height:" + ("normal")  + ";}.v-drag-element{z-index:" + ("60000")  + ";position:" + ("absolute")  + " !important;opacity:" + ("0.5")  + ";cursor:" + ("default")  + ";}.v-clip{overflow:" + ("hidden") ) + (";}.v-scrollable{overflow:" + ("auto")  + ";line-height:" + ("normal")  + ";-webkit-overflow-scrolling:" + ("touch")  + ";}.v-overlay-container{width:" + ("0")  + ";height:" + ("0")  + ";}.v-gridlayout.v-layout-margin-top{padding-top:" + ("24px")  + ";}.v-gridlayout,.v-verticallayout,.v-horizontallayout{line-height:" + ("normal")  + ";}.v-gridlayout.v-layout-margin-bottom{padding-bottom:" + ("24px")  + ";}.v-gridlayout.v-layout-margin-left{padding-left:" + ("24px")  + ";}.v-gridlayout.v-layout-margin-right{padding-right:" + ("24px")  + ";}.v-gridlayout .v-layout-spacing-on{padding-left:") + (("12px")  + ";padding-top:" + ("12px")  + ";}.v-spacing{width:" + ("6px")  + ";height:" + ("6px")  + ";}.v-vertical,.v-horizontal{display:" + ("inline-block")  + ";}.v-layout.v-vertical>.v-expand,.v-layout.v-horizontal>.v-expand{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";}.v-slot,.v-spacing{display:" + ("inline-block") ) + (";white-space:" + ("normal")  + ";vertical-align:" + ("top")  + ";}.v-vertical>.v-slot:after{display:" + ("inline-block")  + ";clear:" + ("both")  + ";width:" + ("0")  + ";height:" + ("0")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";}.v-vertical>.v-slot,.v-vertical>.v-expand>.v-slot{display:" + ("block")  + ";clear:" + ("both")  + ";}.v-horizontal>.v-slot,.v-horizontal>.v-expand>.v-slot{height:") + (("100%")  + ";}.v-vertical>.v-spacing,.v-vertical>.v-expand>.v-spacing{width:" + ("0")  + ";display:" + ("block")  + ";clear:" + ("both")  + ";}.v-horizontal>.v-spacing,.v-horizontal>.v-expand>.v-spacing{height:" + ("0")  + ";}.v-align-middle:before,.v-align-bottom:before,.v-expand>.v-align-middle:before,.v-expand>.v-align-bottom:before{content:" + ("\"\"")  + ";display:" + ("inline-block")  + ";height:" + ("100%")  + ";vertical-align:" + ("middle")  + ";width:" + ("0")  + ";}.v-align-middle{white-space:" + ("nowrap") ) + (";vertical-align:" + ("middle")  + ";}.v-align-bottom,.v-caption-on-left,.v-caption-on-right{white-space:" + ("nowrap")  + ";}.v-align-middle>.v-widget{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";}.v-align-bottom>.v-widget,.v-has-caption,.v-has-caption>.v-caption{display:" + ("inline-block")  + ";}.v-align-bottom,.v-align-bottom>.v-widget{vertical-align:" + ("bottom")  + ";}.v-align-center{text-align:" + ("center")  + ";}.v-align-center>.v-widget{margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";}.v-align-right{text-align:" + ("right")  + ";}.v-align-right>.v-widget{margin-left:") + (("auto")  + ";}.v-caption{overflow:" + ("visible")  + ";vertical-align:" + ("middle")  + ";}.v-caption-on-top>.v-caption,.v-caption-on-bottom>.v-caption{display:" + ("block")  + ";}.v-caption-on-left>.v-caption{padding-right:" + ("0.5em")  + ";}.v-caption-on-right>.v-caption{vertical-align:" + ("top")  + ";}.v-caption-on-left>.v-widget,.v-caption-on-right>.v-widget{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";}.v-has-caption.v-has-width>.v-widget{width:" + ("100%")  + " !important;}.v-has-caption.v-has-height>.v-widget{height:" + ("100%")  + " !important;}.v-errorindicator{vertical-align:" + ("middle") ) + (";}div.v-csslayout{display:" + ("block")  + ";}.v-csslayout-margin,.v-csslayout-container,.v-datefield-popupcalendar input.v-datefield-textfield,.v-inline-datefield-popupcalendar input.v-inline-datefield-textfield{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-has-width>.v-csslayout-margin,.v-has-width>.v-csslayout-margin>.v-csslayout-container,.v-has-width>input.v-datefield-textfield,.v-datefield-calendarpanel table,.v-has-width>input.v-inline-datefield-textfield,.v-inline-datefield-calendarpanel table{width:" + ("100%")  + ";}.v-has-height>.v-csslayout-margin,.v-has-height>.v-csslayout-margin>.v-csslayout-container,.v-formlayout.v-has-height>table{height:" + ("100%")  + ";}.v-customcomponent,.v-customlayout{overflow:" + ("hidden")  + ";}.v-datefield{white-space:" + ("nowrap")  + ";display:" + ("inline-block")  + ";}.v-datefield-textfield{vertical-align:" + ("top")  + ";}.v-datefield-button{cursor:") + (("pointer")  + ";vertical-align:" + ("top")  + ";}.v-datefield-prompt .v-datefield-textfield{color:" + ("#999")  + ";font-style:" + ("italic")  + ";}.v-datefield .v-datefield-button-readonly{display:" + ("none")  + ";}.v-datefield-calendarpanel td,.v-inline-datefield-calendarpanel td{padding:" + ("2px")  + ";margin:" + ("0")  + ";}.v-datefield-calendarpanel-header td{text-align:" + ("center")  + ";}.v-datefield-calendarpanel-month{text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";}.v-datefield-calendarpanel-weeknumber{color:" + ("#999") ) + (";border-right:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";font-size:" + ("11.7px")  + ";}.v-datefield-calendarpanel-day{cursor:" + ("pointer")  + ";}.v-datefield-calendarpanel-day-today{cursor:" + ("pointer")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-disabled .v-datefield-calendarpanel-day,.v-disabled .v-datefield-calendarpanel-day-today{cursor:" + ("default")  + ";}.v-datefield-calendarpanel-day-disabled{cursor:" + ("default")  + ";opacity:" + ("0.5")  + ";}.v-datefield-calendarpanel-day-selected{cursor:" + ("default")  + ";background:" + ("#00a3e8")  + ";color:") + (("#fff")  + ";display:" + ("block")  + ";}.v-datefield-calendarpanel-day-offmonth{color:" + ("#666")  + ";}.v-datefield-time{white-space:" + ("nowrap")  + ";}.v-datefield-time .v-label{display:" + ("inline")  + ";}.v-datefield-popup{background:" + ("#fff")  + ";}.v-inline-datefield{white-space:" + ("nowrap")  + ";display:" + ("inline-block")  + ";}.v-inline-datefield-textfield{vertical-align:" + ("top")  + ";}.v-inline-datefield-button{cursor:" + ("pointer")  + ";vertical-align:" + ("top") ) + (";}.v-inline-datefield-prompt .v-inline-datefield-textfield{color:" + ("#999")  + ";font-style:" + ("italic")  + ";}.v-inline-datefield .v-inline-datefield-button-readonly{display:" + ("none")  + ";}.v-inline-datefield-calendarpanel-header td{text-align:" + ("center")  + ";}.v-inline-datefield-calendarpanel-month{text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";}.v-inline-datefield-calendarpanel-weeknumber{color:" + ("#999")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";font-size:" + ("11.7px")  + ";}.v-inline-datefield-calendarpanel-day{cursor:" + ("pointer")  + ";}.v-inline-datefield-calendarpanel-day-today{cursor:") + (("pointer")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-disabled .v-inline-datefield-calendarpanel-day,.v-disabled .v-inline-datefield-calendarpanel-day-today{cursor:" + ("default")  + ";}.v-inline-datefield-calendarpanel-day-disabled{cursor:" + ("default")  + ";opacity:" + ("0.5")  + ";}.v-inline-datefield-calendarpanel-day-selected{cursor:" + ("default")  + ";background:" + ("#00a3e8")  + ";color:" + ("#fff")  + ";display:" + ("block")  + ";}.v-inline-datefield-calendarpanel-day-offmonth{color:" + ("#666")  + ";}.v-inline-datefield-time{white-space:" + ("nowrap") ) + (";}.v-inline-datefield-time .v-label{display:" + ("inline")  + ";}.v-inline-datefield-popup{background:" + ("#fff")  + ";}.v-ddwrapper{padding:" + ("2px")  + ";-moz-border-radius:" + ("4px")  + ";-webkit-border-radius:" + ("4px")  + ";border-radius:" + ("4px")  + ";position:" + ("relative")  + ";}[draggable=\"true\"]{-khtml-user-drag:" + ("element")  + ";-webkit-user-drag:" + ("element")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:") + (("none")  + ";}.v-ddwrapper-over{border:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("#bcdcff")  + ";padding:" + ("0")  + ";background-color:" + ("rgba(" + "169"+ ","+ " " +"209"+ ","+ " " +"255"+ ","+ " " +"0.6" + ")")  + ";}.no-box-drag-hints .v-ddwrapper-over{border:" + ("none")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";}.v-app .v-ddwrapper-over-top,.v-window .v-ddwrapper-over-top,.v-popupview-popup .v-ddwrapper-over-top{border:" + ("none")  + ";border-top:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent") ) + (";padding:" + ("2px")  + ";padding-top:" + ("0")  + ";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0")  + ";}.v-app .v-ddwrapper-over-bottom,.v-window .v-ddwrapper-over-bottom,.v-popupview-popup .v-ddwrapper-over-bottom{border:" + ("none")  + ";border-bottom:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";padding-bottom:" + ("0")  + ";-moz-border-radius:") + (("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0")  + ";}.v-app .v-ddwrapper-over-left,.v-window .v-ddwrapper-over-left,.v-popupview-popup .v-ddwrapper-over-left{border:" + ("none")  + ";border-left:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";padding-left:" + ("0")  + ";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0") ) + (";}.v-app .v-ddwrapper-over-right,.v-window .v-ddwrapper-over-right,.v-popupview-popup .v-ddwrapper-over-right{border:" + ("none")  + ";border-right:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";background-color:" + ("transparent")  + ";padding:" + ("2px")  + ";padding-right:" + ("0")  + ";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";border-radius:" + ("0")  + ";}.v-ddwrapper,.v-ddwrapper-over,.v-app .v-ddwrapper-over-top,.v-window .v-ddwrapper-over-top,.v-popupview-popup .v-ddwrapper-over-top,.v-app .v-ddwrapper-over-bottom,.v-window .v-ddwrapper-over-bottom,.v-popupview-popup .v-ddwrapper-over-bottom,.v-app .v-ddwrapper-over-left,.v-window .v-ddwrapper-over-left,.v-popupview-popup .v-ddwrapper-over-left,.v-app .v-ddwrapper-over-right,.v-window .v-ddwrapper-over-right,.v-popupview-popup .v-ddwrapper-over-right{border-color:" + ("rgba(" + "0"+ ","+ " " +"109"+ ","+ " " +"232"+ ","+ " " +"0.6" + ")")  + ";}.v-ddwrapper-over-bottom:after{margin-top:" + ("-2px")  + ";}.v-ddwrapper-over-left:before{background-position:") + (("0"+ " " +"-6px")  + ";margin-top:" + ("-2px")  + ";margin-left:" + ("-4px")  + ";}.v-ddwrapper-over-right:before{background-position:" + ("0"+ " " +"-6px")  + ";margin-top:" + ("-2px")  + ";margin-left:" + ("-4px")  + ";position:" + ("relative")  + ";margin-bottom:" + ("-4px")  + ";margin-right:" + ("-4px")  + ";margin-left:" + ("0")  + ";width:" + ("auto") ) + (";background-position:" + ("100%"+ " " +"-6px")  + ";}.no-horizontal-drag-hints .v-ddwrapper-over-left{padding-left:" + ("2px")  + ";border-left:" + ("none")  + ";}.no-horizontal-drag-hints .v-ddwrapper-over-right{padding-right:" + ("2px")  + ";border-right:" + ("none")  + ";}.no-vertical-drag-hints .v-ddwrapper-over-top{padding-top:" + ("2px")  + ";border-top:" + ("none")  + ";}.no-vertical-drag-hints .v-ddwrapper-over-bottom{padding-bottom:" + ("2px")  + ";border-bottom:" + ("none")  + ";}.no-horizontal-drag-hints .v-ddwrapper-over-left:before,.no-horizontal-drag-hints .v-ddwrapper-over-right:before,.no-vertical-drag-hints .v-ddwrapper-over-top:before,.no-vertical-drag-hints .v-ddwrapper-over-bottom:after{display:" + ("none")  + ";}.v-table .v-embedded-image{display:") + (("inline-block")  + ";}.v-formlayout.v-has-width>table{width:" + ("100%")  + ";}.v-formlayout-cell .v-errorindicator{display:" + ("block")  + ";}.v-formlayout-error-indicator{width:" + ("12px")  + ";}.v-formlayout-captioncell{text-align:" + ("right")  + ";white-space:" + ("nowrap")  + ";}.v-formlayout-errorcell,.v-formlayout-captioncell{width:" + ("1px")  + ";}.v-formlayout-captioncell .v-caption{overflow:" + ("visible")  + ";}.v-formlayout-spacing>tbody>.v-formlayout-row>.v-formlayout-captioncell,.v-formlayout-spacing>tbody>.v-formlayout-row>.v-formlayout-contentcell,.v-formlayout-spacing>tbody>.v-formlayout-row>.v-formlayout-errorcell{padding-top:" + ("6px")  + ";}.v-formlayout-spacing>tbody>.v-formlayout-firstrow>.v-formlayout-captioncell,.v-formlayout-spacing>tbody>.v-formlayout-firstrow>.v-formlayout-contentcell,.v-formlayout-spacing>tbody>.v-formlayout-firstrow>.v-formlayout-errorcell{padding-top:" + ("0")  + ";}.v-formlayout-margin-top>tbody>.v-formlayout-firstrow>.v-formlayout-captioncell,.v-formlayout-margin-top>tbody>.v-formlayout-firstrow>.v-formlayout-contentcell,.v-formlayout-margin-top>tbody>.v-formlayout-firstrow>.v-formlayout-errorcell,.v-gridlayout-margin-top{padding-top:" + ("12px") ) + (";}.v-formlayout-margin-bottom>tbody>.v-formlayout-lastrow>.v-formlayout-captioncell,.v-formlayout-margin-bottom>tbody>.v-formlayout-lastrow>.v-formlayout-contentcell,.v-formlayout-margin-bottom>tbody>.v-formlayout-lastrow>.v-formlayout-errorcell,.v-gridlayout-margin-bottom{padding-bottom:" + ("12px")  + ";}.v-formlayout-margin-left>tbody>.v-formlayout-row>.v-formlayout-captioncell,.v-gridlayout-margin-left{padding-left:" + ("12px")  + ";}.v-formlayout-margin-right>tbody>.v-formlayout-row>.v-formlayout-contentcell,.v-gridlayout-margin-right{padding-right:" + ("12px")  + ";}.v-formlayout-captioncell .v-caption .v-required-field-indicator{float:" + ("none")  + ";}.v-gridlayout{position:" + ("relative")  + ";}.v-gridlayout-slot{position:" + ("absolute")  + ";}.v-gridlayout-spacing-on{padding-left:" + ("6px")  + ";padding-top:" + ("6px")  + ";overflow:" + ("hidden")  + ";}.v-gridlayout-spacing{padding-left:" + ("0")  + ";padding-top:") + (("0")  + ";}.v-gridlayout-spacing-off{padding-left:" + ("0")  + ";padding-top:" + ("0")  + ";overflow:" + ("hidden")  + ";}.v-label{overflow:" + ("hidden")  + ";}.v-label.v-has-width{white-space:" + ("normal")  + ";}.v-link{white-space:" + ("nowrap")  + ";}.v-link a{vertical-align:" + ("middle")  + ";text-decoration:" + ("none")  + ";}.v-link span{text-decoration:" + ("underline")  + ";vertical-align:" + ("middle") ) + (";}.v-disabled a{cursor:" + ("default")  + ";}.v-link img{vertical-align:" + ("middle")  + ";border:" + ("none")  + ";}.v-loginform{height:" + ("140px")  + ";width:" + ("200px")  + ";}.v-app-loginpage .v-button{float:" + ("left")  + ";float:" + ("left")  + ";}.v-menubar{display:" + ("inline-block")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.v-menubar .v-menubar-menuitem{cursor:") + (("default")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";display:" + ("inline")  + ";display:" + ("inline-block")  + ";zoom:" + ("1")  + ";}.v-menubar .v-menubar-menuitem-caption .v-icon{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.v-menubar-submenu{background:" + ("#fff")  + ";}.v-menubar-menuitem-selected{background:" + ("#333")  + ";color:" + ("#fff") ) + (";}.v-menubar-submenu .v-menubar-menuitem{cursor:" + ("default")  + ";display:" + ("block")  + ";position:" + ("relative")  + ";padding-right:" + ("1.5em")  + ";}.v-menubar-submenu .v-menubar-menuitem-caption{display:" + ("block")  + ";}.v-menubar-submenu .v-menubar-menuitem *,.v-menubar-submenu .v-menubar-menuitem-caption *{white-space:" + ("nowrap")  + ";}.v-menubar-submenu-indicator{display:" + ("none")  + ";font-family:" + ("arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.v-menubar-submenu .v-menubar-submenu-indicator{display:" + ("block")  + ";position:" + ("absolute")  + ";right:") + (("0")  + ";width:" + ("1em")  + ";height:" + ("1em")  + ";font-size:" + ("11.7px")  + ";}.v-menubar-menuitem-disabled,.v-menubar span.v-menubar-menuitem-disabled:hover,.v-menubar span.v-menubar-menuitem-disabled:focus,.v-menubar span.v-menubar-menuitem-disabled:active{color:" + ("#999")  + ";}.v-menubar-more-menuitem{font-family:" + ("arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.v-menubar-separator{overflow:" + ("hidden")  + ";}.v-menubar-separator span{display:" + ("block")  + ";text-indent:" + ("-9999px")  + ";font-size:" + ("1px")  + ";line-height:" + ("1px") ) + (";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";margin:" + ("3px"+ " " +"0"+ " " +"2px")  + ";overflow:" + ("hidden")  + ";}.v-menubar .v-icon,.v-menubar-submenu .v-icon{margin-right:" + ("3px")  + ";}.v-menubar-submenu-check-column .v-menubar-menuitem{padding-left:" + ("6px")  + ";}.v-menubar-submenu-check-column .v-menubar-menuitem-caption{padding-left:" + ("18px")  + ";}.v-Notification h1,.v-Notification p,.v-Notification-error h1,.v-Notification-error p,.v-Notification-warning h1,.v-Notification-warning p{margin:" + ("0"+ " " +"1em")  + ";}.v-Notification-warning{background:" + ("orange")  + ";}.v-Notification-error{background:" + ("red")  + ";}.v-Notification-tray h1,.v-Notification-tray p{display:" + ("block")  + ";}.v-Notification-system{background-color:") + (("red")  + ";opacity:" + ("0.7")  + ";}.v-Notification-system h1{display:" + ("block")  + ";margin:" + ("0")  + ";}.v-orderedlayout,.v-horizontallayout,.v-verticallayout{position:" + ("relative")  + ";}.v-orderedlayout-spacing-off,.v-horizontallayout-spacing-off,.v-verticallayout-spacing-off{padding-top:" + ("0")  + ";padding-left:" + ("0")  + ";}.v-horizontallayout-slot,.v-verticallayout-slot,.v-shadow{position:" + ("absolute")  + ";}.v-panel{outline:" + ("none")  + ";text-align:" + ("left")  + ";}.v-panel-caption{outline:" + ("none") ) + (";text-align:" + ("left")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";font-weight:" + ("500")  + ";}.v-panel-content{outline:" + ("none")  + ";text-align:" + ("left")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-panel-deco,.v-panel-light,.v-panel-caption-light,.v-panel-content-light,.v-panel-deco-light{outline:" + ("none")  + ";text-align:") + (("left")  + ";}.v-panel-caption .v-errorindicator{float:" + ("none")  + ";display:" + ("inline")  + ";}.v-panel-caption .v-icon{display:" + ("inline")  + ";vertical-align:" + ("middle")  + ";}.v-panel-caption span{vertical-align:" + ("middle")  + ";}.v-panel-nocaption{overflow:" + ("hidden")  + ";}.v-panel.v-has-width>.v-panel-content{width:" + ("100%")  + ";}.v-panel.v-has-height>.v-panel-content{height:" + ("100%")  + ";}.v-popupview{cursor:" + ("pointer")  + ";text-decoration:" + ("underline") ) + (";white-space:" + ("nowrap")  + ";}.v-popupview-popup{overflow:" + ("auto")  + ";}.v-progressindicator,.v-progressbar{width:" + ("150px")  + ";}.v-progressindicator-wrapper,.v-progressbar-wrapper{height:" + ("7px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.v-progressindicator-indicator,.v-progressbar-indicator{height:" + ("7px")  + ";background:" + ("#ddd")  + ";}.v-progressindicator-indeterminate .v-progressindicator-wrapper,.v-progressindicator-indeterminate .v-progressindicator-indicator,.v-progressindicator-indeterminate-disabled .v-progressindicator-wrapper,.v-progressindicator-indeterminate-disabled .v-progressindicator-indicator,.v-progressbar-indeterminate .v-progressbar-wrapper,.v-progressbar-indeterminate .v-progressbar-indicator,.v-progressbar-indeterminate-disabled .v-progressbar-wrapper,.v-progressbar-indeterminate-disabled .v-progressbar-indicator{display:" + ("none")  + ";}div.v-progressindicator-indeterminate-disabled{height:" + ("20px")  + ";width:" + ("20px")  + ";background:") + (("transparent")  + ";}.v-select-optiongroup .v-select-option{display:" + ("block")  + ";white-space:" + ("nowrap")  + ";}.v-select-optiongroup .v-icon{vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";margin:" + ("0"+ " " +"2px")  + ";}.v-select-twincol{white-space:" + ("nowrap")  + ";}.v-select-twincol-options{float:" + ("left")  + ";}.v-select-twincol-caption-left{float:" + ("left")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis") ) + (";}.v-select-twincol-selections{font-weight:" + ("500")  + ";}.v-select-twincol-caption-right{float:" + ("right")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.v-select-twincol-buttons{float:" + ("left")  + ";text-align:" + ("center")  + ";}.v-select-twincol-buttons .v-select-twincol-deco{clear:" + ("both")  + ";}.v-select-twincol .v-textfield{display:" + ("block")  + ";float:" + ("left")  + ";clear:" + ("left")  + ";}.v-select-twincol .v-button{float:") + (("left")  + ";}.v-select-twincol-buttons .v-button{float:" + ("none")  + ";}.v-slider{margin:" + ("5px"+ " " +"0")  + ";}.v-slider-vertical{width:" + ("2px")  + ";height:" + ("auto")  + ";margin:" + ("0"+ " " +"5px")  + ";border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#cccfd0")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#cccfd0")  + ";}.v-slider-vertical .v-slider-base{width:" + ("2px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#eee") ) + (";border-right:" + ("none")  + ";}.v-slider-vertical .v-slider-handle{width:" + ("12px")  + ";height:" + ("12px")  + ";font-size:" + ("0")  + ";margin-left:" + ("-5px")  + ";}.v-slider-feedback{padding:" + ("2px"+ " " +"5px")  + ";background:" + ("#444")  + ";color:" + ("#fff")  + ";font-size:" + ("11px")  + ";line-height:" + ("13px")  + ";font-weight:") + (("500")  + ";font-family:" + ("Arial"+ ","+ " " +"Helvetica"+ ","+ " " +"sans-serif")  + ";border-radius:" + ("4px")  + ";-webkit-border-radius:" + ("4px")  + ";-moz-border-radius:" + ("4px")  + ";margin:" + ("-2px"+ " " +"0"+ " " +"0"+ " " +"2px")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"0"+ " " +"#000")  + ";}.v-splitpanel-horizontal,.v-splitpanel-vertical{overflow:" + ("hidden")  + ";}.v-splitpanel-hsplitter{width:" + ("6px")  + ";}.v-splitpanel-hsplitter div{width:" + ("6px")  + ";position:" + ("absolute") ) + (";top:" + ("0")  + ";bottom:" + ("0")  + ";background:" + ("#ddd")  + ";cursor:" + ("e-resize")  + ";cursor:" + ("col-resize")  + ";}.v-disabled .v-splitpanel-hsplitter div{cursor:" + ("default")  + ";}.v-splitpanel-vsplitter{height:" + ("6px")  + ";}.v-splitpanel-vsplitter div{height:" + ("6px")  + ";background:" + ("#ddd")  + ";cursor:" + ("s-resize")  + ";cursor:") + (("row-resize")  + ";}.v-disabled .v-splitpanel-vsplitter div{cursor:" + ("default")  + ";}.v-off{color:" + ("#ddd")  + ";}.v-table-drag .v-table-body{border-color:" + ("#1d9dff")  + ";}.v-table-row-drag-middle .v-table-cell-content{background-color:" + ("#bcdcff")  + ";}.v-table-row-drag-top .v-table-cell-content{border-top:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";}.v-table-row-drag-top .v-table-cell-wrapper{margin-top:" + ("-2px")  + ";}.v-table-row-drag-bottom .v-table-cell-content{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";}.v-table-row-drag-bottom .v-table-cell-wrapper{margin-bottom:" + ("-2px")  + ";}.v-tabsheet,.v-tabsheet-content,.v-tabsheet-deco{outline:" + ("none")  + ";text-align:" + ("left") ) + (";}.v-tabsheet-tabs{empty-cells:" + ("hide")  + ";border-collapse:" + ("collapse")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border:" + ("0")  + ";width:" + ("100%")  + ";overflow:" + ("hidden")  + ";}.v-tabsheet-tabitemcell:focus,input.v-textfield-readonly:focus,textarea.v-textarea-readonly:focus{outline:" + ("none")  + ";}.v-tabsheet-tabitemcell{margin:" + ("0")  + ";padding:" + ("0")  + ";vertical-align:") + (("bottom")  + ";}.v-tabsheet-spacertd{margin:" + ("0")  + ";padding:" + ("0")  + ";vertical-align:" + ("bottom")  + ";width:" + ("100%")  + ";}.v-tabsheet-spacertd div{border-left:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";height:" + ("1em")  + ";padding:" + ("0.2em"+ " " +"0")  + ";}.v-tabsheet-hidetabs>.v-tabsheet-tabcontainer,.v-disabled .v-tabsheet-scroller{display:" + ("none")  + ";}.v-tabsheet-scroller{white-space:" + ("nowrap") ) + (";text-align:" + ("right")  + ";margin-top:" + ("-1em")  + ";}.v-tabsheet-scrollerPrev,.v-tabsheet-scrollerNext,.v-tabsheet-scrollerPrev-disabled,.v-tabsheet-scrollerNext-disabled{border:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";background:" + ("#fff")  + ";width:" + ("12px")  + ";height:" + ("1em")  + ";cursor:" + ("pointer")  + ";}.v-tabsheet-scrollerPrev-disabled,.v-tabsheet-scrollerNext-disabled{opacity:" + ("0.5")  + ";cursor:" + ("default")  + ";}.v-tabsheet-tabs .v-caption,.v-tabsheet-tabs .v-caption span{white-space:" + ("nowrap")  + ";}.v-tabsheet-caption-close{display:") + (("inline")  + ";display:" + ("inline-block")  + ";zoom:" + ("1")  + ";width:" + ("16px")  + ";height:" + ("16px")  + ";text-align:" + ("center")  + ";font-weight:" + ("bold")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";user-select:" + ("none")  + ";-khtml-user-select:" + ("none") ) + (";-ms-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.v-tabsheet .v-disabled .v-tabsheet-caption-close{cursor:" + ("default")  + ";visibility:" + ("hidden")  + ";}.v-tabsheet-tabitem:hover .v-tabsheet-caption-close,div table.v-treetable-animation-clone tr.v-table-row,div table.v-treetable-animation-clone tr.v-table-row-odd,div table.v-treetable-animation-clone tr.v-table-row td.v-table-cell-content,div table.v-treetable-animation-clone tr.v-table-row-odd td.v-table-cell-content{visibility:" + ("visible")  + ";}.v-tabsheet-tabitem{border:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";border-right:" + ("none")  + ";cursor:" + ("pointer")  + ";padding:" + ("0.2em"+ " " +"0.5em")  + ";}.v-tabsheet-tabitem .v-caption{cursor:") + (("inherit")  + ";}.v-tabsheet.v-disabled .v-tabsheet-tabitem,.v-tabsheet-tabitemcell-disabled .v-tabsheet-tabitem{cursor:" + ("default")  + ";}.v-tabsheet-tabitem-selected{cursor:" + ("default")  + ";border-bottom-color:" + ("#fff")  + ";}.v-tabsheet-tabitem-selected .v-caption{cursor:" + ("default")  + ";}.v-tabsheet-content{border:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";border-top:" + ("none")  + ";border-bottom:" + ("none")  + ";position:" + ("relative")  + ";}.v-tabsheet-deco{height:" + ("1px")  + ";background:" + ("#aaa") ) + (";overflow:" + ("hidden")  + ";}.v-tabsheet-hidetabs .v-tabsheet-content{border:" + ("none")  + ";}.v-tabsheet-hidetabs .v-tabsheet-deco{height:" + ("0")  + ";}.v-textfield{text-align:" + ("left")  + ";}.v-textarea{resize:" + ("none")  + ";white-space:" + ("pre-wrap")  + ";}input.v-textfield-prompt,textarea.v-textarea-prompt{color:" + ("#999")  + ";font-style:" + ("italic")  + ";}input.v-textfield-readonly,textarea.v-textarea-readonly{background:" + ("transparent")  + ";border:" + ("none")  + ";resize:") + (("none")  + ";}input.v-disabled,textarea.v-disabled{resize:" + ("none")  + ";}input:focus,textarea:focus{outline-width:" + ("medium")  + ";}.v-tree{text-align:" + ("left")  + ";padding:" + ("1px"+ " " +"0")  + ";outline:" + ("none")  + ";}.v-tree-node-caption:focus,.v-window-contents>div,.v-button:focus{outline:" + ("none")  + ";}div.v-tree-node-leaf{background:" + ("transparent")  + ";}.v-tree-node-caption{margin-left:" + ("1em")  + ";}.v-tree-node span{cursor:" + ("pointer")  + ";}.v-tree-node-caption div,.v-upload{white-space:" + ("nowrap") ) + (";}.v-tree-node-caption span,.v-tree-node-caption .v-icon,.v-window-header .v-icon{vertical-align:" + ("middle")  + ";}.v-tree-node-selected span{background:" + ("#999")  + ";color:" + ("#fff")  + ";}.v-tree-node-children{padding-left:" + ("1em")  + ";}.v-tree .v-tree-node-drag-top{border-top:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";margin-top:" + ("-1px")  + ";padding-top:" + ("0")  + ";background-position:" + ("5px"+ " " +"-38px")  + ";}.v-tree .v-tree-node-drag-bottom{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";margin-bottom:" + ("-1px")  + ";padding-bottom:") + (("0")  + ";}.v-tree .v-tree-node-drag-bottom:after{margin-top:" + ("-2px")  + ";}.v-tree .v-tree-node-caption-drag-center:after{margin-left:" + ("14px")  + ";}.v-tree .v-tree-node-drag-top.v-tree-node-expanded{background-position:" + ("-5px"+ " " +"-11px")  + ";}.v-tree .v-tree-node-caption-drag-center div{border:" + ("2px"+ " " +"solid"+ " " +"#1d9dff")  + ";-moz-border-radius:" + ("4px")  + ";-webkit-border-radius:" + ("4px")  + ";border-radius:" + ("4px")  + ";margin:" + ("-2px"+ " " +"2px"+ " " +"-2px"+ " " +"-2px")  + ";background-color:" + ("#bcdcff")  + ";background-color:" + ("rgba(" + "169"+ ","+ " " +"209"+ ","+ " " +"255"+ ","+ " " +"0.6" + ")") ) + (";border-color:" + ("rgba(" + "0"+ ","+ " " +"109"+ ","+ " " +"232"+ ","+ " " +"0.6" + ")")  + ";}.v-tree .v-tree-node-drag-top,.v-tree .v-tree-node-drag-bottom{border-color:" + ("rgba(" + "0"+ ","+ " " +"109"+ ","+ " " +"232"+ ","+ " " +"0.6" + ")")  + ";}.v-treetable .v-checkbox{display:" + ("inline-block")  + ";padding-bottom:" + ("4px")  + ";}.v-treetable .v-table-row .v-table-cell-content,.v-treetable .v-table-row-odd .v-table-cell-content{position:" + ("relative")  + ";z-index:" + ("10")  + ";}.v-treetable .v-table-cell-wrapper{position:" + ("relative")  + ";}.v-treetable .v-table-body .v-table-table .v-table-row-animating{zoom:" + ("1")  + ";z-index:" + ("1")  + ";background:" + ("transparent")  + ";}.v-treetable .v-table-body .v-table-table .v-table-row-animating .v-table-cell-content{background:") + (("transparent")  + ";}.v-treetable-animation-clone{border-spacing:" + ("0")  + ";zoom:" + ("1")  + ";}div.v-treetable-animation-clone-wrapper{position:" + ("absolute")  + ";z-index:" + ("2")  + ";background-color:" + ("#fff")  + ";}div.v-treetable-animation-clone-wrapper table.v-treetable-animation-clone{background-color:" + ("#fff")  + ";}.v-upload-immediate{position:" + ("relative")  + ";margin:" + ("0")  + ";overflow:" + ("hidden")  + ";}.v-upload-immediate input{opacity:" + ("0") ) + (";z-index:" + ("2")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";height:" + ("21px")  + ";text-align:" + ("right")  + ";border:" + ("none")  + ";background:" + ("transparent")  + ";}.v-upload-immediate button{position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";width:") + (("100%")  + ";text-align:" + ("left")  + ";}.v-window{background:" + ("#fff")  + ";}.v-window-contents{-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";}.v-window.v-has-width>div.popupContent,.v-window.v-has-width .v-window-wrap,.v-window.v-has-width .v-window-contents,.v-window.v-has-width .v-window-contents>div{width:" + ("100%")  + ";}.v-window.v-has-height>div.popupContent,.v-window.v-has-height .v-window-wrap,.v-window.v-has-height .v-window-contents,.v-window.v-has-height .v-window-contents>div{height:" + ("100%")  + ";}.v-window-outerheader{padding:" + ("0.3em"+ " " +"1em")  + ";height:" + ("1.6em")  + ";position:" + ("relative") ) + (";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";cursor:" + ("move")  + ";}.v-window-draggingCurtain{cursor:" + ("move")  + ";}.v-window-header{font-weight:" + ("500")  + ";}div.v-window-header{white-space:" + ("nowrap")  + ";text-overflow:" + ("ellipsis")  + ";-ms-text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";padding:") + (("0")  + ";}.v-window-footer{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";height:" + ("10px")  + ";position:" + ("relative")  + ";cursor:" + ("move")  + ";}.v-window-resizebox{width:" + ("10px")  + ";height:" + ("10px")  + ";background:" + ("#ddd")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute") ) + (";right:" + ("0")  + ";cursor:" + ("se-resize")  + ";}.v-window-resizingCurtain{cursor:" + ("se-resize")  + ";}.v-window div.v-window-footer-noresize{height:" + ("0")  + ";}.v-window-resizebox-disabled{cursor:" + ("default")  + ";display:" + ("none")  + ";}.v-window-closebox{position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";width:" + ("1em")  + ";height:") + (("1em")  + ";background:" + ("red")  + ";cursor:" + ("pointer")  + ";overflow:" + ("hidden")  + ";}.v-window-modalitycurtain{top:" + ("0")  + ";left:" + ("0")  + ";background:" + ("#999")  + ";opacity:" + ("0.5")  + ";position:" + ("fixed")  + ";width:" + ("100%")  + ";height:" + ("100%") ) + (";}@font-face{font-family:" + ("\"TkIcons\"")  + ";src:" + ("url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.fontAwesome())).getUrl() + "')"+ " " +"format(" + "\"woff\"" + ")"+ ","+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.fontAwesomeOtf())).getUrl() + "')"+ " " +"format(" + "\"opentype\"" + ")")  + ";font-weight:" + ("normal")  + ";font-style:" + ("normal")  + ";}.v-csslayout{overflow:" + ("visible")  + ";}.v-shadow,.v-shadow-window{display:" + ("none")  + ";}body{font-family:" + ("\"Helvetica Neue\""+ ","+ " " +"Helvetica"+ ","+ " " +"Arial"+ ","+ " " +"Tahoma"+ ","+ " " +"Verdana")  + ";color:" + ("#5e5d55")  + ";font-size:" + ("14px")  + ";line-height:" + ("19px")  + ";-webkit-text-size-adjust:") + (("none")  + ";}input,textarea,select,option{font-family:" + ("\"Helvetica Neue\""+ ","+ " " +"Helvetica"+ ","+ " " +"Arial"+ ","+ " " +"Tahoma"+ ","+ " " +"Verdana")  + ";color:" + ("#5e5d55")  + ";}.v-assistive-device-only{position:" + ("absolute")  + ";top:" + ("-2000px")  + ";left:" + ("-2000px")  + ";width:" + ("10px")  + ";height:" + ("10px")  + ";overflow:" + ("hidden")  + ";}.v-contextmenu{background:" + ("#f5f5f2")  + ";border:" + ("none") ) + (";border-radius:" + ("3px")  + ";-webkit-border-radius:" + ("3px")  + ";-moz-border-radius:" + ("3px")  + ";-o-border-radius:" + ("3px")  + ";box-shadow:" + ("0"+ " " +"0"+ " " +"2px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.8" + ")")  + ";overflow:" + ("hidden")  + ";padding:" + ("4px"+ " " +"0")  + ";}.v-contextmenu .gwt-MenuItem{padding:" + ("1px"+ " " +"12px"+ " " +"1px"+ " " +"8px")  + ";height:" + ("30px")  + ";user-select:" + ("none")  + ";-moz-user-select:") + (("none")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";cursor:" + ("default")  + ";}.v-contextmenu .gwt-MenuItem .v-icon{margin-right:" + ("3px")  + ";}.v-contextmenu .gwt-MenuItem-selected div{background:" + ("transparent")  + ";color:" + ("black")  + ";}.v-touchkit-offlinemode-panel{padding-top:" + ("10%")  + ";padding-left:" + ("17%")  + ";padding-right:" + ("17%")  + ";text-align:" + ("center") ) + (";}.v-touchkit-sadface{display:" + ("inline-block")  + ";-webkit-transform:" + ("rotate(" + "90deg" + ")")  + ";transform:" + ("rotate(" + "90deg" + ")")  + ";font-size:" + ("4em")  + ";font-weight:" + ("bold")  + ";height:" + ("1em")  + ";margin-left:" + ("-0.5em")  + ";}.v-app,.v-touchkit-backgroundstripes,.v-touchkit-offlinemode{background:" + ("#f5f5f2")  + ";}.v-loading-indicator,.v-loading-indicator-delay,.v-loading-indicator-wait{pointer-events:" + ("none")  + ";position:" + ("absolute")  + ";z-index:") + (("30000")  + ";top:" + ("20%")  + ";left:" + ("25%")  + ";right:" + ("25%")  + ";margin:" + ("0")  + ";}.v-app-loading{pointer-events:" + ("none")  + ";position:" + ("absolute")  + ";z-index:" + ("30000")  + ";top:" + ("20%")  + ";left:" + ("25%")  + ";right:" + ("25%") ) + (";margin:" + ("0")  + ";text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";}div.v-progressindicator-indeterminate,div.v-progressbar-indeterminate{width:") + (("20px")  + ";}div.v-progressindicator-indeterminate:after,div.v-progressbar-indeterminate:after,.v-app-loading:after,.v-cache-loading-indicator:after,.v-loading-indicator:after{font-family:" + ("\"TkIcons\"")  + ";content:" + ("\"\"")  + ";color:" + ("gray")  + ";font-size:" + ("20px")  + ";line-height:" + ("1em")  + ";}@-webkit-keyframes spinnerRotate {\n	from {\n		-webkit-transform:rotate(0deg);\n	}\n	to {\n		-webkit-transform:rotate(360deg);\n	}\n}@keyframes spinnerRotate {\n	from {\n		transform:rotate(0deg);\n	}\n	to {\n		transform:rotate(360deg);\n	}\n}.v-cache-loading-indicator{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear") ) + (";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";}.v-loading-indicator{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:") + (("2s")  + ";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";opacity:" + ("0.02")  + ";}.v-loading-indicator-delay{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s") ) + (";animation-iteration-count:" + ("infinite")  + ";animation-timing-function:" + ("linear")  + ";opacity:" + ("0.5")  + ";}.v-loading-indicator-wait{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:") + (("infinite")  + ";animation-timing-function:" + ("linear")  + ";opacity:" + ("1")  + ";}div.v-progressindicator-indeterminate,div.v-progressbar-indeterminate{text-align:" + ("center")  + ";-webkit-animation-name:" + ("spinnerRotate")  + ";-webkit-animation-duration:" + ("2s")  + ";-webkit-animation-iteration-count:" + ("infinite")  + ";-webkit-animation-timing-function:" + ("linear")  + ";animation-name:" + ("spinnerRotate")  + ";animation-duration:" + ("2s")  + ";animation-iteration-count:" + ("infinite") ) + (";animation-timing-function:" + ("linear")  + ";}.v-app-loading:after,.v-loading-indicator:after{font-size:" + ("50px")  + ";}.v-button{margin:" + ("0")  + ";border:" + ("none")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";display:" + ("block")  + ";border-radius:" + ("3px")  + ";background:" + ("white")  + ";padding:" + ("3px")  + ";text-align:") + (("center")  + ";position:" + ("relative")  + ";overflow:" + ("hidden")  + ";-webkit-touch-callout:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";-webkit-tap-highlight-color:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0" + ")")  + ";-ms-user-select:" + ("none")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";font-size:" + ("20px")  + ";font-weight:" + ("500")  + ";line-height:" + ("2") ) + (";color:" + ("#00a3e8")  + ";}.v-button:active .v-button-wrap:after{content:" + ("\"\"")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";left:" + ("0")  + ";background-color:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.3" + ")")  + ";border-radius:" + ("inherit")  + ";pointer-events:" + ("none")  + ";-webkit-touch-callout:") + (("none")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";}.v-button-wrap{display:" + ("block")  + ";padding:" + ("0"+ " " +"10px")  + ";white-space:" + ("nowrap")  + ";text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";}.v-button-link,.v-button-link .v-button-wrap,.v-button-link .v-button-caption,.v-button-link:active,.v-button-link.v-pressed,.v-nativebutton-link{display:" + ("inline-block")  + ";border-radius:" + ("0")  + ";background:" + ("transparent") ) + (";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";padding:" + ("0")  + ";height:" + ("auto")  + ";margin:" + ("0")  + ";font-size:" + ("14px")  + ";font-weight:" + ("normal")  + ";color:" + ("#00a3e8")  + ";line-height:" + ("inherit")  + ";}.v-button-link:active .v-button-wrap{background:" + ("transparent")  + ";}.v-button-link .v-button-caption,.v-nativebutton-link .v-button-caption{text-decoration:") + (("none")  + ";line-height:" + ("1")  + ";}a{color:" + ("#00a3e8")  + ";}.icon-arrow-up .v-button-wrap:before,.icon-arrow-down .v-button-wrap:before,.icon-arrow-left .v-button-wrap:before,.icon-arrow-right .v-button-wrap:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"")  + ";font-size:" + ("28px")  + ";}.icon-arrow-up .v-button-wrap:before{content:" + ("\"\"")  + ";}.icon-arrow-down .v-button-wrap:before{content:" + ("\"\"")  + ";}.icon-arrow-left .v-button-wrap:before{content:" + ("\"\"")  + ";}.icon-arrow-right .v-button-wrap:before{content:" + ("\"\"") ) + (";}.v-touchkit-navbar .icon-arrow-up .v-button-caption,.v-touchkit-navbar .icon-arrow-down .v-button-caption,.v-touchkit-navbar .icon-arrow-left .v-button-caption,.v-touchkit-navbar .icon-arrow-right .v-button-caption{display:" + ("none")  + ";}.v-touchkit-navpanel{position:" + ("relative")  + ";overflow:" + ("hidden")  + ";display:" + ("block")  + ";}.v-touchkit-navpanel-wrapper{position:" + ("relative")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";-webkit-transform:" + ("translate3d(" + "0"+ ","+ " " +"0"+ ","+ " " +"0" + ")")  + ";-webkit-transition:" + ("-webkit-transform"+ " " +"0.3s"+ " " +"linear")  + ";transform:" + ("translate3d(" + "0"+ ","+ " " +"0"+ ","+ " " +"0" + ")")  + ";transition:") + (("transform"+ " " +"0.3s"+ " " +"linear")  + ";}.v-touchkit-navpanel-container,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-container{position:" + ("absolute")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";opacity:" + ("0")  + ";-webkit-transition:" + ("opacity"+ " " +"0.15s"+ " " +"linear")  + ";transition:" + ("opacity"+ " " +"0.15s"+ " " +"linear")  + ";}.v-touchkit-navpanel-placeholder,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-placeholder{position:" + ("absolute")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";background:" + ("#f5f5f2") ) + (";}.v-touchkit-navpanel-notransit{-webkit-transition:" + ("none")  + ";transition:" + ("none")  + ";}.v-touchkit-navbutton,.v-button-nav{display:" + ("block")  + ";position:" + ("relative")  + ";font-weight:" + ("500")  + ";color:" + ("#43423d")  + ";line-height:" + ("2")  + ";margin:" + ("0")  + ";padding:" + ("0"+ " " +"16px"+ " " +"0"+ " " +"0")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";white-space:" + ("nowrap")  + ";-webkit-touch-callout:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";}.v-touchkit-verticalcomponentgroup .v-button-nav{margin:" + ("0"+ " " +"-10px")  + ";padding:" + ("0"+ " " +"16px"+ " " +"0"+ " " +"listlayoutmargin")  + ";background:" + ("transparent")  + ";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";text-align:" + ("left") ) + (";border-radius:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-touchkit-navbutton{margin:" + ("0"+ " " +"-10px")  + ";outline:" + ("none")  + ";}.v-button-nav>span{padding:" + ("0"+ " " +"16px"+ " " +"0"+ " " +"listlayoutmargin")  + ";background:" + ("transparent")  + " !important;-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";height:" + ("43px")  + ";}.v-button-nav>span>span{color:" + ("black")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";line-height:" + ("43px")  + " !important;}.v-button-nav:active>span>span{color:" + ("white")  + ";}.v-touchkit-verticalcomponentgroup .v-touchkit-navbutton:active,.v-button-nav:active{background:" + ("#00a3e8")  + ";color:" + ("#fff")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-contentcell{padding-right:" + ("10px")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-contentcell>*{float:" + ("right")  + ";}.v-touchkit-componentgroup-row>.v-caption>.v-icon,.v-touchkit-navbutton .v-icon{height:" + ("30px")  + ";margin-right:" + ("6px")  + ";vertical-align:" + ("-9px")  + ";}.v-touchkit-navbutton-desc{color:" + ("#73787c") ) + (";font-weight:" + ("normal")  + ";float:" + ("right")  + ";margin-right:" + ("22px")  + ";margin-left:" + ("10px")  + ";}.v-touchkit-navbutton-emphasis .v-touchkit-navbutton-desc{color:" + ("#1b699f")  + ";}.v-touchkit-navbutton:active .v-touchkit-navbutton-desc{color:" + ("#fff")  + ";}.v-touchkit-navbutton-pill .v-touchkit-navbutton-desc{color:" + ("#fff")  + ";padding:" + ("1px"+ " " +"10px"+ " " +"2px")  + ";background:" + ("#5d81ab")  + ";border-radius:" + ("1em")  + ";line-height:") + (("1")  + ";margin-top:" + ("12px")  + ";font-weight:" + ("bold")  + ";}.v-touchkit-navbutton-pill:active .v-touchkit-navbutton-desc{background:" + ("#fff")  + ";color:" + ("#5d81ab")  + ";}.v-touchkit-navbutton:after{font-family:" + ("\"TkIcons\"")  + ";content:" + ("\"\"")  + ";color:" + ("#00a3e8")  + ";position:" + ("absolute")  + ";right:" + ("16px")  + ";top:" + ("0") ) + (";bottom:" + ("0")  + ";width:" + ("10px")  + ";margin-right:" + ("-1px")  + ";}.v-touchkit-navbutton:active:after{color:" + ("white")  + ";}.v-touchkit-navbutton.v-touchkit-navbutton-back .v-touchkit-navbutton-desc{margin-left:" + ("0")  + ";margin-right:" + ("0")  + ";}.v-touchkit-navbar-left{position:" + ("absolute")  + ";left:" + ("6px")  + ";top:" + ("6px")  + ";max-width:" + ("35%")  + ";z-index:") + (("1")  + ";padding-right:" + ("4px")  + ";}.v-touchkit-navbar,.v-touchkit-navpanel-placeholder>div,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-placeholder>div{color:" + ("#5e5d55")  + ";display:" + ("block")  + ";height:" + ("43px")  + ";font-size:" + ("20px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";text-align:" + ("center")  + ";position:" + ("relative")  + ";background:" + ("#f9f9f8")  + ";}.v-touchkit-navbar{z-index:" + ("1") ) + (";background:" + ("white")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-navbar .v-touchkit-navbar-caption,.v-touchkit-navpanel-placeholder>div,.v-touchkit-popover.v-touchkit-fullscreen .v-touchkit-navpanel-placeholder>div{line-height:" + ("43px")  + ";}.v-touchkit-navbar-caption{display:" + ("block")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";text-align:" + ("center")  + ";}.v-touchkit-navpanel-placeholder>div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.v-touchkit-navbar-right{position:") + (("absolute")  + ";right:" + ("6px")  + ";top:" + ("6px")  + ";max-width:" + ("35%")  + ";padding-left:" + ("4px")  + ";}.v-touchkit-navbar-right>.v-button,.v-touchkit-navbar-left>.v-button{display:" + ("block")  + ";}.v-touchkit-navbar .v-button .v-icon{height:" + ("20px")  + ";margin:" + ("4px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";vertical-align:" + ("top")  + ";}.v-touchkit-navview-notoolbar .v-touchkit-navview-toolbar{display:" + ("none")  + ";}.v-touchkit-navview{position:" + ("relative") ) + (";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("block")  + ";}.v-touchkit-navview-wrapper{position:" + ("absolute")  + ";top:" + ("43px")  + ";bottom:" + ("48px")  + ";left:" + ("0")  + ";right:" + ("0")  + ";overflow:" + ("auto")  + ";}.v-touchkit-navview-notoolbar .v-touchkit-navview-wrapper{bottom:" + ("0")  + ";}.v-touchkit-navview-toolbar{position:") + (("absolute")  + ";height:" + ("48px")  + ";bottom:" + ("0")  + ";left:" + ("0")  + ";right:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";box-shadow:" + ("0"+ " " +"-2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-navview-notoolbar .v-touchkit-navview-toolbar,.v-touchkit-popover .v-window-closebox,.v-touchkit-popover .v-window-outerheader,.v-touchkit-popover .v-window-footer{display:" + ("none")  + ";}.v-slider:focus,.v-touchkit-switch-widget:focus,.v-table-body:focus,.v-table-body-wrapper:focus,.v-filterselect-input:focus,.v-datefield-textfield:focus{outline:" + ("none")  + ";}.v-slider-base{height:" + ("6px")  + ";background:" + ("#f5f5f2") ) + (";border-radius:" + ("4px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";}.v-slider-handle{background:" + ("white")  + ";width:" + ("22px")  + ";height:" + ("22px")  + ";border-radius:" + ("11px")  + ";margin-top:" + ("-9px")  + ";box-shadow:" + ("0"+ " " +"1px"+ " " +"1px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.2" + ")")  + ";border:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.3" + ")")  + ";font-size:" + ("0")  + ";}.v-slider-handle:before{content:") + (("\"\"")  + ";position:" + ("absolute")  + ";margin-left:" + ("7px")  + ";margin-top:" + ("7px")  + ";background:" + ("#00a3e8")  + ";width:" + ("8px")  + ";height:" + ("8px")  + ";border-radius:" + ("4px")  + ";}.v-window-modalitycurtain{background:" + ("#3d3e40")  + ";opacity:" + ("0.7")  + ";}.v-window-modalitycurtain.relative{opacity:" + ("0.02") ) + (";}.v-touchkit-popover.v-touchkit-plain{background:" + ("#fff")  + ";}.v-window-contents{background:" + ("#f5f5f2")  + ";}.v-touchkit-popover.v-touchkit-relative .v-window-wrap{overflow:" + ("visible")  + ";background:" + ("transparent")  + ";position:" + ("relative")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";}.v-touchkit-popover.v-touchkit-relative.v-touchkit-smallscreen .v-window-wrap,.v-touchkit-popover.v-touchkit-relative.v-touchkit-smallscreen .v-window-contents{padding:" + ("0")  + ";border:" + ("none")  + ";border-radius:" + ("0")  + ";}.v-touchkit-popover.v-touchkit-relative.v-touchkit-smallscreen{box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-opacity-transition{-webkit-transition:") + (("opacity"+ " " +"0.1s"+ " " +"linear")  + ";}.v-touchkit-popover-pointer{height:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getHeight() + "px")  + ";width:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getSafeUri().asString() + "\") -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getLeft() + "px -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowDownImage()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";margin-top:" + ("0")  + ";width:" + ("45px")  + ";height:" + ("20px")  + ";background-size:" + ("45px"+ " " +"20px")  + ";}.v-touchkit-popover-pointer-bottom{height:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getHeight() + "px") ) + (";width:" + ((VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getSafeUri().asString() + "\") -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getLeft() + "px -" + (VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.popoverArrowImage()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";margin-top:" + ("1px")  + ";width:" + ("45px")  + ";height:" + ("20px")  + ";background-size:" + ("45px"+ " " +"20px")  + ";}.v-touchkit-switch-widget{display:" + ("block")  + ";height:" + ("24px")  + ";}.v-touchkit-switch-wrapper{width:") + (("60px")  + ";height:" + ("22px")  + ";font-size:" + ("16px")  + ";position:" + ("relative")  + ";background:" + ("#00a1d8")  + ";border-radius:" + ("3px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.15" + ")")  + ";overflow:" + ("hidden")  + ";font-weight:" + ("700")  + ";box-shadow:" + ("inset"+ " " +"0"+ " " +"1px"+ " " +"1px"+ " " +"0"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.05" + ")")  + ";line-height:" + ("1") ) + (";float:" + ("right")  + ";}.v-touchkit-switch-off{background:" + ("#c8c7b5")  + ";}.v-touchkit-switch{left:" + ("0")  + ";width:" + ("150%")  + ";height:" + ("100%")  + ";position:" + ("absolute")  + ";box-sizing:" + ("border-box")  + ";}.v-touchkit-switch:before{text-align:" + ("center")  + ";position:" + ("absolute")  + ";margin:" + ("2px")  + ";color:") + (("white")  + ";content:" + ("\"I\"")  + ";right:" + ("66.6%")  + ";left:" + ("0")  + ";}.v-touchkit-switch:after{text-align:" + ("center")  + ";position:" + ("absolute")  + ";margin:" + ("2px")  + ";color:" + ("white")  + ";content:" + ("\"O\"")  + ";right:" + ("0")  + ";left:" + ("66.6%") ) + (";}.v-touchkit-switch-slider{height:" + ("100%")  + ";left:" + ("33.3%")  + ";right:" + ("33.3%")  + ";text-align:" + ("center")  + ";position:" + ("absolute")  + ";color:" + ("#a09f91")  + ";box-sizing:" + ("border-box")  + ";}.v-touchkit-switch-slider:after{content:" + ("\"| | |\"")  + ";position:" + ("absolute")  + ";background:" + ("#dcdbd0")  + ";box-shadow:") + (("inset"+ " " +"0"+ " " +"1px"+ " " +"2px"+ " " +"0"+ " " +"rgba(" + "255"+ ","+ " " +"255"+ ","+ " " +"255"+ ","+ " " +"0.3" + ")"+ ","+ " " +"0"+ " " +"1px"+ " " +"2px"+ " " +"0"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.3" + ")")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"1px"+ " " +"rgba(" + "255"+ ","+ " " +"255"+ ","+ " " +"255"+ ","+ " " +"1" + ")")  + ";border-radius:" + ("1px")  + ";left:" + ("0")  + ";right:" + ("0")  + ";top:" + ("0")  + ";bottom:" + ("0")  + ";margin:" + ("2px")  + ";font-size:" + ("8px")  + ";line-height:" + ("16px")  + ";word-spacing:" + ("1px") ) + (";}.v-slider-feedback{font-size:" + ("20px")  + ";line-height:" + ("1")  + ";padding:" + ("4px"+ " " +"7px")  + ";-webkit-box-shadow:" + ("0"+ " " +"1px"+ " " +"5px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.5" + ")")  + ";margin-top:" + ("-14px")  + " !important;background:" + ("#5e5d55")  + ";}.v-slider-feedback:after{content:" + ("\"\"")  + ";display:" + ("block")  + ";position:" + ("absolute")  + ";top:" + ("28px")  + ";left:") + (("50%")  + ";margin-left:" + ("-5px")  + ";height:" + ("0")  + ";border-top:" + ("5px"+ " " +"solid"+ " " +"#5e5d55")  + ";border-left:" + ("5px"+ " " +"solid"+ " " +"transparent")  + ";border-right:" + ("5px"+ " " +"solid"+ " " +"transparent")  + ";}.v-touchkit-verticalcomponentgroup .v-checkbox{line-height:" + ("43px")  + ";font-size:" + ("16px")  + ";font-weight:" + ("bold")  + ";}.v-touchkit-tabbar{overflow:" + ("hidden")  + ";position:" + ("relative") ) + (";padding-bottom:" + ("48px")  + ";}.v-touchkit-tabbar .v-csslayout-container,.v-touchkit-tabbar .v-csslayout-margin{height:" + ("100%")  + ";position:" + ("relative")  + ";}.v-touchkit-tabbar-wrapper{overflow:" + ("auto")  + ";-webkit-overflow-scrolling:" + ("touch")  + ";right:" + ("0")  + ";left:" + ("0")  + ";top:" + ("0")  + ";bottom:" + ("48px")  + ";position:" + ("absolute")  + ";}.v-touchkit-tabbar-toolbar .v-touchkit-toolbar{position:") + (("absolute")  + ";bottom:" + ("0")  + ";left:" + ("0")  + ";right:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d1d1ce")  + ";box-shadow:" + ("0"+ " " +"-2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-tabbar-toolbar .v-touchkit-toolbar .v-button{background:" + ("#f5f5f2")  + ";color:" + ("#5e5d55")  + ";}.v-touchkit-tabbar-toolbar .v-touchkit-toolbar .v-button-selected{background:" + ("white")  + ";color:" + ("#00a3e8")  + ";}.v-orderedlayout-margin-top,.v-horizontallayout-margin-top,.v-verticallayout-margin-top,.v-gridlayout-margin-top,.v-csslayout-margin-top{padding-top:" + ("10px") ) + (";}.v-orderedlayout-margin-right,.v-horizontallayout-margin-right,.v-verticallayout-margin-right,.v-gridlayout-margin-right,.v-csslayout-margin-right{padding-right:" + ("10px")  + ";}.v-orderedlayout-margin-bottom,.v-horizontallayout-margin-bottom,.v-verticallayout-margin-bottom,.v-gridlayout-margin-bottom,.v-csslayout-margin-bottom{padding-bottom:" + ("10px")  + ";}.v-orderedlayout-margin-left,.v-horizontallayout-margin-left,.v-verticallayout-margin-left,.v-gridlayout-margin-left,.v-csslayout-margin-left{padding-left:" + ("10px")  + ";}.v-csslayout-margin-top{margin-top:" + ("10px")  + ";padding:" + ("0")  + ";}.v-csslayout-margin-right{margin-right:" + ("10px")  + ";padding:" + ("0")  + ";}.v-csslayout-margin-bottom{margin-bottom:" + ("10px")  + ";padding:" + ("0")  + ";}.v-csslayout-margin-left{margin-left:" + ("10px")  + ";padding:") + (("0")  + ";}.v-orderedlayout-spacing-on,.v-horizontallayout-spacing-on,.v-verticallayout-spacing-on,.v-gridlayout-spacing-on{padding-top:" + ("8px")  + ";padding-left:" + ("8px")  + ";}.v-layout>.v-button,.v-layout>.v-touchkit-horizontalbuttongroup{margin:" + ("10px")  + ";}.v-Notification{background:" + ("#737268")  + ";padding:" + ("30px"+ " " +"30px")  + ";text-align:" + ("center")  + ";color:" + ("#fff")  + ";line-height:" + ("normal")  + ";overflow:" + ("hidden")  + ";width:" + ("100%") ) + (";box-sizing:" + ("border-box")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-Notification-error{background:" + ("#fa663e")  + ";}.v-Notification-warning{background:" + ("#f5d000")  + ";color:" + ("#43423d")  + ";}.v-Notification h1{font-weight:" + ("500")  + ";font-size:" + ("20px")  + ";}.v-table{overflow:" + ("hidden")  + ";text-align:" + ("left")  + ";display:" + ("block")  + ";}.v-table-header table,.v-table-table,.v-table-footer table{border:") + (("0")  + ";border-collapse:" + ("separate")  + ";border-spacing:" + ("0")  + ";font-size:" + ("16px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.v-table-header-cell,.v-table-header-cell-rowheader,.v-table-header-cell-asc,.v-table-header-cell-desc{cursor:" + ("pointer")  + ";padding:" + ("0")  + ";}.v-table-footer td{padding:" + ("0")  + ";}.v-table-footer-cell{cursor:" + ("pointer")  + ";}.v-table-footer-container{float:" + ("right") ) + (";height:" + ("16px")  + ";overflow:" + ("hidden")  + ";padding-right:" + ("7px")  + ";white-space:" + ("nowrap")  + ";}.v-table-resizer{background:" + ("transparent")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#acaba5")  + ";cursor:" + ("col-resize")  + ";display:" + ("block")  + ";float:" + ("right")  + ";height:" + ("30px")  + ";overflow:") + (("hidden")  + ";width:" + ("2px")  + ";}.v-table-caption-container{margin-left:" + ("6px")  + ";overflow:" + ("hidden")  + ";padding-right:" + ("4px")  + ";white-space:" + ("nowrap")  + ";line-height:" + ("30px")  + ";}.v-table-caption-container-align-right{float:" + ("right")  + ";text-align:" + ("right")  + ";}.v-table-sort-indicator{background:" + ("transparent")  + ";color:" + ("#c8c7b5") ) + (";float:" + ("right")  + ";height:" + ("30px")  + ";width:" + ("0")  + ";}.v-table-header-cell-asc .v-table-sort-indicator,.v-table-header-cell-desc .v-table-sort-indicator{float:" + ("right")  + ";height:" + ("1.2em")  + ";width:" + ("16px")  + ";}.v-table-body{background:" + ("#fff")  + ";}.v-table-row-spacer{height:" + ("10px")  + ";overflow:" + ("hidden")  + ";}.v-table-row,.v-table-row-odd{background:" + ("#fff")  + ";color:") + (("#43423d")  + ";border:" + ("0")  + ";cursor:" + ("pointer")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.v-table-cell-content{overflow:" + ("hidden")  + ";padding:" + ("6px"+ " " +"7px"+ " " +"6px"+ " " +"6px")  + ";vertical-align:" + ("top")  + ";white-space:" + ("nowrap")  + ";}.v-table .v-selected{background:" + ("#00a3e8")  + ";color:" + ("#fff") ) + (";}.v-table-cell-wrapper{overflow:" + ("hidden")  + ";padding:" + ("5px"+ " " +"0")  + ";white-space:" + ("nowrap")  + ";}.v-table-cell-wrapper-align-right{text-align:" + ("right")  + ";}.v-table-focus-slot-left{background:" + ("transparent")  + ";border-left:" + ("2px"+ " " +"solid"+ " " +"#999")  + ";border-left-color:" + ("#222")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#aaa")  + ";float:" + ("none")  + ";margin-bottom:" + ("-1.2em")  + ";margin-left:") + (("0")  + ";width:" + ("auto")  + ";}.v-table-focus-slot-right{border-right:" + ("2px"+ " " +"solid"+ " " +"#999")  + ";border-right-color:" + ("#222")  + ";margin-left:" + ("-2px")  + ";margin-right:" + ("0")  + ";}.v-table-header-drag{background:" + ("#efefef")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#eee")  + ";margin-top:" + ("20px")  + ";opacity:" + ("0.9")  + ";position:" + ("absolute") ) + (";z-index:" + ("30000")  + ";}.v-table-scrollposition{background:" + ("transparent")  + ";border:" + ("none")  + ";width:" + ("auto")  + ";}.v-table-scrollposition span{border:" + ("none")  + ";color:" + ("white")  + ";background:" + ("#5e5d55")  + ";opacity:" + ("0.8")  + ";display:" + ("block")  + ";padding:" + ("10px"+ " " +"30px")  + ";position:") + (("relative")  + ";top:" + ("10px")  + ";text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";}.v-table-body.focused{border-color:" + ("#388ddd")  + ";}.v-table-focus .v-table-cell-content{border-bottom:" + ("1px"+ " " +"dotted"+ " " +"#0066bd")  + ";border-top:" + ("1px"+ " " +"dotted"+ " " +"#0066bd")  + ";}.v-table-focus .v-table-cell-wrapper{margin-bottom:" + ("-1px")  + ";margin-top:" + ("-1px")  + ";}.v-table-header-wrap{background:" + ("#78776d")  + ";color:" + ("white") ) + (";height:" + ("30px")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";z-index:" + ("1")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-table-footer-wrap{background:" + ("#78776d")  + ";color:" + ("white")  + ";height:" + ("30px")  + ";overflow:" + ("hidden")  + ";border-top:" + ("none")  + ";}.v-table-header,.v-table-footer,.v-table-footer table{height:") + (("30px")  + ";}.v-table-caption-container .v-icon{height:" + ("16px")  + ";margin:" + ("-4px"+ " " +"3px"+ " " +"0"+ " " +"0")  + ";vertical-align:" + ("middle")  + ";vertical-align:" + ("middle")  + ";}.v-table-row-odd{background:" + ("#f5f5f2")  + ";}.v-table-cell-content:last-child{border-right-color:" + ("transparent")  + ";}.v-table-header-drag img{height:" + ("16px")  + ";margin:" + ("-3px"+ " " +"3px"+ " " +"0"+ " " +"0")  + ";}.v-table.v-disabled .v-table-header-cell,.v-table.v-disabled .v-table-header-cell-asc,.v-table.v-disabled .v-table-header-cell-desc,.v-table.v-disabled .v-table-resizer,.v-table-body-noselection .v-table-row,.v-table-body-noselection .v-table-row-odd,.v-table.v-disabled .v-table-column-selector{cursor:" + ("default")  + ";}.v-table-caption-container-align-center,.v-table-cell-wrapper-align-center{text-align:" + ("center") ) + (";}.v-table-header-drag .v-icon{vertical-align:" + ("middle")  + ";vertical-align:" + ("middle")  + ";}.v-table-header-drag *{vertical-align:" + ("middle")  + ";}.v-table-column-selector{margin-top:" + ("-27px")  + ";width:" + ("20px")  + ";float:" + ("right")  + ";height:" + ("1.2em")  + ";position:" + ("relative")  + ";cursor:" + ("pointer")  + ";line-height:" + ("8px")  + ";font-size:") + (("6px")  + ";text-align:" + ("center")  + ";}.v-table-column-selector:after{content:" + ("\"\\A \\A \"")  + ";font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";white-space:" + ("pre")  + ";}.v-table-header-cell-asc .v-table-sort-indicator:before{content:" + ("\"▲\"")  + ";line-height:" + ("30px")  + ";font-size:" + ("70%")  + ";}.v-table-header-cell-desc .v-table-sort-indicator:before{content:" + ("\"▼\"")  + ";line-height:" + ("30px") ) + (";font-size:" + ("70%")  + ";}.v-filterselect{overflow:" + ("hidden")  + ";background:" + ("#fff")  + ";height:" + ("22px")  + ";min-width:" + ("80px")  + ";}.v-filterselect-input{padding:" + ("0")  + ";}.v-filterselect-prompt{position:" + ("relative")  + ";}.v-filterselect-prompt .v-filterselect-input{position:" + ("absolute")  + ";left:" + ("0")  + ";right:" + ("25px")  + ";}.v-filterselect .v-icon{height:") + (("23px")  + ";margin-top:" + ("2px")  + " !important;}.v-filterselect-suggestmenu{min-width:" + ("290px")  + ";-webkit-tap-highlight-color:" + ("transparent")  + ";}.v-filterselect-suggestpopup,.v-datefield-calendarpanel{border-radius:" + ("4px")  + ";margin-top:" + ("4px")  + " !important;overflow:" + ("hidden")  + ";border:" + ("none")  + ";background:" + ("white")  + ";}.v-filterselect-suggestpopup .v-icon{height:" + ("32px")  + ";vertical-align:" + ("middle") ) + (";}.v-filterselect-suggestpopup .gwt-MenuItem{height:" + ("36px")  + ";line-height:" + ("36px")  + ";padding:" + ("2px"+ " " +"10px")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e0e0e0")  + ";}.v-filterselect-suggestpopup tr:last-child .gwt-MenuItem{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#e0e0e0")  + ";}.v-filterselect-nextpage,.v-filterselect-nextpage-off,.v-filterselect-prevpage-off,.v-filterselect-prevpage{width:" + ("25px")  + ";height:" + ("25px")  + ";overflow:" + ("hidden")  + ";margin:" + ("7px"+ " " +"auto")  + ";}.v-filterselect{position:" + ("relative")  + ";}.v-filterselect-button{right:") + (("0")  + ";top:" + ("0")  + ";height:" + ("25px")  + ";width:" + ("25px")  + ";position:" + ("absolute")  + ";font-size:" + ("18px")  + ";text-align:" + ("right")  + ";}.v-filterselect-button:before{content:" + ("\"\"")  + ";font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";margin-left:" + ("5px") ) + (";}.v-filterselect-button:active{opacity:" + ("1")  + ";}.v-filterselect-nextpage-off span,.v-filterselect-prevpage-off span,.v-filterselect-nextpage span,.v-filterselect-prevpage span{display:" + ("block")  + ";height:" + ("32px")  + ";text-indent:" + ("-9999px")  + ";}.v-filterselect-prevpage:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";}.v-filterselect-nextpage:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"")  + ";}.v-filterselect-prevpage-off:before{font-family:" + ("\"TkIcons\"")  + ";color:") + (("#00a3e8")  + ";}.v-filterselect-nextpage-off:before{font-family:" + ("\"TkIcons\"")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"")  + ";color:" + ("#f5f5f2")  + ";}.v-filterselect-prevpage:before{content:" + ("\"\"")  + ";}.v-filterselect-prevpage-off:before{content:" + ("\"\"")  + ";color:" + ("#f5f5f2")  + ";}.v-filterselect-status{position:" + ("absolute")  + ";right:" + ("12px")  + ";bottom:" + ("15px") ) + (";color:" + ("#b7b9bb")  + ";font-size:" + ("14px")  + ";}.v-datefield-popupcalendar{clear:" + ("both")  + ";float:" + ("none")  + ";padding:" + ("0")  + ";box-sizing:" + ("border-box")  + ";border-collapse:" + ("collapse")  + ";height:" + ("42px")  + ";}.v-datefield-button{-webkit-appearance:" + ("none")  + ";background:" + ("transparent")  + ";line-height:") + (("42px")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";margin-left:" + ("-25px")  + ";width:" + ("25px")  + ";text-align:" + ("right")  + ";}.v-datefield-button:after{font-family:" + ("\"TkIcons\"")  + ";font-size:" + ("18px")  + ";color:" + ("#00a3e8")  + ";content:" + ("\"\"") ) + (";}.v-datefield-error{border:" + ("2px"+ " " +"solid"+ " " +"rgba(" + "250"+ ","+ " " +"40"+ ","+ " " +"0"+ ","+ " " +"0.6" + ")")  + ";}.v-datefield-calendarpanel,.v-inline-datefield-calendarpanel{background:" + ("#fff")  + ";border:" + ("none")  + ";}.v-datefield-calendarpanel button,.v-inline-datefield-calendarpanel button{-webkit-appearance:" + ("none")  + ";background:" + ("transparent")  + ";display:" + ("block")  + ";border:" + ("none")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("arial")  + ";font-size:") + (("20px")  + ";font-weight:" + ("bold")  + ";}.v-datefield-calendarpanel-header td,.v-inline-datefield-calendarpanel-header td{background:" + ("#f5f5f2")  + ";line-height:" + ("19px")  + ";height:" + ("25px")  + ";font-size:" + ("20px")  + ";font-weight:" + ("bold")  + ";width:" + ("1px")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.25" + ")")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.5" + ")")  + ";padding:" + ("0"+ " " +"6px"+ " " +"3px") ) + (";}.v-datefield-calendarpanel-header td.v-datefield-calendarpanel-month,.v-inline-datefield-calendarpanel-header td.v-inline-datefield-calendarpanel-month{width:" + ("auto")  + ";min-width:" + ("140px")  + ";}span.v-datefield-calendarpanel-month,span.v-inline-datefield-calendarpanel-month{line-height:" + ("26px")  + ";font-size:" + ("15px")  + ";}.v-datefield-calendarpanel .v-button-nextyear,.v-inline-datefield-calendarpanel .v-button-nextyear{border-right:" + ("none")  + ";}.v-datefield-calendarpanel table,.v-inline-datefield-calendarpanel table{padding:" + ("0"+ " " +"10px")  + ";}.v-datefield-time{padding:" + ("0"+ " " +"10px")  + ";padding-bottom:" + ("10px")  + ";}.v-datefield-calendarpanel td,.v-inline-datefield-calendarpanel td{text-align:" + ("center")  + ";}.v-datefield-popup{overflow:" + ("hidden")  + ";}.v-tree{display:") + (("block")  + ";}.v-tree-node{padding:" + ("4px"+ " " +"0")  + ";}.v-tree-node-caption{margin-left:" + ("35px")  + ";min-height:" + ("35px")  + ";line-height:" + ("28px")  + ";}.v-touchkit-verticalcomponentgroup{display:" + ("block")  + ";position:" + ("relative")  + ";width:" + ("100%")  + ";margin:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc") ) + (";background:" + ("white")  + ";-webkit-box-sizing:" + ("border-box")  + ";box-shadow:" + ("0"+ " " +"1px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";margin-bottom:" + ("10px")  + ";}.v-textfield,.v-textarea,.v-touchkit-numberfield,.v-datefield{-webkit-appearance:" + ("none")  + ";border:" + ("0")  + ";border-radius:" + ("0")  + ";color:" + ("#43423d")  + ";font-weight:") + (("500")  + ";font-size:" + ("16px")  + ";}.v-touchkit-verticalcomponentgroup .v-textfield{background:" + ("transparent")  + ";margin:" + ("0")  + ";height:" + ("42px")  + ";}.v-touchkit-verticalcomponentgroup .v-textarea{background:" + ("transparent")  + ";margin:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-touchkit-numberfield{background:" + ("transparent")  + ";margin:" + ("0")  + ";height:" + ("42px")  + ";}.v-touchkit-verticalcomponentgroup .v-datefield,.v-filterselect-input{background:" + ("transparent") ) + (";margin:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-textfield:focus,.v-touchkit-verticalcomponentgroup .v-textarea:focus,.v-touchkit-verticalcomponentgroup .v-touchkit-numberfield:focus{box-shadow:" + ("inset"+ " " +"0"+ " " +"-3px"+ " " +"#00a3e8")  + ";outline:" + ("none")  + ";}.v-touchkit-verticalcomponentgroup .v-textfield-error{color:" + ("#ed5931")  + ";}.v-touchkit-verticalcomponentgroup input:read-only{color:" + ("#000")  + ";}.v-touchkit-componentgroup-row .v-caption,.v-touchkit-componentgroup-cell>*{margin:" + ("10px"+ " " +"0")  + ";}.v-touchkit-componentgroup-cell>.v-form{margin-left:" + ("-10px")  + ";margin-right:" + ("-10px")  + ";display:" + ("block")  + ";}.v-select,.v-touchkit-datepicker{position:" + ("relative")  + ";padding:") + (("0")  + ";}.v-touchkit-datepicker>input{-webkit-appearance:" + ("none")  + ";border:" + ("none")  + ";color:" + ("#43423d")  + ";font-weight:" + ("500")  + ";font-size:" + ("16px")  + ";background:" + ("transparent")  + ";margin:" + ("0")  + ";display:" + ("block")  + ";padding:" + ("0"+ " " +"1.5em"+ " " +"0"+ " " +"0")  + ";min-height:" + ("22px") ) + (";min-width:" + ("80px")  + ";width:" + ("100%")  + ";}.v-select-select{-webkit-appearance:" + ("none")  + ";border:" + ("none")  + ";color:" + ("#43423d")  + ";font-weight:" + ("500")  + ";font-size:" + ("16px")  + ";background:" + ("transparent")  + ";margin:" + ("0")  + ";display:" + ("block")  + ";padding:") + (("0"+ " " +"1.5em"+ " " +"0"+ " " +"0")  + ";min-height:" + ("22px")  + ";min-width:" + ("80px")  + ";}.v-touchkit-datepicker:after,.v-select:after{content:" + ("\"\"")  + ";text-align:" + ("right")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";width:" + ("1em")  + ";color:" + ("#00a3e8")  + ";pointer-events:" + ("none") ) + (";font-size:" + ("18px")  + ";font-family:" + ("\"TkIcons\"")  + ";}.v-touchkit-datepicker:after{content:" + ("\"\"")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup{margin:" + ("0")  + ";width:" + ("100%")  + ";}.v-touchkit-componentgroup-cell>.v-touchkit-navbutton{padding-left:" + ("10px")  + ";padding-right:" + ("16px")  + ";line-height:" + ("43px")  + ";}.v-touchkit-verticalcomponentgroup .v-slider-base{margin-left:" + ("5px")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option{height:" + ("40px")  + ";position:") + (("relative")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option input{font-size:" + ("large")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option>*{margin:" + ("14px"+ " " +"0")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup .v-select-option>label{display:" + ("block")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";right:" + ("0")  + ";padding-left:" + ("20px")  + ";padding-top:" + ("10px")  + ";margin:" + ("0") ) + (";color:" + ("#43423d")  + ";font-weight:" + ("500")  + ";vertical-align:" + ("top")  + ";line-height:" + ("normal")  + ";font-size:" + ("16px")  + ";height:" + ("30px")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup>.v-select-option:before{content:" + ("\"\"")  + ";display:" + ("block")  + ";position:" + ("absolute")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";left:" + ("0")  + ";right:" + ("0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";}.v-touchkit-componentgroup-cell>.v-select-optiongroup :first-child:before{display:" + ("none")  + ";}.v-touchkit-componentgroup-cell>.v-formlayout{margin:" + ("0"+ " " +"-10px")  + ";width:" + ("auto")  + " !important;display:" + ("block")  + ";}.v-form>fieldset>div:last-child>.v-layout{display:" + ("block")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-captioncell,.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-contentcell,.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-errorcell{padding:" + ("0")  + ";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-contentcell{padding-right:" + ("10px") ) + (";}.v-touchkit-verticalcomponentgroup .v-formlayout .v-formlayout-row .v-formlayout-captioncell{padding-left:" + ("10px")  + ";text-align:" + ("left")  + ";}.v-formlayout-captioncell>.v-caption{font-size:" + ("16px")  + ";color:" + ("#5e5d55")  + ";line-height:" + ("43px")  + ";height:" + ("43px")  + ";margin:" + ("0")  + ";}.v-formlayout-row>td{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";}.v-formlayout-lastrow>td{border-bottom:" + ("none")  + ";}.v-label-grey-title,.v-layout>.v-caption>div{font-size:" + ("16px")  + ";color:") + (("#7d7d6e")  + ";margin:" + ("10px")  + ";margin-top:" + ("15px")  + ";margin-bottom:" + ("5px")  + ";}.v-touchkit-componentgroup-row{position:" + ("relative")  + ";display:" + ("-webkit-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";padding:" + ("0"+ " " +"10px")  + ";}.v-touchkit-componentgroup-row:first-child{border-top:" + ("none") ) + (";}.v-touchkit-componentgroup-row:before{content:" + ("\"\"")  + ";display:" + ("block")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("10px")  + ";right:" + ("10px")  + ";}.v-touchkit-componentgroup-row:first-child:before{display:" + ("none")  + ";}.v-touchkit-componentgroup-row-cap{-webkit-box-align:" + ("center")  + ";min-height:" + ("42px")  + ";}.v-touchkit-componentgroup-row>.v-caption{font-size:") + (("16px")  + ";color:" + ("#5e5d55")  + ";padding-right:" + ("5px")  + ";-webkit-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";white-space:" + ("nowrap")  + ";overflow-x:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.v-touchkit-componentgroup-row-nocap>.v-caption{display:" + ("none")  + ";-webkit-box-flex:" + ("0")  + ";}.v-touchkit-componentgroup-row-nocap>.v-touchkit-componentgroup-cell{-webkit-box-flex:" + ("1") ) + (";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("100%")  + ";padding-left:" + ("0")  + ";}.v-touchkit-componentgroup-row-cap>.v-caption{-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("40%")  + ";}.v-touchkit-componentgroup-row-cap>.v-touchkit-componentgroup-cell{-webkit-box-flex:" + ("0")  + ";-ms-flex:" + ("0")  + ";flex:") + (("0")  + ";}.v-touchkit-componentgroup-row-cap>.v-touchkit-componentgroup-cell>*{float:" + ("right")  + ";}.v-touchkit-componentgroup-row-full>.v-caption{-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("40%")  + ";}.v-touchkit-componentgroup-row-full>.v-touchkit-componentgroup-cell{-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:" + ("1")  + ";width:" + ("60%")  + ";}.v-touchkit-componentgroup-row-full>.v-touchkit-componentgroup-cell>*{float:" + ("none") ) + (";}.v-touchkit-componentgroup-cell-fullwrapper .v-touchkit-horizontalbuttongroup{margin-top:" + ("10px")  + ";margin-bottom:" + ("10px")  + ";}.v-vertical.v-margin-left,.v-horizontal.v-margin-left{padding-left:" + ("10px")  + ";}.v-vertical.v-margin-bottom,.v-horizontal.v-margin-bottom{padding-bottom:" + ("10px")  + ";}.v-vertical.v-margin-right,.v-horizontal.v-margin-right{padding-right:" + ("10px")  + ";}.v-vertical.v-margin-top,.v-horizontal.v-margin-top{padding-top:" + ("10px")  + ";}.v-touchkit-navview-wrapper>.v-touchkit-verticalcomponentgroup,.v-touchkit-tabbar-wrapper>.v-touchkit-verticalcomponentgroup,.v-touchkit-swipeview>.v-touchkit-verticalcomponentgroup{width:" + ("auto")  + ";}.v-touchkit-datepopover{background:" + ("white")  + ";box-shadow:" + ("1px"+ " " +"1px"+ " " +"3px"+ " " +"3px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.25" + ")")  + ";cursor:" + ("default")  + ";width:") + (("290px")  + ";border-radius:" + ("3px")  + ";}.v-touchkit-datepopover .gwt-DatePicker{width:" + ("100%")  + ";-webkit-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";}.v-touchkit-datepopover table.datePickerDays{border-collapse:" + ("collapse")  + ";background-color:" + ("#fbfbfb")  + ";width:" + ("289px")  + ";font-size:" + ("18px")  + ";}.v-touchkit-datepopover table.datePickerDays td{border:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";font-weight:" + ("bold") ) + (";color:" + ("#54626d")  + ";}.v-touchkit-datepopover .datePickerMonthSelector{width:" + ("100%")  + ";}.v-touchkit-datepopover .datePickerMonth{text-align:" + ("center")  + ";color:" + ("#7d7d6e")  + ";font-size:" + ("18px")  + ";padding-top:" + ("7px")  + ";font-weight:" + ("bold")  + ";}.v-touchkit-datepopover .datePickerDay,.v-touchkit-datepopover .datePickerWeekdayLabel,.v-touchkit-datepopover .datePickerWeekendLabel{min-width:" + ("40px")  + ";min-height:" + ("40px")  + ";line-height:" + ("40px")  + ";text-align:") + (("center")  + ";outline:" + ("0")  + ";}.v-touchkit-datepopover .datePickerPreviousButton,.v-touchkit-datepopover .datePickerNextButton{min-width:" + ("40px")  + ";min-height:" + ("40px")  + ";line-height:" + ("40px")  + ";text-align:" + ("center")  + ";outline:" + ("0")  + ";color:" + ("#00a3e8")  + ";font-size:" + ("40px")  + ";}.v-touchkit-datepopover table.datePickerDays td.datePickerWeekdayLabel,.v-touchkit-datepopover table.datePickerDays td.datePickerWeekendLabel{border:" + ("none")  + ";}.v-touchkit-datepopover .datePickerPreviousButton>*,.v-touchkit-datepopover .datePickerNextButton>*{outline:" + ("0") ) + (";}.v-touchkit-datepopover-noprev .datePickerPreviousButton,.v-touchkit-datepopover-nonext .datePickerNextButton{opacity:" + ("0.2")  + ";}.v-touchkit-datepopover .datePickerDay:focus{border-width:" + ("0")  + ";}.v-touchkit-datepopover .datePickerWeekdayLabel,.v-touchkit-datepopover .datePickerWeekendLabel{background-color:" + ("#f5f5f2")  + ";font-size:" + ("0.8em")  + ";}.v-touchkit-datepopover .datePickerDay{font-weight:" + ("bold")  + ";color:" + ("#333")  + ";}.v-touchkit-datepopover .datePickerDayIsValue{background-color:" + ("#7d7d6e")  + ";color:" + ("white")  + ";text-shadow:" + ("1px"+ " " +"1px"+ " " +"2px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.4" + ")")  + ";}.v-touchkit-datepopover .datePickerDayIsFiller{opacity:" + ("0.5")  + ";}.v-touchkit-datepopover .datePickerDayIsDisabled{display:") + (("none")  + ";text-decoration:" + ("line-through")  + ";}.v-touchkit-date-ok{font-size:" + ("32px")  + ";color:" + ("#00a3e8")  + ";text-align:" + ("center")  + ";height:" + ("32px")  + ";padding-top:" + ("8px")  + ";margin-left:" + ("28.57%")  + ";}.v-touchkit-date-cancel{font-size:" + ("32px")  + ";color:" + ("#00a3e8")  + ";text-align:" + ("center") ) + (";height:" + ("32px")  + ";padding-top:" + ("8px")  + ";float:" + ("left")  + ";width:" + ("81px")  + ";padding-left:" + ("1px")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"gray")  + ";}.v-touchkit-datepopover-hidedays .datePickerDays{display:" + ("none")  + ";}.v-touchkit-datepopover-time{border-bottom:" + ("1px"+ " " +"solid"+ " " +"gray")  + ";}.v-touchkit-datepopover-time:before{content:" + ("\"\"")  + ";font-family:" + ("\"TkIcons\"")  + ";color:") + (("gray")  + ";margin-left:" + ("115px")  + ";margin-right:" + ("5px")  + ";font-size:" + ("18px")  + ";}.v-touchkit-datepopover-time input{border:" + ("none")  + ";width:" + ("150px")  + ";padding:" + ("0")  + ";height:" + ("40px")  + ";font-size:" + ("18px")  + ";}.v-touchkit-componentgroup-cell .v-button,.v-touchkit-navbar .v-button,.v-touchkit-horizontalbuttongroup,.v-touchkit-navbutton-back,.v-touchkit-navbutton-forward{display:" + ("block")  + ";margin:" + ("0") ) + (";padding:" + ("0")  + ";overflow:" + ("hidden")  + ";-webkit-box-sizing:" + ("border-box")  + ";background:" + ("transparent")  + ";color:" + ("#00a3e8")  + ";box-shadow:" + ("none")  + ";border-radius:" + ("3px")  + ";line-height:" + ("30px")  + ";}.v-touchkit-navbutton-back{padding-left:" + ("10px")  + ";padding-right:" + ("20px")  + ";padding-left:") + (("20px")  + ";padding-right:" + ("10px")  + ";}.v-touchkit-navbutton-back:after{content:" + ("\"\"")  + ";left:" + ("3px")  + ";}.v-touchkit-navbutton-back:active:after{color:" + ("inherit")  + ";}.v-touchkit-horizontalbuttongroup .v-button{display:" + ("inline-block")  + ";border:" + ("0")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";border-radius:" + ("0")  + ";}.v-touchkit-horizontalbuttongroup .v-button:first-child{border-left:" + ("none")  + ";border-top-left-radius:" + ("3px") ) + (";border-bottom-left-radius:" + ("3px")  + ";}.v-touchkit-horizontalbuttongroup .v-button:last-child{border-top-right-radius:" + ("3px")  + ";border-bottom-right-radius:" + ("3px")  + ";}.v-touchkit-navbar .v-button,.v-touchkit-componentgroup-cell>.v-button,.v-touchkit-horizontalbuttongroup .v-button,.v-touchkit-navbutton-back,.v-touchkit-navbutton-forward{margin:" + ("0")  + ";font-size:" + ("14px")  + ";font-weight:" + ("normal")  + ";}.v-touchkit-componentgroup-cell>.v-button{margin:" + ("10px"+ " " +"0")  + ";float:" + ("left")  + ";}.v-touchkit-componentgroup-cell>.v-button>.v-button-wrap{padding:" + ("0")  + ";}.v-touchkit-navbar .v-button-wrap,.v-touchkit-horizontalbuttongroup .v-button-wrap{padding:" + ("0"+ " " +"10px")  + ";}.v-touchkit-horizontalbuttongroup{padding:") + (("0")  + ";display:" + ("inline-block")  + ";overflow:" + ("visible")  + ";}.v-touchkit-componentgroup-cell>.v-touchkit-horizontalbuttongroup{margin:" + ("10px"+ " " +"0")  + ";}.v-touchkit-componentgroup-cell>.v-upload-immediate .v-button{text-align:" + ("left")  + ";font-size:" + ("16px")  + ";line-height:" + ("20px")  + ";font-weight:" + ("500")  + ";color:" + ("#43423d")  + ";}.v-touchkit-componentgroup-cell>.v-upload-immediate .v-button-wrap{padding:" + ("0")  + ";}.v-touchkit-toolbar{background:" + ("#f9f9f8") ) + (";height:" + ("48px")  + ";display:" + ("-webkit-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("flex")  + ";box-shadow:" + ("0"+ " " +"2px"+ " " +"rgba(" + "209"+ ","+ " " +"209"+ ","+ " " +"206"+ ","+ " " +"0.5" + ")")  + ";}.v-touchkit-toolbar .v-button{display:" + ("block")  + ";background:" + ("white")  + ";box-shadow:" + ("none")  + ";-webkit-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";flex:") + (("1")  + ";padding:" + ("0")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#e6e6e6")  + ";border-radius:" + ("0")  + ";color:" + ("#00a3e8")  + ";}.v-touchkit-toolbar .v-button:first-child{border:" + ("none")  + ";}.v-touchkit-toolbar .v-button-wrap{background:" + ("transparent")  + ";height:" + ("auto")  + ";padding:" + ("0")  + ";-webkit-box-shadow:" + ("none")  + ";font-size:" + ("10px") ) + (";line-height:" + ("1")  + ";overflow:" + ("visible")  + ";display:" + ("block")  + ";height:" + ("48px")  + ";background:" + ("transparent")  + ";}.v-touchkit-toolbar .v-button-caption{position:" + ("absolute")  + ";bottom:" + ("4px")  + ";left:" + ("0")  + ";right:" + ("0")  + ";}.v-touchkit-toolbar .v-button .v-icon{height:" + ("24px")  + ";display:") + (("inline")  + ";margin-top:" + ("12px")  + ";}.v-touchkit-tabbar-toolbar .v-button .v-icon{margin-top:" + ("8px")  + ";}.v-touchkit-horizontalbuttongroup .v-button-wrap{background:" + ("none")  + ";border-radius:" + ("0")  + ";}.v-touchkit-navbar .v-button-no-decoration{background:" + ("transparent")  + ";border:" + ("none")  + ";-webkit-box-shadow:" + ("none")  + ";overflow:" + ("visible")  + ";}.v-touchkit-navbar .v-button-no-decoration .v-button-wrap{border:" + ("none")  + ";background:" + ("transparent") ) + (";overflow:" + ("visible")  + ";-webkit-box-shadow:" + ("none")  + ";}.v-button-white .v-button-wrap{background-color:" + ("#fff")  + ";}.v-button-white .v-button-caption{color:" + ("#222")  + ";}.v-button.red{background-color:" + ("#ed5931")  + ";border:" + ("none")  + ";}.v-button.green{background-color:" + ("#0a0")  + ";border:" + ("none")  + ";}.v-button.blue{background-color:" + ("#00a3e8")  + ";border:" + ("none")  + ";}.v-button.red .v-button-wrap,.v-button.green .v-button-wrap,.v-button.blue .v-button-wrap,.v-touchkit-horizontalbuttongroup .v-button-red .v-button-caption,.v-touchkit-horizontalbuttongroup .v-button-blue .v-button-caption,.v-touchkit-horizontalbuttongroup .v-button-green .v-button-caption,.v-touchkit-navbar .v-button-red .v-button-caption,.v-touchkit-navbar .v-button-blue .v-button-caption,.v-touchkit-navbar .v-button-green .v-button-caption{color:") + (("white")  + ";}.v-treetable-treespacer{display:" + ("inline-block")  + ";height:" + ("19px")  + ";width:" + ("18px")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("5px")  + ";text-align:" + ("right")  + ";margin-right:" + ("4px")  + ";}.v-treetable-node-closed:after,.v-tree-node:after{content:" + ("\"▶\"")  + ";}.v-tree-node{position:" + ("relative") ) + (";}.v-treetable-node-open:after,.v-tree-node-expanded:after{content:" + ("\"▼\"")  + ";}.v-tree-node-leaf:after{content:" + ("\"\"")  + ";}.v-tree-node:after,.v-tree-node-expanded:after{position:" + ("absolute")  + ";top:" + ("12px")  + ";left:" + ("6px")  + ";}.v-treetable-node-closed::after,.v-treetable-node-open::after{margin-right:" + ("4px")  + ";}.v-menubar-submenu .v-menubar-menuitem-checked .v-menubar-menuitem-caption:after{content:" + ("\"X\"")  + ";color:" + ("#00a3e8")  + ";}.v-tree .v-tree-node-drag-top:before,.v-tree .v-tree-node-drag-bottom:after,.v-tree .v-tree-node-caption-drag-center:after{display:" + ("block")  + ";position:" + ("absolute")  + ";width:") + (("6px")  + ";height:" + ("6px")  + ";margin-top:" + ("-4px")  + ";background:" + ("transparent"+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.dragSlotDotImage())).getUrl() + "')")  + ";}.v-table-row-drag-top .v-table-cell-content:first-child:before,.v-table-row-drag-bottom .v-table-cell-content:first-child:after{display:" + ("block")  + ";position:" + ("absolute")  + ";width:" + ("6px")  + ";height:" + ("6px")  + ";margin-top:" + ("-4px")  + ";margin-left:" + ("-6px")  + ";background:" + ("transparent"+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.dragSlotDotImage())).getUrl() + "')") ) + (";}.v-ddwrapper-over-top:before,.v-ddwrapper-over-bottom:after,.v-ddwrapper-over-left:before,.v-ddwrapper-over-right:before{display:" + ("block")  + ";position:" + ("absolute")  + ";width:" + ("6px")  + ";height:" + ("6px")  + ";margin-top:" + ("-4px")  + ";margin-left:" + ("-2px")  + ";background:" + ("transparent"+ " " +"url('" + ((com.google.gwt.resources.client.DataResource)(VTouchKitResources_std_safari_default_InlineClientBundleGenerator.this.dragSlotDotImage())).getUrl() + "')"+ " " +"no-repeat")  + ";}.v-cache-loading-indicator{position:" + ("absolute")  + ";right:" + ("5px")  + ";top:" + ("5px")  + ";}.v-cache-loading-indicator:after{font-size:") + (("10px")  + ";}.GL40WDDAIB{display:" + ("block")  + ";position:" + ("absolute")  + ";right:" + ("10px")  + ";top:" + ("0")  + ";bottom:" + ("0")  + ";}.GL40WDDAIB>div{display:" + ("table")  + ";height:" + ("100%")  + ";}.GL40WDDAIB>div>div{display:" + ("table-row")  + ";}.GL40WDDAIB>div>div>div{display:" + ("table-cell")  + ";vertical-align:" + ("middle") ) + (";text-align:" + ("center")  + ";color:" + ("gray")  + ";font-size:" + ("10px")  + ";font-weight:" + ("bold")  + ";padding:" + ("0"+ " " +"5px")  + ";}"));
      }
      public java.lang.String blue(){
        return "blue";
      }
      public java.lang.String blueButtonInsetBackground() {
        return "#00a";
      }
      public java.lang.String blueButtonWrapBgColor() {
        return "#00a3e8";
      }
      public java.lang.String buttonActiveGradient() {
        return "-webkit-gradient(linear, 0% 0%, 0% 100%, from(rgba(200,200,200,.55)), to(rgba(128,131,141,.55)), color-stop(.49, rgba(132,134,138,.55)), color-stop(.51, rgba(101,104,113,.55)))";
      }
      public java.lang.String buttonBoxShadow() {
        return "0 2px rgba(0, 0, 0, 0.1)";
      }
      public java.lang.String buttonColor() {
        return "#00a3e8";
      }
      public java.lang.String buttonColorGradient() {
        return "-webkit-gradient(linear, 0% 0%, 0% 100%, from(rgba(246,246,246,.26)), to(rgba(145,149,159,.26)), color-stop(.49, rgba(160,162,167,.26)), color-stop(.51, rgba(130,133,142,.26)))";
      }
      public java.lang.String buttonFontSize() {
        return "20px";
      }
      public java.lang.String buttonGradient() {
        return "-webkit-gradient(linear, 0% 0%, 0% 100%, from(rgba(246,246,246,.46)), to(rgba(145,149,159,.46)), color-stop(.49, rgba(160,162,167,.46)), color-stop(.51, rgba(130,133,142,.46)))";
      }
      public java.lang.String buttonInsetBackground() {
        return "rgba(37, 38, 40, 0.6)";
      }
      public java.lang.String buttonInsetBoxShadow() {
        return "inset 0 1px 2px rgba(0, 0, 0, 0.5)";
      }
      public java.lang.String buttonTextShadow() {
        return "0 -1px 0 rgba(0, 0, 0, 0.75)";
      }
      public java.lang.String datePickerDay(){
        return "datePickerDay";
      }
      public java.lang.String datePickerDayIsDisabled(){
        return "datePickerDayIsDisabled";
      }
      public java.lang.String datePickerDayIsFiller(){
        return "datePickerDayIsFiller";
      }
      public java.lang.String datePickerDayIsValue(){
        return "datePickerDayIsValue";
      }
      public java.lang.String datePickerDays(){
        return "datePickerDays";
      }
      public java.lang.String datePickerMonth(){
        return "datePickerMonth";
      }
      public java.lang.String datePickerMonthSelector(){
        return "datePickerMonthSelector";
      }
      public java.lang.String datePickerNextButton(){
        return "datePickerNextButton";
      }
      public java.lang.String datePickerPreviousButton(){
        return "datePickerPreviousButton";
      }
      public java.lang.String datePickerWeekdayLabel(){
        return "datePickerWeekdayLabel";
      }
      public java.lang.String datePickerWeekendLabel(){
        return "datePickerWeekendLabel";
      }
      public java.lang.String divider() {
        return "1px solid #e6e6e6";
      }
      public java.lang.String floatingIndex(){
        return "GL40WDDAIB";
      }
      public java.lang.String focused(){
        return "focused";
      }
      public java.lang.String green(){
        return "green";
      }
      public java.lang.String greenButtonInsetBackground() {
        return "#009600";
      }
      public java.lang.String greenButtonWrapBgColor() {
        return "#0a0";
      }
      public java.lang.String gwtDatePicker(){
        return "gwt-DatePicker";
      }
      public java.lang.String gwtMenuItem(){
        return "gwt-MenuItem";
      }
      public java.lang.String gwtMenuItemSelected(){
        return "gwt-MenuItem-selected";
      }
      public java.lang.String iconArrowDown(){
        return "icon-arrow-down";
      }
      public java.lang.String iconArrowLeft(){
        return "icon-arrow-left";
      }
      public java.lang.String iconArrowRight(){
        return "icon-arrow-right";
      }
      public java.lang.String iconArrowUp(){
        return "icon-arrow-up";
      }
      public java.lang.String lightDivider() {
        return "1px solid #e6e6e6";
      }
      public java.lang.String listBorder() {
        return "1px solid #e6e6e6";
      }
      public java.lang.String listLayoutMargin() {
        return "10px";
      }
      public java.lang.String navButtonGradient() {
        return "-webkit-gradient(linear, 0% 0%, 0% 100%, from(#4d8cb9), to(#3e6fa8))";
      }
      public java.lang.String navbarButtonBorder() {
        return "none";
      }
      public java.lang.String navbarButtonBoxShadow() {
        return "none";
      }
      public java.lang.String navbarButtonColor() {
        return "#00a3e8";
      }
      public java.lang.String negativeListLayoutMargin() {
        return "-10px";
      }
      public java.lang.String noBoxDragHints(){
        return "no-box-drag-hints";
      }
      public java.lang.String noHorizontalDragHints(){
        return "no-horizontal-drag-hints";
      }
      public java.lang.String noVerticalDragHints(){
        return "no-vertical-drag-hints";
      }
      public java.lang.String popupContent(){
        return "popupContent";
      }
      public java.lang.String red(){
        return "red";
      }
      public java.lang.String redButtonInsetBackground() {
        return "#a00";
      }
      public java.lang.String redButtonWrapBgColor() {
        return "#ed5931";
      }
      public java.lang.String relative(){
        return "relative";
      }
      public java.lang.String tableHeaderHeight() {
        return "30px";
      }
      public java.lang.String vAbsolutelayout(){
        return "v-absolutelayout";
      }
      public java.lang.String vAbsolutelayoutCanvas(){
        return "v-absolutelayout-canvas";
      }
      public java.lang.String vAbsolutelayoutMargin(){
        return "v-absolutelayout-margin";
      }
      public java.lang.String vAbsolutelayoutWrapper(){
        return "v-absolutelayout-wrapper";
      }
      public java.lang.String vAccordion(){
        return "v-accordion";
      }
      public java.lang.String vAccordionItem(){
        return "v-accordion-item";
      }
      public java.lang.String vAccordionItemCaption(){
        return "v-accordion-item-caption";
      }
      public java.lang.String vAccordionItemContent(){
        return "v-accordion-item-content";
      }
      public java.lang.String vAccordionItemOpen(){
        return "v-accordion-item-open";
      }
      public java.lang.String vAlignBottom(){
        return "v-align-bottom";
      }
      public java.lang.String vAlignCenter(){
        return "v-align-center";
      }
      public java.lang.String vAlignMiddle(){
        return "v-align-middle";
      }
      public java.lang.String vAlignRight(){
        return "v-align-right";
      }
      public java.lang.String vApp(){
        return "v-app";
      }
      public java.lang.String vAppLoading(){
        return "v-app-loading";
      }
      public java.lang.String vAppLoginpage(){
        return "v-app-loginpage";
      }
      public java.lang.String vButton(){
        return "v-button";
      }
      public java.lang.String vButtonBlue(){
        return "v-button-blue";
      }
      public java.lang.String vButtonCaption(){
        return "v-button-caption";
      }
      public java.lang.String vButtonGreen(){
        return "v-button-green";
      }
      public java.lang.String vButtonLink(){
        return "v-button-link";
      }
      public java.lang.String vButtonNav(){
        return "v-button-nav";
      }
      public java.lang.String vButtonNextyear(){
        return "v-button-nextyear";
      }
      public java.lang.String vButtonNoDecoration(){
        return "v-button-no-decoration";
      }
      public java.lang.String vButtonRed(){
        return "v-button-red";
      }
      public java.lang.String vButtonSelected(){
        return "v-button-selected";
      }
      public java.lang.String vButtonWhite(){
        return "v-button-white";
      }
      public java.lang.String vButtonWrap(){
        return "v-button-wrap";
      }
      public java.lang.String vCacheLoadingIndicator(){
        return "v-cache-loading-indicator";
      }
      public java.lang.String vCaption(){
        return "v-caption";
      }
      public java.lang.String vCaptionOnBottom(){
        return "v-caption-on-bottom";
      }
      public java.lang.String vCaptionOnLeft(){
        return "v-caption-on-left";
      }
      public java.lang.String vCaptionOnRight(){
        return "v-caption-on-right";
      }
      public java.lang.String vCaptionOnTop(){
        return "v-caption-on-top";
      }
      public java.lang.String vCaptiontext(){
        return "v-captiontext";
      }
      public java.lang.String vCaptionwrapper(){
        return "v-captionwrapper";
      }
      public java.lang.String vCheckbox(){
        return "v-checkbox";
      }
      public java.lang.String vClip(){
        return "v-clip";
      }
      public java.lang.String vContextmenu(){
        return "v-contextmenu";
      }
      public java.lang.String vCsslayout(){
        return "v-csslayout";
      }
      public java.lang.String vCsslayoutContainer(){
        return "v-csslayout-container";
      }
      public java.lang.String vCsslayoutMargin(){
        return "v-csslayout-margin";
      }
      public java.lang.String vCsslayoutMarginBottom(){
        return "v-csslayout-margin-bottom";
      }
      public java.lang.String vCsslayoutMarginLeft(){
        return "v-csslayout-margin-left";
      }
      public java.lang.String vCsslayoutMarginRight(){
        return "v-csslayout-margin-right";
      }
      public java.lang.String vCsslayoutMarginTop(){
        return "v-csslayout-margin-top";
      }
      public java.lang.String vCustomcomponent(){
        return "v-customcomponent";
      }
      public java.lang.String vCustomlayout(){
        return "v-customlayout";
      }
      public java.lang.String vDatefield(){
        return "v-datefield";
      }
      public java.lang.String vDatefieldButton(){
        return "v-datefield-button";
      }
      public java.lang.String vDatefieldButtonReadonly(){
        return "v-datefield-button-readonly";
      }
      public java.lang.String vDatefieldCalendarpanel(){
        return "v-datefield-calendarpanel";
      }
      public java.lang.String vDatefieldCalendarpanelDay(){
        return "v-datefield-calendarpanel-day";
      }
      public java.lang.String vDatefieldCalendarpanelDayDisabled(){
        return "v-datefield-calendarpanel-day-disabled";
      }
      public java.lang.String vDatefieldCalendarpanelDayFocused(){
        return "v-datefield-calendarpanel-day-focused";
      }
      public java.lang.String vDatefieldCalendarpanelDayOffmonth(){
        return "v-datefield-calendarpanel-day-offmonth";
      }
      public java.lang.String vDatefieldCalendarpanelDaySelected(){
        return "v-datefield-calendarpanel-day-selected";
      }
      public java.lang.String vDatefieldCalendarpanelDayToday(){
        return "v-datefield-calendarpanel-day-today";
      }
      public java.lang.String vDatefieldCalendarpanelHeader(){
        return "v-datefield-calendarpanel-header";
      }
      public java.lang.String vDatefieldCalendarpanelMonth(){
        return "v-datefield-calendarpanel-month";
      }
      public java.lang.String vDatefieldCalendarpanelWeeknumber(){
        return "v-datefield-calendarpanel-weeknumber";
      }
      public java.lang.String vDatefieldError(){
        return "v-datefield-error";
      }
      public java.lang.String vDatefieldPopup(){
        return "v-datefield-popup";
      }
      public java.lang.String vDatefieldPopupcalendar(){
        return "v-datefield-popupcalendar";
      }
      public java.lang.String vDatefieldPrompt(){
        return "v-datefield-prompt";
      }
      public java.lang.String vDatefieldTextfield(){
        return "v-datefield-textfield";
      }
      public java.lang.String vDatefieldTime(){
        return "v-datefield-time";
      }
      public java.lang.String vDdwrapper(){
        return "v-ddwrapper";
      }
      public java.lang.String vDdwrapperOver(){
        return "v-ddwrapper-over";
      }
      public java.lang.String vDdwrapperOverBottom(){
        return "v-ddwrapper-over-bottom";
      }
      public java.lang.String vDdwrapperOverLeft(){
        return "v-ddwrapper-over-left";
      }
      public java.lang.String vDdwrapperOverRight(){
        return "v-ddwrapper-over-right";
      }
      public java.lang.String vDdwrapperOverTop(){
        return "v-ddwrapper-over-top";
      }
      public java.lang.String vDisabled(){
        return "v-disabled";
      }
      public java.lang.String vDragElement(){
        return "v-drag-element";
      }
      public java.lang.String vEmbeddedImage(){
        return "v-embedded-image";
      }
      public java.lang.String vErrorindicator(){
        return "v-errorindicator";
      }
      public java.lang.String vExpand(){
        return "v-expand";
      }
      public java.lang.String vFilterselect(){
        return "v-filterselect";
      }
      public java.lang.String vFilterselectButton(){
        return "v-filterselect-button";
      }
      public java.lang.String vFilterselectInput(){
        return "v-filterselect-input";
      }
      public java.lang.String vFilterselectNextpage(){
        return "v-filterselect-nextpage";
      }
      public java.lang.String vFilterselectNextpageOff(){
        return "v-filterselect-nextpage-off";
      }
      public java.lang.String vFilterselectPrevpage(){
        return "v-filterselect-prevpage";
      }
      public java.lang.String vFilterselectPrevpageOff(){
        return "v-filterselect-prevpage-off";
      }
      public java.lang.String vFilterselectPrompt(){
        return "v-filterselect-prompt";
      }
      public java.lang.String vFilterselectStatus(){
        return "v-filterselect-status";
      }
      public java.lang.String vFilterselectSuggestmenu(){
        return "v-filterselect-suggestmenu";
      }
      public java.lang.String vFilterselectSuggestpopup(){
        return "v-filterselect-suggestpopup";
      }
      public java.lang.String vForm(){
        return "v-form";
      }
      public java.lang.String vFormContent(){
        return "v-form-content";
      }
      public java.lang.String vFormlayout(){
        return "v-formlayout";
      }
      public java.lang.String vFormlayoutCaptioncell(){
        return "v-formlayout-captioncell";
      }
      public java.lang.String vFormlayoutCell(){
        return "v-formlayout-cell";
      }
      public java.lang.String vFormlayoutContentcell(){
        return "v-formlayout-contentcell";
      }
      public java.lang.String vFormlayoutErrorIndicator(){
        return "v-formlayout-error-indicator";
      }
      public java.lang.String vFormlayoutErrorcell(){
        return "v-formlayout-errorcell";
      }
      public java.lang.String vFormlayoutFirstrow(){
        return "v-formlayout-firstrow";
      }
      public java.lang.String vFormlayoutLastrow(){
        return "v-formlayout-lastrow";
      }
      public java.lang.String vFormlayoutMarginBottom(){
        return "v-formlayout-margin-bottom";
      }
      public java.lang.String vFormlayoutMarginLeft(){
        return "v-formlayout-margin-left";
      }
      public java.lang.String vFormlayoutMarginRight(){
        return "v-formlayout-margin-right";
      }
      public java.lang.String vFormlayoutMarginTop(){
        return "v-formlayout-margin-top";
      }
      public java.lang.String vFormlayoutRow(){
        return "v-formlayout-row";
      }
      public java.lang.String vFormlayoutSpacing(){
        return "v-formlayout-spacing";
      }
      public java.lang.String vGeneratedBody(){
        return "v-generated-body";
      }
      public java.lang.String vGridlayout(){
        return "v-gridlayout";
      }
      public java.lang.String vGridlayoutMarginBottom(){
        return "v-gridlayout-margin-bottom";
      }
      public java.lang.String vGridlayoutMarginLeft(){
        return "v-gridlayout-margin-left";
      }
      public java.lang.String vGridlayoutMarginRight(){
        return "v-gridlayout-margin-right";
      }
      public java.lang.String vGridlayoutMarginTop(){
        return "v-gridlayout-margin-top";
      }
      public java.lang.String vGridlayoutSlot(){
        return "v-gridlayout-slot";
      }
      public java.lang.String vGridlayoutSpacing(){
        return "v-gridlayout-spacing";
      }
      public java.lang.String vGridlayoutSpacingOff(){
        return "v-gridlayout-spacing-off";
      }
      public java.lang.String vGridlayoutSpacingOn(){
        return "v-gridlayout-spacing-on";
      }
      public java.lang.String vHasCaption(){
        return "v-has-caption";
      }
      public java.lang.String vHasHeight(){
        return "v-has-height";
      }
      public java.lang.String vHasWidth(){
        return "v-has-width";
      }
      public java.lang.String vHorizontal(){
        return "v-horizontal";
      }
      public java.lang.String vHorizontallayout(){
        return "v-horizontallayout";
      }
      public java.lang.String vHorizontallayoutMarginBottom(){
        return "v-horizontallayout-margin-bottom";
      }
      public java.lang.String vHorizontallayoutMarginLeft(){
        return "v-horizontallayout-margin-left";
      }
      public java.lang.String vHorizontallayoutMarginRight(){
        return "v-horizontallayout-margin-right";
      }
      public java.lang.String vHorizontallayoutMarginTop(){
        return "v-horizontallayout-margin-top";
      }
      public java.lang.String vHorizontallayoutSlot(){
        return "v-horizontallayout-slot";
      }
      public java.lang.String vHorizontallayoutSpacingOff(){
        return "v-horizontallayout-spacing-off";
      }
      public java.lang.String vHorizontallayoutSpacingOn(){
        return "v-horizontallayout-spacing-on";
      }
      public java.lang.String vIcon(){
        return "v-icon";
      }
      public java.lang.String vInlineDatefield(){
        return "v-inline-datefield";
      }
      public java.lang.String vInlineDatefieldButton(){
        return "v-inline-datefield-button";
      }
      public java.lang.String vInlineDatefieldButtonReadonly(){
        return "v-inline-datefield-button-readonly";
      }
      public java.lang.String vInlineDatefieldCalendarpanel(){
        return "v-inline-datefield-calendarpanel";
      }
      public java.lang.String vInlineDatefieldCalendarpanelDay(){
        return "v-inline-datefield-calendarpanel-day";
      }
      public java.lang.String vInlineDatefieldCalendarpanelDayDisabled(){
        return "v-inline-datefield-calendarpanel-day-disabled";
      }
      public java.lang.String vInlineDatefieldCalendarpanelDayFocused(){
        return "v-inline-datefield-calendarpanel-day-focused";
      }
      public java.lang.String vInlineDatefieldCalendarpanelDayOffmonth(){
        return "v-inline-datefield-calendarpanel-day-offmonth";
      }
      public java.lang.String vInlineDatefieldCalendarpanelDaySelected(){
        return "v-inline-datefield-calendarpanel-day-selected";
      }
      public java.lang.String vInlineDatefieldCalendarpanelDayToday(){
        return "v-inline-datefield-calendarpanel-day-today";
      }
      public java.lang.String vInlineDatefieldCalendarpanelHeader(){
        return "v-inline-datefield-calendarpanel-header";
      }
      public java.lang.String vInlineDatefieldCalendarpanelMonth(){
        return "v-inline-datefield-calendarpanel-month";
      }
      public java.lang.String vInlineDatefieldCalendarpanelWeeknumber(){
        return "v-inline-datefield-calendarpanel-weeknumber";
      }
      public java.lang.String vInlineDatefieldPopup(){
        return "v-inline-datefield-popup";
      }
      public java.lang.String vInlineDatefieldPopupcalendar(){
        return "v-inline-datefield-popupcalendar";
      }
      public java.lang.String vInlineDatefieldPrompt(){
        return "v-inline-datefield-prompt";
      }
      public java.lang.String vInlineDatefieldTextfield(){
        return "v-inline-datefield-textfield";
      }
      public java.lang.String vInlineDatefieldTime(){
        return "v-inline-datefield-time";
      }
      public java.lang.String vLabel(){
        return "v-label";
      }
      public java.lang.String vLabelGreyTitle(){
        return "v-label-grey-title";
      }
      public java.lang.String vLabelUndefW(){
        return "v-label-undef-w";
      }
      public java.lang.String vLayout(){
        return "v-layout";
      }
      public java.lang.String vLayoutMarginBottom(){
        return "v-layout-margin-bottom";
      }
      public java.lang.String vLayoutMarginLeft(){
        return "v-layout-margin-left";
      }
      public java.lang.String vLayoutMarginRight(){
        return "v-layout-margin-right";
      }
      public java.lang.String vLayoutMarginTop(){
        return "v-layout-margin-top";
      }
      public java.lang.String vLayoutSpacingOn(){
        return "v-layout-spacing-on";
      }
      public java.lang.String vLink(){
        return "v-link";
      }
      public java.lang.String vLoadingIndicator(){
        return "v-loading-indicator";
      }
      public java.lang.String vLoadingIndicatorDelay(){
        return "v-loading-indicator-delay";
      }
      public java.lang.String vLoadingIndicatorWait(){
        return "v-loading-indicator-wait";
      }
      public java.lang.String vLoginform(){
        return "v-loginform";
      }
      public java.lang.String vMarginBottom(){
        return "v-margin-bottom";
      }
      public java.lang.String vMarginLeft(){
        return "v-margin-left";
      }
      public java.lang.String vMarginRight(){
        return "v-margin-right";
      }
      public java.lang.String vMarginTop(){
        return "v-margin-top";
      }
      public java.lang.String vMenubar(){
        return "v-menubar";
      }
      public java.lang.String vMenubarMenuitem(){
        return "v-menubar-menuitem";
      }
      public java.lang.String vMenubarMenuitemCaption(){
        return "v-menubar-menuitem-caption";
      }
      public java.lang.String vMenubarMenuitemChecked(){
        return "v-menubar-menuitem-checked";
      }
      public java.lang.String vMenubarMenuitemDisabled(){
        return "v-menubar-menuitem-disabled";
      }
      public java.lang.String vMenubarMenuitemSelected(){
        return "v-menubar-menuitem-selected";
      }
      public java.lang.String vMenubarMoreMenuitem(){
        return "v-menubar-more-menuitem";
      }
      public java.lang.String vMenubarPopup(){
        return "v-menubar-popup";
      }
      public java.lang.String vMenubarSeparator(){
        return "v-menubar-separator";
      }
      public java.lang.String vMenubarSubmenu(){
        return "v-menubar-submenu";
      }
      public java.lang.String vMenubarSubmenuCheckColumn(){
        return "v-menubar-submenu-check-column";
      }
      public java.lang.String vMenubarSubmenuIndicator(){
        return "v-menubar-submenu-indicator";
      }
      public java.lang.String vNativebutton(){
        return "v-nativebutton";
      }
      public java.lang.String vNativebuttonCaption(){
        return "v-nativebutton-caption";
      }
      public java.lang.String vNativebuttonLink(){
        return "v-nativebutton-link";
      }
      public java.lang.String vNotification(){
        return "v-Notification";
      }
      public java.lang.String vNotificationError(){
        return "v-Notification-error";
      }
      public java.lang.String vNotificationSystem(){
        return "v-Notification-system";
      }
      public java.lang.String vNotificationTray(){
        return "v-Notification-tray";
      }
      public java.lang.String vNotificationWarning(){
        return "v-Notification-warning";
      }
      public java.lang.String vOff(){
        return "v-off";
      }
      public java.lang.String vOrderedlayout(){
        return "v-orderedlayout";
      }
      public java.lang.String vOrderedlayoutMarginBottom(){
        return "v-orderedlayout-margin-bottom";
      }
      public java.lang.String vOrderedlayoutMarginLeft(){
        return "v-orderedlayout-margin-left";
      }
      public java.lang.String vOrderedlayoutMarginRight(){
        return "v-orderedlayout-margin-right";
      }
      public java.lang.String vOrderedlayoutMarginTop(){
        return "v-orderedlayout-margin-top";
      }
      public java.lang.String vOrderedlayoutSpacingOff(){
        return "v-orderedlayout-spacing-off";
      }
      public java.lang.String vOrderedlayoutSpacingOn(){
        return "v-orderedlayout-spacing-on";
      }
      public java.lang.String vOverlayContainer(){
        return "v-overlay-container";
      }
      public java.lang.String vPanel(){
        return "v-panel";
      }
      public java.lang.String vPanelCaption(){
        return "v-panel-caption";
      }
      public java.lang.String vPanelCaptionLight(){
        return "v-panel-caption-light";
      }
      public java.lang.String vPanelContent(){
        return "v-panel-content";
      }
      public java.lang.String vPanelContentLight(){
        return "v-panel-content-light";
      }
      public java.lang.String vPanelDeco(){
        return "v-panel-deco";
      }
      public java.lang.String vPanelDecoLight(){
        return "v-panel-deco-light";
      }
      public java.lang.String vPanelLight(){
        return "v-panel-light";
      }
      public java.lang.String vPanelNocaption(){
        return "v-panel-nocaption";
      }
      public java.lang.String vPopupview(){
        return "v-popupview";
      }
      public java.lang.String vPopupviewPopup(){
        return "v-popupview-popup";
      }
      public java.lang.String vPressed(){
        return "v-pressed";
      }
      public java.lang.String vProgressindicator(){
        return "v-progressindicator";
      }
      public java.lang.String vProgressindicatorIndeterminate(){
        return "v-progressindicator-indeterminate";
      }
      public java.lang.String vProgressindicatorIndeterminateDisabled(){
        return "v-progressindicator-indeterminate-disabled";
      }
      public java.lang.String vProgressindicatorIndicator(){
        return "v-progressindicator-indicator";
      }
      public java.lang.String vProgressindicatorWrapper(){
        return "v-progressindicator-wrapper";
      }
      public java.lang.String vReadonly(){
        return "v-readonly";
      }
      public java.lang.String vRequiredFieldIndicator(){
        return "v-required-field-indicator";
      }
      public java.lang.String vScrollable(){
        return "v-scrollable";
      }
      public java.lang.String vSelect(){
        return "v-select";
      }
      public java.lang.String vSelectOption(){
        return "v-select-option";
      }
      public java.lang.String vSelectOptiongroup(){
        return "v-select-optiongroup";
      }
      public java.lang.String vSelectSelect(){
        return "v-select-select";
      }
      public java.lang.String vSelectTwincol(){
        return "v-select-twincol";
      }
      public java.lang.String vSelectTwincolButtons(){
        return "v-select-twincol-buttons";
      }
      public java.lang.String vSelectTwincolCaptionLeft(){
        return "v-select-twincol-caption-left";
      }
      public java.lang.String vSelectTwincolCaptionRight(){
        return "v-select-twincol-caption-right";
      }
      public java.lang.String vSelectTwincolDeco(){
        return "v-select-twincol-deco";
      }
      public java.lang.String vSelectTwincolOptions(){
        return "v-select-twincol-options";
      }
      public java.lang.String vSelectTwincolSelections(){
        return "v-select-twincol-selections";
      }
      public java.lang.String vSelected(){
        return "v-selected";
      }
      public java.lang.String vShadow(){
        return "v-shadow";
      }
      public java.lang.String vShadowWindow(){
        return "v-shadow-window";
      }
      public java.lang.String vSlider(){
        return "v-slider";
      }
      public java.lang.String vSliderBase(){
        return "v-slider-base";
      }
      public java.lang.String vSliderFeedback(){
        return "v-slider-feedback";
      }
      public java.lang.String vSliderHandle(){
        return "v-slider-handle";
      }
      public java.lang.String vSliderHandleActive(){
        return "v-slider-handle-active";
      }
      public java.lang.String vSliderVertical(){
        return "v-slider-vertical";
      }
      public java.lang.String vSlot(){
        return "v-slot";
      }
      public java.lang.String vSpacing(){
        return "v-spacing";
      }
      public java.lang.String vSplitpanelHorizontal(){
        return "v-splitpanel-horizontal";
      }
      public java.lang.String vSplitpanelHsplitter(){
        return "v-splitpanel-hsplitter";
      }
      public java.lang.String vSplitpanelVertical(){
        return "v-splitpanel-vertical";
      }
      public java.lang.String vSplitpanelVsplitter(){
        return "v-splitpanel-vsplitter";
      }
      public java.lang.String vSwitchOff(){
        return "v-touchkit-switch-off";
      }
      public java.lang.String vSwitchWrapper(){
        return "v-touchkit-switch-wrapper";
      }
      public java.lang.String vTable(){
        return "v-table";
      }
      public java.lang.String vTableBody(){
        return "v-table-body";
      }
      public java.lang.String vTableBodyNoselection(){
        return "v-table-body-noselection";
      }
      public java.lang.String vTableBodyWrapper(){
        return "v-table-body-wrapper";
      }
      public java.lang.String vTableCaptionContainer(){
        return "v-table-caption-container";
      }
      public java.lang.String vTableCaptionContainerAlignCenter(){
        return "v-table-caption-container-align-center";
      }
      public java.lang.String vTableCaptionContainerAlignRight(){
        return "v-table-caption-container-align-right";
      }
      public java.lang.String vTableCellContent(){
        return "v-table-cell-content";
      }
      public java.lang.String vTableCellWrapper(){
        return "v-table-cell-wrapper";
      }
      public java.lang.String vTableCellWrapperAlignCenter(){
        return "v-table-cell-wrapper-align-center";
      }
      public java.lang.String vTableCellWrapperAlignRight(){
        return "v-table-cell-wrapper-align-right";
      }
      public java.lang.String vTableColumnSelector(){
        return "v-table-column-selector";
      }
      public java.lang.String vTableDrag(){
        return "v-table-drag";
      }
      public java.lang.String vTableFocus(){
        return "v-table-focus";
      }
      public java.lang.String vTableFocusSlotLeft(){
        return "v-table-focus-slot-left";
      }
      public java.lang.String vTableFocusSlotRight(){
        return "v-table-focus-slot-right";
      }
      public java.lang.String vTableFooter(){
        return "v-table-footer";
      }
      public java.lang.String vTableFooterCell(){
        return "v-table-footer-cell";
      }
      public java.lang.String vTableFooterContainer(){
        return "v-table-footer-container";
      }
      public java.lang.String vTableFooterWrap(){
        return "v-table-footer-wrap";
      }
      public java.lang.String vTableGeneratedRow(){
        return "v-table-generated-row";
      }
      public java.lang.String vTableHeader(){
        return "v-table-header";
      }
      public java.lang.String vTableHeaderCell(){
        return "v-table-header-cell";
      }
      public java.lang.String vTableHeaderCellAsc(){
        return "v-table-header-cell-asc";
      }
      public java.lang.String vTableHeaderCellDesc(){
        return "v-table-header-cell-desc";
      }
      public java.lang.String vTableHeaderCellRowHeader(){
        return "v-table-header-cell-rowheader";
      }
      public java.lang.String vTableHeaderDrag(){
        return "v-table-header-drag";
      }
      public java.lang.String vTableHeaderWrap(){
        return "v-table-header-wrap";
      }
      public java.lang.String vTableResizer(){
        return "v-table-resizer";
      }
      public java.lang.String vTableRow(){
        return "v-table-row";
      }
      public java.lang.String vTableRowAnimating(){
        return "v-table-row-animating";
      }
      public java.lang.String vTableRowDragBottom(){
        return "v-table-row-drag-bottom";
      }
      public java.lang.String vTableRowDragMiddle(){
        return "v-table-row-drag-middle";
      }
      public java.lang.String vTableRowDragTop(){
        return "v-table-row-drag-top";
      }
      public java.lang.String vTableRowOdd(){
        return "v-table-row-odd";
      }
      public java.lang.String vTableRowSpacer(){
        return "v-table-row-spacer";
      }
      public java.lang.String vTableScrollposition(){
        return "v-table-scrollposition";
      }
      public java.lang.String vTableSortIndicator(){
        return "v-table-sort-indicator";
      }
      public java.lang.String vTableTable(){
        return "v-table-table";
      }
      public java.lang.String vTabsheet(){
        return "v-tabsheet";
      }
      public java.lang.String vTabsheetCaptionClose(){
        return "v-tabsheet-caption-close";
      }
      public java.lang.String vTabsheetContent(){
        return "v-tabsheet-content";
      }
      public java.lang.String vTabsheetDeco(){
        return "v-tabsheet-deco";
      }
      public java.lang.String vTabsheetHidetabs(){
        return "v-tabsheet-hidetabs";
      }
      public java.lang.String vTabsheetScroller(){
        return "v-tabsheet-scroller";
      }
      public java.lang.String vTabsheetScrollerNext(){
        return "v-tabsheet-scrollerNext";
      }
      public java.lang.String vTabsheetScrollerNextDisabled(){
        return "v-tabsheet-scrollerNext-disabled";
      }
      public java.lang.String vTabsheetScrollerPrev(){
        return "v-tabsheet-scrollerPrev";
      }
      public java.lang.String vTabsheetScrollerPrevDisabled(){
        return "v-tabsheet-scrollerPrev-disabled";
      }
      public java.lang.String vTabsheetSpacertd(){
        return "v-tabsheet-spacertd";
      }
      public java.lang.String vTabsheetTabcontainer(){
        return "v-tabsheet-tabcontainer";
      }
      public java.lang.String vTabsheetTabitem(){
        return "v-tabsheet-tabitem";
      }
      public java.lang.String vTabsheetTabitemSelected(){
        return "v-tabsheet-tabitem-selected";
      }
      public java.lang.String vTabsheetTabitemcell(){
        return "v-tabsheet-tabitemcell";
      }
      public java.lang.String vTabsheetTabitemcellDisabled(){
        return "v-tabsheet-tabitemcell-disabled";
      }
      public java.lang.String vTabsheetTabs(){
        return "v-tabsheet-tabs";
      }
      public java.lang.String vTextarea(){
        return "v-textarea";
      }
      public java.lang.String vTextareaPrompt(){
        return "v-textarea-prompt";
      }
      public java.lang.String vTextareaReadonly(){
        return "v-textarea-readonly";
      }
      public java.lang.String vTextfield(){
        return "v-textfield";
      }
      public java.lang.String vTextfieldPrompt(){
        return "v-textfield-prompt";
      }
      public java.lang.String vTextfieldReadonly(){
        return "v-textfield-readonly";
      }
      public java.lang.String vTooltip(){
        return "v-tooltip";
      }
      public java.lang.String vTouchkitBackgroundstripes(){
        return "v-touchkit-backgroundstripes";
      }
      public java.lang.String vTouchkitDateCancel(){
        return "v-touchkit-date-cancel";
      }
      public java.lang.String vTouchkitDateOk(){
        return "v-touchkit-date-ok";
      }
      public java.lang.String vTouchkitDatepopover(){
        return "v-touchkit-datepopover";
      }
      public java.lang.String vTouchkitDatepopoverHidedays(){
        return "v-touchkit-datepopover-hidedays";
      }
      public java.lang.String vTouchkitDatepopoverNonext(){
        return "v-touchkit-datepopover-nonext";
      }
      public java.lang.String vTouchkitDatepopoverNoprev(){
        return "v-touchkit-datepopover-noprev";
      }
      public java.lang.String vTouchkitFullscreen(){
        return "v-touchkit-fullscreen";
      }
      public java.lang.String vTouchkitHorizontalbuttongroup(){
        return "v-touchkit-horizontalbuttongroup";
      }
      public java.lang.String vTouchkitNavbar(){
        return "v-touchkit-navbar";
      }
      public java.lang.String vTouchkitNavbarCaption(){
        return "v-touchkit-navbar-caption";
      }
      public java.lang.String vTouchkitNavbarLeft(){
        return "v-touchkit-navbar-left";
      }
      public java.lang.String vTouchkitNavbarRight(){
        return "v-touchkit-navbar-right";
      }
      public java.lang.String vTouchkitNavbutton(){
        return "v-touchkit-navbutton";
      }
      public java.lang.String vTouchkitNavbuttonBack(){
        return "v-touchkit-navbutton-back";
      }
      public java.lang.String vTouchkitNavbuttonDesc(){
        return "v-touchkit-navbutton-desc";
      }
      public java.lang.String vTouchkitNavbuttonEmphasis(){
        return "v-touchkit-navbutton-emphasis";
      }
      public java.lang.String vTouchkitNavbuttonForward(){
        return "v-touchkit-navbutton-forward";
      }
      public java.lang.String vTouchkitNavbuttonPill(){
        return "v-touchkit-navbutton-pill";
      }
      public java.lang.String vTouchkitNavpanel(){
        return "v-touchkit-navpanel";
      }
      public java.lang.String vTouchkitNavpanelContainer(){
        return "v-touchkit-navpanel-container";
      }
      public java.lang.String vTouchkitNavpanelNotransit(){
        return "v-touchkit-navpanel-notransit";
      }
      public java.lang.String vTouchkitNavpanelPlaceholder(){
        return "v-touchkit-navpanel-placeholder";
      }
      public java.lang.String vTouchkitNavpanelWrapper(){
        return "v-touchkit-navpanel-wrapper";
      }
      public java.lang.String vTouchkitNavview(){
        return "v-touchkit-navview";
      }
      public java.lang.String vTouchkitNavviewNotoolbar(){
        return "v-touchkit-navview-notoolbar";
      }
      public java.lang.String vTouchkitNavviewToolbar(){
        return "v-touchkit-navview-toolbar";
      }
      public java.lang.String vTouchkitNavviewWrapper(){
        return "v-touchkit-navview-wrapper";
      }
      public java.lang.String vTouchkitNumberfield(){
        return "v-touchkit-numberfield";
      }
      public java.lang.String vTouchkitOfflinemode(){
        return "v-touchkit-offlinemode";
      }
      public java.lang.String vTouchkitOfflinemodePanel(){
        return "v-touchkit-offlinemode-panel";
      }
      public java.lang.String vTouchkitOpacityTransition(){
        return "v-touchkit-opacity-transition";
      }
      public java.lang.String vTouchkitPlain(){
        return "v-touchkit-plain";
      }
      public java.lang.String vTouchkitPopover(){
        return "v-touchkit-popover";
      }
      public java.lang.String vTouchkitPopoverPointer(){
        return "v-touchkit-popover-pointer";
      }
      public java.lang.String vTouchkitPopoverPointerBottom(){
        return "v-touchkit-popover-pointer-bottom";
      }
      public java.lang.String vTouchkitRelative(){
        return "v-touchkit-relative";
      }
      public java.lang.String vTouchkitSadface(){
        return "v-touchkit-sadface";
      }
      public java.lang.String vTouchkitSmallscreen(){
        return "v-touchkit-smallscreen";
      }
      public java.lang.String vTouchkitSwipeview(){
        return "v-touchkit-swipeview";
      }
      public java.lang.String vTouchkitSwitch(){
        return "v-touchkit-switch";
      }
      public java.lang.String vTouchkitSwitchFocus(){
        return "v-touchkit-switch-focus";
      }
      public java.lang.String vTouchkitSwitchSlider(){
        return "v-touchkit-switch-slider";
      }
      public java.lang.String vTouchkitTabbar(){
        return "v-touchkit-tabbar";
      }
      public java.lang.String vTouchkitTabbarToolbar(){
        return "v-touchkit-tabbar-toolbar";
      }
      public java.lang.String vTouchkitTabbarWrapper(){
        return "v-touchkit-tabbar-wrapper";
      }
      public java.lang.String vTouchkitToolbar(){
        return "v-touchkit-toolbar";
      }
      public java.lang.String vTouchkitVerticalcomponentgroup(){
        return "v-touchkit-verticalcomponentgroup";
      }
      public java.lang.String vTree(){
        return "v-tree";
      }
      public java.lang.String vTreeNode(){
        return "v-tree-node";
      }
      public java.lang.String vTreeNodeCaption(){
        return "v-tree-node-caption";
      }
      public java.lang.String vTreeNodeCaptionDragCenter(){
        return "v-tree-node-caption-drag-center";
      }
      public java.lang.String vTreeNodeChildren(){
        return "v-tree-node-children";
      }
      public java.lang.String vTreeNodeDragBottom(){
        return "v-tree-node-drag-bottom";
      }
      public java.lang.String vTreeNodeDragTop(){
        return "v-tree-node-drag-top";
      }
      public java.lang.String vTreeNodeExpanded(){
        return "v-tree-node-expanded";
      }
      public java.lang.String vTreeNodeLeaf(){
        return "v-tree-node-leaf";
      }
      public java.lang.String vTreeNodeSelected(){
        return "v-tree-node-selected";
      }
      public java.lang.String vTreetable(){
        return "v-treetable";
      }
      public java.lang.String vTreetableAnimationClone(){
        return "v-treetable-animation-clone";
      }
      public java.lang.String vTreetableAnimationCloneWrapper(){
        return "v-treetable-animation-clone-wrapper";
      }
      public java.lang.String vTreetableNodeClosed(){
        return "v-treetable-node-closed";
      }
      public java.lang.String vTreetableNodeOpen(){
        return "v-treetable-node-open";
      }
      public java.lang.String vTreetableTreespacer(){
        return "v-treetable-treespacer";
      }
      public java.lang.String vUi(){
        return "v-ui";
      }
      public java.lang.String vUiEmbedded(){
        return "v-ui-embedded";
      }
      public java.lang.String vUpload(){
        return "v-upload";
      }
      public java.lang.String vUploadImmediate(){
        return "v-upload-immediate";
      }
      public java.lang.String vVertical(){
        return "v-vertical";
      }
      public java.lang.String vVerticallayout(){
        return "v-verticallayout";
      }
      public java.lang.String vVerticallayoutMarginBottom(){
        return "v-verticallayout-margin-bottom";
      }
      public java.lang.String vVerticallayoutMarginLeft(){
        return "v-verticallayout-margin-left";
      }
      public java.lang.String vVerticallayoutMarginRight(){
        return "v-verticallayout-margin-right";
      }
      public java.lang.String vVerticallayoutMarginTop(){
        return "v-verticallayout-margin-top";
      }
      public java.lang.String vVerticallayoutSlot(){
        return "v-verticallayout-slot";
      }
      public java.lang.String vVerticallayoutSpacingOff(){
        return "v-verticallayout-spacing-off";
      }
      public java.lang.String vVerticallayoutSpacingOn(){
        return "v-verticallayout-spacing-on";
      }
      public java.lang.String vWidget(){
        return "v-widget";
      }
      public java.lang.String vWindow(){
        return "v-window";
      }
      public java.lang.String vWindowClosebox(){
        return "v-window-closebox";
      }
      public java.lang.String vWindowContents(){
        return "v-window-contents";
      }
      public java.lang.String vWindowDraggingCurtain(){
        return "v-window-draggingCurtain";
      }
      public java.lang.String vWindowFooter(){
        return "v-window-footer";
      }
      public java.lang.String vWindowFooterNoresize(){
        return "v-window-footer-noresize";
      }
      public java.lang.String vWindowHeader(){
        return "v-window-header";
      }
      public java.lang.String vWindowModalitycurtain(){
        return "v-window-modalitycurtain";
      }
      public java.lang.String vWindowOuterheader(){
        return "v-window-outerheader";
      }
      public java.lang.String vWindowResizebox(){
        return "v-window-resizebox";
      }
      public java.lang.String vWindowResizeboxDisabled(){
        return "v-window-resizebox-disabled";
      }
      public java.lang.String vWindowResizingCurtain(){
        return "v-window-resizingCurtain";
      }
      public java.lang.String vWindowWrap(){
        return "v-window-wrap";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.vaadin.addon.touchkit.gwt.client.theme.ParkingStyles get() {
      return css;
    }
  }
  public com.vaadin.addon.touchkit.gwt.client.theme.ParkingStyles css() {
    return cssInitializer.get();
  }
  private void dragSlotDotImageInitializer() {
    dragSlotDotImage = // jar:file:/home/stefan/.m2/repository/com/vaadin/addon/vaadin-touchkit-agpl/4.0.0.alpha2/vaadin-touchkit-agpl-4.0.0.alpha2.jar!/com/vaadin/addon/touchkit/gwt/client/theme/img/drag-slot-dot.png
    new com.google.gwt.resources.client.impl.DataResourcePrototype(
      "dragSlotDotImage",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAMCAYAAABBV8wuAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAGhJREFUeNpiZMh9IcTAwOABxDYMEHAEiHewQAUjGRAAzGZxUWcDq9ydLQgWdZ36HkTZMDHgAIxAO6LQjAKB5SA7dkA5KJbDjQLaBcYwgNtVMCNgrmLMe4nfVSxQyyKh7oeBIzhdBRBgAJ/0GItNwausAAAAAElFTkSuQmCC")
    );
  }
  private static class dragSlotDotImageInitializer {
    static {
      _instance0.dragSlotDotImageInitializer();
    }
    static com.google.gwt.resources.client.DataResource get() {
      return dragSlotDotImage;
    }
  }
  public com.google.gwt.resources.client.DataResource dragSlotDotImage() {
    return dragSlotDotImageInitializer.get();
  }
  private void fontAwesomeInitializer() {
    fontAwesome = // jar:file:/home/stefan/.m2/repository/com/vaadin/addon/vaadin-touchkit-agpl/4.0.0.alpha2/vaadin-touchkit-agpl-4.0.0.alpha2.jar!/com/vaadin/addon/touchkit/gwt/client/theme/FontAwesome.woff
    new com.google.gwt.resources.client.impl.DataResourcePrototype(
      "fontAwesome",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(GWT.getModuleBaseForStaticFiles() + "650109D413E2C231EC22108817C9E71A.cache.woff")
    );
  }
  private static class fontAwesomeInitializer {
    static {
      _instance0.fontAwesomeInitializer();
    }
    static com.google.gwt.resources.client.DataResource get() {
      return fontAwesome;
    }
  }
  public com.google.gwt.resources.client.DataResource fontAwesome() {
    return fontAwesomeInitializer.get();
  }
  private void fontAwesomeOtfInitializer() {
    fontAwesomeOtf = // jar:file:/home/stefan/.m2/repository/com/vaadin/addon/vaadin-touchkit-agpl/4.0.0.alpha2/vaadin-touchkit-agpl-4.0.0.alpha2.jar!/com/vaadin/addon/touchkit/gwt/client/theme/FontAwesome.otf
    new com.google.gwt.resources.client.impl.DataResourcePrototype(
      "fontAwesomeOtf",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(GWT.getModuleBaseForStaticFiles() + "852FDDF08434BD6396C8F37892DA6D25.cache.otf")
    );
  }
  private static class fontAwesomeOtfInitializer {
    static {
      _instance0.fontAwesomeOtfInitializer();
    }
    static com.google.gwt.resources.client.DataResource get() {
      return fontAwesomeOtf;
    }
  }
  public com.google.gwt.resources.client.DataResource fontAwesomeOtf() {
    return fontAwesomeOtfInitializer.get();
  }
  private void popoverArrowDownImageInitializer() {
    popoverArrowDownImage = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "popoverArrowDownImage",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 90, 40, false, false
    );
  }
  private static class popoverArrowDownImageInitializer {
    static {
      _instance0.popoverArrowDownImageInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return popoverArrowDownImage;
    }
  }
  public com.google.gwt.resources.client.ImageResource popoverArrowDownImage() {
    return popoverArrowDownImageInitializer.get();
  }
  private void popoverArrowImageInitializer() {
    popoverArrowImage = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "popoverArrowImage",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 90, 40, false, false
    );
  }
  private static class popoverArrowImageInitializer {
    static {
      _instance0.popoverArrowImageInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return popoverArrowImage;
    }
  }
  public com.google.gwt.resources.client.ImageResource popoverArrowImage() {
    return popoverArrowImageInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.vaadin.addon.touchkit.gwt.client.theme.ParkingStyles css;
  private static com.google.gwt.resources.client.DataResource dragSlotDotImage;
  private static com.google.gwt.resources.client.DataResource fontAwesome;
  private static com.google.gwt.resources.client.DataResource fontAwesomeOtf;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFoAAAAoCAYAAAB+Qu3IAAAB9UlEQVR42u2bsW3CQBiFb4OMkBEyAiNkBEZghIyQETJCBkBWbEOB5OIKFxQUlijcUFhy4cKNc0+KpePiBGPfmfvt/0mWEMjIfEjofTwQURS9q6PBcTweG46dgGXLFYwFom6s2zvTNG3qumZSAwN2BuS10PMDu8CDSZIw7IGQwe5PyG12u92LDrssS6bXM1VV6ZALsBT/RYe93+8Zdo+AEVj1htxmu90+qRNkC7soCqbZD7IMguBZ3BMdNo48z5mqETDRPo8lmImhCcPwo32y8/nMdDsgg9EoyF2wuWs3zel0uoIsbEY96YZh/xKRN+EiutgsrWvjtULmbnZkW4njeLU0sTFEpHAOeYld+24RcQRbzhn2YBGxHVNs5tS1IWm6iFipb2Nhq4rzOSexsSoitqN37SzLWERchvqIoHdk6yLismtTGhEMEdkICqE0IuDapJTTiYjLrg3Y6KO+i4iSsVdBMT6LDa7loSLiumv7MCIYIpKRh+zjiOCdiLju2o+A7bWIuIQ9ZdfGOkSmI1MdEUiJCNURgaSIUBoRev9qaCnRu/bhcLDStTtEZCU4dkcEnIs3bDYi4uOIYP5qiCE7GBEul8v8ReTRI4LxZf0XQ3YwIixSRKYeERYtIo5gX3Xtm39f4Izv2oDNIjIRbBaR6bo2ORH5BuwRM2hpT8fOAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFoAAAAoCAYAAAB+Qu3IAAACA0lEQVR42u2bT2qDQBTGc4McoUfoEXqEHqFH6BF6hB7BI/QI3Wc0QkAQshAEQXAhBLJyMfWFMTysWhvn6fx5H8wu2fwmJL8vX7LbWZTj8fgchmHdnrg9+x1Hfw6Hw4uCLNWpATyT0ZgW6lsHOEmS22HYhJCzLJNN09wOhg2PYVLLIAcYMg7APp/PEr2VMOylkMuylGOBC+geJ4T4ZHLzAe/b893Bq6pK/pWiKPArO2CK8yCDusk4jmVd13Ju4EIQ7C/Wv2lHvkO+Xq/yvwHY8FwFm117oojI0+n0EOQu8FwMm/VvoIiAsoFNLA3Ahgtj1x4pIjogY/3Drg0X6ivk9zFHJoLtn2tPFRGKYNeGC+Yish7swGXAd0eeW0R0p+fagdOQQb0ul4vcKj3Y7ri2cuRsSRHRHbhop4oNLiLw6W8C5JFiY69rCyFedRcRilg9IuAikqapsZCHio01rr1GEaGAbdWIsHYRoXRtI0cEpW/Blo6sK8aOCCYUEWLX3n5EMKmIUMA2wrWxI5tSRIhde/0RoV9EXM5mxUY5svFFhNK1yUcEXETAO32AvPqIEEXRh82ObMWIgB05z3Ppe7SPCC4VEd2BdUgLbBeLiHEjQqswT0t/NeRLHh4RfCgim7u2T0WEAvasEYHyV0OeuvbvEWHo7wucx2EPjgjwBTcXEVrXBsY/NtNdwhdKn8gAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource popoverArrowDownImage;
  private static com.google.gwt.resources.client.ImageResource popoverArrowImage;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
      dragSlotDotImage(), 
      fontAwesome(), 
      fontAwesomeOtf(), 
      popoverArrowDownImage(), 
      popoverArrowImage(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
        resourceMap.put("dragSlotDotImage", dragSlotDotImage());
        resourceMap.put("fontAwesome", fontAwesome());
        resourceMap.put("fontAwesomeOtf", fontAwesomeOtf());
        resourceMap.put("popoverArrowDownImage", popoverArrowDownImage());
        resourceMap.put("popoverArrowImage", popoverArrowImage());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.vaadin.addon.touchkit.gwt.client.VTouchKitResources::css()();
      case 'dragSlotDotImage': return this.@com.vaadin.addon.touchkit.gwt.client.VTouchKitResources::dragSlotDotImage()();
      case 'fontAwesome': return this.@com.vaadin.addon.touchkit.gwt.client.VTouchKitResources::fontAwesome()();
      case 'fontAwesomeOtf': return this.@com.vaadin.addon.touchkit.gwt.client.VTouchKitResources::fontAwesomeOtf()();
      case 'popoverArrowDownImage': return this.@com.vaadin.addon.touchkit.gwt.client.VTouchKitResources::popoverArrowDownImage()();
      case 'popoverArrowImage': return this.@com.vaadin.addon.touchkit.gwt.client.VTouchKitResources::popoverArrowImage()();
    }
    return null;
  }-*/;
}
