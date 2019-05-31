package de.livia.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//https://www.tutorialspoint.com/spring_boot/spring_boot_eureka_server.htm

/**
 * Eureka Server class
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    // http://localhost:8761
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
