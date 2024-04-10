/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipe;

/**
 *
 * @author giloc
 */
public class PontuacaoF1 implements Classificacao{
    @Override
    public int obterPontuacao(int posicao) {
        // Atribuindo pontos de acordo com a posição na corrida
        switch (posicao) {
            case 1:
                return 25;
            case 2:
                return 18;
            case 3:
                return 15;
            case 4:
                return 12;
            case 5:
                return 10;
            case 6:
                return 8;
            case 7:
                return 6;
            case 8:
                return 4;
            case 9:
                return 2;
            case 10:
                return 1;
            default:
                return 0; // Outros pilotos não pontuam
        }
    }
}
