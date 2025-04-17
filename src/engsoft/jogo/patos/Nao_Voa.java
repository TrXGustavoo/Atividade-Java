package engsoft.jogo.patos;

/**
 * Implementação concreta de um comportamento para patos que não conseguem voar.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de voo,
 * permitindo representar patos que não possuem capacidade de voo.
 * Quando utilizada, retorna uma mensagem indicando que o pato não voa
 * e sua velocidade é zero.
 * 
 * @see Padrao_Voaveis
 */
public class Nao_Voa implements Padrao_Voaveis {

	public Nao_Voa() {

	}

	public String voar() {
		return "Esse pato n�o Voa. Velocidade: " + getVelocidade();
	}

	public double getVelocidade() {
		return 0;
	}

}
