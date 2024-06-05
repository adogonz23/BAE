package ies.puerto.mongodb.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import ies.puerto.mongodb.modelo.Coche;

public interface CocheRepositorio extends MongoRepository<Coche,Integer>{
    
}
