package view;

import controller.Arvore;

public class Main {

	public static void main(String[] args) {
		
		Arvore tree = new Arvore();
		
		int[] vetor = {12, 4, 2, 8, 6, 16};
		
		// Inserindo os valores do vetor na árovre
		for(int valor : vetor) {
			tree.insert(valor);
		}
		
		// Determinando o nível do nó 6
		try {
			tree.search(6);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
