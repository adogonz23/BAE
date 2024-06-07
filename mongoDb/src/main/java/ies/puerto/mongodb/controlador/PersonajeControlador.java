package ies.puerto.mongodb.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ies.puerto.mongodb.modelo.Personaje;
import ies.puerto.mongodb.servicio.PersonajeServicio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/personajes")
public class PersonajeControlador {
    
    private PersonajeServicio personajeServicio;

    @Autowired
    public void setPersonajeServicio(PersonajeServicio personajeServicio) {
        this.personajeServicio = personajeServicio;
    }


    @GetMapping("/")
    public ResponseEntity<List<Personaje>> getAll() {
        return ResponseEntity.ok(personajeServicio.getAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity getByName(@RequestParam String nombre) {
        return  ResponseEntity.ok(personajeServicio.getById(nombre));
    }

    @PostMapping
    public ResponseEntity addPersonaje(@RequestBody Personaje personaje) {
        personajeServicio.insertPersonaje(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletePersonaje(@RequestParam String nombre){
        personajeServicio.deletePersonaje(nombre);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    
}
