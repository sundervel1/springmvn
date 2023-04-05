package com.emids.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mybean.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);

	}

}
