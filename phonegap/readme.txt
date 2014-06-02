CREATING NATIVE APPS WITH PHONEGAP
**********************************

0.1) Check your ip	
	$IP = (Ubuntu) user:-$ ifconfig wlan0 | grep 'inet Adresse:' | cut -d: -f2 | awk '{ print $1}'

0.2) If your ip is 192.168.178.28 goto step 1)
0.3) Change the redirect ip in /woundManagementSrc/index.html to your $IP
0.4) Zip woundManagementSrc folder to woundManagement.zip

1) Login on 'build.phonegap.com'
	-> use your github account
2) Upload woundManagement.zip
3) Compile all
	-> Windows and Android apps will be compiled on the phonegap server
4) Download .apk
5) Install it on your mobile device
	-> probably need a file manager
6) run local Server github:/root/WoundManagement mvn jetty:run (Port: 8080)
7) Start App.

If your in the same network with your device and your server this will run!

ADD:
Since out app is still not running on osr-amos.cs.fau.de/ss14/proj2, we need this 
workaround. If our app is running on the university server, we don't need to change the ip
but run the app with the redirect ip osr-amos.cs.fau.de/ss14/proj2:8080

