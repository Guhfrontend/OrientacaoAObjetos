package br.com.udemy.java.application;

import br.com.udemy.java.entites.triangle;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();


        System.out.println("Entre com os numeros do triangulo X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Entre com os numeros do triangulo Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do tringulo X: %.4f%n", areaX);
        System.out.printf("Área do tringulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.printf("Área do tringulo X: %.4f%n", areaX);
        } else {
            System.out.printf("Área do tringulo Y: %.4f%n", areaY);
        }


    }
}
