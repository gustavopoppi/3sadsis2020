package aula20200515.pedido;

import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		Produto fraldaPampersRN = new Produto("Fralda Pampers Confort Sec RN");
		Produto leiteNinhoFases2 = new Produto("Leite Ninho Infantil Fases 2");
		Produto feijao = new Produto("Feij�o Gr�o de Ouro 1kg");
		
		
		Pedido pedido100 = new Pedido(100);
		pedido100.adicionarItem(new ItemPedido(fraldaPampersRN, 2, 37.50));
		pedido100.adicionarItem(new ItemPedido(feijao, 4, 7.50));
		
		Pedido pedido200 = new Pedido(200);
		pedido200.adicionarItem(new ItemPedido(leiteNinhoFases2, 1, 27.30));
				
		Pedido pedido300 = new Pedido(300);
		pedido300.adicionarItem(new ItemPedido(leiteNinhoFases2, 7, 22.00));
		
		listarItensDoPedidoNoConsole(pedido100);
		listarItensDoPedidoNoConsole(pedido200);
		listarItensDoPedidoNoConsole(pedido300);
		
	}
	
	public static void listarItensDoPedidoNoConsole(Pedido p) {
		ArrayList<ItemPedido>  itensDoPedido = p.getItens();
		System.out.println("---------------------------------------");
		System.out.println("Itens do pedido nro " + p.getNumero() + " Valor total = " + p.getValorTotal());
		for (ItemPedido item : itensDoPedido) {
			System.out.println(item.getProduto().getNome() + " " + item.getQuantidade() + " " + item.getPreco() + " " + item.getValorTotal());
		}
		System.out.println("---------------------------------------");
	}

}
