package com.nahian.healthcare;

public class NursePractitioner extends HealthProfessional {
    private String licenseNumber;

    public NursePractitioner() {
        super();
    }

    public NursePractitioner(int id, String name, String specialty, String licenseNumber) {
        super(id, name, specialty);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Nurse Practitioner");
        System.out.println("License Number: " + licenseNumber);
    }
}
