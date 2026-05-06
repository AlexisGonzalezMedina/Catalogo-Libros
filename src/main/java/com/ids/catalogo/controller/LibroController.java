package com.ids.catalogo.controller;

import com.ids.catalogo.model.Libro;
import com.ids.catalogo.service.LibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listar(){
        return libroService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> getById(@PathVariable Long id) {
        return ResponseEntity.ok(libroService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Libro> create(@Valid @RequestBody Libro libro){
        return new ResponseEntity<>(libroService.create(libro), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> update(@PathVariable Long id, @Valid @RequestBody Libro libro){
        return ResponseEntity.ok(libroService.update(id, libro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        libroService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/autor")
    public List<Libro> searchByAutor(@RequestParam String nombre) {
        return libroService.searchByAutor(nombre);
    }

    @GetMapping("/genero")
    public List<Libro> searchByGenero(@RequestParam String genero) {
        return libroService.searchByGenero(genero);
    }



}
