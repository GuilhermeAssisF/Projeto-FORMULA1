package equipe;

import java.util.ArrayList;
import java.util.List;

public class TemposVolta extends RegistroCorrida {
    private List<String> temposVolta; // Lista para armazenar os tempos de volta dos pilotos

    //Construtor da classe TemposVolta.
    public TemposVolta() {
        this.temposVolta = new ArrayList<>();
    }

   // Método para registrar o tempo de volta de um piloto.

    public void registrarTempoVolta(String tempo) {
        temposVolta.add(tempo); // Adiciona o tempo de volta à lista
        System.out.println("Tempo de volta registrado: " + tempo); // Exibe mensagem de confirmação
    }
    
    //Simula o registro dos tempos de volta dos pilotos e lança uma exceção em caso de erro.
     
    @Override
    void registrar() throws Exception {
        try {
            System.out.println("Registrando os tempos de volta dos pilotos..."); // Mensagem de registro
            for (String tempo : temposVolta) {
                System.out.println("Tempo de volta: " + tempo); // Exibe cada tempo de volta registrado
            }
            throw new Exception("Erro ao registrar os tempos de volta dos pilotos"); // Lança exceção simulando erro
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage()); // Exibe mensagem de erro
        }
    }
}
