package br.com.usjt.exercicio4.item1;

import java.util.TreeMap;

public class TesteAdapter {
	public static void main(String[] args) {
		String item[][] = {{"Amendo","Bobo"},{"Arroz","Doce"}};
		TreeMap<String, String> matriz = TreeMapAdapter.treeMapAdapter(item);
		System.out.println(matriz.toString());
	}
}
