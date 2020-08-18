package org.jiajie.coffeecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author jay
 */
@SpringBootApplication
@EnableAsync
public class CoffeecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeecodeApplication.class, args);
	}

}
