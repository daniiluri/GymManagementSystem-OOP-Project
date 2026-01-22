package com.Daniil.gym.model;

public class Member extends Person {
    private int visitCount;
    private boolean activeMembership;


    //Constructor
    public Member(int personId, String name, String surname, int age, int visitCount, boolean activeMembership){
        super(personId, name, surname, age);
        setVisitCount(visitCount);
        this.activeMembership = activeMembership;
    }


    //Getters and setters of subclass
    public void setActiveMembership(boolean activeMembership){
        this.activeMembership = activeMembership;
    }

    public boolean getActiveMembership(){
        return activeMembership;
    }

    public void setVisitCount(int visitCount)   {
        if (visitCount >= 0){
            this.visitCount = visitCount;
        }
        else {
            throw new IllegalArgumentException("Invalid visit count");
        }
    }

    public int getVisitCount(){
        return visitCount;
    }


    // Overridden methods
    @Override
    public void work() {
        System.out.println("Doing exercises...");
    }

    @Override
    public String getRole() {
        return "Member";
    }


    // Methods of subclass
    public boolean isRegular() {
        return visitCount > 50;
    }

    public void buyMembership(){
        if(activeMembership){
            System.out.println("You already have an active membership");
        }
        else{
            activeMembership = true;
        }
    }

    public void removeMembership(){
        if(activeMembership){
            activeMembership = false;
        }
        else{
            System.out.println("Does not have an active membership");
        }
    }

    @Override
    public String toString(){
        if (activeMembership){
            return personId + " " + name + " " + surname + " " + age + " y.o." + ", Visit count: " + visitCount + " with membership";
        }
        else{
            return personId + " " + name + " " + surname + " " + age + " y.o." + ", Visit count: " + visitCount + " without membership";
        }
    }
}
