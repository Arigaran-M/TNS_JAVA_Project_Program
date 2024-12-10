package com.tnsif.inheritance.singleinheritance;

//Parent or super Class
class Animal {
	public void eat(){
		System.out.println("This Animal can Eat");
	}
}

//Derived or sub or child class
class Dog extends Animal {
	public void bark() {
		System.out.println("Barks");
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.bark();
		d1.eat();
	}
}
