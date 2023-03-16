package org.tnsif.collection;
//program to Demonstrate on DI in the form of collection
//Driver class
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIusingCollection {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("collect.xml");
		CollectionDemo d=c.getBean("col",CollectionDemo.class);
		d.display();
	}
}
