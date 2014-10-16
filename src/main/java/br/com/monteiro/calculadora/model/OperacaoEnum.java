package br.com.monteiro.calculadora.model;

public enum OperacaoEnum {
	SOMAR{
		public Integer calcula(Integer valor1, Integer valor2){
			Integer resultado = valor1 + valor2;
			return resultado;
		};
		
		public String toString(){
			return "Soma";
		}
	},
	SUBTRAIR{
		public Integer calcula(Integer valor1, Integer valor2){
			Integer resultado = valor1 - valor2;
			return resultado;
		};
		
		public String toString(){
			return "Subtração";
		}
	},
	MULTIPLICAR{
		public Integer calcula(Integer valor1, Integer valor2){
			Integer resultado = valor1 * valor2;
			return resultado;
		};
		
		public String toString(){
			return "Multiplicação";
		}
	},
	DIVIDIR{
		public Integer calcula(Integer valor1, Integer valor2){
			Integer resultado = valor1 / valor2;
			return resultado;
		};
		
		public String toString(){
			return "Divisão";
		}
	};
	
	public abstract Integer calcula(Integer valor1, Integer valor2);
	public abstract String toString();
	
}
