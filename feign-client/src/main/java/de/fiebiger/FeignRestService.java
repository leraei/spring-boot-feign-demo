package de.fiebiger;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * This interface should be in its own lib. See the module rest-api for example
 * Created by tfiebige on 21.03.16.
 */
@FeignClient("hello")
public interface FeignRestService extends RestService {}
