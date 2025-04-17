package engsoft.jogo.patos;

public class Lutar_Capoeira implements Padrao_Lutar {
	
	private String luta;
	
	public Lutar_Capoeira() {
        this.luta = "Capoeira";
    }

    @Override
    public String lutar() {
        return "Lutando usando " + luta;
    }

    public String getLuta() {
        return luta;
    }
}
