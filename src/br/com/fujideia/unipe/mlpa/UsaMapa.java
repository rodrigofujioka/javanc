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

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 23 de ago de 2016
 * @Time: 20:03:26
 */
public class UsaMapa {
	
	public static void main(String[] args) {
		
		Map<String, Mulher> mapa = new HashMap<>(); 
		
		Mulher m1 = new Mulher();
		Mulher m2 = new Mulher();
		Mulher m3 = new Mulher();
		m1.setIdade(18);
		m1.setNome("Augusta");
		
		m2.setIdade(33);
		m2.setNome("Milena");
		
		m3.setIdade(22);
		m3.setNome("Leonora");
		
		
		mapa.put("013", m1);
		mapa.put("xx", m1);
		
		Mulher consulta = mapa.get("x");
		
		Set<String> lista = mapa.keySet();
		Collection<Mulher> listaDois = mapa.values();
		
		System.out.println(listaDois.size());
		
		for(String x : lista){
			System.out.println(x);
		}
		
		
		
	}
	

}






