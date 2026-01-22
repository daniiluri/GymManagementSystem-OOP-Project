package com.Daniil.gym.model;

public class Trainer extends Person {
    private int workExperience;
    private int trainedMembersCount;


    // Constructor
    public Trainer(int personId, String name, String surname, int age, int workExperience, int trainedMembersCount){
        super(personId, name, surname, age);
        setWorkExperience(workExperience);
        setTrainedMembersCount(trainedMembersCount);
    }


    //Getters and Setters
    public void setWorkExperience(int workExperience){
        if (workExperience >= 0){
            this.workExperience = workExperience;
        }
        else {
            throw new IllegalArgumentException("Work experience cannot be negative");
        }
    }

    public int getWorkExperience(){
        return workExperience;
    }

    public void setTrainedMembersCount(int trainedMembersCount){
        if (trainedMembersCount >= 0){
            this.trainedMembersCount = trainedMembersCount;
        }
        else {
            throw new IllegalArgumentException("Trained members count cannot be negative");
        }
    }

    public int getTrainedMembersCount(){
        return trainedMembersCount;
    }


    // Overridden methods of subclass
    @Override
    public void work() {
        System.out.println("Training people...");
    }

    @Override
    public String getRole() {
        return "Trainer";
    }


    // Methods of subclass
    public void addTrainedMember(){
        trainedMembersCount++;
    }

    public boolean isExperienced(){
        return workExperience > 3;
    }

    @Override
    public String toString(){
        return personId + " " + name + " "  + surname + " " + age + " y.o" + ", work experience: " + workExperience + ", trained members count: " + trainedMembersCount;
    }
}
