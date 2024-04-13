package equipe;

public class TesteClassificacao {
    public static void main(String[] args) {
         Classificacao classificacao = new PontuacaoF1();
        
        Scuderia ferrari = new Scuderia("Ferrari", "Vermelho", 1);
        ferrari.piloto1 = new Piloto("Charles Leclerc", 24, 3, 36, 3, classificacao);
        ferrari.piloto2 = new Piloto("Carlos Sainz", 27, 2, 24, 5, classificacao);
        
        Scuderia rb = new Scuderia("Redbull", "Preto", 2);
        rb.piloto1 = new Piloto("AAAAA", 23,3,40,6, classificacao);
        
        ferrari.piloto1.definirPosicao(1);
        ferrari.piloto2.definirPosicao(2);
        rb.piloto1.definirPosicao(3);
        
        System.out.println("Classificacao da corrida e pontos:");
        System.out.println("1. " + ferrari.piloto1.obterNome() + " - Pontos: " + ferrari.piloto1.obterPontuacao());
        System.out.println("2. " + ferrari.piloto2.obterNome() + " - Pontos: " + ferrari.piloto2.obterPontuacao());
        System.out.println("3. " + rb.piloto1.obterNome() + " - Pontos: " + rb.piloto1.obterPontuacao());
    }
}
