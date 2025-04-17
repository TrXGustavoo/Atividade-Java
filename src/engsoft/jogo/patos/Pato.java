package engsoft.jogo.patos;

// Classe abstrata porque indica que esta classe não pode ser instanciada diretamente

public abstract class Pato {
	
	protected Padrao_Voaveis comportamento_pato;

	protected Padrao_Dancar comportamento_danca; 


	abstract String mostrar();
	
	public String nadar()
	{
		return "Pato Nadando.";		
	}	
	
	public void setComportamento(Padrao_Voaveis padrao )
	{
		comportamento_pato = padrao;		
	}
	
	public String comportamento_pato()
	{		
		return comportamento_pato.voar();		

	}

	public void setComportamentoDanca(Padrao_Dancar danca) {
		comportamento_danca = danca;
	}

	public String comportamento_dancar() {
		return comportamento_danca.dancar();
	}
}
