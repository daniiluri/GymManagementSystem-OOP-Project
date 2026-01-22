package com.Daniil.gym.model;

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
        if (personId < 0) {
            throw new IllegalArgumentException("Person ID cannot be negative");
        }
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
            System.out.println("Name cannot be empty!");
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
            throw new IllegalArgumentException("Surname cannot be empty!");
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
            throw new IllegalArgumentException("Age cannot be negative!");
        }
    }

    public int getAge() {
        return age;
    }


    // Methods to Override
    public abstract void work();

    public abstract String getRole();

    // Method
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
