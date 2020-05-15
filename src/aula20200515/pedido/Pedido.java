package aula20200515.pedido;

import java.util.ArrayList;

public class Pedido {
	//- numero : int
	private int numero;
	
	//- itens (atributo de associação)
	private ArrayList<ItemPedido> itens = new ArrayList<>();
	
	//+ getnumero() : int
	public int getNumero() {
		return numero;
	}
	
	//+ Pedido(numero : int)
	public Pedido(int numero) {
		this.numero = numero;
	}
	
	//+ adicionarItem(itemPedido : ItemPedido) : void
	public void adicionarItem(ItemPedido itemPedido) {
		this.itens.add(itemPedido);
	}
	 
	//+ getItens() : ArrayList<ItemPedido>
	public ArrayList<ItemPedido> getItens() {
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