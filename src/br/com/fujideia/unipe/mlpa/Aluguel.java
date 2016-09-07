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

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 16 de ago de 2016
 * @Time: 19:55:58
 */
public class Aluguel {

	private Fita fita;
	private int diasAlugada;
	
	
	/**
	 * 
	 */
	public Aluguel(Fita fita, int quantidadeDias) {
		this.fita = fita;
		this.diasAlugada = quantidadeDias;
	}
		
	public double obterSubtotal(){
		double subTotal = fita.obterValorFita();	
		if(diasAlugada > fita.obterDiasFita()){
			subTotal += (diasAlugada - fita.obterDiasFita()) 
					* fita.obterValorMultaFita();
		}
		return subTotal;
	}
	
	
	
	
	
	/**
	 * @return the fita
	 */
	public Fita getFita() {
		return fita;
	}

	/**
	 * @param fita the fita to set
	 */
	public void setFita(Fita fita) {
		this.fita = fita;
	}

	/**
	 * @return the diasAlugada
	 */
	public int getDiasAlugada() {
		return diasAlugada;
	}

	/**
	 * @param diasAlugada the diasAlugada to set
	 */
	public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}


}





