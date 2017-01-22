package com.example.analyzer;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class ApplicationRunListenerDeal implements SpringApplicationRunListener {
	private SpringApplication  application;
	private String[] args;
	public ApplicationRunListenerDeal(SpringApplication application,String[] args){
		this.application = application;
		this.args = args;
	}
	
	@Override
	public void started() {
		// TODO Auto-generated method stub
	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		// TODO Auto-generated method stub
		context.getBeanFactory().registerSingleton(ApplicationRunner.class.getName(), new SpringApplicationRunningDeal());
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		// TODO Auto-generated method stub
		System.err.println("------------context---------------------");
		System.out.println(context.toString());
		AnnotationConfigEmbeddedWebApplicationContext configContext =(AnnotationConfigEmbeddedWebApplicationContext)context;
		System.out.println(configContext.toString());
		
		for (ApplicationContextInitializer initializer : application.getInitializers()) {
			System.out.println(initializer.toString());
		}
	}

	@Override
	public void finished(ConfigurableApplicationContext context,
			Throwable exception) {
	}

}
