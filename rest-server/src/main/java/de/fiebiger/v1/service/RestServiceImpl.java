package de.fiebiger.v1.service;

import de.fiebiger.v1.response.UserResponse;
import de.fiebiger.v1.request.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;



/**
 * This is the RestController class
 * Created by tfiebige on 21.03.16.
 */
@RestController
public class RestServiceImpl implements RestService {

	private Map<String, UserResponse> users = new HashMap();

	@Override
	public String hello() {
		return  "hello World!";
	}

	@Override
	public ResponseEntity<UserResponse> createUser(@RequestBody @Valid UserRequest userRequest) {
		UserResponse userResponse = new UserResponse(userRequest.getEmail(), userRequest.getPassword());
		users.put(userResponse.getId(), userResponse);
		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<UserResponse> findById(@PathVariable("userAccountId") String userAccountId) {
		UserResponse userResponse = users.get(userAccountId);
		if(userResponse != null) {
			return ResponseEntity.status(HttpStatus.OK).body(userResponse);
		}
		else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
}
