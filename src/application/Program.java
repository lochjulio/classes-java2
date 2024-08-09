package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Taxa: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + emp);
        System.out.println();
        System.out.println("Qual percentual para aumentar o salario?" );

        double porcentagem = sc.nextDouble();
        emp.increaseSalary(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + emp);

        sc.close();
    }
}
