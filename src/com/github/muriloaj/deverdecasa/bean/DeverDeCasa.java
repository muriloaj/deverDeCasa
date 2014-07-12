package com.github.muriloaj.deverdecasa.bean;

import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DeverDeCasa {

	private static String[] acao = new String[] { "fiz", "pude fazer",
			"consegui concluir", "terminei" };
	private static String[] vitima = new String[] { "a tarefa", " o trabalho",
			"o dever de casa", "o projeto", "nadica de nada" };
	private static String[] razao = new String[] { "meu cachorro comeu",
			"eu me esqueci",
			"pegou fogo enquanto fazia e cozinhava ao mesmo tempo",
			"caiu no bueiro", "estava doando sangue",
			"foi extraviado no aeroporto junto a minha mala",
			"achei que era para semana que vem",
			"não sabia que era pra entregar", };

	private static String gerarMotivo() {
		Random rnd = new Random();
		StringBuilder str = new StringBuilder("Não ");
		str.append(acao[rnd.nextInt(acao.length)]);
		str.append(" ");
		str.append(vitima[rnd.nextInt(vitima.length)]);
		str.append(" porque ");
		str.append(razao[rnd.nextInt(razao.length)]);
		str.append(".");
		return str.toString();
	}

	public String getMotivo() {
		return DeverDeCasa.gerarMotivo();
	}

	
}
