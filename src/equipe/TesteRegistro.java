/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipe;

/**
 *
 * @author giloc
 */
public class TesteRegistro {
    public static void main(String[] args) {
        try {
            // Criando objeto da classe ResultadoCorrida
            ResultadoCorrida resultadoCorrida = new ResultadoCorrida(5); // Supondo 5 pilotos na corrida

            // Adicionando resultados fictícios dos pilotos
            resultadoCorrida.adicionarResultado("Lewis Hamilton", 1);
            resultadoCorrida.adicionarResultado("Max Verstappen", 2);
            resultadoCorrida.adicionarResultado("Valtteri Bottas", 3);

            // Chamando o método registrar
            resultadoCorrida.registrar();
        } catch (Exception e) {
            System.out.println("Erro durante o registro do resultado da corrida: " + e.getMessage());
        }
    
    }
}
