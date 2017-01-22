package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.analyzer.ApplicationListenerDeal;
import com.mongodb.DBCollection;


/**
 * 
 * @author lw
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	
	@Bean  public Object getBean(){
		return new Object();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, ReflectiveOperationException {
//		System.out.println(621547-617800);
//		SpringApplication.run(DemoApplication.class, args);
		
		SpringApplication application = new SpringApplication(DemoApplication.class);
//		application.setBanner(new ApplicationBanner());
		application.setWebEnvironment(true);
//		application.setEnvironment(new StandardServletEnvironment());

//		application.setEnvironment(ConfigurableEnvironment.class.newInstance());
		application.setAdditionalProfiles("test","test2");
		application.addListeners(new ApplicationListenerDeal());
		System.out.println(application.isWebEnvironment());
	
		System.out.println(application.toString());
		
//		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	
		DBCollection dbCollection;
		//fluent builder api
		
//		new SpringApplicationBuilder()
//				.sources(DemoApplication.class).bannerMode(Mode.OFF).run(args);
		
//		new SpringApplicationBuilder().sources(DemoApplication.class)
//		.child(DemoApplication.class)
//		.addCommandLineProperties(true).bannerMode(Mode.OFF)
//		.run(args);
//	
	}
}
