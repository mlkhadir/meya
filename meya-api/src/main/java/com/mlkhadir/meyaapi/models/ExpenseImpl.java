package com.mlkhadir.meyaapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseImpl extends Expense {
    private MeyaUser paidByUser;
    private Set<MeyaUser> paidForUsers;
}
