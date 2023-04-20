package com.cydeo.entity;

import com.cydeo.enums.CartStatus;
import com.cydeo.enums.DiscountType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartStatus cartStatus;

    @ManyToOne
    private Customer customer;

     @ManyToOne
    private Discount discount;
}
