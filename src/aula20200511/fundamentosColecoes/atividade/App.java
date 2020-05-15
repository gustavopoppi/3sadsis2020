package aula20200511.fundamentosColecoes.atividade;

import aula20200508.associacoesComArray.Endereco;

public class App {

	public static void main(String[] args) {
		Produto omo = new Produto("Omo");
		Produto coca = new Produto("Coca");

		Produto feijao = new Produto("Feijão");

		Pedido pedidoUm = new Pedido(1);
		pedidoUm.adicionarItem(new ItemPedido(omo, 1, 1));
		pedidoUm.adicionarItem(new ItemPedido(coca, 1.5, 6.2));

		Pedido pedidoDois = new Pedido(2);
		pedidoDois.adicionarItem(new ItemPedido(feijao, 2, 4.2));

		//System.out.println(pedidoUm.getItensPedido());
		// System.out.println(pedidoDois.getItensPedido());
		
		listarItensPedido(pedidoUm);
		listarItensPedido(pedidoDois);
	}

	public static void listarItensPedido(Pedido pedido) {
		System.out.println("Referente ao pedido: " + pedido.getNumero());
		for (int i = 0; i < pedido.getItensPedido().size(); i++) {
			ItemPedido e = pedido.getItensPedido().get(i);
			System.out.println("Item " + (i + 1) + ", produto: " + e.getProduto().getNome() + ", quantidade: "
					+ e.getQuantidade() + ", valor: R$" + e.getPreco());

		Produto feijao = new Produto("Feijão");
		
		ItemPedido itemUm = new ItemPedido(omo, 1, 1);
		ItemPedido itemDois = new ItemPedido(coca, 1.5, 6.2);
		
		Pedido pedidoUm = new Pedido(1);
		pedidoUm.adicionarItem(itemUm);
		pedidoUm.adicionarItem(itemDois);
		//System.out.println(pedidoUm.getItensPedido());

		for (int i = 0; i < pedidoUm.getItensPedido().size(); i++) {
			ItemPedido e = pedidoUm.getItensPedido().get(i);
			System.out.println("Pedido " + (i+1) + 
					   ", produto: " + e.getProduto().getNome() + 
					   ", quantidade: "+ e.getQuantidade() +
					   ", valor: R$" + e.getPreco());
		}
	}

}
