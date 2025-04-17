package engsoft.jogo.patos;

// É uma herença pode ser percebido por causa do extendes que indica que Pato_Ruivo esta herdando Pato

public class Pato_Ruivo extends Pato implements Padrao_Grasnar{

	public Pato_Ruivo()
	{
		setComportamento(new Voaveis_Asa());	
		setComportamentoDanca(new Danca_Samba());	
	}
	
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ;
	}

	public String grasnar() {
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

}
