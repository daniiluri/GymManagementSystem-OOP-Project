package com.Daniil.gym;

public class Equipment {
    private String name;
    private String description;
    private String category;
    private int quantity;


    public Equipment(String name, String description, String category, int quantity){
        this.name = name;
        this.description = description;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public boolean isAvailable(){
        return quantity > 0;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    @Override
    public String toString(){
        return name + " " + description + " " + category + " " + quantity;
    }
}

