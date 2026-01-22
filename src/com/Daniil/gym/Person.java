package com.Daniil.gym;

public abstract class Person {
    protected int personId;
    protected String name;
    protected String surname;
    protected int age;


    // Constructor of superclass
    public Person(int personId, String name, String surname, int age) {
        setPersonId(personId);
        setName(name);
        setSurname(surname);
        setAge(age);
    }


    //Getters and Setters of superclass
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonId() {
        return personId;
    }

    public void  setName(String name) {
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Warning: Name cannot be empty!");
            this.name = "Unknown";
        }
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.trim().isEmpty()){
            this.surname = surname;
        }
        else {
            System.out.println("Warning: Surname cannot be empty!");
            this.surname = "Unknown";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        if  (age >= 0) {
            this.age = age;
        }
        else {
            System.out.println("Warning: Invalid age");
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }


    // Methods to Override
    abstract void work() {
        System.out.println("Working...");
    }

    public String getRole() {
        return "Person";
    }

    public boolean isAdult(){
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return personId + " " + name + " " + surname + " " + age + " y.o.";
    }
}
