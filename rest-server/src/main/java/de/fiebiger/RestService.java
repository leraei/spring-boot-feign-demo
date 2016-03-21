package de.fiebiger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This interface should be in its own lib. See the module rest-api for example
 * Created by tfiebige on 21.03.16.
 */
@RequestMapping(value = "/v1/hello")
public interface RestService {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	String hello();
}
