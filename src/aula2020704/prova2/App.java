package aula2020704.prova2;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor("Nome Diretor",5000);
		Programador programador = new Programador("Nome Programador", 1500);
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		funcionario.add(diretor);
		funcionario.add(programador);
		
		for (Funcionario func: funcionario) {			
			System.out.println(func.getBonificacao());
		}
	}
}
