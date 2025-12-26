package com.Daniil.gym;

public class Trainer {
    private int id;
    private static int id_gen;
    private String name;
    private String surname;
    private int workExperience;
    private int trainedMembersCount;

    public Trainer(){
        id = id_gen++;
    }

    public Trainer(String name, String surname, int workExperience, int trainedMembersCount){
        this();
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
        this.trainedMembersCount = trainedMembersCount;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
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

    public int getWorkExperience(){
        return workExperience;
    }

    public void setWorkExperience(int workExperience){
        this.workExperience = workExperience;
    }

    public int getTrainedMembersCount(){
        return trainedMembersCount;
    }

    public void setTrainedMembersCount(int trainedMembersCount){
        this.trainedMembersCount = trainedMembersCount;
    }

    public void addTrainedMember(){
        trainedMembersCount++;
    }

    public boolean isExperienced(){
        return workExperience > 3;
    }

    @Override
    public String toString(){
        return id + " " + name + " "  + surname + " " + workExperience + " " + trainedMembersCount;
    }
}
