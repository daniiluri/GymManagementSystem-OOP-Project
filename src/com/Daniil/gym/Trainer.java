package com.Daniil.gym;

public class Trainer extends Person{
    private int workExperience;
    private int trainedMembersCount;

    public Trainer(){
        super();
    }

    public Trainer(String name, String surname, int workExperience, int trainedMembersCount){
        super(name, surname);
        setWorkExperience(workExperience);
        setTrainedMembersCount(trainedMembersCount);
    }

    public void setWorkExperience(int workExperience){
        if (workExperience >= 0){
            this.workExperience = workExperience;
        }
        else {
            System.out.println("Warning: work experience cannot be negative! Setting to 0.");
            this.workExperience = 0;
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
            System.out.println("Warning: trained members count cannot be negative! Setting to 0.");
            this.trainedMembersCount = 0;
        }
    }

    public int getTrainedMembersCount(){
        return trainedMembersCount;
    }

    public void addTrainedMember(){
        trainedMembersCount++;
    }

    public boolean isExperienced(){
        return workExperience > 3;
    }

    @Override
    public String toString(){
        return id + " " + name + " "  + surname + ", work experience " + workExperience + ", trained members count: " + trainedMembersCount;
    }
}
