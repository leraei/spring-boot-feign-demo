# Spring Boot Starter Web Rest Service and Feign Client
## General
This project shows you how you can share your spring-web rest interface (http://projects.spring.io/spring-boot/, https://spring.io/guides/gs/rest-service/) with a feign client (https://github.com/Netflix/feign)
## rest-server
Offers a simple rest api. Simply start and try http://127.0.0.1:8001/v1/hello. It will return "Hello World!". Some files are stored in this project for rules of simplicity. 
Please be aware of the fact, that all files in de.fiebiger.v1.request, de.fiebiger.v1.response, de.fiebiger.exception and RestService interface should be in its own project. 
See "rest-api" and "rest-api-commons" for example
## feign-client
Offers a simple feign client example. Simply start and try http://127.0.0.1:8080/. This link will call the rest-service api using a feign client and returns "hello world!"
Some files are stored in this project for rules of simplicity. Please be aware of the fact, that all files in de.fiebiger.v1.request, de.fiebiger.v1.response, 
 de.fiebiger.v1.service and de.fiebiger.exception should be in its own artifact. See "rest-api" and "rest-api-commons" for example

## rest-api
This project is not used in this example. But it demonstrates how you can extract many java classes from your client and server projects. You can put all interfaces and dtos of 
one ore more restservices in this project. So
the server and the client can import them

## rest-api-commons
This project is not used in this example. But it demonstrates how you can extract many java classes from your client and server projects. If you want to create an own rest-api for each 
restservice, you can put all java classes that are used by more then one restservice into this project. In our example the Exception classes and the FeignError Handler are extracted to this project. 
