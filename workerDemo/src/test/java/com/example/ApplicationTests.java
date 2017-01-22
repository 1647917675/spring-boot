package com.example;

import javax.ws.rs.core.Application;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.component.BlogProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {
	@Autowired
	private BlogProperties blogProperties;
	
	@SuppressWarnings("deprecation")
	@Test
	public void getHello() throws Exception {
		Assert.assertEquals(blogProperties.getName(), "程序猿DD");
		Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
	}
}