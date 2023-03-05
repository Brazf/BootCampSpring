package OOaula7;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Account conta1 = new Account(0, null, 0);
			
			// entrada do número da conta
			System.out.println("Enter account number:");
			int number = scan.nextInt();
			
			scan.nextLine();
			
			// entrada do nome do titular
			System.out.println("Enter account holder:");
			String holder = scan.nextLine();
			
			// rotina de checagem de deposito inicial
			System.out.println("Is there na initial deposit (y/n)?");
			String select = scan.nextLine();
			
			if(select.equalsIgnoreCase("y")) {
				System.out.print("Enter initial deposit value:");
				double balance = scan.nextDouble();
				conta1 = new Account(number, holder, balance);
			}
			else {
				double balance = 0.0;
				conta1 = new Account(number, holder, balance);
			}
			
			
			System.out.println(conta1);
			

			scan.close();
	}
}
