
package equipe;

import java.text.DecimalFormat;
public class Patrocinio 
{
    String patrocinador;
    int valor;
    int tempoPatrocinio;
    int anoInicio;

    public Patrocinio(String patrocinador, int valor, int tempoPatrocinio, int anoInicio) {
        this.patrocinador = patrocinador;
        this.valor = valor;
        this.tempoPatrocinio = tempoPatrocinio;
        this.anoInicio = anoInicio;
    }

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

    public int anoFinalContrato(){
        int finalContrato = tempoPatrocinio + anoInicio;
        return finalContrato;
    }

    DecimalFormat formato = new DecimalFormat("#,##0");

    //Metodo para exibir patrocinio
    public void exibePatrocionio(){
        System.out.println("\nDADOS PATROCINADOR");
        System.out.println("Titulo Patrocinador: " + patrocinador);
        System.out.println("Valor: " + formato.format(valor) + " de Euros");
        System.out.println("Tempo de Patrocino: " + tempoPatrocinio + " anos");
        System.out.println("Ano de Inicio: " + anoInicio);
        System.out.println("Final Contrato: " + anoFinalContrato());
    }
    
}
