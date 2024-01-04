package Livro;

import java.util.Date;

public class Livro {

    public static void main(String[] args) {

        LivroDeLivraria livro = new LivroDeLivraria();

        livro.nome = "Percy Jackson";
        livro.autor = "Gustavo Ribeiro";
        livro.volume = 2;
        livro.preco = 25.70;
        livro.paginas = 325;

        livro.emprestado = true;
        livro.dataEntrega = new Date(20/11/2021);
        livro.nomeEmprestimo = "Gustavo Ribeiro";





    }


}
