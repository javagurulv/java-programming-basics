package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_4.task_3;

class  DoctorAppointment {

    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private int visitPrice;

    public DoctorAppointment(String patientFirstName,
                             String patientLastName,
                             String diagnosis,
                             int visitPrice) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.visitPrice = visitPrice;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getVisitPrice() {
        return visitPrice;
    }
}