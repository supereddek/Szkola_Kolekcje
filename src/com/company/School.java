package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class School {
    private ArrayList<Person> studentsAL = new ArrayList<>();
    private LinkedList<Person> studentsLL = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent(Person student) {
        this.studentsAL.add(student);
        this.studentsLL.add(student);
    }

    public void newStudent(){
        System.out.println("Podaj imię:");
        String firstName = sc.next();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.next();
        Person student = new Person(firstName, lastName);
        this.addStudent(student);
        student.addGrades();
    }
    public void showStudents() {
        System.out.println("Lista studentów z ArrayList:");
        for(Person person: studentsAL) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
        System.out.println("\n Lista studentów z LinkedList: ");
        for(Person person: studentsLL) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }

}
