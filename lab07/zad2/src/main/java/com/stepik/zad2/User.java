package com.stepik.zad2;

import java.util.Date;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;

    @NotNull(message = "Name is required!")
    @Size(min = 3, message = "Provide name with normal length!")
    private String name;

    @NotNull(message = "Age is required!")
    @Min(value = 1, message = "Minimum age is 1!")
    private int age;

    @NotNull(message = "User type is required!")
    private UserType userType;

    private Date registrationDate;

    public static enum UserType {
        GUEST, REGISTERED, ADMIN
    }
}
