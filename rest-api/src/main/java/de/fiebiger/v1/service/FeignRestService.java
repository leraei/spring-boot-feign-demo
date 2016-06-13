package de.fiebiger.v1.service;

import de.fiebiger.exception.ErrorDecoder;
import org.springframework.cloud.netflix.feign.FeignClient;



/**
 * Created by tfiebige on 21.03.16.
 */
@FeignClient(value = "hello", url = "${restservice.host}", configuration = ErrorDecoder.class)
public interface FeignRestService extends RestService {}
