package com.mlkhadir.meyaapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transfer extends Expense {
    private MeyaUser paidByUser;
    private MeyaUser paidForUser;
}

