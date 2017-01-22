package com.example.analyzer;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class SpringApplicationRunningDeal implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("#################RMB-----RMB-------RMB-------RMB#####################");
		System.out.println(args.toString());
		System.out.println(args.getSourceArgs()[0]);
	}

}
