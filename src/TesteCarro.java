public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();

        System.out.println("A autonomia do carro é:  " + autonomia);

        double qtdConbustivel10 = van.calculaCombustivel(10);
        double qtdConbustivel15 = van.calculaCombustivel(15);

        System.out.println("Calculo de combustível: " + qtdConbustivel10);
        System.out.println("Calculo de combustível: " + qtdConbustivel15);

    }
}
