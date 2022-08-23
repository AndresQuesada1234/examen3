package com.example.examen3.controller;

import com.example.examen3.entities.HijoXLibro;
import com.example.examen3.services.HijoXLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/HijosXLibros"})
public class HijosXLibrosController {

    @Autowired(required = false)
    HijoXLibroService hijoXLibroService;

    /*@PostMapping
    public HijoXLibro create(@RequestBody HijoXLibro hijoXLibro){
        return hijoXLibroService.save(hijoXLibro).get();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<HijoXLibro> findById(@PathVariable long id){
        Optional<HijoXLibro> res = hijoXLibroService.findById(id);
        if(res.isPresent()){
            return ResponseEntity.ok().body(res.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

}
