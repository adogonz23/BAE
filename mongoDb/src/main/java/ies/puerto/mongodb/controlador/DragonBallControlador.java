package ies.puerto.mongodb.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ies.puerto.mongodb.modelo.DragonBall;

import ies.puerto.mongodb.servicio.DragonBallServicio;

@RestController
@RequestMapping("api/dragonball")
public class DragonBallControlador {
    
    private DragonBallServicio dragonBallServicio;

    @Autowired
    public void setDragonBallServicio(DragonBallServicio dragonBallServicio) {
        this.dragonBallServicio = dragonBallServicio;
    }


    @GetMapping("/")
    public ResponseEntity<List<DragonBall>> getAll() {
        return ResponseEntity.ok(dragonBallServicio.getAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity getById(@RequestParam String nombre) {
        return  ResponseEntity.ok(dragonBallServicio.getById(nombre));
    }

    @PostMapping
    public ResponseEntity addPersonaje(@RequestBody DragonBall personaje) {
        dragonBallServicio.insertPersonaje(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletePersonaje(@RequestParam String nombre){
        dragonBallServicio.deletePersonaje(nombre);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    
}
