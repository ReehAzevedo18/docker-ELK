package com.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteApplication {
	private static final Logger LOG = LoggerFactory.getLogger(TesteApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);

		LOG.info("Teste de LOG");
		LOG.error("1..2..3.. testando");


	}

}
