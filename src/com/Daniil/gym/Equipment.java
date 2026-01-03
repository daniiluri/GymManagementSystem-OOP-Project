package com.Daniil.gym;

public class Equipment {
    private String name;
    private String description;
    private String category;
    private int quantity;

    public Equipment() {
        this.name = "Unknown";
        this.description = "Unknown";
        this.category = "Unknown";
        this.quantity = 0;
    }

    public Equipment(String name, String description, String category, int quantity){
        this();
        setName(name);
        setDescription(description);
        setCategory(category);
        setQuantity(quantity);
    }

    public void setName(String name){
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("Warning: Name cannot be empty!");
        }
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        if (description != null && !description.trim().isEmpty()){
            this.description = description;
        }
        else {
            System.out.println("Warning: Description cannot be empty!");
        }
    }

    public String getDescription(){
        return description;
    }

    public void setCategory(String category){
        if  (category != null && !category.trim().isEmpty()){
            this.category = category;
        }
        else {
            System.out.println("Warning: Category cannot be empty!");
        }
    }

    public String getCategory(){
        return category;
    }

    public void setQuantity(int quantity){
        if (quantity >= 0){
            this.quantity = quantity;
        }
        else {
            System.out.println("Quantity cannot be negative");
            this.quantity = 0;
        }
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean isAvailable(){
        return quantity > 0;
    }

    public void addQuantity(int quantity){
        if  (quantity > 0){
            this.quantity += quantity;
        }
        else  {
            System.out.println("Quantity must be positive");
        }
    }

    @Override
    public String toString(){
        return name + " " + description + " " + category + " " + quantity;
    }
}

