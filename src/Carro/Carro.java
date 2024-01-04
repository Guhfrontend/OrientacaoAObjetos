package Carro;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " +capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {


        System.out.println("Metodo obter Autonomia foi chamado. ");

        return capCombustivel * consumoCombustivel;

    }
    double calculaCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return  qtdCombustivel;
    }
}
