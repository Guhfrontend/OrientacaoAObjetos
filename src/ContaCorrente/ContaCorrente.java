package ContaCorrente;

public class ContaCorrente {

    String nome;
    String agencia;
    double saldo;
    boolean especial;
    double valorEspecial;
    double limite;


    boolean realizarSaque(double quantiaSacar) {
        if (saldo >= 0) {
            saldo -= quantiaSacar;
            return true;
        } else {
            if (especial) {
                    double limiteCheque = limite + saldo;
                    if (limiteCheque >= quantiaSacar) {
                        saldo -= quantiaSacar;
                        return true;
                    } else {
                        return false;
                    }
            } else {
                return false;
            }
        }
    }
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    void consultarSaldo(){
       System.out.println("Saldo atual da conta = " + saldo);
    }
    boolean verificarEspecial(){
        return saldo < 0;
        }


}
