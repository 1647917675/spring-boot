package com.example.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

public class ApplicationCommand implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println(args);
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
