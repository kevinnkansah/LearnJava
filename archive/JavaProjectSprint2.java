// Name: Kevin Sesu
// Surname: Nkansah
// Student number: 4384756
// Project name: Restaurant Inventory System

// This class represents a prototype of a restaurant inventory system
// The purpose of this project is to create a system that can manage the inventory of a restaurant
// The system should be able to track the stock levels, costs, and expiration dates of the products
// The system should also be able to generate reports and alerts based on the inventory data

import java.util.Scanner;

public class JavaProjectSprint2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name:");
        String name = scanner.nextLine();

        System.out.print("Surname:");
        String surname = scanner.nextLine();

        System.out.print("Enter an email address:");
        String email = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm Password: ");
        String passwordAgain = scanner.nextLine();

        scanner.close();
    }
}