package br.com.monteiro.calculadora.controller;


import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.monteiro.calculadora.model.OperacaoEnum;

@Resource
public class CalculadoraController {
	
	private Result result;
	
	public CalculadoraController(Result result) {
		this.result = result;
		result.include("operacoes", getListOperacao());
	}

	public void formulario(){}

	public void calcula(OperacaoEnum operacao, Integer valor1, Integer valor2){
		Integer resultado = 0;
		String mensagem = "";
		resultado = operacao.calcula(valor1, valor2);
		mensagem = montaMensagem(operacao, valor1, valor2, resultado);
		result.include("mensagem", mensagem);
		result.of(this).formulario();
	}
	
	private List<OperacaoEnum> getListOperacao(){
		List<OperacaoEnum> lista = new ArrayList<OperacaoEnum>();
		for (OperacaoEnum operacao : OperacaoEnum.values()) {
			lista.add(operacao);
		}
		return lista;
	}
	
	private String montaMensagem(OperacaoEnum operacao, Integer valor1, Integer valor2, Integer resultado){
		return "A " + operacao.toString() + " dos valores ( "+valor1+" , "+ valor2+" ) é igual a "+resultado;
	}
}
