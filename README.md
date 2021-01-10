# Login-Servlet-Example

This repository contains an example source, how to use Servlets with JSP to build a simple
login application. The servlet will be used to receive an HTTP-request from
a client, which will be in our case a Web-Browser. The username und password, which
are submitted by an html-form, will be validated using an h2-database. If the validation
is successfull, the user will be redirected to the application´s homepage.Otherwise
he will get an invalid access error-message. In the application´s homepage, personal data of
the logged user will be displayed in form of a table. This application is deployed on Wildfly
Application Server.



## Pre requisites
 * Maven
 * JDK8+
 
## Build the example
 1. Clone this repository and build the examples using:
     `mvn package`
 2. From the folder loginservlet run
     `mvn wildfly:run -DskipTests`
