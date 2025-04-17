package engsoft.jogo.patos;

/**
 * Interface que define o contrato para diferentes comportamentos de grasnido.
 * 
 * Esta interface é parte do padrão Strategy e permite que diferentes tipos
 * de grasnido sejam implementados e trocados dinamicamente. Todas as classes
 * que
 * implementam esta interface devem fornecer uma implementação concreta para
 * o método grasnar(), que retorna uma descrição do som produzido.
 * 
 * As implementações desta interface podem representar diversos tipos de
 * grasnido
 * como o de patos reais, patos de borracha, ou até mesmo apitos de caça que
 * simulam o som de patos.
 */

public interface Padrao_Grasnar {

	String grasnar();

}
