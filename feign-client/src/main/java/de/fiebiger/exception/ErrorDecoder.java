package de.fiebiger.exception;

import feign.Response;
import org.springframework.context.annotation.Configuration;

import static feign.FeignException.errorStatus;



/**
 * Created by tfiebige on 26.03.16.
 */
@Configuration
public class ErrorDecoder implements feign.codec.ErrorDecoder {

		@Override
		public Exception decode(String methodKey, Response response) {
			if (response.status() >= 404) {
				return new NotFoundException(
						response.status(),
						response.reason()
				);
			}
			return errorStatus(methodKey, response);
		}
	}
