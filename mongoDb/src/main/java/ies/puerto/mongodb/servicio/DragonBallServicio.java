package ies.puerto.mongodb.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ies.puerto.mongodb.modelo.DragonBall;

import ies.puerto.mongodb.repositorio.DragonBallRepositorio;

@Service
public class DragonBallServicio {
    
    private DragonBallRepositorio dragonBallRepositorio;

    @Autowired
    public void setDragonBallRepositorio(DragonBallRepositorio dragonBallRepositorio) {
        this.dragonBallRepositorio = dragonBallRepositorio;
    }

    public List<DragonBall> getAll(){
        return dragonBallRepositorio.findAll();
    }

    public Optional<DragonBall> getById(String nombre){
        return dragonBallRepositorio.findById(nombre);
    }
    public void insertPersonaje(DragonBall personaje){
        dragonBallRepositorio.insert(personaje);
    }
    public void deletePersonaje(String nombre){
        dragonBallRepositorio.deleteById(nombre);
    }
    
}
