package engsoft.jogo.patos;

/**
 * Implementação concreta de um comportamento de voo propulsionado por foguete.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de voo,
 * permitindo representar patos com capacidade de voo extremamente rápida
 * devido à propulsão por foguete. Quando utilizada, retorna uma mensagem
 * indicando o método de voo por foguete e a velocidade extraordinária atingida.
 * 
 * @see Padrao_Voaveis
 */

public class Voar_Foguete implements Padrao_Voaveis {

	private double velocidade;

	public Voar_Foguete() {
		velocidade = 1000;
	}

	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();
	}

	public double getVelocidade() {
		return velocidade;
	}
}
