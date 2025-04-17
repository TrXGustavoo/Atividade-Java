package engsoft.jogo.patos;


// É uma herença pode ser percebido por causa do extendes que indica que Pato_Bravo esta herdando Pato

public class Pato_Bravo extends Pato implements  Padrao_Grasnar{

	public Pato_Bravo()	
	{
		setComportamento(new Voaveis_Asa());	
		setComportamentoDanca(new Danca_Tango());	
	}
	
	public String mostrar() {		
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}

}
