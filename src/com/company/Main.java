package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		Person bartek = new Person("Bartek", "Kox");
		bartek.addGrades();
		bartek.printGrades();


    }
}
