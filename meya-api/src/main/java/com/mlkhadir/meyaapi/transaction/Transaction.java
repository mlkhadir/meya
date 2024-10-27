package com.mlkhadir.meyaapi.transaction;

import com.mlkhadir.meyaapi.meya.Meya;
import com.mlkhadir.meyaapi.models.MeyaUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String description;
    private Date createdAt;
    private Double amount;
    private String currency;
    @ManyToOne
    @JoinColumn(name = "paid_by_user_id")
    private MeyaUser paidByUser;
    @ManyToOne
    @JoinColumn(name = "meya_id")
    private Meya meya;
}
