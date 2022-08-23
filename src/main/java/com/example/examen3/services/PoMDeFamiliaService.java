package com.example.examen3.services;

import com.example.examen3.entities.PoMDeFamilia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PoMDeFamiliaService {
    public List<PoMDeFamilia> getAll();
    @Query(value = "SELECT p.padre_id, " +
            " p.nombre, " +
            " p.direccion, " +
            " p.telefPrimario, " +
            " p.telefSecundario, " +
            " h.nombre FROM PadresDeFamilia as p inner join Hijos as h on p.padre_id = h.padre_id " +
            " where p.padre_id = :id", nativeQuery=true)
    public Optional<PoMDeFamilia> findById(long id);
    public Optional<PoMDeFamilia> save(PoMDeFamilia poMDeFamilia);
    public Optional<PoMDeFamilia> update(PoMDeFamilia poMDeFamilia);

    public boolean delete(Long id);
}
