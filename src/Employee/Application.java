package Employee;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Employee cliente = new Employee();

        cliente.name = "Joao Silva";
        cliente.salary = 6000;
        cliente.tax = 1000;

        System.out.printf(" Name: %s %n Gross salary: %.2f% %n Tax: %.2f% %n ", cliente.name, cliente.salary, cliente.tax);

        System.out.printf("Employee: %s, $ %.2f% %n" , cliente.name, cliente.netSalary());
        System.out.println("Widht porcentagem to increase salary? ");
        cliente.porcentage = scan.nextDouble();

        System.out.printf("Updade data: Joao Silva, $ %.2f%", cliente.increaseSalary());


    }
}
