package com.examenlibro.libro.controllers;

import com.examenlibro.libro.dao.LibroDAO;
import com.examenlibro.libro.models.Libro;

import java.util.List;

public class LibroController implements LibroDAO {
    private LibroDAO libroDAO;

    public List<Libro> getLibros(){
        return libroDAO.getLibros();
    }

    public void registrarLibro(Libro libro){
        libroDAO.registrarLibro(libro);
    }
}
