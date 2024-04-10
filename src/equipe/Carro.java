package equipe;

import java.text.DecimalFormat;
public class Carro {
    double peso;
    String motor;
    double potencia;
    String corCarro;

    public Carro(double peso, String motor, double potencia, String corCarro) {
        this.peso = peso;
        this.motor = motor;
        this.potencia = potencia;
        this.corCarro = corCarro;
    }

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


    public double velocidadeMaxima() {
        double velocidadeMaxima = Math.sqrt(2.0 * (potencia*745.7) / (0.3 * 1.225 * 2.0));
        return velocidadeMaxima/3.6;
    }

    DecimalFormat formato = new DecimalFormat("#.##");

    public void exibeCarro(){
        System.out.println("\nESPECIFICACOES CARRO");
        System.out.println("Motor: " + motor);
        System.out.println("Peso: " + peso + "Kg");
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Cor: " + corCarro);
        System.out.println("Velocidade Maxima: " + formato.format(velocidadeMaxima()) + " km/h");
    }
}
