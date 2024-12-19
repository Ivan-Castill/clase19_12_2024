package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuClientes {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            // Menú
            System.out.println("----- Menú -----");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    eliminarCliente();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (opcion != 4);
    }

    private static void agregarCliente() {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su numero de cedula: ");
        String id = scanner.next();
        scanner.nextLine(); // Limpiar el buffer


        Cliente cliente = new Cliente(nombre, id);
        clientes.add(cliente);
        System.out.println("Cliente agregado con éxito.");
    }

    private static void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    private static void eliminarCliente() {
        System.out.print("Ingrese la cedula del cliente a eliminar: ");
        String id = scanner.next();
        boolean encontrado = false;

        for (Cliente cliente : clientes) {
            if (cliente.id == id) {
                clientes.remove(cliente);
                System.out.println("Cliente eliminado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente con ID " + id + " no encontrado.");
        }
    }
}
