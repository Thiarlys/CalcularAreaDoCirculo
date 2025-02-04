package Exercicios_Secao4;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        // Calcular a area de um círculo sendo a formula area = pi . raio²
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio;
        double area;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = pi *Math.pow(raio, 2);
        System.out.println("A area do circulo é "+area);

    }
}
