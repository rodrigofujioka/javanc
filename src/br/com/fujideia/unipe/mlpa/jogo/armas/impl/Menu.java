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
 * Classe que exibe as operações que podem ser executadas no programa principal
 * 
 * @author: Rodrigo.fujioka
 * @date: 13 de ago de 2016
 * @Time: 10:52:38
 */
public class Menu {

	public void menuPrincipal() {
		System.out.println("Opções do Jogo");
		System.out.println("1 - Selecione Personagem");
		System.out.println("2 - Selecionar Arma");
		System.out.println("3 - Usar Arma");
		System.out.println("4 - Sair");
	}

	public void menuPersonagem() {
		System.out.println("Selecione o Personagem");
		System.out.println("1 - Soldado");
		System.out.println("2 - General");
		System.out.println("3 - Lutador de Sumo");
	}

	public void menuArmas() {
		System.out.println("1 - Revolver");
		System.out.println("2 - Fuzil");
		System.out.println("3 - Desarmado");

	}

	public Personagem obterPersonagem(int opcao){
		
		switch (opcao) {
		case 1: return new Soldado();
		case 2: return new General();
		default : 
			System.out.println("Opção não existe");		
		}	
		return null;	
	}

	public Personagem obterArma(int opcao, Personagem p) {

		if (p != null) {

			switch (opcao) {
			case 1:
				p.setArma(new Revolver());
				return p;

			case 2:
				p.setArma(new Fuzil());
				return p;

			case 3:
				p.setArma(new Desarmado());
				return p;
			default:
				System.out.println("Opção não existe");
			}
			
		} else {
			System.out.println("Selecione um Personagem primeiro");
		}
		return p;

	}

}
