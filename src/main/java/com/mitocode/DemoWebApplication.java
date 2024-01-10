package com.mitocode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoWebApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

	public void run(String... args) throws Exception {

		LOG.info("Hola Coders desde Spring Boot en consola");
		LOG.warn("Adviertiendo a los coders");

	}
}
