package sip.bom;

public enum Cargo {
	
	
	DESENVOLVEDOR(1.1),
	DBA(1.2),
	GERENTE(1.3);
	
	private double multiplicadorSalario;

	Cargo(double multiplicadorSalario) {
		this.multiplicadorSalario = multiplicadorSalario;
	}

	public double getMultiplicadorSalario() {
		return this.multiplicadorSalario;
	}

}
