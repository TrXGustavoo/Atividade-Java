package engsoft.jogo.patos;

/**
 * Classe Dirigir_Carro
 * 
 * Esta classe implementa a interface Padrao_Dirigir como parte do padrão
 * Strategy.
 * Representa entidades que possuem a capacidade de dirigir carros.
 * 
 * Esta implementação concreta do algoritmo de direção retorna uma mensagem
 * indicando que está dirigindo um carro específico.
 */

public class Dirigir_Carro implements Padrao_Dirigir {

    public Dirigir_Carro() {

    }

    @Override
    public String dirigir() {
        return "Dirigindo um corsa... 🚘";
    }
}
