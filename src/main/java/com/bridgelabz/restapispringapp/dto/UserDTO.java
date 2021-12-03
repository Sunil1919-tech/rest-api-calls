package com.bridgelabz.restapispringapp.dto;

/**
 * purpose:to initialize the variables
 *
 * @author Sunil
 * @since 01/12/2021
 */
public class UserDTO {
    private String firstName;
    private String lasName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                '}';
    }
}
