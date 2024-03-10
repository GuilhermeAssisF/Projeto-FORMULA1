
package formula1;

public class Pneu {
    String tipo;
    int quantidade;
    String fabricante;

    public Pneu(String tipo, int quantidade, String fabricante) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void adicionaPneus(){
        quantidade += 1;
    }
    public void retiraPneus(){
        quantidade -= 1;
    }

    //Metodo que exibe a quantidade pneus
    public void exibePneus(){
        System.out.println("------ PNEUS " + tipo.toUpperCase() + " ------");
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Fabricante: " + fabricante);
    }
}
