package com.oops;

abstract class Animal{
	//abstract method
	public abstract void animalSound();
}

public class AbstractionDemo extends Animal {
	
	public void animalSound() {
		System.out.println("I am a Dog, and i bark");
	}

	public static void main(String[] args) {
		
		Animal obj = new AbstractionDemo();
		obj.animalSound();

	}

}
