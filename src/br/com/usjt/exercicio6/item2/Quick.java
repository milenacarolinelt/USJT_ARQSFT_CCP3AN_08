package br.com.usjt.exercicio6.item2;

public class Quick implements Sort {

	@Override
	public int[] sort(int[] v) {
		return quicksort(v, 0, v.length - 1);
	}

	private int separa(int v[], int p, int r) {
		int c = v[p + ((int) (Math.random() * (1 + r - p) * 1000) % (1 + r - p))];
		int i = p + 1, j = r, t;
		while (true) {
			while (i <= r && v[i] <= c)
				++i;
			while (c < v[j])
				--j;
			if (i >= j)
				break;
			t = v[i];
			v[i] = v[j];
			v[j] = t;
			++i;
			--j;
		}
		v[p] = v[j];
		v[j] = c;
		return j;
	}

	public int[] quicksort(int v[], int p, int r) {
		int j;
		if (p < r) {
			j = separa(v, p, r);
			quicksort(v, p, j - 1);
			quicksort(v, j + 1, r);
		}
		return v;
	}
}
