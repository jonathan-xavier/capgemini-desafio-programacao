package capgemini_desafio.capgemini_desafio.questao03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao03 {
	
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Informe uma palavra:");
		 String entrada = "";
		 
		 if(!sc.hasNextInt() && sc.hasNextDouble() && sc.hasNextFloat()) {
			entrada = sc.nextLine();
		 }else {
			 System.out.println("Digite apenas palavras.");
		 }
		 
			int anagrama =  quantidadeAnagramas(entrada);
			System.out.println(anagrama);


		}

	 	//metodo que analisa se duas palavras são anagramas
		public static boolean verificaSeAnagrama(String s1, String s2) {
			
	        if(s1.length() != s2.length()) return false;
	        
	        int cont = 0;
	        boolean[] verifica = new boolean[s2.length()];
	        for(int i = 0; i < s1.length(); i++) {
	            for(int j = 0; j < s2.length(); j++) {
	                if(s1.charAt(i) == s2.charAt(j) && !verifica[j]) {
	                    cont++; verifica[j] = true; break;
	                }
	            }
	        }
	        return cont == s2.length()? true : false;
	    }
	    /*Esse metodo identifica uma quantidade da palavra
	     * apartir de uma string ele encontra o numero de pares de substrings que
	     * são anagramas.
		*/
	    public static int quantidadeAnagramas(String s) {
	        List<String> lista = new ArrayList<>();
	        for(int i = 0; i < s.length(); i++) {
	            for(int j = i + 1; j <= s.length(); j++) 
	                lista.add(s.substring(i, j));
	        }
	        
	        int resultado = 0;
	        for(int i = 0; i < lista.size(); i++) {
	            for(int j = i + 1; j < lista.size(); j++) {
	                if(verificaSeAnagrama(lista.get(i), lista.get(j))) resultado++;
	            }
	        }
	        return resultado;
	    }

}
