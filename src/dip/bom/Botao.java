package dip.bom;

public class Botao {
	
	private InterfaceDispositivo dispositivo;
	
	public Botao(InterfaceDispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public void acionar() {
		if (dispositivo.isLigada()) {
			dispositivo.desligar();
		} else {
			dispositivo	.ligar();
		}
	}
	
}
