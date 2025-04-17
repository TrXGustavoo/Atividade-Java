package engsoft.jogo.patos;

/**
 * Implementação concreta de um pato ruivo.
 * 
 * Esta classe herda da classe abstrata Pato e implementa a interface
 * Padrao_Grasnar,
 * representando um pato ruivo típico. Este pato pode voar com suas asas, dançar
 * samba e tem um grasnido característico. É um exemplo de como diferentes tipos
 * de patos podem implementar comportamentos específicos através do padrão
 * Strategy.
 * 
 * @see Pato
 * @see Padrao_Grasnar
 * @see Voaveis_Asa
 * @see Danca_Samba
 */

public class Pato_Ruivo extends Pato implements Padrao_Grasnar {

	public Pato_Ruivo() {
		setComportamento(new Voaveis_Asa());
		setComportamentoDanca(new Danca_Samba());
	}

	public String mostrar() {
		return "Eu sou o Pato Ruivo.";
	}

	public String grasnar() {
		// TODO Auto-generated method stub
		return "Que-Que.";

	}

}
