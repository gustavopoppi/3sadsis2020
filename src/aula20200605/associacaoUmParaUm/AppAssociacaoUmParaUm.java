package aula20200605.associacaoUmParaUm;

public class AppAssociacaoUmParaUm {

	public static void main(String[] args) {

		//Fechadura fechadura = null;
		//Porta porta = new Porta(null);
		Fechadura fechadura = new Fechadura();
		
		Porta porta = new Porta(fechadura);
		
		System.out.println("Fechadura da porta: " + porta.getFechadura());
		System.out.println("Porta da fechadura: " + fechadura.getPorta());
	}

}
