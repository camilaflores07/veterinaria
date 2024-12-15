/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;




import java.util.Scanner;

public class Perro {
    static int totalAtendidos = 0;
    static int banos = 0;
    static int grooming = 0;
    static int serviciosMedicos = 0;

    public static void MostrarMenuServicios(Scanner entrada) {
        totalAtendidos++;
        System.out.println("\n");
        System.out.println("Seleccione la raza de perro:");
        System.out.println("1. Terrier");
        System.out.println("2. Pug");
        System.out.println("3. Poodle");
        System.out.print("Ingrese su opcion: ");
        int razaPerro = entrada.nextInt();

        String raza = switch (razaPerro) {
            case 1 -> "Terrier";
            case 2 -> "Pug";
            case 3 -> "Poodle";
            default -> {
                System.out.println("Raza no valida.");
                yield "Desconocida";
            }
        };

        mostrarServicios(entrada, raza);
    }

    public static void mostrarServicios(Scanner entrada, String raza) {
        System.out.println("\n");
        System.out.println("Seleccione el servicio:");
        System.out.println("1. Bano (Lps.200.0)");
        System.out.println("2. Grooming (Lps.135.0)");
        System.out.println("3. Servicio Medico (Lps.550.0)");
        System.out.print("Ingrese su opción: ");
        
        int servicio = entrada.nextInt();

        double precio = CalcularPrecio(servicio);

        if (precio > 0) {
            switch (servicio) {
                case 1 -> banos++;
                case 2 -> grooming++;
                case 3 -> serviciosMedicos++;
            }
            System.out.println("\n");
            System.out.println("Ha seleccionado el servicio para un perro raza " + raza + ".");
            System.out.println("El costo del servicio es: " + precio);
            System.out.println("\n");
        }
    }

    public static double CalcularPrecio(int servicio) {
        return switch (servicio) {
            case 1 -> 200.0;
            case 2 -> 135.0;
            case 3 -> 550.0;
            default -> {
                System.out.println("Servicio no valido.");
                yield 0.0;
            }
        };
    }
}
