
package equipe;

public class Scuderia {
    String nomeEquipe;
    String cor;
    int divisao;
    Carro car;
    Engenheiro eng;
    Patrocinio patrocinador;
    Pecas peca;
    Piloto piloto1, piloto2;
    Pneu pneuMedio, pneuMacio, pneuDuro;

    //getter setter engenheiro
    public Engenheiro getEng() {
        return eng;
    }

    public void setEng(Engenheiro eng) {
        this.eng = eng;
    }

    //getter setters patrocinio
    public Patrocinio getPatrocinador1() {
        return patrocinador;
    }

    public void setPatrocinador1(Patrocinio patrocinador1) {
        this.patrocinador = patrocinador1;
    }

    //getter setter pecas
    public Pecas getPeca() {
        return peca;
    }

    public void setPeca(Pecas peca) {
        this.peca = peca;
    }

    //getter setters pneu
    public Piloto getPiloto1() {
        return piloto1;
    }

    public void setPiloto1(Piloto piloto1) {
        this.piloto1 = piloto1;
    }

    public Piloto getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }

    //getter setter pneus
    public Pneu getPneuMedio() {
        return pneuMedio;
    }

    public void setPneuMedio(Pneu pneuMedio) {
        this.pneuMedio = pneuMedio;
    }

    public Pneu getPneuMacio() {
        return pneuMacio;
    }

    public void setPneuMacio(Pneu pneuMacio) {
        this.pneuMacio = pneuMacio;
    }

    public Pneu getPneuDuro() {
        return pneuDuro;
    }

    public void setPneuDuro(Pneu pneuDuro) {
        this.pneuDuro = pneuDuro;
    }

    //getter setter carro
    public Carro getCar() {
        return car;
    }

    public void setCar(Carro car) {
        this.car = car;
    }
    
    //Montagem Scuderia
    public Scuderia(String nomeEquipe,String cor,int divisao) {
        this.nomeEquipe = nomeEquipe;
        this.cor = cor;
        this.divisao = divisao;
        
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
        patrocinador.exibePatrocinio();
        peca.exibePecas();
        System.out.println("\nPNEUS");
        pneuDuro.exibePneus();
        pneuMacio.exibePneus();
        pneuMedio.exibePneus();
    }

}
