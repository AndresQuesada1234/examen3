package com.example.examen3.repositories;

import com.example.examen3.entities.PoMDeFamilia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoMDeFamiliaRepository extends JpaRepository<PoMDeFamilia, Long> {
}
