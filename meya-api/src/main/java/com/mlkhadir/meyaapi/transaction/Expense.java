package com.mlkhadir.meyaapi.transaction;

import com.mlkhadir.meyaapi.models.MeyaUser;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Expense extends Transaction {
    @OneToMany
    private Set<MeyaUser> paidForUsers;
}
