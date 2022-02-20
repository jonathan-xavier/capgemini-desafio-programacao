package capgemini_desafio.capgemini_desafio.questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01 {
	
	//metodo principal onde o programa é executado.
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		System.out.println("Digite um numero para a base e altura da escada: ");
		
		//verifica se a entrada é um numero
		//caso não seja é retornado uma mensagem ao usuário.
		if(sc.hasNextInt()) {
			
			numero = sc.nextInt();
		}else {
			System.out.println("Favor informe apenas numeros inteiros. Exemplo: 7");
		}
		
		System.out.print(criaEscada(numero));
		sc.close();
		
		
	}
	

	//Método que mostra na tela uma escada com "*" e " "
	//com base no numero recebido, esse numero sera o tamanho da escada
	//em altura quando em largura.
	//E é retornado uma array de string com o tamanho e largura da escada.
	public static String criaEscada(int numero) {
		
		List<String> escada = new ArrayList<>();
		
		int aux = numero - 1;
		for(int i = 0; i<numero; i ++) {
			escada.add(" ".repeat(aux) + "*".repeat(i + 1));
			aux --;
		}
		
		 return String.join("\n", escada);
		 
	}
}
