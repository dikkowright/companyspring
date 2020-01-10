package com.example.companyspring.Model.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecuitmentRequest {

    private String surname;
    private String firstName;
    private String middleName;
    private String sex;
    private String age;
    private String maritalStatus;
    private String phoneNumber;
    private String level;
    private String status;
    private String email;
    private String department;
    private String salary;
}
