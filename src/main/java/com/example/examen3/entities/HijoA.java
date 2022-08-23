package com.example.examen3.entities;

import javax.persistence.*;

@Entity
@Table(name = "Hijos")
public class HijoA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hijo_id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "lect_guard_ambas")
    private String lect_guard_ambas;
    @Column(name = "alergias")
    private String alergias;

    @JoinColumn(name = "padre_id")
    private Long padreId;

    public HijoA(){

    }

    public HijoA(String nombre, String lect_guard_ambas, String alergias, Long padreId) {
        this.nombre = nombre;
        this.lect_guard_ambas = lect_guard_ambas;
        this.alergias = alergias;
        this.padreId = padreId;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLect_guard_ambas() {
        return lect_guard_ambas;
    }

    public Long getPadreId() {
        return padreId;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLect_guard_ambas(String lect_guard_ambas) {
        this.lect_guard_ambas = lect_guard_ambas;
    }

    public void setPadreId(Long padreId) {
        this.padreId = padreId;
    }
}
