package com.example.examen3.services;

import com.example.examen3.entities.HijoXLibro;
import com.example.examen3.repositories.HijoXLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HijoXLibroServiceImpl implements HijoXLibroService{

    @Autowired
    HijoXLibroRepository hijoXLibroRepository;

    @Override
    public Optional<HijoXLibro> findById(long id) {
        return hijoXLibroRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<HijoXLibro> save(HijoXLibro hijoXLibro) {
        return Optional.of(hijoXLibroRepository.save(hijoXLibro));
    }
}
