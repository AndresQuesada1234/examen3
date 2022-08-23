package com.example.examen3.entities;

import javax.persistence.*;

@Entity
@Table(name = "HijosXLibros")
public class HijoXLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HxLId")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hijo_id")
    private HijoA id_hijo;
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "libro_id")
    private Libro id_libro;*/

    /*public HijoXLibro(HijoA id_hijo, Libro id_libro) {
        this.id_hijo = id_hijo;
        this.id_libro = id_libro;
    }*/

    /*public HijoXLibro() {

    }

    public Long getId() {
        return id;
    }

    public HijoA getId_hijo() {
        return id_hijo;
    }

    public Libro getId_libro() {
        return id_libro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_hijo(HijoA id_hijo) {
        this.id_hijo = id_hijo;
    }

    public void setId_libro(Libro id_libro) {
        this.id_libro = id_libro;
    }*/
}
