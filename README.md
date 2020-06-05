# Login-Servlet

This repository contains an example source, how to use Servlets to build a simple
login application. The servlet will be used to receive an HTTP-request from
a client, which will be in our case a Web-Browser. The username und password, which
are submitted by an html-form, will be validated using an h2-database. If the validation
is successfull, the user will be redirected to the application´s homepage.Otherwise
he will get an invalid access error-message.



## Pre requisites
 * Maven
 * JDK8+
 
## Build the example
 1. Clone this repository and build the examples using:
     `mvn package`
