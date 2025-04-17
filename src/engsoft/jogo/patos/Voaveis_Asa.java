package engsoft.jogo.patos;

/**
 * Implementação concreta de um comportamento de voo natural usando asas.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de voo,
 * permitindo representar patos que voam naturalmente usando suas asas.
 * Quando utilizada, retorna uma mensagem descrevendo o voo natural
 * e a velocidade padrão alcançada por patos comuns.
 * 
 * @see Padrao_Voaveis
 */
public class Voaveis_Asa implements Padrao_Voaveis {

	private double velocidade;

	public Voaveis_Asa() {
		velocidade = 10;
	}

	public String voar() {
		return "Voando como um p�ssaro que voa. Velocidade: "
				+ getVelocidade();
	}

	public double getVelocidade() {
		return velocidade;
	}

}
