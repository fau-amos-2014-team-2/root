-------------------------------------------------------------------
Vaadin TouchKit app skeleton created by maven archetype
-------------------------------------------------------------------

USING THE GENERATED PROJECT:
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

The project is pretty standard Maven web app project and should thus
be compatible with practically all IDE's. The application stub
contains usage examples of some basic components and also provides a
method to serve different UI for desktop browsers.

Packaging/installing the project
--------------------------------

Run maven command:

mvn install

Running the default install target generates war file. Also 
widgetset compilation is automatically done at this point.

Running the app in development server
-------------------------------------

The project has by default jetty plugin configure as a web server. It
can be started with maven command:

mvn jetty:run

