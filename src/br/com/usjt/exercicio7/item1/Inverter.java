package br.com.usjt.exercicio7.item1;

public class Inverter extends StringTemplate{

	@Override
	public void tranformar(String texto) {
		char[] p = texto.toCharArray();
		String texto2 = "";
		for(int i=p.length - 1; i >= 0; i--)
			texto2 += p[i];
		System.out.println(texto2);
	}

}
