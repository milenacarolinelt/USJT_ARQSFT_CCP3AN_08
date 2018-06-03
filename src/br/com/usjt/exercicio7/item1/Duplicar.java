package br.com.usjt.exercicio7.item1;

public class Duplicar extends StringTemplate{

	@Override
	public void tranformar(String texto) {
		String texto2 = "";
		for(int i = 0; i < texto.length(); i++)
			texto2 += texto.substring(i, i+1) + texto.substring(i, i+1);
		System.out.println(texto2);
	}

}
