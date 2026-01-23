package com.Daniil.gym.menu;

import com.Daniil.gym.model.Member;
import com.Daniil.gym.model.Person;
import com.Daniil.gym.model.Trainer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GymMenu implements Menu {
    private static ArrayList<Person> allPeople = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void displayMenu() {
        System.out.println("\n========================================");
        System.out.println(" RESTAURANT MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Trainer");
        System.out.println("2. Add Member");
        System.out.println("3. View All People");
        System.out.println("4. Make All People Work (Polymorphism Demo)");
        System.out.println("0. Exit");
        System.out.println("========================================");
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            System.out.print("Enter choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1: addTrainer(); break;
                    case 2: addMember(); break;
                    case 3: viewAllPeople(); break;
                    case 4: demonstrateWork(); break;
                    case 0: running = false; break;
                    default: System.out.println("Invalid!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private void addTrainer() {
        try {
            System.out.println("\n--- ADD TRAINER ---");

            System.out.print("Enter Person ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter surname: ");
            String surname = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter work experience: ");
            int workExperience = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter trained members count: ");
            int trainedMembersCount = scanner.nextInt();
            scanner.nextLine();

            Trainer trainer = new Trainer(id, name, surname, age,  workExperience, trainedMembersCount);
            allPeople.add(trainer);
            System.out.println("\n Trainer added successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addMember() {
        try {
            System.out.print("Enter Member id: ");
            int personId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Member name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Member surname: ");
            String surname = scanner.nextLine();

            System.out.print("Enter Member age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Member visit count: ");
            int visitCount = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Does he have membership? (true/false): ");
            Boolean membership = scanner.nextBoolean();
            scanner.nextLine();

            Member member = new Member(personId, name, surname, age, visitCount, membership);
            allPeople.add(member);
            System.out.println("\n new Member added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewAllPeople() {
        System.out.println("\n========================================");
        System.out.println(" ALL PEOPLE (POLYMORPHIC LIST)");
        System.out.println("========================================");
        if (allPeople.isEmpty()) {
            System.out.println("No People found.");
            return;
        }
        System.out.println("Total people: " + allPeople.size());
        System.out.println();
        for (int i = 0; i < allPeople.size(); i++) {
            Person p = allPeople.get(i);
            System.out.print((i + 1) + ". " + p);

            if (p instanceof Member) {
                Member member = (Member) p; // Downcast
                if (member.isRegular()) {
                    System.out.print(" is Regular Member");
                }

            } else if (p instanceof Trainer) {
                Trainer trainer = (Trainer) p; // Downcast
                if (trainer.isExperienced()) {
                    System.out.print(" is Experienced!");
                }
            }
            System.out.println();
        }
    }

    private void demonstrateWork() {
        System.out.println("\n--- POLYMORPHISM: All People Working ---");
        for (Person p : allPeople) {
            p.work(); // Calls overridden method!
        }
    }
}

