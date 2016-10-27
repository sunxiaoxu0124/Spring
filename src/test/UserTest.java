package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class UserTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework.xml");
		User u = context.getBean("user1", User.class);
		System.out.println(u);
	}
}
