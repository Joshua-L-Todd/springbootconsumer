package com.learning.consumer.springconsumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Organization {

    private String company_name;
    private int year_of_inc;
    private int postal_code;
    private int employee_count;
    private String slogan;
}
