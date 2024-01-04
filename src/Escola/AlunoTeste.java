package Escola;

public class AlunoTeste {
    public static void main(String[] args) {

         Aluno Aluno = new Aluno();

         Aluno.aluno = "Gustavo Ribeiro da Silva";
         Aluno.matricula = 1234;
         Aluno.Curso = "ánalise e Desenvolvimento de Sistemas";
         Aluno.disciplina[0] = 8;
         Aluno.disciplina[1] = 6;
         Aluno.disciplina[2] = 7;
        Aluno.nomeDisciplinas[0] = "Estatistica";
        Aluno.nomeDisciplinas[1] = "Gestão";
        Aluno.nomeDisciplinas[2] = "Linguagem";

        System.out.println( Aluno.nomeDisciplinas[3].length());


    }
}
