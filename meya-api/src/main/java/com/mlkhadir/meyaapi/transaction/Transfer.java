package com.mlkhadir.meyaapi.transaction;

import com.mlkhadir.meyaapi.models.MeyaUser;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Transfer extends Transaction {
    @ManyToOne
    @JoinColumn(name = "paid_for_user_id")
    private MeyaUser paidForUser;
}

