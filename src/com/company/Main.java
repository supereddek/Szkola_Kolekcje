package com.company;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	School school = new School();
    	runApp(school);
    }



	public static void printMenu() {
		System.out.println("Co chcesz zrobić?");
		System.out.println("1 - Dodaj nowego studenta");
		System.out.println("2 - wyświetl obecnych studentów");
		System.out.println("3 - usuń studenta");
	}

	public static void runApp(School school) {
    	int action = 1;
    	while (action!=0) {
    		printMenu();
    		action = sc.nextInt();
    		switch (action){
				case 1:
					school.newStudent();
					break;
				case 2:
					school.showStudents();
					break;
				case 3:
					school.removeStudent();
					break;
			}

		}
    }
}
