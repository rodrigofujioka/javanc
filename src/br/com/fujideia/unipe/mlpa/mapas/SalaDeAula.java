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
package br.com.fujideia.unipe.mlpa.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe que define o comportamento para o objeto.
 * 
 * @author: Rodrigo
 * @date: 29 de ago de 2016
 * @Time: 21:06:18
 */
public class SalaDeAula {

	public static void main(String[] args) {

		Map<String, Aluno> mapaSala = new HashMap<String, Aluno>();
		Scanner leitor = new Scanner(System.in);
		int opcaoEscolhida = 0;

		while (true) {
			
			System.out.println("Selecione a Opção desejada");
			System.out.println("1 - Incluir");
			System.out.println("2 - Consultar");
			opcaoEscolhida = Integer.parseInt(leitor.nextLine());
			
			switch (opcaoEscolhida) {
			case 1 :
				Aluno aluno = new Aluno();
				System.out.println("Informe um Nome");
				String nome = leitor.nextLine();
				System.out.println("Informe a matrícula");
				String ra = leitor.nextLine();				
				aluno.setNome(nome);
				aluno.setRa(ra);
				
				mapaSala.put(ra, aluno);
				
				break;
				
			case 2 :
				
				System.out.println("Digite a matrícula a ser procurada");
				ra = leitor.nextLine();
				aluno = mapaSala.get(ra);
				
				System.out.println(aluno.getRa());
				System.out.println(aluno.getNome());
				

			default:
				break;
			}
			

		}

	}

	public static Aluno consultarAluno(String ra, Map<String, Aluno> mapa) {

		Aluno alunoRetorno = mapa.get(ra);

		return alunoRetorno;
	}

}
