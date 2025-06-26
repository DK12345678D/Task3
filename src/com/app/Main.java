package com.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Sample data
        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "OOP Concepts", "Grady Booch"));
        library.addUser(new User(101, "Alice"));
        library.addUser(new User(102, "Bob"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 0:
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);

        sc.close();
    }
}
