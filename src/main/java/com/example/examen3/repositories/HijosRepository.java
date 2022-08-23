package com.example.examen3.repositories;

import com.example.examen3.entities.HijoA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HijosRepository extends JpaRepository<HijoA, Long> {
}
