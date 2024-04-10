
package equipe;

public class Engenheiro {
    String nomeEngenheiro;
    String tipoEngenheiro;
    int idadeEngenheiro;

    public Engenheiro(String nomeEngenheiro,String tipoEngenheiro,int idadeEngenheiro) {
        this.nomeEngenheiro = nomeEngenheiro;
        this.tipoEngenheiro = tipoEngenheiro;
        this.idadeEngenheiro = idadeEngenheiro;
    }

    public String getNomeEngenheiro() {
        return nomeEngenheiro;
    }

    public void setNomeEngenheiro(String nomeEngenheiro) {
        this.nomeEngenheiro = nomeEngenheiro;
    }

    public String getTipoEngenheiro() {
        return tipoEngenheiro;
    }

    public void setTipoEngenheiro(String tipoEngenheiro) {
        this.tipoEngenheiro = tipoEngenheiro;
    }

    public int getIdadeEngenheiro() {
        return idadeEngenheiro;
    }

    public void setIdadeEngenheiro(int idadeEngenheiro) {
        this.idadeEngenheiro = idadeEngenheiro;
    }

    //Metodo para exibir engenheiro
    public void exibeEngenheiro(){
        System.out.println("\nENGENHEIRO");
        System.out.println("Nome: " + nomeEngenheiro);
        System.out.println("Especialidade: " + tipoEngenheiro);
        System.out.println("Idade: " + idadeEngenheiro);
    }

    

}
