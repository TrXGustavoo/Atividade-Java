package engsoft.jogo.patos;

// É uma herença pode ser percebido por causa do extendes que indica que Pato_Borracha esta herdando Pato

public class Pato_Borracha extends Pato {

	public Pato_Borracha()
	{
		setComportamento(new Nao_Voa());	
		setComportamentoDanca(new Nao_Danca());	
	}
	
	public String mostrar() {
		return "Ol�, eu sou de Boarracha.";
	}
	
}
