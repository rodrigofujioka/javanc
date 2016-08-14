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

import java.util.Scanner;

import br.com.fujideia.unipe.mlpa.jogo.armas.ArmaIF;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 13 de ago de 2016
 * @Time: 10:25:56
 */
public class UsaPersonagem {
	
	public static void main(String[] args) {
		
		int opcao;
		Menu menu = new Menu();
		Scanner leitor = new Scanner(System.in);
		Personagem p = null;
		ArmaIF arma = null;
		
		while(true){
			
			menu.menuPrincipal();
			opcao = Integer.parseInt(leitor.nextLine());						
			
			switch (opcao) {
			
			case 1:
				menu.menuPersonagem();
				opcao = Integer.parseInt(leitor.nextLine());								
				p = menu.obterPersonagem(opcao);
				break;

			case 2:
				menu.menuArmas();;
				opcao = Integer.parseInt(leitor.nextLine());
				p = menu.obterArma(opcao, p);				
				break;
				
			case 3:
				
				if(p!=null){
					p.arma();
				}else{
					System.out.println("Selecione Personagem");
				}
			break;
			
			case 4 :
				System.exit(0);							
				break;
			default:
				break;
			}
			
			
		}
		
		
						
		
	}

}
