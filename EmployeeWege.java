package com.bridgelab.day4;

public class EmployeeWege {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wege computation");
		
		// employee present or absent //			
				int attandance = 1;
				double randomCheck = Math.floor(Math.random() * 10) % 2;
				//System.out.println(randomCheck);                         
				if(attandance == randomCheck) {
					System.out.println("Employee is present");
				} else {
					System.out.println("Employee is Absent");
				}

	}

}
