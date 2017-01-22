package com.example.banner;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

public class ApplicationBanner implements Banner{

	@Override
	public void printBanner(Environment environment, Class<?> sourceClass,
			PrintStream out) {
		System.out.println(sourceClass.getName());
		System.out.print(environment.toString());
	}

}
