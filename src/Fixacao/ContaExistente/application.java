package Fixacao.ContaExistente;

import Fixacao.ContaExistente.User;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        User user = new User();

        user.name = "Alex Green";
        user.numberCount = 8532;
        user.depositIn = true;


        for (int i = 5; i > 0; i--) {
            System.out.println("Enter account number: ");
            int account = scan.nextInt();
            if (user.numberCount != account) {
                System.out.printf("Errado, você tem mais %d tentativas.%n", i);
                if (i == 1) {
                    System.out.println("conta bloqueada");
                    return;
                }
            } else if (user.numberCount == account) {
                i = 0;
            }
        }
        System.out.println("Enter account name: ");

        System.out.println("Enter account number: ");
        System.out.println("Enter account number: ");


    }
}
