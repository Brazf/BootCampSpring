package ooaula8;

import java.util.ArrayList;
import java.util.List;

public class Lista1 {

	public static void main(String[] args) {
		

		List<Integer> numInt = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			numInt.add(i);
		}
		
		
		for (Integer numeros : numInt) {
			System.out.println(numeros);
		}
		
	}
	
}
