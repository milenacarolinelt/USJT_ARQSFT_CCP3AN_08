package br.com.usjt.exercicio6.item2;

public class TesteOrdenacao {
	
	public static void main(String[] args) {
		SortService service;
		
		System.out.println("--------- Bubble ---------");
		service = new SortService(new Bubble());
		service.sort(new int[]{100, 1, 234, 200, 20, 123, 13, 4, 32, 19, 3, 331, 10, 12, 23, 110, 9, 0});
		System.out.println("--------- Bubble ---------");
		
		System.out.println("--------- Insertion ---------");
		service = new SortService(new Insertion());
		service.sort(new int[]{100, 1, 234, 200, 20, 123, 13, 4, 32, 19, 3, 331, 10, 12, 23, 110, 9, 0});
		System.out.println("--------- Insertion ---------");
		
		System.out.println("--------- Quick ---------");
		service = new SortService(new Quick());
		service.sort(new int[]{100, 1, 234, 200, 20, 123, 13, 4, 32, 19, 3, 331, 10, 12, 23, 110, 9, 0});
		System.out.println("--------- Quick ---------");
		
		System.out.println("--------- Selection ---------");
		service = new SortService(new Selection());
		service.sort(new int[]{100, 1, 234, 200, 20, 123, 13, 4, 32, 19, 3, 331, 10, 12, 23, 110, 9, 0});
		System.out.println("--------- Selection ---------");
		
	}
}
