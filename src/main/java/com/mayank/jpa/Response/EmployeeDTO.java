package com.mayank.jpa.Response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EmployeeDTO {
    private Long id;
    private String name;
    private String remark;


}
