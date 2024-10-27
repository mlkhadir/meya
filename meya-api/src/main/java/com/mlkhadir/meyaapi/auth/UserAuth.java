package com.mlkhadir.meyaapi.auth;

import com.mlkhadir.meyaapi.models.MeyaUser;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class UserAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String email;
    private String password;

    @OneToOne(mappedBy = "userAuth", cascade = CascadeType.ALL)
    private MeyaUser meyaUser;
}