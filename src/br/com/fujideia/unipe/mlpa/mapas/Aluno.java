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

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 29 de ago de 2016
 * @Time: 20:57:57
 */
public class Aluno implements Comparable<Aluno>{

	private String ra;
	private String nome;
	private String curso;
	private int periodo;
	
	
	/**
	 * @return the ra
	 */
	public String getRa() {
		return ra;
	}
	/**
	 * @param ra the ra to set
	 */
	public void setRa(String ra) {
		this.ra = ra;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * @return the periodo
	 */
	public int getPeriodo() {
		return periodo;
	}
	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Aluno aluno) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(aluno.getNome());
	}
	
	
	
	
	
}
















