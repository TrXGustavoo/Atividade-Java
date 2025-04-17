
/**
 * Interface que define o contrato para diferentes comportamentos de dança.
 * 
 * Esta interface é parte do padrão Strategy e permite que diferentes estilos
 * de dança sejam implementados e trocados dinamicamente. Todas as classes que
 * implementam esta interface devem fornecer uma implementação concreta para
 * o método dancar(), que retorna uma descrição do comportamento de dança.
 * 
 * As implementações desta interface podem representar diversos estilos de dança
 * como samba e tango, ou mesmo a ausência de dança.
 */

package engsoft.jogo.patos;

public interface Padrao_Dancar {

    String dancar();

}