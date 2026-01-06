package com.Daniil.gym;

public class Member extends Person{
    private int visitCount;
    private boolean activeMembership;


    public Member(int personId, String name, String surname, int age, int visitCount, boolean activeMembership){
        super(personId, name, surname, age);
        setVisitCount(visitCount);
        this.activeMembership = activeMembership;
    }

    public void setActiveMembership(boolean activeMembership){
        this.activeMembership = activeMembership;
    }

    public boolean getActiveMembership(){
        return activeMembership;
    }

    public void setVisitCount(int visitCount){
        if (visitCount >= 0){
            this.visitCount = visitCount;
        }
        else {
            System.out.println("Invalid visit count");
            this.visitCount = 0;
        }
    }

    public int getVisitCount(){
        return visitCount;
    }

    @Override
    public void work() {
        System.out.println("Doing exercises...");
    }

    @Override
    public String getRole() {
        return "Member";
    }

    public boolean isRegular() {
        if (visitCount > 50) {
            return true;
        }
        return false;
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
