package School;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        result aluno = new result();

        aluno.name = "Alex green";

        aluno.porcentageTeste();
        aluno.note1 = scan.nextDouble();

        aluno.porcentageTeste();
        aluno.note2 = scan.nextDouble();

        aluno.porcentageTeste();
        aluno.note3 = scan.nextDouble();

        double result = aluno.note1 + aluno.note2 + aluno.note3;

        if (result >= 60){
            System.out.println("Pass");
        } else {
        System.out.println("Failed");
        }
    }
}
