package aula20200413.exForum;

public class AppConta {

	public static void main(String[] args) {
		try {
			Conta conta = new Conta(222, 52468, -123);
			
			conta.depositar(100);
			conta.getSaldo();
		}catch(RuntimeException ex) {
			System.out.println("Mensagem da exceção: " + ex.getMessage());
		}

	}

}
