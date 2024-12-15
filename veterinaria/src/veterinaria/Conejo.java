/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author 50494
 */
import java.util.Scanner;

public class Conejo {
    static int totalAtendidos = 0;
    static int banos = 0;
    static int grooming = 0;
    static int serviciosMedicos = 0;

    public static void MostrarMenuServicios(Scanner entrada) {
        totalAtendidos++;
        MostrarServicios(entrada);
    }

    public static void MostrarServicios(Scanner entrada) {
         System.out.println("\n");
        System.out.println("Seleccione el servicio:");
        System.out.println("1. Bano (Lps.150.0)");
        System.out.println("2. Grooming (Lps.300.0)");
        System.out.println("3. Servicio Medico (Lps.40.0)");
        System.out.print("Ingrese su opción: ");
        int servicio = entrada.nextInt();

        double precio = calcularPrecio(servicio);

        if (precio > 0) {
            switch (servicio) {
                case 1 -> banos++;
                case 2 -> grooming++;
                case 3 -> serviciosMedicos++;
            }
            System.out.println("Ha seleccionado el servicio para un conejo.");
            System.out.println("El costo del servicio es: " + precio);
        }
    }

    public static double calcularPrecio(int servicio) {
        return switch (servicio) {
            case 1 -> 150.0;
            case 2 -> 300.0;
            case 3 -> 40.0;
            default -> {
                System.out.println("Servicio no valido.");
                yield 0.0;
            }
        };
    }
}
