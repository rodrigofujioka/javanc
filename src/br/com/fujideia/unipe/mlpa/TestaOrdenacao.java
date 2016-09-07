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
package br.com.fujideia.unipe.mlpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 22 de ago de 2016
 * @Time: 20:59:50
 */
public class TestaOrdenacao {
		
	public static void main(String[] args) {
				
		Mulher m1 = new Mulher();
		Mulher m2 = new Mulher();
		Mulher m3 = new Mulher();
		m1.setIdade(18);
		m1.setNome("Augusta");
		
		m2.setIdade(33);
		m2.setNome("Milena");
		
		m3.setIdade(22);
		m3.setNome("Leonora");
		
		ArrayList<Mulher> lista = new ArrayList<>();
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		lista.add(m1);
		lista.add(m2);	
		
		
		Collections.sort(lista);
		System.out.println(lista);
		
		Collections.sort(lista, new MulherNomeComparator());
		System.out.println(lista);
		
	
		
		
		TreeSet<Mulher> listaTree = new TreeSet<>();
		listaTree.addAll(lista);		
		System.out.println(listaTree);
		
		//listaTree.get
		lista.get(3);
		
		
		
		Set<Mulher> listaSet = new HashSet<>();
		listaSet.addAll(lista);
		System.out.println(listaSet);
		
		
		
	}
	
}



