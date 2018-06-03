package br.com.usjt.exercicio7.item1;

public class TesteTemplate {
	public static void main(String[] args) {
		String texto = "Queria estar morta";
		System.out.println("--------- Duplicar ---------");
		StringTemplate template = new Duplicar();
		template.tranformar(texto);

		System.out.println("--------- Inverter ---------");
		template = new Inverter();
		template.tranformar(texto);

		System.out.println("--------- Maiusculo ---------");
		template = new Maiusculo();
		template.tranformar(texto);

		System.out.println("--------- Minusculo ---------");
		template = new Minusculo();
		template.tranformar(texto);
	}
}
