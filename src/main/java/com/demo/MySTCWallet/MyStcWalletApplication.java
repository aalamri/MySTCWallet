package com.demo.MySTCWallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MyStcWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyStcWalletApplication.class, args);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16); // Strength set as 16
		String encodedPassword = encoder.encode("UserPassword");
		System.out.println("BCryptPasswordEncoder");
		System.out.println(encodedPassword);
		System.out.println("\n");
	}

}
