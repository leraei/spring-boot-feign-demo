package de.fiebiger.v1.service;

import de.fiebiger.v1.response.UserResponse;
import de.fiebiger.exception.NotFoundException;
import de.fiebiger.v1.request.UserRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;



/**
 * Created by tfiebige on 21.03.16.
 */
@RequestMapping(value = "/v1/users/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public interface RestService {

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	String hello();

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	ResponseEntity<UserResponse> createUser(@RequestBody @Valid UserRequest userRequest);

	@RequestMapping(value = "{userAccountId}", method = RequestMethod.GET)
	@ResponseBody
	ResponseEntity<UserResponse> findById(@PathVariable("userAccountId") String userAccountId) throws NotFoundException;

}


