package com.springboot.DependencyInjection;

import com.springboot.DependencyInjection.controllers.ConstructorInjectedController;
import com.springboot.DependencyInjection.controllers.MyController;
import com.springboot.DependencyInjection.controllers.PropretyInjectedController;
import com.springboot.DependencyInjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean(("myController"));

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------Proprety");
		PropretyInjectedController propretyInjectedController = (PropretyInjectedController) ctx.getBean("propretyInjectedController");
		//we provide a name, and in return, we get an instance of Object class
		System.out.println(propretyInjectedController.getGreeting());

		System.out.println("------Setter");
		SetterInjectedController setterInjectedController  = (SetterInjectedController) ctx.getBean("setterInjectedController");
		//we provide a name, and in return, we get an instance of Object class
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		//we provide a name, and in return, we get an instance of Object class
		System.out.println(constructorInjectedController.getGreeting());














	}

}
