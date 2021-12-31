package servicos;

import java.util.ArrayList;
import java.util.List;

public class PrintServico {
	
	List<Integer> list = new ArrayList<>();
	
	public void addValor(Integer valor) {
		list.add(valor);
		
	}
	public Integer first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("lista é vazia");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
	

}
