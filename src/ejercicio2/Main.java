package ejercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        Principal registro=new Principal();
        while (true){
            //Menu
            System.out.println("Menu");
            System.out.println("1.- Agregar Clientes");
            System.out.println("2.- Mostrar Clientes");
            System.out.println("3.- Salir");
            System.out.println("Seleccione una Opcion:");
            int opcion=scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1){
                for(int i=0;i<3;i++){
                    System.out.println("Ingrese su Cedula: ");
                    String cedula=scanner.nextLine();
                    System.out.println("Ingrese su Nombre: ");
                    String nombre=scanner.nextLine();
                    //Llama ala  funcion para agregar cliente
                    registro.agregarClientes(cedula,nombre);
                }
            }
            else if (opcion==2){
                registro.mostrarClientes();
            }
            if (opcion==3){
                System.out.println("Salir");
            }

        }


    }
}
