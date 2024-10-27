package com.mlkhadir.meyaapi.meya;

import com.mlkhadir.meyaapi.models.MeyaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.UUID;

@Repository
public interface MeyaRepository extends JpaRepository<Meya, UUID> {

    @Query("SELECT m FROM Meya m JOIN m.members mem WHERE mem = :member")
    Set<Meya> findMeyaByMember(@Param("member") MeyaUser member);
}
