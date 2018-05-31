package com.company;

import java.util.Scanner;

public class Main {
    private static String firstInitial, lastName, streetName, streetType, city, houseNumber;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first initial: ");
        firstInitial = input.nextLine();
        System.out.println("Enter your last name: ");
        lastName = input.nextLine();
        System.out.println("Enter your house number: ");
        houseNumber = input.nextLine();
        System.out.println("Enter your street name: ");
        streetName = input.nextLine();
        System.out.println("Enter your street type: ");
        streetType = input.nextLine();
        System.out.println("Enter your city: ");
        city = input.nextLine();

        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " " + streetName + " " + streetType + " " + city);
    }
}
