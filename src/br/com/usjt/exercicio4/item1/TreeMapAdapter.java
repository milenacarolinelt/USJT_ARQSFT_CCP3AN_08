package br.com.usjt.exercicio4.item1;
import java.util.TreeMap;

public class TreeMapAdapter extends TreeMap<Integer, Integer>{
	private static final long serialVersionUID = 1L;
	
	public static TreeMap<String, String> treeMapAdapter(String[][] matriz){
		TreeMap<String, String> map =  new TreeMap<>();
		for (String[] is : matriz) {
			map.put(is[0], is[1]);
		}
		return map;		
	}
	
}
