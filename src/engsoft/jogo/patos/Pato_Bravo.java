package engsoft.jogo.patos;

/**
 * Implementação concreta de um pato bravo (angry duck).
 * 
 * Esta classe herda da classe abstrata Pato e implementa a interface
 * Padrao_Grasnar,
 * representando um pato que demonstra comportamento agressivo. Este pato pode
 * voar
 * com suas asas, dançar tango e tem um grasnido característico com tom
 * irritado.
 * É um exemplo de como diferentes tipos de patos podem implementar
 * comportamentos
 * específicos através do padrão Strategy.
 * 
 * @see Pato
 * @see Padrao_Grasnar
 * @see Voaveis_Asa
 * @see Danca_Tango
 */

public class Pato_Bravo extends Pato implements Padrao_Grasnar {

	public Pato_Bravo() {
		setComportamento(new Voaveis_Asa());
		setComportamentoDanca(new Danca_Tango());
		setComportamento(new Dirigir_Carro());
	}

	public String mostrar() {
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}

}
