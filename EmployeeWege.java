package com.bridgelab.day4;

public class EmployeeWege {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wege computation");
		int noOfHoursPerDay = 8;
		int wegePerHours = 20;
		
		// employee present or absent //			
		
		int attandance = 1;
		double randomCheck = Math.floor(Math.random() * 10) % 2;
		                         
		if(attandance == randomCheck) {
			System.out.println("Employee is present");
			int totalWege = noOfHoursPerDay * wegePerHours;
			System.out.println("Wege per day is " + totalWege);
		} else {
			System.out.println("Employee is Absent");
		}

	}

}
