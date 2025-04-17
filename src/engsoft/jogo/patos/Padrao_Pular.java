package engsoft.jogo.patos;

/**
 * Interface que define o contrato para diferentes comportamentos de pulo.
 * 
 * Esta interface é parte do padrão Strategy e permite que diferentes tipos
 * de pulo sejam implementados e trocados dinamicamente. Todas as classes que
 * implementam esta interface devem fornecer uma implementação concreta para
 * o método pular(), que retorna uma descrição do pulo realizado.
 * 
 * As implementações desta interface podem representar diversos tipos de pulo
 * como pulo alto, pulo baixo, ou a ausência da capacidade de pular.
 */

public interface Padrao_Pular {

    String pular();

    int getAltura();
}