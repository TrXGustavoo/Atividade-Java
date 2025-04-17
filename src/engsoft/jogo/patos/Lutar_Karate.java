package engsoft.jogo.patos;

public class Lutar_Karate implements Padrao_Lutar {
	
	private String luta;
	
	public Lutar_Karate() {
        this.luta = "Karete";
    }

    @Override
    public String lutar() {
        return "Lutando usando " + luta;
    }

    public String getLuta() {
        return luta;
    }
}
