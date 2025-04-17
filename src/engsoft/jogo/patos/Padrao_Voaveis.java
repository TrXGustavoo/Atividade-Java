package engsoft.jogo.patos;

/**
 * Interface que define o contrato para diferentes comportamentos de voo.
 * 
 * Esta interface é parte do padrão Strategy e permite que diferentes tipos
 * de voo sejam implementados e trocados dinamicamente. Todas as classes que
 * implementam esta interface devem fornecer implementações concretas para
 * os métodos voar() e getVelocidade().
 * 
 * As implementações desta interface podem representar diversos tipos de voo
 * como o de patos reais, patos com capacidade de voo limitada, ou patos que
 * não conseguem voar de forma alguma.
 */

public interface Padrao_Voaveis {

	String voar();

	double getVelocidade();

}
