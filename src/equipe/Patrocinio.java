// Declaração do pacote onde a classe está localizada
package equipe;

import java.text.DecimalFormat;

// Definição da classe Patrocinio
public class Patrocinio {
    // Atributos da classe Patrocinio
    String patrocinador; // Nome do patrocinador
    int valor; // Valor do patrocínio em Euros
    int tempoPatrocinio; // Tempo de duração do patrocínio em anos
    int anoInicio; // Ano de início do patrocínio

    // Construtor da classe Patrocinio que inicializa os atributos
    public Patrocinio(String patrocinador, int valor, int tempoPatrocinio, int anoInicio) {
        this.patrocinador = patrocinador;
        this.valor = valor;
        this.tempoPatrocinio = tempoPatrocinio;
        this.anoInicio = anoInicio;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTempoPatrocinio() {
        return tempoPatrocinio;
    }

    public void setTempoPatrocinio(int tempoPatrocinio) {
        this.tempoPatrocinio = tempoPatrocinio;
    }

    // Método para calcular o ano de término do contrato de patrocínio
    public int anoFinalContrato() {
        int finalContrato = tempoPatrocinio + anoInicio;
        return finalContrato;
    }

    // Instância de DecimalFormat para formatar a saída do valor do patrocínio
    DecimalFormat formato = new DecimalFormat("#,##0");

    // Método para exibir as informações do patrocínio
    public void exibePatrocinio() {
        System.out.println("\nDADOS PATROCINADOR");
        System.out.println("Titulo Patrocinador: " + patrocinador);
        System.out.println("Valor: " + formato.format(valor) + " de Euros");
        System.out.println("Tempo de Patrocino: " + tempoPatrocinio + " anos");
        System.out.println("Ano de Inicio: " + anoInicio);
        System.out.println("Final Contrato: " + anoFinalContrato());
    }
}
