package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity

public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zipCode;

    public Address(String name, String street, String zipCode) {
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
    }

    @ManyToOne
   private Customer customer;
}
