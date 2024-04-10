/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipe;


// Definição da classe Piloto
public class Piloto 
{
    String nome; // Nome do piloto
    int idade; // Idade do piloto
    int tempoEquipe; // Tempo de serviço do piloto na equipe (em meses)
    int meses; // Número total de meses que o piloto está na equipe
    private int posicao; // Posição do piloto na corrida
    private Classificacao classificacao; // Interface para calcular a pontuação com base na posição na corrida

    // Construtor da classe Piloto que inicializa os atributos
    public Piloto(String nome, int idade, int tempoEquipe, int meses, int posicao, Classificacao classificacao) {
        this.nome = nome;
        this.idade = idade;
        this.tempoEquipe = tempoEquipe;
        this.meses = meses;
        this.posicao = 0; // A posição é inicializada como 0 por padrão
        this.classificacao = classificacao;
    }

    // Métodos getters e setters para acessar e modificar os atributos

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

    // Método para calcular o tempo de serviço do piloto na equipe em anos
    public int tempodeEquipe() {
        int tempodeEquipe = meses / 12;
        return tempodeEquipe;
    }
    
    // Método para definir a posição do piloto na corrida
    public void definirPosicao(int posicao) {
        this.posicao = posicao;
    }

    // Método para obter o nome do piloto
    public String obterNome() {
        return nome;
    }

    // Método para obter a pontuação do piloto com base na posição na corrida
    public int obterPontuacao() {
        return classificacao.obterPontuacao(posicao);
    }

    // Método para exibir informações do piloto
    public void exibePiloto() {
        System.out.println("------ " + nome.toUpperCase() + " ------");
        System.out.println("Tempo de Equipe: " + tempodeEquipe() + " anos");
    }
}
