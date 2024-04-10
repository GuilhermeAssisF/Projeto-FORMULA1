// Declaração do pacote onde a classe está localizada
package equipe;

// Definição da classe Engenheiro que estende a classe Funcionario
public class Engenheiro extends Funcionario {
    // Atributos da classe Engenheiro
    String tipoEngenheiro; // Tipo de engenheiro (especialidade)
    int idadeEngenheiro; // Idade do engenheiro

    // Construtor da classe Engenheiro que inicializa os atributos
    public Engenheiro(String tipoEngenheiro, int idadeEngenheiro, String nome_funcionario, int cpf_funcionario) {
        // Chamada ao construtor da classe pai (Funcionario)
        super(nome_funcionario, cpf_funcionario);
        // Inicialização dos atributos específicos do engenheiro
        this.tipoEngenheiro = tipoEngenheiro;
        this.idadeEngenheiro = idadeEngenheiro;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getTipoEngenheiro() {
        return tipoEngenheiro;
    }

    public void setTipoEngenheiro(String tipoEngenheiro) {
        this.tipoEngenheiro = tipoEngenheiro;
    }

    public int getIdadeEngenheiro() {
        return idadeEngenheiro;
    }

    public void setIdadeEngenheiro(int idadeEngenheiro) {
        this.idadeEngenheiro = idadeEngenheiro;
    }

    // Método para exibir as informações do engenheiro
    public void exibeEngenheiro() {
        System.out.println("\nENGENHEIRO");
        System.out.println("Nome: " + getNome_funcionario()); // Utilizando o método getter da classe pai
        System.out.println("Especialidade: " + tipoEngenheiro);
        System.out.println("Idade: " + idadeEngenheiro);
    }
}
