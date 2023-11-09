package com.bforbhagya.ems.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDetails {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
