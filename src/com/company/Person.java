package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Person {

    private String firstName;
    private String lastName;
    private HashMap<String, Double> gradesHM = new HashMap<>();
    private TreeMap<String, Double> gradesTM = new TreeMap<>();
    Scanner sc = new Scanner(System.in);

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addGrades() {
        System.out.println("Ile kursów chcesz dodać?");
        int amount = sc.nextInt();
        String subject;
        Double grade;
        for (int i = 0; i < amount; i++) {
            System.out.println("Podaj nazwę kursu:");
            subject = sc.next();
            System.out.println("Podaj ocenę:");
            grade = sc.nextDouble();
            gradesHM.put(subject, grade);
            gradesTM.put(subject, grade);
        }
    }

    public void printGrades() {
        System.out.println("Oceny z HashMap:");
        System.out.println(gradesHM);
        System.out.println("Oceny z TreeMap");
        System.out.println(gradesTM);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void getGrades() {
        System.out.println("");
    }
}
