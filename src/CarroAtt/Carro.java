package CarroAtt;

public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

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
    public double getCapCombustivel(){
        return this.capCombustivel;
    }
    public void setCapCombustivel(int capCombustivel){
        this.capCombustivel = capCombustivel;
    }
}
