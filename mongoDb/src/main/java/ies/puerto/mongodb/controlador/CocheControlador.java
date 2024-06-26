package ies.puerto.mongodb.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.Origin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ies.puerto.mongodb.modelo.Coche;
import ies.puerto.mongodb.servicio.CocheServicio;

@RestController
@RequestMapping("api/coche")
public class CocheControlador {
    
    private CocheServicio cocheServicio;
    
    @Autowired
    public void setCocheServicio(CocheServicio cocheServicio) {
        this.cocheServicio = cocheServicio;
    }
    
    @PostMapping
    public ResponseEntity addObject(@RequestBody Coche coche){
        cocheServicio.addObject(coche);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Coche>> getAllCoches(){
       return ResponseEntity.ok(cocheServicio.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coche> getObjectById(@RequestParam int id){
        return ResponseEntity.ok(cocheServicio.getObjectByID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@RequestParam int id){
        cocheServicio.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
