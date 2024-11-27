package com.nahian.healthcare;

public class Psychologist extends HealthProfessional {
    private String qualifications;

    public Psychologist() {
        super();
    }

    public Psychologist(int id, String name, String specialty, String qualifications) {
        super(id, name, specialty);
        this.qualifications = qualifications;
    }

    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Psychologist");
        System.out.println("Qualifications: " + qualifications);
    }
}
