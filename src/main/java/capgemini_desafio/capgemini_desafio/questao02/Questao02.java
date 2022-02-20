package capgemini_desafio.capgemini_desafio.questao02;

import java.util.Scanner;

public class Questao02 {
	
	//Método principal onde esse programa é executado.
	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        
		//Solicitando possivel senha para validação
		System.out.println("Informe uma senha válida!");
		
		String senha = sc.next();
		
		//Chamando o método criado e atribuindo a senha como parâmetro.
		System.out.println(validarSenha(senha));
		

	}

	
	   /*Método responsável por validar a senha respeitando as regras:
			- Possuir no mínimo 6 caracteres.
			- Conter no minimo 1 digito.
			- Conter no minimo 1 letra em minúsculo.
			- Conter no minimo 1 letra em maiúsculo.
			- Conter no minimo 1 caractere especial. Exemplo: !@#$%^&*()+-
		*
		*/
		public static String validarSenha(String senha) {
			
			String mensagem ="";
			
			//se a senha for menor que 6 recebe true.
	        boolean pequena  = senha.length() < 6 ? true : false;
	        
	        
			boolean temNumero = false;
			boolean temMaiuscula = false;
			boolean temMinuscula = false;
			boolean temSimbolo = false;
			
			/*transformando em uma array de char
			 * e varrendo para verificar se tem os critérios de
			 * uma senha valida como numero, simbolo, maiuscula e minuscula.
			*/
			for(char s : senha.toCharArray()) {
				if(s >= '0' && s <= '9') {
					temNumero = true;
					
				}else if(s >= 'A' && s <= 'Z') {
					temMaiuscula = true;
					
				}else if(s >= 'a' && s <= 'z') {
					temMinuscula = true;
					
				}else {
					temSimbolo = true;
					
				}
				
			}
			
			/*Atribuindo a resposta de acordo com as validações
			 * e retornando ao usuário.
			*/
			if(pequena) mensagem  = Integer.toString( 6 - senha.length()) + "\n";
			
			
			if(!temNumero) mensagem += "Não tem numero!\n";
			
			if(!temMaiuscula) mensagem += "Não tem maiuscula!\n";
		
			
			if(!temMinuscula) mensagem += "Não tem minuscula!\n";
			
			
			if(!temSimbolo) mensagem += "Não tem simbolo!\n";
		
			
			if(pequena) {
				
				mensagem += "Senha pequena! Deve ter no mínimo 6 caracteres.\n";
			}else if(temMaiuscula && temMinuscula && temNumero && temSimbolo) {

				mensagem += "Senha válida!\n";
			}
			
			return mensagem;

		}
}
