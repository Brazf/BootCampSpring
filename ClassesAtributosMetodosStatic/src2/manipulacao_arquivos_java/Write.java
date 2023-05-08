package manipulacao_arquivos_java;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Write {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream arquivo = new FileOutputStream("arquivo.txt", true);

		OutputStreamWriter conversor = new OutputStreamWriter(arquivo);
		
		BufferedWriter dados = new BufferedWriter(conversor);
		
		dados.write("Aprendendo a programar!");
		dados.close();
	}
}
