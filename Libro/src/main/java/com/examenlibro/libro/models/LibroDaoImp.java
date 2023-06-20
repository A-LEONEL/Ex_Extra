package com.examenlibro.libro.models;

import com.examenlibro.libro.dao.LibroDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LibroDaoImp implements LibroDAO {

    @PersistenceContext
    EntityManager entityManager;

    /**
     * retorna toda la lista de elementos de la entidad Libro
     * @return
     */
    public List<Libro> getLibros(){
        String query = "FROM Libro";
        return entityManager.createQuery(query).getResultList();
    }

    /**
     * Guarda un nuevo libro
     * @param libro
     */
    public void registrarLibro(Libro libro){entityManager.merge(libro);}
}
