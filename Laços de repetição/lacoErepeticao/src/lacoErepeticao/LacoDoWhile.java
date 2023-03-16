// do While executa e depois testa.

package lacoErepeticao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabuada,x=1,resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a tabuada que deseja visualizar");
		tabuada = leia.nextInt();
		
		do {
			
			resultado = tabuada * x;
			System.out.println("\n "+tabuada+" X "+x+" = "+resultado);
			x++; // x = x +1 (esse é o contador da tabuada)
			
		}while(x<=10); // quando ele for igual a 10 ele para a contagem
	}

}
