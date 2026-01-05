package com.Daniil.gym;

public class Person {
    protected String name;
    protected String surname;

    public Person(){
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public void  setName(String name) {
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Warning: Name cannot be empty!");
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
        }
    }

    public String getSurname() {
        return surname;
    }
}
