package com.madeeasy.week5.junit.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    // Has-A Relationship
    private Address address;
}
