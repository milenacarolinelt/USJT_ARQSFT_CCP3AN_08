package br.com.usjt.exercicio7.item2;

public class Num implements Comparable<Num> {
	private int first;
	private int last;
	
	public Num(double num) {
		String t = num + "";
		this.first = Integer.parseInt(t.substring(0, t.indexOf(".")));
		this.last = Integer.parseInt(t.substring(t.indexOf(".") + 1));
	}	
	
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return first + "." + last;
	}

	@Override
	public int compareTo(Num outro) {
		if (this.last < outro.last)
            return -1;
        if (this.last > outro.last)
        	return 1;
		return 0;
	}

}
