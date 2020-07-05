package aula20200525.localidades;

public class AppLocalidades {
	
	public static void main(String[] args) {
		Pais br = new Pais("Brasil", 55);
		
		Estado pr = new Estado("Paran�", "PR", 44);
		Estado sp = new Estado("S�o Paulo", "SP", 11);
		
		br.addEstado(pr);
		br.addEstado(sp);
		br.addEstado(pr);
		br.addEstado(sp);
		br.addEstado(new Estado("Paran�", "PR", 44));
		br.addEstado(new Estado("Paran�", "PR", 44));
		br.addEstado(new Estado("Paran�", "PR", 44));
		br.addEstado(new Estado("Paran�", "PR", 44));
		br.addEstado(new Estado("Paran�", "PR", 44));
		
		
		listarPaisNoConsole(br);
	}
	
	private static void listarPaisNoConsole(Pais p) {
		System.out.println("---------------");
		System.out.println("Pa�s: " + p.getNome() + ", c�digo DDI: " + p.getCodigoDDI());
		System.out.println("Quantidade de Estados: " + p.contaEstados());
		System.out.println("---------------");
		System.out.println("Estados:");
		for (Estado e : p.getEstados()) {
			System.out.println(e.getSigla() + "-" + e.getNome() + ": " + e.getCodigoDDD());
		}
	}

}