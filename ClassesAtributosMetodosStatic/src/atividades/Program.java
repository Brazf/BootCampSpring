package atividades;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.println("Digite o nome do funcionário:");
		funcionario.name = scan.nextLine();
		System.out.println("Digite o salário bruto do funcionário:");
		funcionario.grossSalary = scan.nextDouble();
		System.out.println("Digite o imposto do salário do funcionário:");
		funcionario.tax = scan.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + funcionario);
		System.out.println();
		
		System.out.println("Qual a porcentagem para aumentar o salário?");
		funcionario.increaseSalary(scan.nextDouble());
		System.out.println("Dados atualizados: " + funcionario.name + ", $" + funcionario.grossSalary);
		
		
		
	}
}
