package engsoft.jogo.patos;

/**
 * Interface Padrao_Dirigir
 * 
 * Esta interface define o comportamento de direção que pode ser implementado
 * por diferentes classes. Faz parte do padrão Strategy, permitindo que
 * diferentes algoritmos de direção sejam encapsulados e intercambiáveis.
 * 
 * As classes que implementam esta interface devem fornecer uma implementação
 * específica do método dirigir(), definindo como um objeto se movimenta ou
 * dirige.
 */

public interface Padrao_Dirigir {

    String dirigir();

}