package equipe;

public class Pecas 
{
    String nomePeca;
    int desgastePeca;
    int quantidadePeca; 
    String dataFabricacao;

    public Pecas(String nomePeca, int desgastePeca, int quantidadePeca, String dataFabricacao) {
        this.nomePeca = nomePeca;
        this.desgastePeca = desgastePeca;
        this.quantidadePeca = quantidadePeca;
        this.dataFabricacao = dataFabricacao;
    }

    public String getPeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public int getDesgastePeca() {
        return desgastePeca;
    }

    public void setDesgastePeca(int desgastePeca) {
        this.desgastePeca = desgastePeca;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    public int getQuantidadePecas(){
        return quantidadePeca;
    }
    public void setQuantidaePecas(int quantidadePeca) {
        this.quantidadePeca = quantidadePeca;
    }

    //Metodos que aidiciona e retira pecas
    public void adicionaUmaPeca(int quantidadePeca){
        quantidadePeca += 1;
    }
    public void retiraUmaPeca(int quantidaPeca){
        quantidadePeca -= 1;
    }
    
    //Metodo que exibe as pecas
    public void exibePecas(){
        System.out.println("\nCONTROLE DE PECAS");
        System.out.println("Peca: " + nomePeca);
        System.out.println("Desgaste: " + desgastePeca + "%");
        System.out.println("Quantidade em estoque: " + quantidadePeca);
        System.out.println("Data de fabricacao: " + dataFabricacao);
    }
}
