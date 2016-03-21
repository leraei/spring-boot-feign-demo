package de.fiebiger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This project offers a restAPI /v1/hello the returns "Hello World"
 */
@SpringBootApplication
public class RestServiceApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
