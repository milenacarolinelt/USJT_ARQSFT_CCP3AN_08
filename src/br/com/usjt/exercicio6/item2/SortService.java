package br.com.usjt.exercicio6.item2;

public class SortService {
	private final Sort sort;
	
	public SortService(Sort sort) {
		this.sort = sort;
	}
	
	public void sort(int[] value){
		String texto = "";
		for (int i: value)
			texto += i + " ";
		System.out.println(texto);
		sort.sort(value);
		texto = "";
		for (int i: value)
			texto += i + " ";
		System.out.println(texto);
	}
}
