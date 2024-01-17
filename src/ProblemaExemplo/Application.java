package ProblemaExemplo;

import ProblemaExemplo.util.calculator;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();

        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("Circumference: %.2f%n", calculator.PI);
    }

}
