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
 * @Time: 19:33:58
 */
public class Fita {

	public enum Tipo{
		normal, lancamento, infantil
	}
	
	private String titulo;
	private Tipo codigoPreco;	
	
	public Fita(String titulo, Tipo codigoPreco){
		this.titulo = titulo;
		this.codigoPreco =codigoPreco;
	}


	public double obterValorMultaFita(){
		double valorRetorno = 0.0;
		
		if(codigoPreco.equals(Tipo.normal)){
			valorRetorno = 1.5;
		}else if(codigoPreco.equals(Tipo.lancamento)){
			valorRetorno = 3.0;
		}else if(codigoPreco.equals(Tipo.infantil)){
			valorRetorno = 1.5;
		}
				
		return valorRetorno;
	}
	
	
	public double obterValorFita(){
		double valorRetorno = 0.0;
		
		if(codigoPreco.equals(Tipo.normal)){
			valorRetorno = 2.0;
		}else if(codigoPreco.equals(Tipo.lancamento)){
			valorRetorno = 3.0;
		}else if(codigoPreco.equals(Tipo.infantil)){
			valorRetorno = 1.5;
		}
				
		return valorRetorno;
	}
	
	public int obterDiasFita(){
		
		int  diasFita = 0;		
		if(codigoPreco.equals(Tipo.normal)){
			 diasFita =2;
		}else if(codigoPreco.equals(Tipo.lancamento)){
			diasFita =1;
		}else if(codigoPreco.equals(Tipo.infantil)){
			diasFita =3;
		}			
		return diasFita;
	}
	
	
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the codigoPreco
	 */
	public Tipo getCodigoPreco() {
		return codigoPreco;
	}

	/**
	 * @param codigoPreco the codigoPreco to set
	 */
	public void setCodigoPreco(Tipo codigoPreco) {
		this.codigoPreco = codigoPreco;
	}
	
	
	
}








