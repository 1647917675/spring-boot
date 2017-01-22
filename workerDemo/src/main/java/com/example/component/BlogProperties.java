package com.example.component;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("test")
@Configuration
@PropertySource(value = "file:conf/application.properties",encoding = "utf-8")
@ConfigurationProperties(prefix="com")
public class BlogProperties {
	
	private String name;
	
    private String title;
	
    
    public String getName() {
		return name;
	}
    
    public String getTitle() {
		return title;
	}

    public void setName(String name) {
		this.name = name;
	}
    public void setTitle(String title) {
		this.title = title;
	}
    
    @Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
