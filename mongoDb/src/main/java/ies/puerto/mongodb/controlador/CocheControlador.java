package ies.puerto.mongodb.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ies.puerto.mongodb.modelo.Coche;
import ies.puerto.mongodb.servicio.CocheServicio;

@RestController
@RequestMapping("/api/coche")
public class CocheControlador {
    private CocheServicio cocheServicio;

    public void setCocheServicio(CocheServicio cocheServicio) {
        this.cocheServicio = cocheServicio;
    }
    @PostMapping
    public ResponseEntity addObject(@RequestBody Coche coche){
        cocheServicio.addObject(coche);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public void updateObject(){}
    
    @GetMapping
    public ResponseEntity<List<Coche>> getAll(){
       return ResponseEntity.ok(cocheServicio.getAll());
    }

    public void getObjectById(){}

    public void delete(){}

    

}
