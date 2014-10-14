package br.com.monteiro.calculadora.model;

public class Multiplica implements Calculador {

	@Override
	public Integer calcula(Integer valor1, Integer valor2) {
		Integer resultado = valor1 * valor2;
		return resultado;
	}

	@Override
	public String toString() {
		return "Multiplicação";
	}
}
