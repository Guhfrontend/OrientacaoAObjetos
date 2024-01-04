package Lampada;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    int preco;
    String[] tipos;

    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lampada está ligada!");
        } else
            System.out.println("Lampada está Desligada!");
    }
    void mudarEstado(){
        if (ligada){
            desligar();
        }else {
            ligar();
        }
    }


}
