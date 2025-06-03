package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int seleccion;
        boolean continuar = true;

//      LocalDate date = LocalDate.now().plusYears(5);

        System.out.println("¡¡Bienvenido a KoraZon, su supermercado de confiaza!!");

        do {
            do {
                limpiarPantalla();
                System.out.println("Seleccione la categoria de producto que quiere introducir:\n" +
                        "1. Bebidas\n" +
                        "2. Cereales\n" +
                        "3. Productos de Limpieza\n" +
                        "4. Salir");
                seleccion = sc.nextInt();
            } while (seleccion > 4);
            switch (seleccion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("BEBIDAS");

                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("CEREALES");

                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("PRODUCTOS DE LIMPIEZA");

                    break;
                default:
                    continuar = false;
                    break;
            }
        }while (continuar);
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
