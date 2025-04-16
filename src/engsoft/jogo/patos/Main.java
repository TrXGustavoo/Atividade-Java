package engsoft.jogo.patos;



/**
 * Classe principal para demonstrar o comportamento dos patos no jogo.
 * Este exemplo cria um pato, exibe seus comportamentos padrão,
 * e altera seu comportamento em tempo de execução.
 */

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo();		
		
		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
		System.out.println(pt.comportamento_pato());
		
		pt.setComportamento(new Voar_Foguete());
		
		System.out.println(pt.comportamento_pato());
		
		pt.setComportamento(new Voar_Raso());
		
		System.out.println(pt.comportamento_pato());
		
		
	}

}
