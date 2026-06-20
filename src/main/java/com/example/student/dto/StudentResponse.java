package com.example.student.dto;

import lombok.Data;

/**
 * DTO for student response payload.
 */
@Data
public class StudentResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String department;
    private String course;
    private Integer yearOfStudy;
    private String address;
    private String parentContactNumber;
}