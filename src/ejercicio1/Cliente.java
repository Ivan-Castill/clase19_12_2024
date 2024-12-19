package ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class Cliente {
    String nombre;
    String id;
    public Cliente(String nombre,String id){
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre+"\n Cedula: " + id ;
    }
}

