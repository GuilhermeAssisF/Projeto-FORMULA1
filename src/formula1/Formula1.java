
package formula1;

public class Formula1 {
    public static void main(String[] args) 
    {
        String nomeDoArquivo = "equipes.txt";  
        
        Scuderia ferrari = new Scuderia("Ferrari", "Vermelho", 1);
        ferrari.car = new Carro(789,"Ferrari", 900, "vermelho");
        ferrari.piloto1 = new Piloto(28, "Charles Leclerc", 26, 28);
        ferrari.piloto2 = new Piloto(15, "Carlos Sainz", 29, 36);
        ferrari.eng = new Engenheiro("Mattia Binotto", "Mecânico", 54);
        ferrari.patrocinador = new Patrocinio("Sheel", 40000000, 50, 1988);
        ferrari.peca = new Pecas("Caixa de cambio", 30, 3, "06/01/2024");
        ferrari.pneuDuro = new Pneu("Duro", 30, "Pirelli");
        ferrari.pneuMedio = new Pneu("Macio", 20, "Pirelli");
        ferrari.pneuMacio = new Pneu("Medio", 25, "Pirelli");
        ferrari.pneuMacio.adicionaPneus();
        ferrari.pneuMacio.adicionaPneus();
        ferrari.pneuMacio.adicionaPneus();
        ferrari.exibeEquipe();

        System.out.println("\n\n");

        Scuderia redbull = new Scuderia("Red Bull Racing", "Preto;Amarelo;Vermelho", 1);
        redbull.car = new Carro(800,"Honda", 930, "Preto");
        redbull.piloto1 = new Piloto(50, "Max Verstappen", 26, 48);
        redbull.piloto2 = new Piloto(32, "Sergio Perez", 29, 24);
        redbull.eng = new Engenheiro("Paul Monaghan", "Mecânico", 53);
        redbull.patrocinador = new Patrocinio("Red Bull", 60000000, 20, 2002);
        redbull.peca = new Pecas("Caixa de cambio", 10, 2, "09/01/2024");
        redbull.pneuDuro = new Pneu("Duro", 20, "Pirelli");
        redbull.pneuMedio = new Pneu("Macio", 20, "Pirelli");
        redbull.pneuMacio = new Pneu("Medio", 30, "Pirelli");
        redbull.pneuMacio.adicionaPneus();
        redbull.pneuMacio.adicionaPneus();
        redbull.pneuMacio.adicionaPneus();
        redbull.exibeEquipe();

        
        
    }

}
