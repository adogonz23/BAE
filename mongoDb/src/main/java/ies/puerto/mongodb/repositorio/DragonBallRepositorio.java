package ies.puerto.mongodb.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import ies.puerto.mongodb.modelo.DragonBall;

public interface DragonBallRepositorio extends MongoRepository<DragonBall, String>{
    
}
