package ies.puerto.modelo;
import com.mongodb.*;
import com.mongodb.client.MongoClient;
public class Conexion {
    public String url;
    MongoClient mongodb; 
    public void setUrl(String url) {
        this.url = "mongodb+srv://adogonzalez75:DclQ2FTFmJM8PSwu@cluesteradonay.sm29gce.mongodb.net/?retryWrites=true&w=majority&appName=cluesterAdonay";
        
    }
     
     
}
