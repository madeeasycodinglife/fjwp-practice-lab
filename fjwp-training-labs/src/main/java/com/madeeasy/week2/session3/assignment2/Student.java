package com.madeeasy.week2.session3.assignment2;

import java.util.List;

/**
 * The type Student.
 */
@SuppressWarnings("all")
public class Student {

    private String name;
    private int age;
    private String department;

    /**
     * Instantiates a new Student.
     */
    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "IT";
    }

    /**
     * Instantiates a new Student.
     *
     * @param name the name
     * @param age  the age
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    /**
     * Instantiates a new Student.
     *
     * @param name       the name
     * @param age        the age
     * @param department the department
     */
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    /**
     * Displaying the student details
     */
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Department: " + this.department);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student("Palash", 21);
//        Student student3 = new Student("Kartik", 25, "IT");
//        student1.display();
//        student2.display();
//        student3.display();
        List<Student> listOfStudent = List.of(
                new Student(),
                new Student("Palash", 21),
                new Student("Kartik", 25, "IT")
        );
        listOfStudent.stream()
                .forEach(student -> student.display());
    }
}

/**
 * o/p
 * Name: Unknown
 * Age: 20
 * Department: IT
 * Name: Palash
 * Age: 21
 * Department: IT
 * Name: Kartik
 * Age: 25
 * Department: IT
 */