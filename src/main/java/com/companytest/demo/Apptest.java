package com.companytest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.companytest.demo.callrestfunc.setandgetforProducts;


@SpringBootApplication
public class Apptest {
	
	public static void main(String args[]) {
		System.out.print("HEY");
		SpringApplication.run(Apptest.class, args);
	}
	
	setandgetforProducts Object = new setandgetforProducts();

}
