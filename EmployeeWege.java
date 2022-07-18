package com.bridgelab.day4;

public class EmployeeWege {

	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wege computation");
		EmployeeWege employeeWege = new EmployeeWege();
		employeeWege.employee();
	}
		
	void employee() {
		int noOfHoursPerDay = 8;
		int noOfHoursPerDayPartTime = 4;
		int wegePerHours = 20;
		int daysInMonth = 20;
		
		int attandance = 1;
		double randomCheck = Math.floor(Math.random() * 10) % 2;
		
		// employee present or absent //	
		if(attandance == randomCheck) {
			
			if(noOfHoursPerDay == 8) {
				int totalWege = noOfHoursPerDay * wegePerHours;
				System.out.println("Employee is present");
				System.out.println("Wege per day is " + totalWege);
			} 
			if (noOfHoursPerDayPartTime == 4) {
				int partTimeWege = noOfHoursPerDayPartTime * wegePerHours;
				System.out.println("Employee is present part time");
				System.out.println("Part time Wege is " + partTimeWege);
			} 
			if(daysInMonth == 20) {
				int monthWege = noOfHoursPerDay * wegePerHours * daysInMonth;
				System.out.println("Employee is present full time");
				System.out.println("Wege of month is " + monthWege);
			        // (noOfHoursPerDay * wedgePerHours);
			}
		} else {
			System.out.println("Employee is Absent");
		}
		
	}

}




