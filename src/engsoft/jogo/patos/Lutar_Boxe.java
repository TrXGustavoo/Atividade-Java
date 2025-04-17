package engsoft.jogo.patos;

public class Lutar_Boxe implements Padrao_Lutar {

	private String luta;
	
	public Lutar_Boxe() {
        this.luta = "Boxe";
    }

    @Override
    public String lutar() {
        return "Lutando usando " + luta;
    }

    public String getLuta() {
        return luta;
    }
}
