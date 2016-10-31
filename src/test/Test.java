package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Reward;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/resource/SpringFramework.xml");
		Reward reward = context.getBean("reward", Reward.class);
		System.out.println(reward);
	}
}
