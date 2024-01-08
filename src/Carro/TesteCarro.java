package Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat","Ducato",10,100,0.2);
        /*van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;*/

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.numPassageiros);
        System.out.println(carro.capCombustivel);
        System.out.println(carro.consumoCombustivel);


        carro.exibirAutonomia();

       double autonomia = carro.obterAutonomia();

        carro.exibirAutonomia();

        double qtdConbustivel10 = carro.calculaCombustivel(10);
        double qtdConbustivel15 = carro.calculaCombustivel(15);

        System.out.println("Calculo de combustível: " + qtdConbustivel10);
        System.out.println("Calculo de combustível: " + qtdConbustivel15);

        System.out.println(carro.numPassageiros);


    }
}
