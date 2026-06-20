package com.example.student.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * DTO for student request payload.
 */
@Data
public class StudentRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotNull
    private String dateOfBirth;

    @NotBlank
    private String gender;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 10, max = 15)
    private String phoneNumber;

    @NotBlank
    private String department;

    @NotBlank
    private String course;

    @NotNull
    private Integer yearOfStudy;

    @NotBlank
    private String address;

    @NotBlank
    @Size(min = 10, max = 15)
    private String parentContactNumber;
}