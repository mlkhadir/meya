package com.mlkhadir.meyaapi.models;

import com.mlkhadir.meyaapi.auth.UserAuth;
import com.mlkhadir.meyaapi.meya.Meya;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class MeyaUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    @OneToOne
    @JoinColumn(name = "user_auth_id", nullable = false)
    private UserAuth userAuth;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Meya> meya;
}
