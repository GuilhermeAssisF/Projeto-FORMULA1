/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipe;


public class Piloto 
{
    int pontos;
    String nome;
    int idade;
    int tempoEquipe;
    int meses;

    public Piloto(int pontos, String nome, int idade, int meses) {
        this.pontos = pontos;
        this.nome = nome;
        this.idade = idade;
        this.meses = meses;
    }

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

    public int tempodeEquipe() {
        int tempodeEquipe = meses/12;
        return tempodeEquipe;
    }

    //Metodo para exibir o piloto
    public void exibePiloto(){
        System.out.println("------ " + nome.toUpperCase() + " ------");
        System.out.println("Pontos: " + pontos);
        System.out.println("Tempo de Equipe: " + tempodeEquipe() + " anos");
    }

    
    
}
