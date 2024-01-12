package Employee;

public class Employee {

    public String name;
    public double salary;
    public double tax;
    public double porcentage;

   public double netSalary(){
       return salary-tax;
   }
   public double increaseSalary(){
       return netSalary()+((salary*porcentage)/100);
   }
}
