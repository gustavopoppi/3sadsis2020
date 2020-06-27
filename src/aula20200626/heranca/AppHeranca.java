package aula20200626.heranca;

import java.util.List;
import java.util.ArrayList;

public class AppHeranca {

	public static void main(String[] args) {
		List<Animal> zoologico = new ArrayList<>();
		
		zoologico.add(new Aguia());
		zoologico.add(new Tigre());
		zoologico.add(new Minhoca());	
		
		for (Animal animal: zoologico) {
			//animal.alimentar();
			//animal.morrer();
			if (animal instanceof Vertebrado) {
				Vertebrado novaRef = (Vertebrado) animal;
				novaRef.formarOssos();
			}else if (animal instanceof Invertebrado){
				System.out.println("Invertebrado aqui");
			}
		}
	}

}
