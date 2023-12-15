// Práctica 04 -- Ej02 -- //
// @author  Cristhian Abel Aguilar González //

import java.util.Scanner;

public class Sueldo {
    private Scanner scanner;
    private int[] sueldos;

    // Constructor//
    public Sueldo() {
        scanner = new Scanner(System.in);
        sueldos = new int[5];
    }

    private void capturar() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el -Sueldo- " + (i + 1) + "->> ");
            sueldos[i] = scanner.nextInt();

        }
    }

    private void imprimir() {
        for (int i = 0; i < 5; i++) {
            System.out.println("------------------------------------------");
            System.out.println("-Sueldo- ingresado en la posición " + (i + 1) + "->> " + sueldos[i]);
        }
    }

    public static void main(String[] args) {
        Sueldo sueldo = new Sueldo();
        sueldo.capturar();
        sueldo.imprimir();
        System.out.println("------------------------------------------");
        System.out.println("Fin del programa");
    }
}
