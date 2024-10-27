package com.mlkhadir.meyaapi.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Meya {
    @Id
    private String id;
    private String name;
    private String description;
    private Date createdAt;
    @OneToMany(mappedBy = "meya", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MeyaUser> members;
    @OneToMany(mappedBy = "meya", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Expense> expenses;
}
