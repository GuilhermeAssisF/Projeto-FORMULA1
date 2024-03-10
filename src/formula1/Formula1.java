
package formula1;

public class Formula1 {
    public static void main(String[] args) 
    {
        Scuderia ferrari = new Scuderia("Ferrari", "Vermelho", 1);
        ferrari.carroScuderia(789,"Ferrari", 900, "vermelho");
        ferrari.piloto1(28, "Charles Leclerc", 26, 28);
        ferrari.piloto2(15, "Carlos Sainz", 29, 36);
        ferrari.engenheiroScudeia("Mattia Binotto", "Mecânico", 54);
        ferrari.patrocinioScuderia1("Sheel", 40000000, 50, 1988);
        ferrari.pecascarro("Caixa de cambio", 30, 3, "06/01/2024");
        ferrari.contagemPneusDuro("Duro", 30, "Pirelli");
        ferrari.contagemPneusMacios("Macio", 20, "Pirelli");
        ferrari.contagemPneusMedio("Medio", 25, "Pirelli");
        ferrari.pneuMacio.adicionaPneus();
        ferrari.pneuMacio.adicionaPneus();
        ferrari.pneuMacio.adicionaPneus();
        ferrari.exibeEquipe();


        

        
    }

}
