package ies.puerto.mongodb.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ies.puerto.mongodb.modelo.Coche;
import ies.puerto.mongodb.repositorio.CocheRepositorio;

@Service
public class CocheServicio {

    private CocheRepositorio cocheRepositorio;

    @Autowired
    public void setCocheRepositorio(CocheRepositorio cocheRepositorio) {
        this.cocheRepositorio = cocheRepositorio;
    }

    public void addObject(Coche coche){
        cocheRepositorio.insert(coche);
    }

    public List<Coche> getAll(){
         return cocheRepositorio.findAll();
    }

    public Coche getObjectByID(int id){
        Coche cocheBuscado = cocheRepositorio.findById(id).orElseThrow(() ->new RuntimeException("aaaa")) ;
        
        return cocheBuscado;

    }
    public void delete(int id){
        cocheRepositorio.deleteById(id);
    }

}
