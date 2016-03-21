package de.fiebiger;

import org.springframework.web.bind.annotation.RestController;

/**
 * This is the RestController class
 * Created by tfiebige on 21.03.16.
 */
@RestController
public class RestServiceImpl implements RestService {

	@Override public String hello() {
		return "Hallo Welt";
	}
}
