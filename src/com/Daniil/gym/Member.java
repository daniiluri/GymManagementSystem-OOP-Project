package com.Daniil.gym;

public class Member {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private boolean activeMembership;

    public Member(){
        id = id_gen++;
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    public Member(String name, String surname, boolean activeMembership){
        this();
        this.activeMembership = activeMembership;
        setName(name);
        setSurname(surname);
    }

    public int  getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name){
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Warning: Name cannot be empty!");
        }
    }

    public String getName(){
        return name;
    }


    public void setSurname(String surname){
        if (surname != null && !surname.trim().isEmpty()){
            this.surname = surname;
        }
        else {
            System.out.println("Warning: Surname cannot be empty!");
        }
    }

    public String getSurname(){
        return surname;
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
