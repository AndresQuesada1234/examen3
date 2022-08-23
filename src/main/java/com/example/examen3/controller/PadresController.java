package com.example.examen3.controller;

import com.example.examen3.entities.PoMDeFamilia;
import com.example.examen3.services.PoMDeFamiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/PoMDeFamilia"})
public class PadresController {

    @Autowired(required = false)
    private PoMDeFamiliaService poMDeFamiliaService;

    @GetMapping
    public List getAll(){
        return poMDeFamiliaService.getAll();
    }

    @PostMapping
    public PoMDeFamilia create(@RequestBody PoMDeFamilia poMDeFamilia){
        return poMDeFamiliaService.save(poMDeFamilia).get();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PoMDeFamilia> update(@PathVariable("id") long id, @RequestBody PoMDeFamilia poMDeFamilia){
        poMDeFamilia.setId(id);
        Optional<PoMDeFamilia> res = poMDeFamiliaService.update(poMDeFamilia);
        if(res.isPresent()){
            return ResponseEntity.ok().body(res.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping( path = {"/{id}"})
    public ResponseEntity<PoMDeFamilia> findById(@PathVariable long id){
        Optional<PoMDeFamilia> res = poMDeFamiliaService.findById(id);
        if(res.isPresent()){
            return ResponseEntity.ok().body(res.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
