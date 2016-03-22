# Spring Boot Starter Web Rest Service and Feign Client
## General
This project shows you how you can share your spring-web rest interface with a feign client
## rest-server
Offers a simple rest api. Simply start and try http://127.0.0.1:8001/v1/hello. It will return "Hello World!".
The interface RestService is stored for reasons of simplicity in this project. Please refer the project rest-api for an example how you can extract it from this project.
## feign-client
Offers a simple feign client example. Simply start and try http://127.0.0.1:8080/. This link will call the rest-service api using a feign client and returns "hello world!"
 The interface RestService and FeignRestService is stored for reasons of simplicity in this project. Please refer the project rest-api for an example how you can extract it from this project.
## rest-api
This project is not used for the running project. But you can use it as an example how you can extract the interfaces in a seperate library. As an addition you could put your DTOs in this lib too. 
