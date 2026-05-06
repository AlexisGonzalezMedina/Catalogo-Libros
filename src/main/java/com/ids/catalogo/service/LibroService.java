package com.ids.catalogo.service;

import com.ids.catalogo.model.Libro;
import com.ids.catalogo.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getAll(){
        return libroRepository.findAll();
    }

    public Libro getById(Long id){
        return libroRepository.findById(id)
                .orElseThrow(()-> new NoSuchElementException("Libro con ID: " + id + " no encontrado"));
    }

    public Libro create(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro update(Long id, Libro detallesLibro){
        Libro libro = getById(id);
        libro.setTitulo(detallesLibro.getTitulo());
        libro.setAutor(detallesLibro.getAutor());
        libro.setIsbn(detallesLibro.getIsbn());
        libro.setGenero(detallesLibro.getGenero());
        libro.setAnoPublicacion(detallesLibro.getAnoPublicacion());
        libro.setDisponible(detallesLibro.getDisponible());
        return libroRepository.save(libro);
    }

    public void delete(Long id){
        Libro libro = getById(id);
        libroRepository.delete(libro);
    }

    public List<Libro> searchByAutor(String autor){
        return libroRepository.findByAutorContainingIgnoreCase(autor);
    }

    public List<Libro> searchByGenero(String genero){
        return libroRepository.findByGeneroIgnoreCase(genero);
    }

}
