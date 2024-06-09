package ies.puerto.mongodb.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("dragonBall")
public class DragonBall {
    
    @Id
    @Field(name = "nombre")
    private String  nombre;

    List<String> poderes;
    List<String> transformaciones;
    String raza;
    
    public DragonBall() {
    }
    public DragonBall(String nombre) {
        this.nombre = nombre;
    }
    public DragonBall(String nombre, List<String> poderes, List<String> transformaciones, String raza) {
        this.nombre = nombre;
        this.poderes = poderes;
        this.transformaciones = transformaciones;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<String> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }
    public List<String> getTransformaciones() {
        return transformaciones;
    }
    public void setTransformaciones(List<String> transformaciones) {
        this.transformaciones = transformaciones;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DragonBall other = (DragonBall) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "DragonBall [nombre=" + nombre + ", poderes=" + poderes + ", transformaciones=" + transformaciones
                + ", raza=" + raza + "]";
    }
    
}
