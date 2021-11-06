package com.company;

import java.util.*;

public class School {
    private ArrayList<Person> studentsAL = new ArrayList<>();
    private LinkedList<Person> studentsLL = new LinkedList<>();
    private HashSet<Person> studentsHS = new HashSet<>();
    private TreeSet<Person> studentsTS = new TreeSet<>(Comparator.comparing(Person::getFirstName));
    Scanner sc = new Scanner(System.in);

    public void addStudent(Person student) {
        this.studentsAL.add(student);
        this.studentsLL.add(student);
        this.studentsHS.add(student);
        this.studentsTS.add(student);
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
          // person.printGrades();
        }
        System.out.println("\n Lista studentów z LinkedList: ");
        for(Person person: studentsLL) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
          //  person.printGrades();
        }
        System.out.println("Lista studentów z TreeSet:");
        for(Person person: studentsTS) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
          //  person.printGrades();
        }
        System.out.println("Lista studentów z HashSet:");
        for(Person person: studentsLL) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
            person.printGrades();
        }
        System.out.println();
    }

    public void removeStudent() {
        System.out.println("Podaj imię osoby którą chcesz usunać:");
        String firstName = sc.next();
        System.out.println("Podaj nazwisko osoby:");
        String lastName = sc.next();
        studentsLL.removeIf(person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName));
        studentsAL.removeIf(person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName));
        studentsHS.removeIf(person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName));
        studentsTS.removeIf(person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName));
    }

}
