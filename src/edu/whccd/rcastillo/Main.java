package edu.whccd.rcastillo;


/* This application is meant to utilize if and else statement along with switch statements
    Author: Richard Castillo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Welcome to the Student Grade Scale");
	    System.out.println();

	    System.out.print("Enter Student numeric grade: ");
	    int grade = sc.nextInt();

		System.out.print("Enter Letter Grade: ");
		String letterGrade = sc.next();

	    System.out.println();

	    if (grade > 100 || grade < 0)
			System.out.println("Invalid input");
	    else if (grade >= 90)
	        System.out.println("Letter Grade: A");
	    else if (grade >= 80)
	        System.out.println("Letter Grade: B");
	    else if (grade >= 70)
	        System.out.println("Letter Grade: C");
	    else if (grade >= 60)
	        System.out.println("Letter Grade: D");
	    else if (grade >= 50)
	        System.out.println("Letter Grade: F");

	    System.out.println("***********************************");

	    switch (letterGrade) {
			case "A":
				System.out.println("Numeric Grade Range: 90-100");
				break;
			case "B":
				System.out.println("Numeric Grade Range: 80-89");
				break;
			case "C":
				System.out.println("Numeric Grade Range: 70-79");
				break;
			case "D":
				System.out.println("Numeric Grade Range: 60-69");
				break;
			case "F":
				System.out.println("Numeric Grade Range: 0-59");
			default:
				System.out.println("Invalid Input");
		}

    }
}
