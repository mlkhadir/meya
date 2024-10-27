package com.mlkhadir.meyaapi.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserAuthRepository extends JpaRepository<UserAuth, String> {
}
