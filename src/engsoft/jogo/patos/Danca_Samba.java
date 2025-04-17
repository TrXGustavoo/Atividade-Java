
/**
 * Implementação concreta de um comportamento de dança no estilo samba.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de dança,
 * permitindo que diferentes estilos de dança possam ser atribuídos 
 * dinamicamente aos patos. Quando utilizada, simula um pato dançando
 * samba, retornando uma mensagem que indica o estilo de dança.
 * 
 * @see Padrao_Dancar
 */
package engsoft.jogo.patos;

public class Danca_Samba implements Padrao_Dancar {

    private String estilo;

    public Danca_Samba() {
        this.estilo = "Samba";
    }

    @Override
    public String dancar() {
        return "Dançando no estilo " + estilo + "! 🕺";
    }

    public String getEstilo() {
        return estilo;
    }

}
