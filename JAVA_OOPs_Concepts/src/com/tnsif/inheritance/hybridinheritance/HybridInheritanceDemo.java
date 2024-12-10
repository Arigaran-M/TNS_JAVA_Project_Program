package com.tnsif.inheritance.hybridinheritance;

//Parent or super Class
class Animal{
	void eat() {
		System.out.println("This Animal can Eat");
	}
}

//Derived or sub or child class
class Dog extends Animal{
	void bark() {
		System.out.println("Dog Barks");
	}
}

//Derived or sub or child class
class Cat extends Animal{
	void meow() {
		System.out.println("Cat Meow");
	}
}

//Derived or sub or child class
class Puppy extends Dog{
	void weep() {
		System.out.println("Weep");
	}
}

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		Puppy d1 = new Puppy();
		c1.eat();
		c1.meow();
		d1.eat();
		d1.bark();
		d1.weep();
	}
}
