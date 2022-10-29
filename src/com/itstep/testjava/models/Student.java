package com.itstep.testjava.models;

public class Student {
    String firstName;
    String lastName;
    int averageMark;

    public Student(String firstName, String lastName, int averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return String.format("%s %s, average mark: %d", firstName, lastName, averageMark);
    }
}
