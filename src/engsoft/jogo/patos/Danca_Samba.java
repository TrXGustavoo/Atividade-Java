package engsoft.jogo.patos;

public class Danca_Samba implements Padrao_Dancar {

    private String estilo;

    public Danca_Samba() {
        this.estilo = "Samba";
    }

    @Override
    public String dancar() {
        return "Dançando no estilo " + estilo + "! 🕺";
    }

    public String getEstilo() {
        return estilo;
    }
    
}
