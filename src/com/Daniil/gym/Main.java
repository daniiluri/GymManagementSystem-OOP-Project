package com.Daniil.gym;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Person> allPeople = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        allPeople.add(new Person(3, "Aldiyar", "Prali", 18));
        allPeople.add(new Member(4, "Dias", "Azamtuly", 18, 20, true));
        allPeople.add(new Trainer(5, "Erasyl", "Termibekov", 18, 3, 12));

        //menu
        boolean running = true;
        while (running) {
            displayMenu(); // Show menu options
            int choice = scanner.nextInt(); // Read user's choice
            scanner.nextLine(); // IMPORTANT: consume leftover newline
            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    addMember(); // Add member
                    break;
                case 3:
                    addTrainer(); //Add trainer
                    break;
                case 4:
                    viewAllPeople(); // View All Members
                    break;
                case 5:
                    demonstratePolymorphism(); // View all Trainers
                    break;
                case 6:
                    viewAllMembers();
                    break;
                case 7:
                    viewAllTrainers();
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
        System.out.println("1. Add Person");
        System.out.println("2. Add Member");
        System.out.println("3. Add Trainer");
        System.out.println("4. View All People(Polymorphic)");
        System.out.println("5. Make All People Work");
        System.out.println("6. View All Members");
        System.out.println("7. View All Trainers");
        System.out.println("0. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice: ");
    } 

    private static void addMember() {
        System.out.println("Enter Member id");
        int personId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Member name");
        String name = scanner.nextLine();

        System.out.println("Enter Member surname");
        String surname = scanner.nextLine();

        System.out.println("Enter Member age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Member visit count");
        int visitCount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Does he have membership? (true/false)");
        Boolean membership = scanner.nextBoolean();
        scanner.nextLine();


        Person person = new Member(personId, name, surname, age, visitCount,membership);

        allPeople.add(person);
        System.out.println("\n new Member added successfully!");
    }

    private static void addTrainer() {
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

        Person person = new Trainer(id, name, surname, age,  workExperience, trainedMembersCount);
        allPeople.add(person);
        System.out.println("\n Trainer added successfully!");
    }

    private static void viewAllMembers() {
        System.out.println("\n========================================");
        System.out.println(" MEMBERS ONLY");
        System.out.println("========================================");

        int memberCount = 0;

        for (Person p : allPeople) {
            if (p instanceof Member) {
                Member member = (Member) p;
                memberCount++;
                System.out.print(memberCount + ". " + p.getRole() + " " + p.getName() + " " + p.getSurname() + p.getAge() + " y.o." + ", Visit count: " + ((Member) p).getVisitCount());
                if (((Member) p).getActiveMembership()) {
                    System.out.print(" with active membership");
                }
                else {
                    System.out.print(" without active membership");
                }
                System.out.println();
            }
        }
        if (memberCount == 0) {
            System.out.println("No memebers found.");
        }
    }

    private static void viewAllTrainers() {
        System.out.println("\n========================================");
        System.out.println(" TRAINERS ONLY");
        System.out.println("========================================");

        int trainerCount = 0;

        for (Person p : allPeople) {
            if (p instanceof Trainer) {
                Trainer trainer = (Trainer) p;
                trainerCount++;
                System.out.println(trainerCount + ". " + p.getRole() + " " + p.getName() + " "  + p.getSurname() + " " + p.getAge() + " y.o" + ", work experience " + ((Trainer) p).getWorkExperience() + ", trained members count: " + ((Trainer) p).getTrainedMembersCount());
                System.out.println();
            }
        }
        if (trainerCount == 0) {
            System.out.println("No trainers found.");
        }
    }

    private static void addPerson() {
        System.out.println("Enter Person id");
        int personId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Person name");
        String name = scanner.nextLine();

        System.out.println("Enter Person surname");
        String surname = scanner.nextLine();

        System.out.println("Enter Person age");
        int age = scanner.nextInt();
        scanner.nextLine();

        Person person = new Person(personId, name, surname, age);

        allPeople.add(person);
        System.out.println("\n new Person added successfully!");
    }

    private static void viewAllPeople() {
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
            System.out.println((i + 1) + ". " + p);

            if (p instanceof Member) {
                Member member = (Member) p; // Downcast
                if (member.isRegular()) {
                    System.out.println(" is Regular Member");
                }

            } else if (p instanceof Trainer) {
                Trainer trainer = (Trainer) p; // Downcast
                if (trainer.isExperienced()) {
                    System.out.println(" is Experienced!");
                }
            }
            System.out.println();
        }
    }

    private static void demonstratePolymorphism() {
        System.out.println("\n========================================");
        System.out.println(" POLYMORPHISM DEMONSTRATION");
        System.out.println("========================================");
        System.out.println("Calling work() on all staff members:");
        System.out.println();
        for (Person s : allPeople) {
            System.out.print(s.getName() + " "); // Polymorphism: Same method, different behavior!
            s.work();
        }
        System.out.println();
        System.out.println(" Notice: Same method name (work), different output!");
        System.out.println(" This is POLYMORPHISM in action!");
    } //Make All People Work
}
