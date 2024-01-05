package Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro("Fiat","Ducato",10,100,0.2);
        /*van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;*/

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);


        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();

        van.exibirAutonomia();

        double qtdConbustivel10 = van.calculaCombustivel(10);
        double qtdConbustivel15 = van.calculaCombustivel(15);

        System.out.println("Calculo de combustível: " + qtdConbustivel10);
        System.out.println("Calculo de combustível: " + qtdConbustivel15);

        System.out.println(van.numPassageiros);
    }
}
