package manipulacao_arquivos_java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Leitura {
	
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);
		
		/* CONVERSÃO PARA BINÁRIO */
		FileInputStream arquivo = 
				new FileInputStream("arquivo.txt");
		
		/* CONVERSÃO PARA CHAR */
		InputStreamReader conversor = 
				new InputStreamReader(arquivo);
		
		/* CONVERSÃO PARA STRING */
		BufferedReader dados = 
				new BufferedReader(conversor);
		
		String s;
		String nomes = "";
		
		/* LAÇO QUE PEGA PALAVRA POR PALAVRA E ARMAZENA É UM LUGAR (OU PODE SER EXIBIDO AO LONGO DO WHILE */
		while(true) {
			s = dados.readLine();
			if(s == null) {
				break;
			}else{
				nomes += s+"\n";
			}
		};
		
		System.out.println(nomes);
		
		dados.close();
	}
}
