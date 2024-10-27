package com.mlkhadir.meyaapi.repository;

import com.mlkhadir.meyaapi.models.Meya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeyaRepository extends JpaRepository<Meya, String> {
}
