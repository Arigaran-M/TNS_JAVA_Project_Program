package com.tnsif.inheritance.multilevelinheritance;

//Parent or super Class
class Animal {
	public void eat() {
		System.out.println("This Animal can Eat");
	}
}

//Derived or sub or child class
class Dog extends Animal {
	public void bark() {
		System.out.println("Dog Barks");
	}
}

//Derived or sub or child class
class Puppy extends Dog {
	public void weep() {
		System.out.println("Puppy Weeps");
	}
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p1 = new Puppy();
		p1.eat();
		p1.bark();
		p1.weep();
	}
}
