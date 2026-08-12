package app;

import models.Course;
import models.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        students.add(new Students(1L, "John", "Smith", "john.smith@email.com", "3001234567"));
        students.add(new Students(2L, "Emily", "Johnson", "emily.johnson@email.com", "3012345678"));
        students.add(new Students(3L, "Michael", "Brown", "michael.brown@email.com", "3023456789"));
        students.add(new Students(4L, "Sarah", "Davis", "sarah.davis@email.com", "3034567890"));
        students.add(new Students(5L, "David", "Wilson", "david.wilson@email.com", "3045678901"));

        System.out.println("List of students");

        for (Students student : students) {
            System.out.println(
                    "ID: " + student.getId() +
                            ", First Name: " + student.getFirstname() +
                            ", Last Name: " + student.getLastname() +
                            ", Email: " + student.getEmail() +
                            ", Phone: " + student.getPhone()
            );
        }

        courses.add(new Course(1L, "Java Basics", "JAVA101", "Introduction to programming with Java", 40, 25));
        courses.add(new Course(2L, "Advanced Java", "JAVA201", "OOP, collections and exception handling", 60, 20));
        courses.add(new Course(3L, "Databases", "DB101", "Relational modeling and SQL", 50, 30));
        courses.add(new Course(4L, "Web Development", "WEB101", "HTML, CSS, JavaScript and frameworks", 80, 15));
        courses.add(new Course(5L, "Spring Boot", "SPR101", "Building REST APIs with Spring", 70, 20));

        System.out.println("\nList of courses");

        for (Course course : courses) {
            System.out.println(
                    "ID: " + course.getId() +
                            ", Name: " + course.getName() +
                            ", Code: " + course.getCode() +
                            ", Description: " + course.getDescription() +
                            ", Duration: " + course.getDuration() +
                            ", Capacity: " + course.getCapacity()
            );
        }

    }

}