package ies.puerto.mongodb.repositorio;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import ies.puerto.mongodb.modelo.Coche;

@Repository
public interface CocheRepositorio extends MongoRepository<Coche,Integer>{
    
}
