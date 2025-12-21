package com.Daniil.gym;

public class Member {
    private int id;
    private static int id_gen;
    private String name;
    private String surname;
    private boolean activeMembership;

    public Member(){
        id = id_gen++;
    }

    public Member(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public boolean getActiveMembership(){
        return activeMembership;
    }

    public void setActiveMembership(boolean activeMembership){
        this.activeMembership = activeMembership;
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
            return id + " " + name + " " + surname + " have an active membership";
        }
        else{
            return id + " " + name + " " + surname + " have no active membership";
        }
    }
}
