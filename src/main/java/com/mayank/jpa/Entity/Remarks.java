package com.mayank.jpa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "remarks")
public class Remarks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String remark;

    private Long empId;

//    @JoinColumn(name = "employee_id")
//    @OneToOne
//    private Employees employees;

}
