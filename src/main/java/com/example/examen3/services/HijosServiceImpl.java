package com.example.examen3.services;

import com.example.examen3.entities.HijoA;
import com.example.examen3.repositories.HijosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HijosServiceImpl implements HijosService{

    @Autowired
    HijosRepository hijosRepository;

    @Override
    public List<HijoA> getAll() {
        return hijosRepository.findAll();
    }

    @Override
    public Optional<HijoA> findById(long id) {
        return hijosRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<HijoA> save(HijoA hijoA) {
        return Optional.of(hijosRepository.save(hijoA));
    }

    @Override
    public Optional<HijoA> update(HijoA hijoA) {
        /*Optional<HijoA> record = hijosRepository.findById(hijoA.getId());
        if(record.isPresent()){
            HijoA data = record.get();
            data.setLect_guard_ambas(hijoA.getLect_guard_ambas());
            data.setAlergias(hijoA.getAlergias());
            data.setPadreId(hijoA.getPadreId());

            return Optional.of(hijosRepository.save(data));
        }
        return Optional.empty();*/
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
