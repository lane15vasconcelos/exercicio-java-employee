package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("GrossSalary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

       System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
         double porcentage = sc.nextDouble();
        employee.increaseSalary(porcentage);

        System.out.println("Updated data: " + employee);


        sc.close();

    }    
    
}

