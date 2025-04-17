package engsoft.jogo.patos;

public class Main {
    public static void main(String[] args) {
        // Testando o pato de borracha
        Pato pato1 = new Pato_Borracha();
        System.out.println(pato1.mostrar());
        System.out.println(pato1.comportamento_pato()); // voo
        System.out.println(pato1.comportamento_dancar()); // dança

        System.out.println("--------");

        // Testando o pato bravo
        Pato pato2 = new Pato_Bravo();
        System.out.println(pato2.mostrar());
        System.out.println(pato2.comportamento_pato());
        System.out.println(((Pato_Bravo)pato2).grasnar()); // grasnado
        System.out.println(pato2.comportamento_dancar());

        System.out.println("--------");

        // Mudando comportamento de dança em tempo de execução
        pato2.setComportamentoDanca(new Danca_Samba());
        System.out.println("Mudando dança do Pato Bravo...");
        System.out.println(pato2.comportamento_dancar());
    }
}
