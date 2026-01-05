package com.Daniil.gym;

public class Member extends Person{
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private boolean activeMembership;

    public Member(){
        super();
    }

    public Member(String name, String surname, boolean activeMembership){
        super(name, surname);
        this.activeMembership = activeMembership;
    }

    public void setActiveMembership(boolean activeMembership){
        this.activeMembership = activeMembership;
    }

    public boolean getActiveMembership(){
        return activeMembership;
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
            return id + " " + name + " " + surname + " with membership";
        }
        else{
            return id + " " + name + " " + surname + " without membership";
        }
    }
}
