package day1;

import java.util.Scanner;

public class Operators {

// EX 2
	public static void calculate() {

		Scanner in = new Scanner(System.in);
		System.out.print("Input distance in meters: ");
		double distance = in.nextDouble();

		System.out.print("Input hour: ");
		int hours = in.nextInt();

		System.out.print("Input minutes: ");
		int minutes = in.nextInt();

		System.out.print("Input seconds: ");
		int seconds = in.nextInt();

		double totalSeconds = hours * 3600 + minutes * 60 + seconds;
		double metersPerSecond = distance / totalSeconds;
		double kmPerHour = (distance / 1000) / (totalSeconds / 3600);
		double milesPerHour = (distance / 1609) / (totalSeconds / 3600);
		System.out.printf("Your speed in meters/second is %.8f\n", metersPerSecond);
		System.out.printf("Your speed in km/h is %.8f\n", kmPerHour);
		System.out.printf("Your speed in miles/h is %.8f\n", milesPerHour);

	}

//EX3
	public static void calculateNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input 1st integer: ");
		int a = input.nextInt();

		System.out.print("Input 2nd integer: ");
		int b = input.nextInt();
		int sum = a + b;
		int difference = a - b;
		int product = a * b;
		double average = (a + b) / 2.0;
		int distance = Math.abs(a - b);
		int maximum = Math.max(a, b);
		int minimum = Math.min(a, b);

		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + difference);
		System.out.println("Product = " + product);
		System.out.println("Average = " + average);
		System.out.println("Distance = " + distance);
		System.out.println("Maximum = " + maximum);
		System.out.println("Minimum = " + minimum);

	}
	
//EX4
	public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
        printDigits(n / 10);
        System.out.print(" " + (n % 10));
    }

}
