package ProblemaExemplo.NewProblem;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Dolar calc = new Dolar();

        System.out.println("What is the dollar price: ");
        calc.dolar = scan.nextDouble();

        System.out.println("How many dollars will be bought: ");
        calc.convertion = scan.nextDouble();

        System.out.println("Amount to be paid in reais = " + calc.CurrencyConverter());
    }
}
