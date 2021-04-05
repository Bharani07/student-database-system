package sdbms;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StudentManagementSystem obj = new StudentManagementSystemImpl(); // Up-casting

		System.out.println("Welcome to Student Database Management System");
		System.out.println("---------------------------------------------");

		while(true) {
			
			System.out.println("1:Add Student\n2:Remove Student\n3:Remove All Students");
			System.out.println("4:Update Student\n5:Display Student\n6:Display All Students");
			System.out.println("7:Sort Students\n8:Exit");
			System.out.println("Enter Choice:");
			int choice = scan.nextInt();

			switch(choice) {

			case 1: 
				System.out.println("Adding Student");
				obj.addStudent();
				break;

			case 2: 
				System.out.println("Removing Student");
				obj.removeStudent();
				break;

			case 3:
				System.out.println("Removing All Students");
				obj.removeAllStudents();
				break;

			case 4: 
				System.out.println("Updating Student Details");
				obj.updateStudent();
				break;

			case 5:
				System.out.println("Display Student");
				obj.displayStudent();
				break;

			case 6:
				System.out.println("Display All Students");
				obj.displayAllStudent();
				break;

			case 7:
				System.out.println("Sorting Students");
				obj.sortStudent();
				break;

			case 8 :
				System.out.println("THANK YOU!!!");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");

			}
			
			System.out.println("==================================");
			
		}

	}

}