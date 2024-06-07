package ies.puerto.mongodb.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ies.puerto.mongodb.modelo.Personaje;
import ies.puerto.mongodb.repositorio.PersonajeRepositorio;
@Service
public class PersonajeServicio {
    private PersonajeRepositorio personajeRepositorio;

    @Autowired
    public void setPersonajeRepositorio(PersonajeRepositorio personajeRepositorio) {
        this.personajeRepositorio = personajeRepositorio;
    }

    public List<Personaje> getAll(){
        return personajeRepositorio.findAll();
    }

    public Optional<Personaje> getById(String nombre){
        return personajeRepositorio.findById(nombre);
    }
    public void insertPersonaje(Personaje personaje){
        personajeRepositorio.insert(personaje);
    }
    public void deletePersonaje(String nombre){
        personajeRepositorio.deleteById(nombre);
    }
}
