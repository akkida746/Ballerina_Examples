package com.javatechie.spring.drools.api;

import org.kie.api.runtime.KieSession;
import org.mvel2.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDroolsApplication implements ApplicationRunner {

	@Autowired
	private KieSession session;

	public static void main(String[] args) {
		SpringApplication.run(SpringDroolsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Order order = new Order();
		order.setCardType("DBS");
		order.setPrice(16000);
		session.insert(order);
		session.fireAllRules();
		System.out.println(order.getDiscount());
	}
}
