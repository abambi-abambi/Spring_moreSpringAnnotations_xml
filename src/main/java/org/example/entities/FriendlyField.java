package org.example.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FriendlyField {
// 3-rd way: use only the field
// without @Qualifier:
// @Autowired
//	private Cat cat;

// with @Qualifier:
//	@Autowired
//	@Qualifier("mya")
	private SmallAnimal cat;

// 1-st way: use the empty constructor + setter
//	public FriendlyField() {
//
//	}
//
//	@Autowired
//	public void setCat(Cat cat) {
//		this.cat = cat;
//	}

// 2-nd way: use the parametrized constructor
// without @Qualifier:
//	@Autowired
//	public FriendlyField(Cat cat) {
//		this.cat = cat;
//	}

// with @Qualifier:
	@Autowired
	public FriendlyField(@Qualifier("mya") SmallAnimal cat) {
		this.cat = cat;
	}

	public void sing() {
		System.out.println("The song is being singed by: " + cat.getName());
	}
}
