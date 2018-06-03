package br.com.usjt.exercicio7.item1;

public class Minusculo extends StringTemplate{

	@Override
	public void tranformar(String texto) {
		System.out.println(texto.toLowerCase());
	}
}
