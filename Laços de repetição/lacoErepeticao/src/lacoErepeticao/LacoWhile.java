// testa depois executa. 

package lacoErepeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com um numero");
		numero =leia.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				somaPar += numero;
			}else {
				contImpar++;
			}
		System.out.println("\n Entre com um número");
		numero = leia.nextInt();
		}
		
		System.out.println("\n Somatorio dos numeros pares foi de:"+somaPar);
		System.out.println("\n Quantidade de numeros impares doi de"+contImpar);
	}

}
