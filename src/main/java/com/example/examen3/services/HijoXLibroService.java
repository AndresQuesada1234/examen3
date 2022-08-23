package com.example.examen3.services;

import com.example.examen3.entities.HijoXLibro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface HijoXLibroService {
    @Query()
    public Optional<HijoXLibro> findById(long id);
    public Optional<HijoXLibro> save(HijoXLibro hijoXLibro);
}
