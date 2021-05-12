package com.collection.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	  int sid;
	  String sname;
	  int marks;
	public Student() {
		super();
	}
	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	public void dispadisplayStudentDetails() {
		System.out.println("[sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]");
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
}
class Course {
	 int courseId;
	 String courseName;
	 List<Student> list;
	  
	public Course() {
		super();
	}
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public void addStudentToCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Students");
		List<Student> list = new ArrayList<Student>();
		int size = sc.nextInt();
		for(int i = 0; i < size;i++) {
			list.add(new Student(sc.nextInt(),sc.next(), sc.nextInt()));
		}
	}
	public void displayCourseDetails() {
        System.out.println("Course [course_id=" + courseId + ", course_name=" + courseName+ " " );
        for(Student s :list) {
        	System.out.println(s);
        }
}
	
@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", list=" + list + "]";
	}
}
public class Department {
	 int deptId;
	 String deptName;
	 List<Department> list;
	 
	public Department() {
		super();
	}
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public void addCourseToDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Courses");
		List<Department> list = new ArrayList<Department>();
		int size = sc.nextInt();
		for(int i = 0; i < size;i++) {
			list.add(new Department(sc.nextInt(),sc.next()));
		}
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", list=" + list + "]";
	}
	public static void main(String[] args) {
		System.out.println("Enter Deratment Id and name");
        Scanner sc = new Scanner(System.in);        
        Department d = new Department(sc.nextInt(),sc.next());        
        d.addCourseToDepartment();
        Course c = new Course();
        c.addStudentToCourse();
       
        System.out.println(d);
        System.out.println(c);
		
	}	
}
