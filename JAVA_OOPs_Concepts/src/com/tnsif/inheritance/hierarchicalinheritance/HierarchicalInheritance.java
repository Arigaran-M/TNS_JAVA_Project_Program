package com.tnsif.inheritance.hierarchicalinheritance;

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

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		c1.eat();
		c1.meow();
		d1.eat();
		d1.bark();
	}
}
