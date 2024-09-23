package com.sis;

public class Clientsis {
	 public static void main(String[] args) {
	     
	        Student gradStudent = new Grad("G1001", "Alice");
	        Student undergradStudent = new Undergrad("U1001", "Bob");

	        Course course1 = new Course("C101", "Computer Science");
	        Course course2 = new Course("C102", "Mathematics");

	        Enrollment enrollmentService = new Simpleenrollment();

	        enrollmentService.enroll(gradStudent, course1);
	        enrollmentService.enroll(undergradStudent, course2);

	        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
	        for (Student student : course1.getStudents()) {
	            System.out.println(student.getName());
	        }

	        System.out.println("Students enrolled in " + course2.getCourseName() + ":");
	        for (Student student : course2.getStudents()) {
	            System.out.println(student.getName());
	        }
	    }

}
