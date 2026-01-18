package miniproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        OPerationClass bst = new OPerationClass();

        while (true) {
            System.out.println("\n------ Student Record Management System ------");
            System.out.println("1. Insert Student Record");
            System.out.println("2. Delete Student Record");
            System.out.println("3. Search Student Record");
            System.out.println("4. Show All Records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Roll Number Generated..\n ");
                    int roll = (int)(0+Math.random()*(1000-0+1));
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Total Marks: ");
                    int marks = sc.nextInt();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    Student student = new Student(roll, name, course, marks, cgpa);
                    bst.insert(student);
                    break;

                case 2:
                    System.out.print("Enter Roll Number to delete: ");
                    int delRoll = sc.nextInt();
				int staData = bst.delete(delRoll);
				
                  
                   if(staData == 0) {
                	   System.out.println("The data successfully deleted...");
                   }
                   else {
                	   System.out.println("!Record not found...");
                   }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    bst.search(searchRoll);
                    break;

                case 4:
                    bst.showAllRecords();
                    break;

                case 5:
                    System.out.println(" Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println(" Invalid choice, try again.");
            }
        }
		
	}

}
