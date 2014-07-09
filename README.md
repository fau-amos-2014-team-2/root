Wound Management App
====================

Wound Management App is an Vaadin-based Web App for Wound Management (Documentation) in hospitals. It is designed to run on tablet devices using Phonegap.

The App was developed by **Team2** of the [AMOS Project] at the Friedrich-Alexander-Universität Erlangen-Nürnberg in close cooperation with the [Develop Group].

A [Live Demo] is available, the default login password is **1234**.

<!-- Section Links -->
[AMOS Project]: http://osr.cs.fau.de/teaching/ss2014/amos/
[Develop Group]: http://www.develop-group.de
[Live Demo]: http://osr-amos.cs.fau.de/ss14/proj2/


Installation
------------

### Requirements
* Application Server (e.g. Tomcat, Jetty)
* PostgreSQL Database Server
* *ROOT.war* file of the repository
* Demo Data *var/wm.sql* file (optional)

### Installation Process

* Deploy the *ROOT.war* WAR file to the application server.

* Setup the Database:
    * The App is using JNDI resource `jdbc/postgresql` by default. You can configure your application server accordingly.
    * You can set up your own database connection parameters:

      Go to the persistence configuration file `WEB-INF/classes/META-INF/persistence.xml`. 
      Edit the `fauDB`persistence unit accordingly. Look at the `testdb` persistence unit at the end of the file to see how to set username and password.

* Connect to the Application to setup the database.

* Optional: Import the Demo Data SQL file *var/wm.sql* using the PostgreSQL command line tool:

  `psql --host=<myhost> --user=<myuser> --file=<wm.sql file>` or
  `psql --host=<myhost> --user=<myuser> < <wm.sql file>`

  A successful import results in an `Data successfully imported`message at the end.

  Restart the application after importing data.


Developing
----------

### Folder Structure

**Code**

* `WoundManagement` – The main project
* `phonegap` – The Phonegap project

**Documentation**

* `ReleaseToolchain` – Some documents on how to Setup base projects.
* `ResearchResults` – Some documents about the examination of used and considered technologies.

**Other**

* `var` – Some other resources (e.g. demo data)


### Getting started

* You need Maven
* Switch to the project folder `WoundManagement`
* `mvn install` – Build the application
* `mvn jetty:run` – Run the application on a local Jetty webserver (by default http://localhost:8080)
* `mvn eclipse:eclipse` – Build an Eclipse project that can be imported to your Eclipse workspace (import the `WoundManagement` folder).
* You might want to import the Demo Data. See the installation process on how to do that.


License
-------

This project is released under the GNU AGPLv3 License.