package com.arraydemo;

class Student {
	
	public int roll_no;
	public String name;
	
	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}


}

public  class StudentDetails{
	
	public static void main(String[] args) {
		
		//declare an Array of integers
		Student[] arr;
		
		arr = new Student[5];
		arr[0] = new Student(1,"Mayank");
		arr[1] = new Student(2,"Pranya");
		arr[2] = new Student(3,"Ashwani");
		arr[3] = new Student(4,"Karan");
		arr[4] = new Student(5,"Pravesh");
		
		//Lets access the elements of the specified array
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].roll_no+" "+arr[i].name);
		}

	}
	
}