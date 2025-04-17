package engsoft.jogo.patos;

/**
 * Implementação concreta de um comportamento de voo em baixa altitude.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de voo,
 * permitindo representar patos que voam próximos ao chão ou à superfície da
 * água.
 * Quando utilizada, retorna uma mensagem indicando o método de voo
 * em baixa altitude e a velocidade moderada alcançada.
 * 
 * @see Padrao_Voaveis
 */

public class Voar_Raso implements Padrao_Voaveis {

	private double velocidade;

	public Voar_Raso() {
		velocidade = 100;
	}

	@Override
	public String voar() {
		return "Voando perto do ch�o. Velocidade: "
				+ getVelocidade();
	}

	@Override
	public double getVelocidade() {
		return velocidade;
	}

}
