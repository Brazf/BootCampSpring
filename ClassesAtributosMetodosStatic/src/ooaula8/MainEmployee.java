package ooaula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("How many employees will be registered?");
		int quant = input.nextInt();
		
		List<Employee> funcionarios = new ArrayList<>();
		
		
		for(int i = 0 ; i < quant; i++) {
			System.out.println("Emplyoee #"+(i+1)+":");
			
			System.out.println("Digite seu ID:");
			int id = input.nextInt();
			while(hasId(funcionarios, id)) {
				System.out.println("ID já existente, digite outro:");
				id = input.nextInt();
			}
			
			System.out.println("Digite seu nome:");
			String name = input.next();
			System.out.println("Digite seu salário:");
			Double salary = input.nextDouble();

			funcionarios.add(new Employee(id, name, salary));
		}
		
		for (Employee employee : funcionarios) {
			System.out.println(employee);
		}
		
		input.close();
	}
	
	public static boolean hasId(List<Employee> funcionarios, int id) {
		Employee result = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return result != null;
	}
}	
