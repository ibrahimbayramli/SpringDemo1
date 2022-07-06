package com.example.backend.dto;

import com.example.backend.model.User;
import lombok.Getter;

import java.io.Serializable;



@Getter
public final class UserViewDTO implements Serializable {

    private static final long seralVersionUID=1L;

    private String firstName;

    private String lastName;


    private UserViewDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static UserViewDTO of(User user){

        return new UserViewDTO(user.getFirstName(),user.getLastName());
    }
}
