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

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 16 de ago de 2016
 * @Time: 20:11:36
 */
public class Cliente {
    private String nome;

    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        for (Aluguel f : fitasAlugadas) {
    
            double valorCorrente = f.obterSubtotal();
            
            
                       pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2
            // dias
            if (f.getFita().getCodigoPreco() == Fita.Tipo.lancamento
                && f.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + f.getFita().getTitulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }
}
