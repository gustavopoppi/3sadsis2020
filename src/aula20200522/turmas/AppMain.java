package aula20200522.turmas;

import java.util.ArrayList;

public class AppMain {

	public static void main(String[] args) {

		Pais brasil = new Pais("Brasil", 55);

		brasil.addEstado(new Estado("Paran�", "PR", 44));
		brasil.addEstado(new Estado("Teste", "PR", 44));
		brasil.addEstado(new Estado("Teste2", "PR", 44));		
		brasil.addEstado(new Estado("Mato Grosso", "MT", 66));
		brasil.addEstado(new Estado("S�o Paulo", "SP", 11));

		System.out.println("Pa�s: " + brasil.getNome());

		
		for (Estado item : brasil.getEstados()) {
			System.out.println("#----------------------#");
			System.out.println(item.getNome());
		}
		
		System.out.println("Qtde estados: " + brasil.contarEstado());
	}

}
