package Ejercicio_15;

import java.util.Scanner;

public class main_Peso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera D: ");
        double pesoD = scanner.nextDouble();

        Peso peso = new Peso(pesoA, pesoB, pesoC, pesoD);
        String resultado = peso.determinarEsferaDiferente();

        System.out.println(resultado);
    }
}
