package com.java8.streams;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println((int)(Math.log(4) /
                Math.log(2)) + 1);
	}

}
