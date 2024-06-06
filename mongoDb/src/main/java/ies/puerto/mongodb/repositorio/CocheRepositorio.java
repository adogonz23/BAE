package ies.puerto.mongodb.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ies.puerto.mongodb.modelo.Coche;
@Repository("CocheRepositorio")
public interface CocheRepositorio extends MongoRepository<Coche,Integer>{
    
}
