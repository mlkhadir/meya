package com.mlkhadir.meyaapi.auth;

import com.mlkhadir.meyaapi.auth.dto.AuthReponse;
import com.mlkhadir.meyaapi.auth.dto.LoginRequest;
import com.mlkhadir.meyaapi.auth.dto.SignUpRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/auth/")
public class UserAuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public AuthReponse login(@RequestBody LoginRequest loginRequest) {
        return null;
    }

    @PostMapping("/signup")
    public AuthReponse login(@RequestBody SignUpRequest signUpRequest) {
        return null;
    }
}
