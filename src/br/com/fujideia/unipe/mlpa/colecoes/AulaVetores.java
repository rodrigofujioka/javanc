/**
 * Projeto das trilhas de treinamento de Java básico ou avançado 
 * com foco nas certificações java e em treinamentos corporativos. 
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package br.com.fujideia.unipe.mlpa.colecoes;

import java.util.Arrays;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 15 de ago de 2016
 * @Time: 21:02:50
 */
public class AulaVetores {
	
	public static void main(String[] args) {
		
		Livro[] livros = new Livro[10];
		Livro[] lista = {new Livro(), new Livro()};
		
		
		for(Livro l : livros){
		//	System.out.println(l.getTitulo());
		}
		
		for(int i= 0; i< livros.length; i++){
			Livro li =livros[i];			
			//System.out.println(li.getTitulo());
		}
		String[] nomes ={"Roberto","Amanda","Thiago"};
		int[] listaNumero = {9,6,5,12,1,3};
		int[] numeros = {9,6,5,12,1,3};
		System.out.println(Arrays.toString(listaNumero));
		System.out.println(Arrays.toString(nomes));
		
		Arrays.sort(nomes);
		Arrays.sort(listaNumero);
		Arrays.sort(numeros);
		
		System.out.println(Arrays.toString(nomes));
		System.out.println(Arrays.toString(listaNumero));
		
		
		System.out.println(numeros.equals(listaNumero));
		System.out.println(Arrays.equals(numeros, listaNumero));
		
	}

}







