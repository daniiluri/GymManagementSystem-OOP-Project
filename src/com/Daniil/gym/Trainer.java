package com.Daniil.gym;

public class Trainer extends Person{
    private int workExperience;
    private int trainedMembersCount;

    public Trainer(int personId, String name, String surname, int age, int workExperience, int trainedMembersCount){
        super(personId, name, surname, age);
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

    @Override
    public void work() {
        System.out.println("Training people...");
    }

    @Override
    public String getRole() {
        return "Trainer";
    }


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
