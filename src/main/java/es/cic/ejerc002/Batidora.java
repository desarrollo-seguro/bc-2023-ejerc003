package es.cic.ejerc002;

public class Batidora {
	
	private double tiempoTotalDeLaReceta;
	private double minutosRestantes;
	
	/* Comentario de prueba */
	
	public double calcularTiempoTotalDeReceta(double minuto1, double minuto2) {
		Calculadora objCalculadora = new Calculadora();
		
		objCalculadora.sumar(minuto1);
		objCalculadora.sumar(minuto2);
		
		tiempoTotalDeLaReceta = objCalculadora.getResultado();
		
		return tiempoTotalDeLaReceta;
		
	}
	
	/**
	 * 
	 * Método para calcular cuánto tiempo falta para completar la receta
	 * 
	 */
	public double calcularMinutosRestantes(double minutosPasados) {
		Calculadora objCalculadora = new Calculadora();
		
		objCalculadora.sumar(tiempoTotalDeLaReceta);
		objCalculadora.restar(minutosPasados);
		minutosRestantes = objCalculadora.getResultado();
		
		return minutosRestantes;
	}
	
	public double getTotalMinutos() {
		return tiempoTotalDeLaReceta;
	}
	
	public double getMinutosRestantes() {
		return minutosRestantes;
	}

}
