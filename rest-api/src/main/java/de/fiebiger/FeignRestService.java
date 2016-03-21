package de.fiebiger;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by tfiebige on 21.03.16.
 */
@FeignClient("hello")
public interface FeignRestService extends RestService {}
