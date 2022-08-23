package com.example.examen3.entities;

import javax.persistence.*;

@Entity
@Table(name = "PadresDeFamilia")
public class PoMDeFamilia {

    @Id
    @Column(name = "padre_id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefPrimario")
    private int telefPrimario;
    @Column(name = "telefSecundario")
    private int telefSecundario;

    public PoMDeFamilia(){

    }

    public PoMDeFamilia(Long id, String nombre, String direccion, int telefPrimario, int telefSecundario) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefPrimario = telefPrimario;
        this.telefSecundario = telefSecundario;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefPrimario() {
        return telefPrimario;
    }

    public int getTelefSecundario() {
        return telefSecundario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefPrimario(int telefPrimario) {
        this.telefPrimario = telefPrimario;
    }

    public void setTelefSecundario(int telefSecundario) {
        this.telefSecundario = telefSecundario;
    }
}
