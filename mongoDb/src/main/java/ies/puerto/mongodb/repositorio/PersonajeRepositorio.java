package ies.puerto.mongodb.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ies.puerto.mongodb.modelo.Personaje;

@Repository
public interface PersonajeRepositorio extends MongoRepository <Personaje, String>{
    
}
