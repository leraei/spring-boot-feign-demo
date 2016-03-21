package de.fiebiger;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class FeignClientApplication {

	/**
	 * Try http://127.0.0.1:8080 to call this method
	 * @return the response from rest-service method hello
	 */
	@RequestMapping("/")
	public String hello() {
		FeignRestService restService = Feign.builder().contract(new SpringMvcContract())
				.target(FeignRestService.class, "http://127.0.0.1:8001");
		return restService.hello();
	}

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}
}
