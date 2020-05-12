package aula20200511.fundamentosColecoes.atividade;

import aula20200508.associacoesComArray.Endereco;

public class App {

	public static void main(String[] args) {
		Produto omo = new Produto("Omo");
		Produto coca = new Produto("Coca");
		Produto feijao = new Produto("Feijão");
		
		ItemPedido itemUm = new ItemPedido(omo, 1, 1);
		ItemPedido itemDois = new ItemPedido(coca, 1.5, 6.2);
		
		Pedido pedidoUm = new Pedido(1);
		pedidoUm.adicionarItem(itemUm);
		pedidoUm.adicionarItem(itemDois);
		System.out.println(pedidoUm.getItensPedido());

		for (int i = 0; i < pedidoUm.getItensPedido().size(); i++) {
			ItemPedido e = pedidoUm.getItensPedido().get(i);
			System.out.println("Pedido " + (i+1) + 
					           ", produto: " + e.getProduto().getNome() + 
					           ", quantidade: "+ e.getQuantidade() +
							   ", valor: R$" + e.getPreco());
		}
	}

}
