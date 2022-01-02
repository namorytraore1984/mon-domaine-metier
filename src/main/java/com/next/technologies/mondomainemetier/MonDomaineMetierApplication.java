package com.next.technologies.mondomainemetier;

import com.next.technologies.mondomainemetier.models.AppUser;
import com.next.technologies.mondomainemetier.repositories.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RequiredArgsConstructor
@EnableEurekaClient
@RefreshScope
@SpringBootApplication
public class MonDomaineMetierApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MonDomaineMetierApplication.class, args);
	}

	private final AppUserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(AppUser.builder().build());
	}
}
