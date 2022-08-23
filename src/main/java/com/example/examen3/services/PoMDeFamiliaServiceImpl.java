package com.example.examen3.services;

import com.example.examen3.entities.PoMDeFamilia;
import com.example.examen3.repositories.PoMDeFamiliaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PoMDeFamiliaServiceImpl implements PoMDeFamiliaService{

    @Autowired
    PoMDeFamiliaRepository poMDeFamiliaRepository;

    @Override
    public List<PoMDeFamilia> getAll() {
        return poMDeFamiliaRepository.findAll();
    }

    @Override
    public Optional<PoMDeFamilia> findById(long id) {
        /*return poMDeFamiliaRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());*/
        return poMDeFamiliaRepository.findById(id);
    }

    @Override
    public Optional<PoMDeFamilia> save(PoMDeFamilia poMDeFamilia) {
        return Optional.of(poMDeFamiliaRepository.save(poMDeFamilia));
    }

    @Override
    public Optional<PoMDeFamilia> update(PoMDeFamilia poMDeFamilia) {
        Optional<PoMDeFamilia> record = poMDeFamiliaRepository.findById(poMDeFamilia.getId());
        if (record.isPresent()) {
            PoMDeFamilia data = record.get();
            data.setNombre(poMDeFamilia.getNombre());
            data.setDireccion(poMDeFamilia.getDireccion());
            data.setTelefPrimario(poMDeFamilia.getTelefPrimario());
            data.setTelefSecundario(poMDeFamilia.getTelefSecundario());

            return Optional.of(poMDeFamiliaRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        Optional<PoMDeFamilia> result = poMDeFamiliaRepository.findById(id);
        if (result.isPresent()){
            poMDeFamiliaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
