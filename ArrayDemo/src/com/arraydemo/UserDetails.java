package com.arraydemo;

import java.util.Scanner;

class User{
	String name, email,mob;
	int age;
	
	public User(String name, int age, String email, String mob) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.mob = mob;
	}
	

}

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter the number of employess"); int n = sc.nextInt();
		 */
		User[] user = new User[1];
		
		for(int i = 0; i < user.length; i++) {
			
			System.out.println("Enter the name");
			 String name = sc.next();
			 //sc.close();
			
			System.out.println("Enter age");
			int age = sc.nextInt();
			//sc.close();
			
			System.out.println("Enter email");
			String email = sc.next();
			//sc.close();
			
			System.out.println("Enter mobile");
			String mob = sc.next();
			
			//sc.close();
			
			user[i] = new User(name,age,email,mob);
			
		}
		
		for(int i = 0; i< user.length;i++) {
			System.out.println("Name :"+user[i].name+" Age: "+user[i].age+" Email :"+user[i].email+" Mobile :"+user[i].mob);
		}

	}

}
