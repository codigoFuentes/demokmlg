package com.example.demokmlg;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemokmlgApplication {

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemokmlgApplication.class, args);
	}

	@Bean
	public java.util.function.Consumer<KStream<Object, Product>> process() {

		return input ->
				input.foreach((key, value) -> {
					productRepository.save(value);
				});
	}

}
