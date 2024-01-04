package Escola;

public class Aluno {

    String aluno;
    int matricula;
    String Curso;
    double[] disciplina = new double[3];
    String[] nomeDisciplinas = new String[3];


    void aprovacaoAluno(boolean aprovacaoAluno){
       double calculo = (disciplina[0]+disciplina[1]+disciplina[2])/3;
       if (calculo >= 7){
           System.out.println("Aprovado");
       } else if (calculo < 7){
           System.out.println("Reprovado");
       }
    }
}
