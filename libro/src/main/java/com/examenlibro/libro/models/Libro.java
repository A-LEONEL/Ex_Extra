package com.examenlibro.libro.models;

import javax.persistence.*;

@Entity
@Table(name = "")

public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "")// como se llama la columna en la BD
    private String ISBN;

    private String Titulo;

    private int NoPag;

    private String Portada;

    private String Editorial;

    private String Autores;

    public Libro(String ISBN, String Titulo, int NoPag, String Portada, String Editorial,
    String Autores){
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.NoPag = NoPag;
        this.Portada = Portada;
        this.Editorial = Editorial;
        this.Autores = Autores;
    }

}
