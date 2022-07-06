package com.example.backend.model;

import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Table(name = "users")
@NoArgsConstructor
@Data
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name",nullable = false,length = 50)
    private String firstName;


    @Column(name = "last_name",nullable = false,length = 50)
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
