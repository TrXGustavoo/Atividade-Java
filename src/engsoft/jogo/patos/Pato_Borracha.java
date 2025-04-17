package engsoft.jogo.patos;

/**
 * Implementação concreta de um pato de borracha.
 * 
 * Esta classe herda da classe abstrata Pato e representa um pato de borracha,
 * que não possui capacidade de voar nem de dançar. É um exemplo de como
 * diferentes tipos de patos podem ter comportamentos específicos através
 * do padrão Strategy.
 * 
 * @see Pato
 * @see Nao_Voa
 * @see Nao_Danca
 * @see Nao_Lutar
 */
public class Pato_Borracha extends Pato {

	public Pato_Borracha() {
		setComportamento(new Nao_Voa());
		setComportamentoDanca(new Nao_Danca());
		setComportamento(new Nao_Dirige());
		setComportamentoLuta(new Nao_Lutar());
	}

	public String mostrar() {
		return "Ol�, eu sou de Boarracha.";
	}

}
