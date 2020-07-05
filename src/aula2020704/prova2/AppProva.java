package aula2020704.prova2;

import java.util.ArrayList;
import java.util.HashSet;

public class AppProva {

	public static void main(String[] args) {
		ArrayList<String> listaDeNomes = new ArrayList<>();
		listaDeNomes.add("Carla");
		listaDeNomes.add("Carla");
		listaDeNomes.add("Diego");
		listaDeNomes.add("Bruno");
		listaDeNomes.add("Carla");

		System.out.println("Quantidade total de nomes: " + listaDeNomes.size());
		
		HashSet<String> conjuntoDeNomes = new HashSet<>();
		conjuntoDeNomes.add("Carla");
		conjuntoDeNomes.add("Carla");
		conjuntoDeNomes.add("Diego");
		conjuntoDeNomes.add("Bruno");
		conjuntoDeNomes.add("Carla");

		System.out.println("Quantidade de nomes não repetidos: " + conjuntoDeNomes.size());
		
		System.out.println("#---------------------------#");

		Pais br = new Pais("Brasil", 55);
		
		Estado pr = new Estado("Paraná", "PR", 44);
		Estado sp = new Estado("São Paulo", "SP", 11);
		
		br.addEstado(pr);
		br.addEstado(sp);
		br.addEstado(pr);
		br.addEstado(sp);
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		
		
		listarPaisNoConsole(br);
		
		System.out.println("#---------------------------#");
		
	}

	private static void listarPaisNoConsole(Pais p) {
		System.out.println("---------------");
		System.out.println("País: " + p.getNome() + ", código DDI: " + p.getCodigoDDI());
		System.out.println("Quantidade de Estados: " + p.contaEstados());
		System.out.println("---------------");
		System.out.println("Estados:");
		for (Estado e : p.getEstados()) {
			System.out.println(e.getSigla() + "-" + e.getNome() + ": " + e.getCodigoDDD());
		}
	}
}
