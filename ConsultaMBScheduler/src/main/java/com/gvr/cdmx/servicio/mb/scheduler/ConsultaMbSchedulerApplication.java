package com.gvr.cdmx.servicio.mb.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class ConsultaMbSchedulerApplication {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConsultaMbSchedulerApplication.class, args);
	}

}
