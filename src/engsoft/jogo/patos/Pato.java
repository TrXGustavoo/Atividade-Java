package engsoft.jogo.patos;

/**
 * Classe abstrata base para todos os tipos de patos no sistema.
 * 
 * Esta classe implementa o padrão Strategy, delegando comportamentos
 * específicos
 * (voar e dançar) para classes estratégias separadas. Isso permite que
 * diferentes
 * tipos de patos possam ter comportamentos variados e que esses comportamentos
 * possam ser trocados dinamicamente em tempo de execução.
 * 
 * Cada subclasse concreta deve implementar o método mostrar() para definir
 * como o pato se apresenta.
 * 
 * @see Padrao_Voaveis
 * @see Padrao_Dancar
 */

public abstract class Pato {

	protected Padrao_Voaveis comportamento_pato;

	protected Padrao_Dancar comportamento_danca;

	protected Padrao_Pular comportamentoPulo;

	abstract String mostrar();

	public String nadar() {
		return "Pato Nadando.";
	}

	public void setComportamento(Padrao_Voaveis padrao) {
		comportamento_pato = padrao;
	}

	public String comportamento_pato() {
		return comportamento_pato.voar();

	}

	public void setComportamentoDanca(Padrao_Dancar danca) {
		comportamento_danca = danca;
	}

	public String comportamento_dancar() {
		return comportamento_danca.dancar();
	}

	public void setComportamentoPulo(Padrao_Pular cp) {
		comportamentoPulo = cp;
	}

	public String executarPulo() {
		if (comportamentoPulo != null) {
			return comportamentoPulo.pular();
		}
		return "Este pato não consegue pular.";
	}
}
