package ejc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("1");
		nomes.add("2");
		nomes.add("3");
		nomes.add("4");
		nomes.add("5");
		nomes.add("6");
		nomes.add("7");
		for (int i = 0; i < nomes.size(); i++) {
			nomes.remove(i);
		}
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(2));
	}

}
