package com.example.analyzer;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ApplicationListenerDeal implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		event.getApplicationContext();
		System.out.println("开始加载 context");
		System.out.println("applistenenr is for the applicationListener !");
		System.out.println("applistenenr is for the applicationListener !");
	}

	
	public void sayWords(String words){
		System.out.println(words);
	}
}
