package com.bcp.tipocambio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TipoCambioApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(TipoCambioApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TipoCambioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("Michu michu Kriss");
	}

}
