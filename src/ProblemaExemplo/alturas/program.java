package ProblemaExemplo.alturas;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = scan.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa: ");
            System.out.print("Nome: ");
            scan.nextLine();
            name[i] = scan.nextLine();
            System.out.print("idade: ");
            idade[i] = scan.nextInt();
            System.out.print("Altura: ");
            altura[i] = scan.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }
        double totalSoma = soma / n;
        System.out.printf("Altura média: %.2f %n", totalSoma);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                count++;
            }
        }
        double mediaIdade = (count * 100) / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", mediaIdade);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16){
                System.out.println(name[i]);
            }
        }


    }
}
