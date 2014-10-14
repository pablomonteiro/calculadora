package br.com.monteiro.calculadora.model;

public enum OperacaoEnum {
	SOMAR{
		public Calculador retornaOperacao(){
			return new Soma();
		};
	},
	SUBTRAIR{
		public Calculador retornaOperacao(){
			return new Subtrai();
		};
	},
	MULTIPLICAR{
		public Calculador retornaOperacao(){
			return new Multiplica();
		};
	},
	DIVIDIR{
		public Calculador retornaOperacao(){
			return new Divide();
		};
	};
	
	public abstract Calculador retornaOperacao();
	
}
