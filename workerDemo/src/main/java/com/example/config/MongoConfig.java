package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.example.component.BlogProperties;
import com.example.type.WorkType;
import com.example.workInstance.Work1;
import com.example.workInstance.Work2;
import com.example.workInstance.Work3;
import com.example.workInstance.Work4;
import com.example.workInstance.WorkInterface;

@Configuration
@PropertySource(value = "file:conf/application.properties",encoding = "utf-8")
//@Profile(value="xxx")
//@ImportResource(value="file:conf/application.properties")
public class MongoConfig {
//	
//	@Bean WorkInterface getWorkInstance(){
//		WorkInterface workIntance = null;
//		WorkType workType = null;
//		try {
//			workType = WorkType.valueOf(System.getProperty("workType"));
//			switch (workType) {
//			case Work1:
//				workIntance = new Work1();
//				return workIntance;
//			case Work2:
//				workIntance = new Work2();
//				return workIntance;
//			case Work3:
//				workIntance = new Work3();
//				return workIntance;
//			case Work4:
//				workIntance = new Work4();
//				return workIntance;
//			default:
//				break;
//			}
//		} catch (Exception e) {
////			System.out.println("输入的参数的类型有问题：请检查是否是以下的参数"+WorkType.values());
//			System.out.println("输入的参数的类型有问题请检查是否是以下的参数:");
//			for (WorkType tyeType : WorkType.values()) {
//					System.out.print(tyeType.name().equalsIgnoreCase("work4") ? tyeType.name() : tyeType.name()+",");
//			}
//			System.out.println("please reboot the application in the exactful configuration！");
//			System.exit(-1);
//		}
//		
//		return workIntance;
//	}
	 
//	 @ConfigurationProperties(prefix="com")
//	 @Bean BlogProperties getBlogProperties(){
//	    	return new BlogProperties();
//	    }
	
	
		

}
	

