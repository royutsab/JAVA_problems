package exercise;
import java.util.Scanner;
public class Calender {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.print("Enter the year: ");
		int year = input.nextInt();

		// Prompt the user to enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday)
		System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
		int firstDay = input.nextInt();
		// Check if it's a leap year and update the number of days in February
		if (isLeapYear(year)) {
		    daysInMonth[1] = 29;
		}

		// Array to store the names of the months
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		// Display the calendar table
		System.out.println("\nCalendar for the year " + year + "\n");
		for (int month = 0; month < 12; month++) {
		    System.out.println(monthNames[month]+","+year);
		    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		    
		    // Print leading spaces for the first day of the month
		    for (int i = 0; i < firstDay; i++) {
		        System.out.print("    ");
		    }
		    
		    // Print the days of the month
		    for (int day = 1; day <= daysInMonth[month]; day++) {
		        System.out.printf("%3d ", day);
		        
		        // Move to the next line if it's Saturday
		        if ((firstDay + day) % 7 == 0 || day == daysInMonth[month]) {
		            System.out.println();
		        }
		    }
		    
		    // Update the first day for the next month
		    firstDay = (firstDay + daysInMonth[month]) % 7;
		    
		    System.out.println();
		    }
	}


public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
}
