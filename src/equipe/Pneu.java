package equipe;

// Definição da classe Pneu
public class Pneu{
    // Atributos da classe Pneu
    String tipo; // Tipo do pneu
    int quantidade; // Quantidade de pneus disponíveis
    String fabricante; // Fabricante dos pneus

    // Construtor da classe Pneu que inicializa os atributos
    public Pneu(String tipo, int quantidade, String fabricante) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.fabricante = fabricante;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    // Método para adicionar um pneu
    public void adicionaPneus(){
        quantidade += 1;
    }

    // Método para retirar um pneu
    public void retiraPneus(){
        quantidade -= 1;
    }

    // Método para exibir informações sobre os pneus
    public void exibePneus(){
        System.out.println("------ PNEUS " + tipo.toUpperCase() + " ------");
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Fabricante: " + fabricante);
    }
}
