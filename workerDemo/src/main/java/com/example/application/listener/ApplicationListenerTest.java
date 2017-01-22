package com.example.application.listener;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.ServletRequestHandledEvent;
/**
 * 
 * this is for test
 * 
 * java savbkasvblksdvhsdvbsldh
 * @author lw
 *
 */
public class ApplicationListenerTest implements
		ApplicationListener<ApplicationEvent> {

	public final Logger logger = LoggerFactory
			.getLogger(ApplicationListenerTest.class);

	public ApplicationListenerTest() {
		MDC.put("client", "ipAddress");
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("ApplicationListenerTest.onApplicationEvent()"+
				ToStringBuilder.reflectionToString(event));
		
		System.out.println("this is for fixed bbrance ");
//		
//		if (event instanceof EmbeddedServletContainerInitializedEvent) {
//			EmbeddedServletContainerInitializedEvent servletContainerInitializedEvent = (EmbeddedServletContainerInitializedEvent) event;
//
//			System.out.println(ToStringBuilder
//					.reflectionToString(servletContainerInitializedEvent));
//			System.out.println(ToStringBuilder
//					.reflectionToString(servletContainerInitializedEvent
//							.getApplicationContext().getServletConfig()));
//		} else if (event instanceof ServletRequestHandledEvent) {
//			ServletRequestHandledEvent ServletRequestHandledEvent = (ServletRequestHandledEvent) event;
//			MDC.put("client", ServletRequestHandledEvent.getClientAddress());
//			
//			System.out.println(ServletRequestHandledEvent.getSessionId());
//			System.out
//					.println("$$$$$$$$$$$---applicationListener-----$$$$$$$$$$");
//			System.out.println(ServletRequestHandledEvent
//					.getProcessingTimeMillis());
//			System.out.println(ServletRequestHandledEvent.getUserName());
//			System.out.println(ServletRequestHandledEvent.toString());
//
//		}

	}

}
