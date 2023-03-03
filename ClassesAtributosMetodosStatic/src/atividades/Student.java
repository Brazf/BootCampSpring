package atividades;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return (nota1 + nota2 + nota3);
	}
	
	public String result () {
		if( notaFinal() >= 60.0 ) {
			return "Aprovado!";
		}
		else {
			return "Reprovado! O estudante precisa de " + String.format("%.2f", 60.0 - notaFinal()) + " para ser aprovado!";
		}
	}
	
	public String toString() {
		return "NOTA FINAL: " + String.format("%.2f", notaFinal()) + "\n" +result();
	}
}
