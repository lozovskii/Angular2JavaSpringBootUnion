package com.project.model;

import javax.persistence.*;

@Entity
@Table(name = "users_angulartest")
public class User {

    @Id
    @SequenceGenerator(name="user_seq", sequenceName="users_angulartest_sequence",allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="user_seq")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String firstName;

    @Column(name = "user_phone")
    private int phoneNumber;

    public User() {
    }

    public User(String firstName, int phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
