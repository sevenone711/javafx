package controllers;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Peapl {
     private SimpleStringProperty lastName;
     private SimpleStringProperty firstName;
     private SimpleIntegerProperty age;
     private SimpleStringProperty phone;
    public Peapl(String lastName,String firstName){

        this.lastName = new SimpleStringProperty(lastName);
        this.firstName = new SimpleStringProperty(firstName);
        this.age = new SimpleIntegerProperty(14);
        this.phone = new SimpleStringProperty("+7916881233");
    }

    public String getLastName () {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty () {
        return lastName;
    }

    public String getFirstName () {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty () {
        return firstName;
    }

    public int getAge () {
        return age.get();
    }

    public SimpleIntegerProperty ageProperty () {
        return age;
    }

    public String getZip () {
        return phone.get();
    }

    public SimpleStringProperty zipProperty () {
        return phone;
    }

    public void setLastName (String lastName) {
        this.lastName.set(lastName);
    }

    public void setFirstName (String firstName) {
        this.firstName.set(firstName);
    }

    public void setAge (int age) {
        this.age.set(age);
    }

    public void setZip (String phone) {
        this.phone.set(phone);
    }
}

