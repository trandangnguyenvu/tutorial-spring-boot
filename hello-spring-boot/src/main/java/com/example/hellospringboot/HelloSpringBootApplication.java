package com.example.hellospringboot;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.hellospringboot.other_package.Bikini;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloSpringBootApplication.class, args);
		// ConfigurableApplicationContext, NOT ApplicationContext that like tutorial
		
		GirlFriend girlFriend = context.getBean(GirlFriend.class);
		
		System.out.println("GirlFriend: " + girlFriend);
		System.out.println("Outfit of girlFriend: " + girlFriend.outfit);

	}

}
