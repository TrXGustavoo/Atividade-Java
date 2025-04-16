package engsoft.jogo.patos;

// 	Classe concreta é uma classe que possui implementação completa para todos os seus métodos.

public class Nao_Voa implements Padrao_Voaveis {

	
	public Nao_Voa()
	{
			
	}
	
	public String voar() {
		return "Esse pato n�o Voa. Velocidade: " + getVelocidade();
	}

	public double getVelocidade() {
		return 0;
	}

}
