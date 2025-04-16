package engsoft.jogo.patos;

// 	Classe concreta é uma classe que possui implementação completa para todos os seus métodos.


public class Voar_Foguete implements Padrao_Voaveis{
	
	private double velocidade;
	
	public Voar_Foguete()
	{
		velocidade = 1000;	
	}
	
	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();		
	}

	public double getVelocidade() {
		return velocidade;
	}	
}
