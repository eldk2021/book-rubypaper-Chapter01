package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RubypaperChapter01Application {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(RubypaperChapter01Application.class);
		
		//스프링 MVC를 기반으로 웹 어플리케이션 구동하겠다. 
		app.setWebApplicationType(WebApplicationType.SERVLET);
		app.run(args);
	}

}
