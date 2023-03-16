// ele exige parametros de inicio, fim e quantidade de execução. Caso já tenha numeros definidos utilizar for

package lacoErepeticao;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		float n1,n2,n3,media, somaMedia=0,mediaGeral;
		int x; // será a variavel de loop
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=3;x++) { // x++ é a mesma coisa que x = x+1
			System.out.println("\nEntre com o nome doalune");
			nome = leia.nextLine();
			leia.nextLine(); //limpa o cash de memoria para não pular etapa
			System.out.println("\nEntre com a primeira nota");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			somaMedia += media; // somaMedia = somaMedia + media
			System.out.println("\n A media do alune " +nome+ "foi de:" +media);
			
		}
		
		mediaGeral = somaMedia/3;
		System.out.printf("\n Média geral da turma foi de: %.2f", mediaGeral);
	}

}
