package com.crm.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;

    @Size(min = 3 , message = "At least 3 chars required")
    private String name;

    @Email
    private String emailId;

    @Size(min = 10 , max = 10 , message = "Should be 10 digits")
    private String mobile;
}

