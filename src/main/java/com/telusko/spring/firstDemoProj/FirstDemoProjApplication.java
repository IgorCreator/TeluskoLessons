package com.telusko.spring.firstDemoProj;

import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstDemoProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstDemoProjApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.show();
	}
}
