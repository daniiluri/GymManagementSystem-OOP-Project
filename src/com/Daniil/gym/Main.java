package com.Daniil.gym;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Member> members = new ArrayList<>();
    private static ArrayList<Trainer> trainers = new ArrayList<>();
    private static ArrayList<Equipment> equipments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        members.add(new Member("Vladimir", "Putin", false));
        members.add(new Member("Barak", "Obama", false));
        members.add(new Member("Donald", "Trump", true));

        trainers.add(new Trainer("Daniil", "Kim", 2, 0));
        trainers.add(new Trainer("Nikola", "Kovac", 0, 0));

        equipments.add(new Equipment("Treadmill", "Running", "For legs", 2));
        equipments.add(new Equipment("Weight", "Up weight", "For arms", 0));

        //menu
        boolean running = true;
        while (running) {
            displayMenu(); // Show menu options
            int choice = scanner.nextInt(); // Read user's choice
            scanner.nextLine(); // IMPORTANT: consume leftover newline
            switch (choice) {
                case 1:
                    addMember(); // Add member
                    break;
                case 2:
                    viewAllMembers(); // View All Members
                    break;
                case 3:
                    addTrainer(); //Add trainer
                    break;
                case 4:
                    viewAllTrainers(); // View all Trainers
                    break;
                case 0:
                    System.out.println("\nGoodbye! ");
                    running = false; // Exit loop
                    break;
                default:
                    System.out.println("\n Invalid choice!");
            }
            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine(); // Wait for user
            }
        }
        scanner.close(); // Clean up
    }

    private static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("GYM SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Member");
        System.out.println("2. View All Members");
        System.out.println("3. Add Trainer");
        System.out.println("4. View All Trainers");
        System.out.println("0. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice: ");
    }

    private static void addMember() {
        System.out.println("Enter Member name");
        String name = scanner.nextLine();

        System.out.println("Enter Member surname");
        String surname = scanner.nextLine();

        System.out.println("Does he have membership? (true/false)");
        Boolean membership = scanner.nextBoolean();
        scanner.nextLine();

        Member member = new Member(name, surname, membership);

        members.add(member);
        System.out.println("\n new Member added successfully!");
    }

    private static void addTrainer() {
        System.out.println("Enter Trainers name");
        String name = scanner.nextLine();

        System.out.println("Enter Trainers surname");
        String surname = scanner.nextLine();

        System.out.println("How much work experience does he have?");
        int experience = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How much members does he train?");
        int trainedMembersCount = scanner.nextInt();
        scanner.nextLine();

        Trainer trainer = new Trainer(name, surname, experience, trainedMembersCount);

        trainers.add(trainer);
        System.out.println("\n Menu item added successfully!");
    }

    private static void viewAllMembers() {
        System.out.println("\n========================================");
        System.out.println(" ALL MEMBERS");
        System.out.println("========================================");

        // Check if list is empty
        if (members.isEmpty()) {
            System.out.println("No members found.");
            return; // Exit method early
        }

        System.out.println("Total members: " + members.size());
        System.out.println();

        // Loop through all items
        for (Member member : members) {
            System.out.println(member);
            System.out.println();
        }
    }

    private static void viewAllTrainers() {
        System.out.println("\n========================================");
        System.out.println(" ALL TRAINERS");
        System.out.println("========================================");

        // Check if list is empty
        if (trainers.isEmpty()) {
            System.out.println("No trainers found.");
            return; // Exit method early
        }

        System.out.println("Total trainers: " + trainers.size());
        System.out.println();

        // Loop through all items
        for (Trainer trainer : trainers) {
            System.out.println(trainer);
            System.out.println();
        }
    }
}
