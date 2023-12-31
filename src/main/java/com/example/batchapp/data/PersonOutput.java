package com.example.batchapp.data;

public class PersonOutput {

    private String firstName;
    private String lastName;
    private String age;

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

    public String getBirthDate() {
        return age;
    }

    public void setBirthDate(String birthDate) {
        this.age = birthDate;
    }

    public PersonOutput(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = birthDate;
    }

    public PersonOutput() {
    }
}
