package com.example.test;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\nEnter Student class level: ");
        this.gradeYear = in.nextLine();

        setStudentId();


    }

    private void setStudentId(){
        id++;
        this.studentId = gradeYear + "" + id;
    }

    public void enroll(){
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else{
                break;
            }
        }while (1 != 0);

        }


    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public String toString(){
        return "Name: " + firstName + " " +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID" + studentId +
                lastName + "\nCourses Enrolled: " +
                courses + "\nBalance: $" + tuitionBalance;
    }

}
