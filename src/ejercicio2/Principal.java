package ejercicio2;

public class Principal {

    String[] cedula=new String[3];
    String[] nombre=new String[3];
    int totalingresos=0;

    public void agregarClientes(String cedula,String nombre){

        if(totalingresos<3){
            this.cedula[totalingresos]=cedula;
            this.nombre[totalingresos]=nombre;
            totalingresos++;
            System.out.println("ClIENTE AGREGADO");
        }else {
            System.out.println("NO SE PUEDE AGREGAR MAS INFORMACION");
        }

    }

    public void mostrarClientes(){

        if (totalingresos==0){
            System.out.println("NO HAY MAS CLIENTES");
        }else {
            for(int i=0;i<totalingresos;i++){
                System.out.println("Cedula: "+cedula[i]+"\n Nombre: "+nombre[i]);
            }
        }

    }

}
