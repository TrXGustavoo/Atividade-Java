package engsoft.jogo.patos;


// 	Classe concreta é uma classe que possui implementação completa para todos os seus métodos.


public class Voaveis_Asa implements Padrao_Voaveis {

	private double velocidade;

	public Voaveis_Asa() {
		velocidade = 10;
	}

	public String voar() {
		return "Voando como um p�ssaro que voa. Velocidade: "
				+ getVelocidade();
	}

	public double getVelocidade() {
		return velocidade;
	}

}
