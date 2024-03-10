
package formula1;

public class Scuderia {
    String nomeEquipe;
    String cor;
    int divisao;
    Carro car;
    Engenheiro eng;
    Patrocinio patrocinador1;
    Pecas peca;
    Piloto piloto1, piloto2;
    Pneu pneuMedio, pneuMacio, pneuDuro;
    
    //Montagem Scuderia
    public Scuderia(String nomeEquipe,String cor,int divisao) {
        this.nomeEquipe = nomeEquipe;
        this.cor = cor;
        this.divisao = divisao;
        
    }

    //Montagem Carros
    public void carroScuderia( double peso, String motor, double potencia, String corCarro){
        this.car = new Carro(peso, motor, potencia, corCarro);
    }

    //Montagem Engenheiro
    public void engenheiroScudeia(String nomeEngenheiro,String tipoEngenheiro,int idadeEngenheiro){
        this.eng = new Engenheiro(nomeEngenheiro, tipoEngenheiro, idadeEngenheiro);
    }

    //Montagem Patrocinio
    public void patrocinioScuderia1(String patrocinador, int valor, int tempoPatrocinio, int anoInicio){
        this.patrocinador1 = new Patrocinio(patrocinador, valor, tempoPatrocinio, anoInicio);
    }
    
    //Montagem Pecas
    public void pecascarro(String nomePeca, int desgastePeca, int quantidadePeca, String dataFabricacao){
        this.peca = new Pecas(nomePeca, desgastePeca, quantidadePeca, dataFabricacao);
    }

    //Definição Pilotos
    public void piloto1(int pontos, String nome, int idade, int meses){
        this.piloto1 = new Piloto(pontos, nome, idade, meses);
    }

    public void piloto2(int pontos, String nome, int idade, int meses){
        this.piloto2 = new Piloto(pontos, nome, idade, meses);
    }

    //Controle de Pneus
    public void contagemPneusMacios(String tipo, int quantidade, String fabricante){
        this.pneuMacio = new Pneu(tipo, quantidade, fabricante);
    }
    public void contagemPneusDuro(String tipo, int quantidade, String fabricante){
        this.pneuDuro = new Pneu(tipo, quantidade, fabricante);
    }
    public void contagemPneusMedio(String tipo, int quantidade, String fabricante){
        this.pneuMedio = new Pneu(tipo, quantidade, fabricante);
    }

    //Getters Setters Scuderia
    public String getNomeEquipe() {
        return nomeEquipe;
    }
    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getDivisao() {
        return divisao;
    }
    public void setDivisao(int divisao) {
        this.divisao = divisao;
    }

    public void exibeScuderia(){
        System.out.println("------ " + nomeEquipe.toUpperCase() + " ------");
        System.out.println("Formula " + divisao);
        System.out.println("Cor Scuderia: " + cor);
    }

    //Metodo que exibe toda equipe
    public void exibeEquipe(){
        exibeScuderia();
        car.exibeCarro();
        System.out.println("\nPILOTOS");
        piloto1.exibePiloto();
        piloto2.exibePiloto();
        eng.exibeEngenheiro();
        patrocinador1.exibePatrocionio();
        peca.exibePecas();
        System.out.println("\nPNEUS");
        pneuDuro.exibePneus();
        pneuMacio.exibePneus();
        pneuMedio.exibePneus();
    }

}
