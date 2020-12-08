package sip.bom;

public interface InterfaceCalculadoraSalario {
	
	static double calcularSalario(Funcionario funcionario) {
		return funcionario.getCargo().getMultiplicadorSalario() * funcionario.getSalarioBase();
	}

}
