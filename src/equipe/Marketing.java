// Declaração do pacote onde a classe está localizada
package equipe;

// Definição da classe Marketing que estende a classe Funcionario
public class Marketing extends Funcionario {
    // Atributo específico da classe Marketing
    private int area_atuacao; // Área de atuação do profissional de marketing

    // Construtor da classe Marketing que inicializa os atributos
    public Marketing(int area_atuacao, String nome_funcionario, int cpf_funcionario) {
        // Chamada ao construtor da classe pai (Funcionario)
        super(nome_funcionario, cpf_funcionario);
        this.area_atuacao = area_atuacao;
    }

    // Métodos getters e setters para acessar e modificar o atributo específico

    public int getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(int area_atuacao) {
        this.area_atuacao = area_atuacao;
    }
}
