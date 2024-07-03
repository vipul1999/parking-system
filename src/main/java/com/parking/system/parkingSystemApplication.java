package com.parking.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.parking.system.database.entity","com.parking.system.ecommerce.database.entity"})
@SpringBootApplication
public class parkingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(parkingSystemApplication.class, args);
	}

}
