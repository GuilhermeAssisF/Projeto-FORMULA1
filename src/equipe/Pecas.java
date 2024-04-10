// Declaração do pacote onde a classe está localizada
package equipe;

// Definição da classe Pecas
public class Pecas {
    // Atributos da classe Pecas
    String nomePeca; // Nome da peça
    int desgastePeca; // Nível de desgaste da peça (em %)
    int quantidadePeca; // Quantidade de peças em estoque
    String dataFabricacao; // Data de fabricação da peça

    // Construtor da classe Pecas que inicializa os atributos
    public Pecas(String nomePeca, int desgastePeca, int quantidadePeca, String dataFabricacao) {
        this.nomePeca = nomePeca;
        this.desgastePeca = desgastePeca;
        this.quantidadePeca = quantidadePeca;
        this.dataFabricacao = dataFabricacao;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public int getDesgastePeca() {
        return desgastePeca;
    }

    public void setDesgastePeca(int desgastePeca) {
        this.desgastePeca = desgastePeca;
    }

    public int getQuantidadePeca() {
        return quantidadePeca;
    }

    public void setQuantidadePeca(int quantidadePeca) {
        this.quantidadePeca = quantidadePeca;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    // Métodos para adicionar e retirar peças do estoque

    public void adicionaUmaPeca() {
        quantidadePeca += 1;
    }

    public void retiraUmaPeca() {
        quantidadePeca -= 1;
    }

    // Método para exibir as informações da peça
    public void exibePecas() {
        System.out.println("\nCONTROLE DE PECAS");
        System.out.println("Peca: " + nomePeca);
        System.out.println("Desgaste: " + desgastePeca + "%");
        System.out.println("Quantidade em estoque: " + quantidadePeca);
        System.out.println("Data de fabricacao: " + dataFabricacao);
    }
}
