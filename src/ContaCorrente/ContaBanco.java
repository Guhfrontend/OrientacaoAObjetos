package ContaCorrente;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaCorrente Conta = new ContaCorrente();


        Conta.nome = "Gustavo Ribero da Silva";
        Conta.agencia = "Itau";
        Conta.especial = true;
        Conta.limite = 500;
        Conta.valorEspecial = 0;
        Conta.saldo = -10;

        boolean saqueEfetuado = Conta.realizarSaque(500);

       if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso");
           Conta.consultarSaldo();
       }else {
           System.out.println("Não foi possivel realizar saque.");
       }

        Conta.depositar(500);
        Conta.consultarSaldo();
        if (Conta.verificarEspecial()){
            System.out.println("Está usando cheque especial");
        }else{
            System.out.println("Não está usando cheque especial");
        }
        Conta.realizarSaque(600);
        Conta.consultarSaldo();
        if (Conta.verificarEspecial()){
            System.out.println("Está usando cheque especial");
        }else{
            System.out.println("Não está usando cheque especial");
        }

    }
}