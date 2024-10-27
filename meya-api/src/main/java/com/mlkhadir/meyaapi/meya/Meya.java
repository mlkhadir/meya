package com.mlkhadir.meyaapi.meya;

import com.mlkhadir.meyaapi.models.MeyaUser;
import com.mlkhadir.meyaapi.transaction.Transaction;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class Meya {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String description;
    private LocalDate createdAt;
    @ManyToMany(mappedBy = "meya", cascade = CascadeType.ALL)
    private Set<MeyaUser> members;
    @OneToMany(mappedBy = "meya", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Transaction> transactions;
}
