package com.example.examen3.repositories;

import com.example.examen3.entities.HijoXLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HijoXLibroRepository extends JpaRepository<HijoXLibro, Long> {
}
