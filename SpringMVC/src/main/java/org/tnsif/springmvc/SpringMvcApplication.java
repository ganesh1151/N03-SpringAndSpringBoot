package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	/*
	 @springbootapplication
	 A convenience annotation that wraps commonly used annotations
	 used in place of the following 3 different annotations
	 
	 1) @configuration: instructs that a spring configuration class is being used insted of XML to define  the components
	 
	 2) @EnableAutoconfiguration : is a spring boot specific annotation instruct that the application should auto
	   configure the other frameworks included as dependency with spring
	   
	 3) @componentsScan: Scans project for spring components annotated with @service, @Repository
	 
	 @ component
	 it is used to denote that a class is components
	 it allows spring to automatically detect our custom beans
	 
	 
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Scanner sc=new Scanner(System.in);
		/*int x=sc.nextInt();
		System.out.println(x);*/
		
		/*Employee e=context.getBean(Employee.class);
		e.setEmpid(10123);
		e.setEmpname("Ganesh Chavan");
		e.print();*/
		HomeController h=context.getBean(HomeController.class);
		h.home();
	}

}
