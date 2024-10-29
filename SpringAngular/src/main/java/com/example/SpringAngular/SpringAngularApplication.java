package com.example.SpringAngular;

import com.example.SpringAngular.persistence.model.Userr;
import com.example.SpringAngular.persistence.repository.UserrRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringAngularApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAngularApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserrRepository userrRepository){
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen")
					.forEach(name -> {
						Userr user = new Userr(name, name.toLowerCase()+"@domain.com");
						userrRepository.save(user);
					});
			userrRepository.findAll().forEach(System.out::println);
		};
	}
}
