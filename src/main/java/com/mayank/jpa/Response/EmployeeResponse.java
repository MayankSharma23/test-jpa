package com.mayank.jpa.Response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeResponse {
    private Long empId;
    private String empName;
    private String empRemark;
}
