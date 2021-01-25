package com.oop.person;

import com.oop.person.controller.PersonController;

public class Run {

	public static void main(String[] args) {
		PersonController per = new PersonController();
		per.insert();
		per.print();
		per.sum();
	}

}
