package es.cic.ejerc002;

public class Calculadora {
	
	private double resultado;
	

	public void sumar(double sumando) {
		this.resultado += sumando;
	}
	
	public void restar(double substraendo) {
		this.resultado -= substraendo;
	} 
	
	public void multiplicar(double factor) {
		this.resultado *= factor;
	}
	
	public void dividir(double divisor) {
		this.resultado /= divisor;
	}
	
	public double getResultado() {
		return resultado;
	}

}
