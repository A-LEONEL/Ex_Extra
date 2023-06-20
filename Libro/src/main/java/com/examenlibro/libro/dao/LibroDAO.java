package com.examenlibro.libro.dao;

import com.examenlibro.libro.models.Libro;

import java.util.List;

public interface LibroDAO {
    //método que retorna los libros de la BD
    List<Libro> getLibros();

    //método que permite registrar un nuevo libro
    void registrarLibro(Libro libro);
}
