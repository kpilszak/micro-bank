package com.kpilszak.microbank.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.kpilszak.microbank.accounts.controller") })
@EnableJpaRepositories("com.kpilszak.microbank.accounts.repository")
@EntityScan("com.kpilszak.microbank.accounts.model")
public class AccountsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
	
}
