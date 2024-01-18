package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        rent[] vect = new rent[10];

        System.out.print("Quantos alunos vão alugar os quartos: ");
        int n = scan.nextInt();

        for (int i = 1;i <= n;i++){
            System.out.println("Rent #"+ i);
            System.out.print("Nome: ");
            scan.next();
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String emails = scan.nextLine();
            System.out.print("Quarto: ");
            int quartos = scan.nextInt();

            vect[quartos] = new rent(nome, emails);
        }
        for (int i = 0; i< 10 ; i++){
            if (vect[i] != null){
                System.out.println(vect[i]);
            }
        }
    }
}
