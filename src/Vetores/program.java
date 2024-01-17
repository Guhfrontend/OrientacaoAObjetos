package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        products[] vect = new products[n];

        for (int i = 0; i < vect.length; i++){
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new products(name, price);
        }
        double soma = 0;
        for (int i=0; i<vect.length; i++){
            soma += vect[i].getPrice();
        }
        double avg = soma / vect.length;
        System.out.printf("%.2f", avg);
    }
}
