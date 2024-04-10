package equipe;

// Definição da classe ResultadoCorrida, que herda da classe RegistroCorrida
public class ResultadoCorrida extends RegistroCorrida{
   private String[] resultado; // Array para armazenar os resultados dos pilotos

    // Construtor da classe ResultadoCorrida
    public ResultadoCorrida(int numPilotos) {
        this.resultado = new String[numPilotos]; // Inicializa o array com o número de pilotos
    }

    // Método para adicionar o resultado de um piloto (nome, posição)
    public void adicionarResultado(String nomePiloto, int posicao) {
        resultado[posicao - 1] = nomePiloto; // Adiciona o resultado na posição correspondente
    }
    
    // Sobrescrita do método registrar da superclasse RegistroCorrida
    @Override
    void registrar() throws Exception {
        try {
            System.out.println("Registrando os tempos de volta dos pilotos..."); // Mensagem de registro
            System.out.println("Computando o resultado da corrida..."); // Mensagem de processamento
            System.out.println("Resultado da corrida:"); // Mensagem de resultado
            
            // Loop para exibir os resultados dos pilotos
            for (int i = 0; i < resultado.length; i++) {
                if (resultado[i] != null) {
                    System.out.println("Posicao " + (i + 1) + ": " + resultado[i]); // Exibe o resultado
                } else {
                    System.out.println("Posicao " + (i + 1) + ": Nao registrado"); // Exibe se o resultado não foi registrado
                }
            }
            
            // Lança uma exceção simulando um erro ao registrar os tempos de volta dos pilotos
            throw new Exception("Erro ao registrar os tempos de volta dos pilotos");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage()); // Exibe mensagem de erro
        }
    }
}
