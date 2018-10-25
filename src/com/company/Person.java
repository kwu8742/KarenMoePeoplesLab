package com.company;

public class Person {
    private String FirstName;
    private String FamilyName;

    public Person(String FirstName, String FamilyName) {
        this.FirstName = FirstName;
        this.FamilyName = FamilyName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getFamilyName() {
        return this.FamilyName;
    }

    public String toString() {
        return "First Name: " + this.FirstName + "Family Name: " + this.FamilyName;
    }
}
