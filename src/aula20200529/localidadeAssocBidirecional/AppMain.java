package aula20200529.localidadeAssocBidirecional;

import java.util.ArrayList;

public class AppMain {

	// ASSOCIA��O 1 PARA 1..*
	public static void main(String[] args) {

		Pais brasil = new Pais("Brasil", 55);
		
		Estado pr = new Estado("Paran�", brasil, "PR", 44);
		Estado ac = new Estado("Acre", brasil, "AC", 777);

		System.out.println("Pa�s do Paran�: " + pr.getPais().getNome());
		
		for (Estado item : brasil.getEstados()) {
			System.out.println("#----------------------#");
			System.out.println(item.getNome());
		}
		
		System.out.println("Qtde estados: " + brasil.contarEstado());
	}

}
