package br.com.usjt.exercicio4.item2;

public class TesteAdapter {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
