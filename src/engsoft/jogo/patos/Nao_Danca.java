/**
 * Implementação concreta de um comportamento para patos que optam por não dançar.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de dança,
 * permitindo representar patos que não desejam ou não são capazes de dançar.
 * Quando utilizada, retorna uma mensagem indicando a recusa em dançar.
 * 
 * @see Padrao_Dancar
 */

package engsoft.jogo.patos;

public class Nao_Danca implements Padrao_Dancar {
    @Override
    public String dancar() {
        return "Prefiro não dançar. 🦆";
    }
}
