package com.bridgelab.day4;

public class EmployeeWege {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wege computation");
		int noOfHoursPerDay = 8;
		int noOfHoursPerDayPartTime = 4;
		int wegePerHours = 20;
		// employee present or absent //	
		int attendence= (int) (Math.floor(Math.random()*10))%2;
	     
		switch (attendence) {

		case 1:
			System.out.println("Employee is Working Full Time");
			int dailyWage= wegePerHours * noOfHoursPerDay;
			System.out.println("Employee daily wage is :" + dailyWage );
		  break;
		case 0:
		    System.out.println("Employee is working part time");
		    int dailPartTimeyWage= wegePerHours * noOfHoursPerDayPartTime ;
		    System.out.println("Employee daily wage is "+ dailPartTimeyWage);
		    break;

		 default :
		 System.out.println("Employee is absent");
		    break;
		}
		
		

	}

}




//int attandance = 1;
//double randomCheck = Math.floor(Math.random() * 10) % 2;
//                         
//if(attandance == randomCheck) {
//	if(noOfHoursPerDay == 8) {
//		int totalWege = noOfHoursPerDay * wegePerHours;
//		System.out.println("Employee is present");
//		System.out.println("Wege per day is " + totalWege);
//	} 
//	if (noOfHoursPerDayPartTime == 4) {
//		int partTimeWege = noOfHoursPerDayPartTime * wegePerHours;
//		System.out.println("Employee is present part time");
//		System.out.println("Part time Wege is " + partTimeWege);
//	} 
//} else {
//	System.out.println("Employee is Absent");
//}
