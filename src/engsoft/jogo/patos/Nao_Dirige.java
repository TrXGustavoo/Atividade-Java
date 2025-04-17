package engsoft.jogo.patos;

/**
 * Classe Nao_Dirige
 * 
 * Esta classe implementa a interface Padrao_Dirigir como parte do padrão
 * Strategy.
 * Representa entidades que não possuem capacidade de direção.
 * 
 * Esta implementação concreta do algoritmo de direção retorna uma mensagem
 * indicando a impossibilidade de dirigir.
 */

public class Nao_Dirige implements Padrao_Dirigir {
    @Override
    public String dirigir() {
        return "Não dirijo.";
    }
}
