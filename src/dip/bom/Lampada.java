package dip.bom;

public class Lampada implements InterfaceDispositivo {
	
	private boolean ligada;
	
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean isLigada() {
		return ligada;
	}
	
	public void ligar() {
		this.ligada = true;
		System.out.println("Lâmpada ligada");
	}

	public void desligar() {
		this.ligada = false;
		System.out.println("Lâmpada desligada");
	}

}
