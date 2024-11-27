package com.nahian.healthcare;

public class Appointment {
    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private HealthProfessional doctor;

    //Default constructor
    public Appointment() {
    }

    //constructor
    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    //getter setters
    public String getPatientName() {
        return patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    //Method to print 
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        doctor.printDetails(); // Call the doctor’s printDetails() method
    }
}
