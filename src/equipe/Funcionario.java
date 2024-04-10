// Declaração do pacote onde a classe está localizada
package equipe;

// Definição da classe Funcionario
public class Funcionario {
    // Atributos da classe Funcionario
    private String nome_funcionario; // Nome do funcionário
    private int cpf_funcionario; // CPF do funcionário

    // Construtor da classe Funcionario que inicializa os atributos
    public Funcionario(String nome_funcionario, int cpf_funcionario) {
        this.nome_funcionario = nome_funcionario;
        this.cpf_funcionario = cpf_funcionario;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public int getCpf_funcionario() {
        return cpf_funcionario;
    }

    public void setCpf_funcionario(int cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }
}
