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

import java.util.Comparator;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 23 de ago de 2016
 * @Time: 19:37:07
 */
public class MulherNomeComparator implements Comparator<Mulher>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Mulher mulherUm, Mulher mulherDois) {
		
		int ordenacao = mulherDois.getNome().compareTo(mulherUm.getNome());
		
		return ordenacao;
	}

}






