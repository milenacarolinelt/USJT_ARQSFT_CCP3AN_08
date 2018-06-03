package br.com.usjt.exercicio7.item2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteComparar {
	public static void main(String[] args) {
		List<Num> lista = new ArrayList<Num>();
		lista.add(new Num(30.67));
		lista.add(new Num(1.1));
		lista.add(new Num(21.1));
		lista.add(new Num(12.2));
		lista.add(new Num(12.17));
		lista.add(new Num(1.02));
		lista.add(new Num(0.90));
		lista.add(new Num(2.5));
		lista.add(new Num(90.10));
		lista.add(new Num(225.5));
		lista.add(new Num(25.67));
		lista.add(new Num(10.5));
		lista.add(new Num(0.5));
		System.out.println(lista.toString());
		Collections.sort(lista);
		System.out.println(lista.toString());
		lista.sort(new Comparator<Num>() {
			
			@Override
			public int compare(Num f, Num l) {
				if (f.getFirst() < l.getFirst())
		            return -1;
		        if (f.getFirst() > l.getFirst())
		        	return 1;
				return 0;
			}			
		});
		System.out.println(lista.toString());
	}
}
