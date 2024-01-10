package com.mitocode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoWebApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) 
		{SpringApplication.run(DemoWebApplication.class, args);
		}
	@Override
	public void run(String... args) throws Exception {


		service=new PersonaServiceImpl();
		service.registrar("Mitocode");
	}
}
