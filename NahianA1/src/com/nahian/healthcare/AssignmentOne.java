package com.nahian.healthcare;

import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        //instances of GeneralPractitioner
        GeneralPractitioner drBromberg = new GeneralPractitioner(1, "Dr Sergey Bromberg", "General Practitioner", "GP123");
        GeneralPractitioner drWong = new GeneralPractitioner(2, "Dr Justin Wong", "General Practitioner", "GP456");
        GeneralPractitioner drAli = new GeneralPractitioner(3, "Dr Ali Zebarjad", "General Practitioner", "GP789");

        //instances of Specialists
        NursePractitioner andrewWalton = new NursePractitioner(4, "Andrew Walton", "Nurse Practitioner", "NP123");
        Psychologist julieScott = new Psychologist(5, "Julie Scott", "Psychologist", "B Sc Grad Dip Psych M");

        // Print health professional
        drBromberg.printDetails();
        System.out.println("------------------------------");
        drWong.printDetails();
        System.out.println("------------------------------");
        drAli.printDetails();
        System.out.println("------------------------------");
        andrewWalton.printDetails();
        System.out.println("------------------------------");
        julieScott.printDetails();

        System.out.println("------------------------------");

        // Proceed to Part 5 - Collection of appointments
        createAppointment("Nahian", "123456789", "09:20", drBromberg);
        createAppointment("Shadab", "987654321", "12:20", andrewWalton);
        printExistingAppointments();
        cancelBooking("123456789");
        printExistingAppointments();
    }

    public static void createAppointment(String name, String phone, String time, HealthProfessional doctor) {
        Appointment appointment = new Appointment(name, phone, time, doctor);
        appointments.add(appointment);
        System.out.println("Appointment created for " + name);
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing appointments:");
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(String phone) {
        appointments.removeIf(appointment -> appointment.getPatientPhone().equals(phone));
        System.out.println("Appointment with phone " + phone + " has been cancelled.");
    }
}
