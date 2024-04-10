package equipe; // Declaração do pacote onde a classe está localizada

import java.text.DecimalFormat;

// Definição da classe Carro
public class Carro {
    // Declaração dos atributos da classe
    double peso; // Peso do carro em quilogramas
    String motor; // Tipo de motor do carro
    double potencia; // Potência do motor em cavalos de potência (cv)
    String corCarro; // Cor do carro

    // Construtor da classe Carro para inicializar os atributos
    public Carro(double peso, String motor, double potencia, String corCarro) {
        this.peso = peso;
        this.motor = motor;
        this.potencia = potencia;
        this.corCarro = corCarro;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String cor) {
        this.corCarro = cor;
    }

    // Método para calcular e retornar a velocidade máxima do carro
    public double velocidadeMaxima() {
        // Fórmula para calcular a velocidade máxima utilizando a potência do motor
        double velocidadeMaxima = Math.sqrt(2.0 * (potencia * 745.7) / (0.3 * 1.225 * 2.0));
        // Convertendo a velocidade para quilômetros por hora (km/h)
        return velocidadeMaxima / 3.6;
    }

    // Instância de DecimalFormat para formatar a saída da velocidade máxima
    DecimalFormat formato = new DecimalFormat("#.##");

    // Método para exibir as especificações do carro
    public void exibeCarro() {
        System.out.println("\nESPECIFICACOES CARRO");
        System.out.println("Motor: " + motor);
        System.out.println("Peso: " + peso + "Kg");
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Cor: " + corCarro);
        System.out.println("Velocidade Maxima: " + formato.format(velocidadeMaxima()) + " km/h");
    }
}
