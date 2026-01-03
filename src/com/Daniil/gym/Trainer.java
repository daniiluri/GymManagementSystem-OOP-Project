package com.Daniil.gym;

public class Trainer {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private int workExperience;
    private int trainedMembersCount;

    public Trainer(){
        id = id_gen++;
        this.name = "Unknown";
        this.surname = "Unknown";
        this.workExperience = 0;
        this.trainedMembersCount = 0;
    }

    public Trainer(String name, String surname, int workExperience, int trainedMembersCount){
        this();
        setName(name);
        setSurname(surname);
        setWorkExperience(workExperience);
        setTrainedMembersCount(trainedMembersCount);
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
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
        else{
            System.out.println("Warning: Surname cannot be empty!");
        }
    }

    public String getSurname(){
        return surname;
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
