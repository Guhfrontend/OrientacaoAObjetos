package Employee;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Employee cliente = new Employee();

        cliente.name = "Joao Silva";
        cliente.salary = 6000;
        cliente.tax = 1000;
        System.out.printf(" Name: %s %n Gross salary: %f %n Tax: %f %n ", cliente.name, cliente.salary, cliente.tax);

        System.out.printf("Employee: %s, $ %f %n" , cliente.name, cliente.netSalary());
        System.out.println("Widht porcentagem to increase salary? ");
        cliente.porcentage = scan.nextDouble();

        System.out.printf("Updade data: Joao Silva, $ %f", cliente.increaseSalary());


    }
}
