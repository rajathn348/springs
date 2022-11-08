package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
	Person p=(Person) context.getBean("person");
	
	
	System.out.println(p.getAge());
	System.out.println(p.getName());
	System.out.println(p.getMobileObj().getBrand());
	System.out.println(p.getMobileObj().getCost());
	System.out.println(p.getMobileObj().getApps());
	System.out.println("=================");
	//traversing
	List<String>lstapps=p.getMobileObj().getApps();
	for(String app:lstapps) {
		System.out.println(app);
		
	}
}
}
