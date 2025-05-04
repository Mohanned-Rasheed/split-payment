package com.split_payment.split_payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SplitPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitPaymentApplication.class, args);
	}

}
