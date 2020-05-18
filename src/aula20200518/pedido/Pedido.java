package aula20200518.pedido;

import java.util.ArrayList;
import java.util.HashSet;

public class Pedido {
	// - numero : int
	private int numero;

	// - itens (atributo de associação)
	private HashSet<ItemPedido> itens = new HashSet<>();

	// + getnumero() : int
	public int getNumero() {
		return numero;
	}

	// + Pedido(numero : int)
	public Pedido(int numero) {
		this.numero = numero;
	}

	// + adicionarItem(itemPedido : ItemPedido) : void
	public void adicionarItem(ItemPedido itemPedido) {
		this.itens.add(itemPedido);
	}

	// + getItens() : ArrayList<ItemPedido>
	public HashSet<ItemPedido> getItens() {
		return itens;
	}

	public double getValorTotal() {
		double valorTotal = 0;
		for (ItemPedido item : itens) {
			valorTotal += item.getValorTotal();
		}
		return valorTotal;
	}

}