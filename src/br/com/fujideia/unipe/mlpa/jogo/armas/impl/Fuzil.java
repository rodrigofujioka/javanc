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
package br.com.fujideia.unipe.mlpa.jogo.armas.impl;

import br.com.fujideia.unipe.mlpa.jogo.armas.ArmaIF;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 13 de ago de 2016
 * @Time: 09:46:35
 */
public class Fuzil implements ArmaIF{

	/* (non-Javadoc)
	 * @see br.com.fujideia.unipe.mlpa.jogo.armas.ArmaIF#usaArma()
	 */
	@Override
	public void usaArma() {
		System.out.println("Fuzil");
		
	}


}
