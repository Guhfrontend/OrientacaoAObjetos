
package Fixacao.Example1;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter account number:");
        int number = scan.nextInt();

        System.out.println("Enter account Holder: ");
        scan.nextLine();
        String holder = scan.nextLine();

        System.out.println("Is there an initial deposit (y/n)?");
        char response = scan.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }
        account.toString();

        System.out.println("Enter a deposit value: ");
        double depositValue = scan.nextDouble();
        account.deposit(depositValue);

        account.toString();

        System.out.println("Enter a deposit value: ");
        double withdrawValue = scan.nextDouble();
        account.withdraw(withdrawValue);

        account.toString();
    }
}
