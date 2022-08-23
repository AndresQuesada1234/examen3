package com.example.examen3.controller;

import com.example.examen3.entities.HijoA;
import com.example.examen3.services.HijosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/HijosA"})
public class HijosController {

    @Autowired(required = false)
    private HijosService hijosService;

    @PostMapping
    public HijoA create(@RequestBody HijoA hijoA){
        return hijosService.save(hijoA).get();
    }

}
