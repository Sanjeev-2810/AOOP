package com.sis;

public class Simpleenrollment implements Enrollment{
	 @Override
	    public void enroll(Student student, Course course) {
	        student.enrollInCourse(course);
	    }

}
