package Carro;

public class Carro {


    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public Carro( ) { }

    public Carro(String marca,String modelo, int numPassageiros,double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }


    public void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " +capCombustivel * consumoCombustivel + " km");
    }

    public double obterAutonomia() {


        System.out.println("Metodo obter Autonomia foi chamado. ");

        return capCombustivel * consumoCombustivel;

    }

    private double divideKmproConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
    public double calculaCombustivel(double km){
        return this.divideKmproConsumoCombustivel(km);
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }
}
