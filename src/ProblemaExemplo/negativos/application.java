package ProblemaExemplo.negativos;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scan.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i< n; i++){
            System.out.println("Digite um numero: ");
            vet[i] = scan.nextInt();

        }
        System.out.println("Numeros negativos: ");
        for (int i = 0; i< vet.length; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }


    }
}
