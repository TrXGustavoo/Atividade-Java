package engsoft.jogo.patos;

/**
 * Implementação concreta de um comportamento de grasnido que simula um apito de
 * caça.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de grasnido,
 * permitindo que diferentes sons possam ser atribuídos dinamicamente aos patos.
 * Quando utilizada, produz o som característico de um apito de caça para patos
 * representado pela string "Queeeeee".
 * 
 * @see Padrao_Grasnar
 */
public class Apito implements Padrao_Grasnar {

	public String grasnar() {
		return "Queeeeee";
	}
}
