package de.fiebiger;

import de.fiebiger.v1.response.UserResponse;
import de.fiebiger.exception.NotFoundException;
import de.fiebiger.v1.request.UserRequest;
import de.fiebiger.v1.service.FeignRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@Configuration
@EnableFeignClients
public class FeignClientApplication {


	@Autowired
	FeignRestService feignRestClient;

	/**
	 * Try http://127.0.0.1:8080/hello to call this method
	 *
	 * @return the response from rest-service method hello
	 */
	@RequestMapping("/hello")
	public String hello() {
		return feignRestClient.hello();
	}


	/**
	 * Try http://127.0.0.1:8080/user to call this method
	 *
	 * @return the response from rest-service method create
	 */
	@RequestMapping("/user")
	public String createUser() {
		ResponseEntity<UserResponse> responseEntity = feignRestClient.createUser(new UserRequest("test@example.com", "password123"));
		return responseEntity.getBody().toString();
	}


	/**
	 * Try http://127.0.0.1:8080/user/{userAccopuntId} to call this method
	 *
	 * @return the response from rest-service method findById
	 */
	@RequestMapping(value = "/user/{userAccountId}", method = RequestMethod.GET)
	public String findById(@PathVariable("userAccountId") String userAccountId) {
		try {
			ResponseEntity<UserResponse> responseEntity = feignRestClient.findById(userAccountId);
			return responseEntity.getBody().toString();
		}
		catch (NotFoundException nfe) {
			return nfe.getHttpStatusCode() + "\t" + nfe.getMessage();
		}
	}


	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}
}
