package com.mlkhadir.meyaapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Expense {
    private String id;
    private String description;
    private Date createdAt;
    private Double amount;
}
