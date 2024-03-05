/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;


public class Piloto 
{
    int pontos;
    String nome;
    int idade;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoEquipe() {
        return tempoEquipe;
    }

    public void setTempoEquipe(int tempoEquipe) {
        this.tempoEquipe = tempoEquipe;
    }
    int tempoEquipe;
}
