package com.example.examen3.services;

import com.example.examen3.entities.HijoA;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface HijosService {

    public List<HijoA> getAll();
    public Optional<HijoA> findById(long id);
    public Optional<HijoA> save(HijoA hijoA);
    public Optional<HijoA> update(HijoA hijoA);

    public boolean delete(Long id);
}
