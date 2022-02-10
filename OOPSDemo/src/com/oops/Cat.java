package com.oops;

class AnimalNew{
	
	public void sound() {
		System.out.println("Animal is making a sound");
	}
}

class Horse extends AnimalNew{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		System.out.println("Neigh");
	}
	
	public static void main(String[] args) {
		
		AnimalNew obj = new Horse();
		obj.sound();
	}
	
}

public class Cat extends AnimalNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalNew obj1 = new Cat();
		obj1.sound();
		

	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		System.out.println("Meow");
	}

}
