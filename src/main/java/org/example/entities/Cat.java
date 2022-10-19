package org.example.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("mya")
@Scope("singleton")
//@Scope("prototype")
public class Cat implements SmallAnimal {
	@Value("${additional.name}")
//	@Value("additional.name")
	private String name;

	Cat() {
		this.name = "Meme";
	}

	Cat(String name) {
		this.name = name;
	}

	@PostConstruct
	public void greetings() {
		System.out.println("Hiii");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Bye-bye");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}