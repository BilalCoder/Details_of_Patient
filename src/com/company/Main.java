package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter age");
        String age = sc.nextLine();
        System.out.println("Enter Gender('M' or 'F'):");
        String g = sc.nextLine();
        System.out.println("Enter Weight:");
        String n = sc.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+g);
        System.out.println("Weight: "+n);
    }
}
