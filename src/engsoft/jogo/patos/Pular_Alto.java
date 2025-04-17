package engsoft.jogo.patos;

import java.util.Random;

/**
 * Implementação concreta de um comportamento de pulo alto.
 * 
 * Esta classe faz parte do padrão Strategy para comportamentos de pulo,
 * permitindo que diferentes tipos de pulo possam ser atribuídos
 * dinamicamente aos patos. Quando utilizada, simula um pato pulando
 * alto com altura aleatória, retornando uma mensagem que indica a altura do
 * pulo.
 * 
 * @see Padrao_Pular
 */

public class Pular_Alto implements Padrao_Pular {

    private Random random;
    private int altura;

    /**
     * Construtor que inicializa o comportamento de pulo alto.
     * A altura do pulo é definida aleatoriamente entre 30 e 70 centímetros.
     */

    public Pular_Alto() {
        this.random = new Random();
        // Gera um valor aleatório entre 30 e 70 centímetros
        this.altura = random.nextInt(41) + 30; // 30 + [0-40]
    }

    /**
     * Implementa o comportamento de pulo alto.
     * A cada chamada gera uma nova altura aleatória para o pulo.
     * 
     * @return Uma string descrevendo o pulo alto e sua altura aleatória.
     */

    @Override
    public String pular() {
        // Atualiza a altura com um novo valor aleatório a cada pulo
        this.altura = random.nextInt(41) + 30;
        return "Pulando bem alto! Altura: " + getAltura() + "cm 🦆";
    }

    /**
     * Retorna a altura atual do pulo.
     * 
     * @return A altura do pulo em centímetros.
     */

    @Override
    public int getAltura() {
        return altura;
    }
}