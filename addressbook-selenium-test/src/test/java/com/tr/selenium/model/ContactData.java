package com.tr.selenium.model;

public class ContactData {
    String firstName;
    String lastName;
    String group;



    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    public ContactData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactData withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getGroup() {
        return group;
    }


}

