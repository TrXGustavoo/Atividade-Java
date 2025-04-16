package engsoft.jogo.patos;

// 	Classe concreta é uma classe que possui implementação completa para todos os seus métodos.


public class Voar_Raso implements Padrao_Voaveis {
	
	private double velocidade;
	
	public Voar_Raso() {
		velocidade = 100;
	}

	@Override
	public String voar() {
		return "Voando perto do ch�o. Velocidade: "
				+ getVelocidade();
	}

	@Override
	public double getVelocidade() {
		return velocidade;
	}

}
