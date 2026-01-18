package miniproject;

public class Student {
	int rollNumber;
    String name;
    String course;
    int totalMarks;
    double cgpa;

    Student(int rollNumber, String name, String course, int totalMarks, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.totalMarks = totalMarks;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("CGPA: " + cgpa);
        System.out.println("--------------------------");
    }
}
