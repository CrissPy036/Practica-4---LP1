// Práctica 04 -- Ej01 -- Invocar varios métodos //
// @author  Cristhian Abel Aguilar González //

import java.util.Scanner;

public class Persona {
    private Scanner scanner;
    private String nombre;
    private int edad;

    public void inicializar() {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Digita la edad: ");
        edad = scanner.nextInt();
    }

    public void imprimir() {
        System.out.println("Nombre ingresado ->> " + nombre);
        System.out.println("Edad digitada ->> " + edad);
    }

    public void buscarMayor() {
        if (edad >= 18) {
            System.out.println(nombre + " ->> es MAYOR de Edad.");
        } else {
            System.out.println(nombre + " ->> es MENOR de Edad.");
        }
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.inicializar();
        persona.imprimir();
        persona.buscarMayor();
    }
}