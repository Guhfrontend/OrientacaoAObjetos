package ProblemaExemplo;

import java.util.Scanner;

public class Application {

    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2*PI* radius;
    }

    public static double volume(double radius){
        return 4*PI* radius * radius * radius/ 3.0;
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("Circumference: %.2f%n", PI);
    }

}
