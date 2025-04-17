package engsoft.jogo.patos;

public class Danca_Tango implements Padrao_Dancar {

    private String estilo;

    public Danca_Tango() {
        this.estilo = "Tango";
    }

    @Override
    public String dancar() {
        return "Dançando no estilo " + estilo + "! 💃";
    }

    public String getEstilo() {
        return estilo;
    }
    
}
