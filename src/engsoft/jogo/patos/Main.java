/**
 * Classe principal que demonstra o uso do padrão Strategy com diferentes tipos de patos.
 * 
 * Esta classe contém o método main que cria instâncias de diferentes tipos de patos
 * e demonstra como seus comportamentos podem ser exibidos e alterados dinamicamente
 * em tempo de execução e que seta o comportamento do pato em tempo real.
 */
package engsoft.jogo.patos;

public class Main {
    public static void main(String[] args) {
        // Testando o pato Ruivo
        Pato pato1 = new Pato_Ruivo();
        System.out.println(pato1.mostrar());
        System.out.println(pato1.comportamento_pato()); // voo
        System.out.println(pato1.comportamento_dancar()); // dança
        System.out.println(pato1.comportamento_lutar()); // lutar
        System.out.println("Pato Ruivo " + pato1.executarPulo());

        System.out.println("--------");

        // Testando o pato bravo
        Pato pato2 = new Pato_Bravo();
        System.out.println(pato2.mostrar());
        System.out.println(pato2.comportamento_pato());
        System.out.println(((Pato_Bravo) pato2).grasnar()); // grasnado
        System.out.println(pato2.comportamento_dancar());
        System.out.println(pato2.comportamento_dirige()); // dirige
        System.out.println(pato2.comportamento_lutar()); // lutar

        System.out.println("--------");

        // Mudando comportamento de dança em tempo de execução
        pato2.setComportamentoDanca(new Danca_Samba());
        System.out.println("Mudando dança do Pato Bravo...");
        System.out.println(pato2.comportamento_dancar());

        System.out.println("--------");

        // Testando o pato de borracha
        Pato pato3 = new Pato_Borracha();
        System.out.println(pato3.mostrar());
        System.out.println(pato3.comportamento_pato()); // voo
        System.out.println(pato3.comportamento_dancar()); // dança
        System.out.println(pato3.comportamento_dirige()); // dirige
        System.out.println(pato3.comportamento_lutar()); // lutar
    }
}
