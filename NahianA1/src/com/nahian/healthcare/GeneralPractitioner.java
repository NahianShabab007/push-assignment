package com.nahian.healthcare;

public class GeneralPractitioner extends HealthProfessional {
    private String licenseNumber;

    // Default constructor
    public GeneralPractitioner() {
        super();
    }

    //Constructor with params
    public GeneralPractitioner(int id, String name, String specialty, String licenseNumber) {
        super(id, name, specialty);
        this.licenseNumber = licenseNumber;
    }

    //Method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("License Number: " + licenseNumber);
    }
}
