// Declaração do pacote onde a classe está localizada
package equipe;

// Definição da classe Mecanico que estende a classe Funcionario
public class Mecanico extends Funcionario {
    // Atributo específico da classe Mecanico
    String tipo_mecanico; // Tipo de mecânico

    // Construtor da classe Mecanico que inicializa os atributos
    public Mecanico(String tipo_mecanico, String nome_funcionario, int cpf_funcionario) {
        // Chamada ao construtor da classe pai (Funcionario)
        super(nome_funcionario, cpf_funcionario);
        this.tipo_mecanico = tipo_mecanico;
    }

    // Métodos getters e setters para acessar e modificar o atributo específico

    public String getTipo_mecanico() {
        return tipo_mecanico;
    }

    public void setTipo_mecanico(String tipo_mecanico) {
        this.tipo_mecanico = tipo_mecanico;
    }
}
