package com.mayank.jpa.Controller;

import com.mayank.jpa.Entity.Remarks;
import com.mayank.jpa.Entity.Employees;
import com.mayank.jpa.Repository.RemarksRepository;
import com.mayank.jpa.Repository.EmployeeRepository;
import com.mayank.jpa.Response.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class Employee {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RemarksRepository remarksRepository;

    @GetMapping("/data")
    public List<EmployeeDTO> getAllEmployees() {
        List<Employees> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        if(employees.size() > 0){

            for (Employees employee:employees) {
                EmployeeDTO employeeDTO = new EmployeeDTO();
                employeeDTO.setId(employee.getId());
                employeeDTO.setName(employee.getName());
                Remarks remarks = remarksRepository.findByEmpId(employee.getId());
                if (remarks != null) {
                    employeeDTO.setRemark(remarks.getRemark());
                }

                employeeDTOs.add(employeeDTO);
            }
        }
        return employeeDTOs;
    }


    //else and try catch is missing

}
