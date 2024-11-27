package com.nahian.healthcare;

public class Specialist extends HealthProfessional {
    private String fieldOfExpertise;

    //Default constructor
    public Specialist() {
        super();
    }

    //Constructor with params
    public Specialist(int id, String name, String specialty, String fieldOfExpertise) {
        super(id, name, specialty);
        this.fieldOfExpertise = fieldOfExpertise;
    }

    //Method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Field of Expertise: " + fieldOfExpertise);
    }
}
