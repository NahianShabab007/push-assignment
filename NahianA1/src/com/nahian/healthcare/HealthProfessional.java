package com.nahian.healthcare;

public class HealthProfessional {
    private int id;
    private String name;
    private String specialty;

    //Default constructor
    public HealthProfessional() {
    }

    //Constructor with params
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    //method to print all variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }

    //getter setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
}
