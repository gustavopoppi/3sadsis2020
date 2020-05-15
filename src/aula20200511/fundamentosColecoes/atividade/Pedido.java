package aula20200511.fundamentosColecoes.atividade;

import java.util.ArrayList;

public class Pedido {
	private int numero;
	private ArrayList<ItemPedido> itensPedido = new ArrayList<ItemPedido>();
	
	public Pedido(int numero) {
		//super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public void adicionarItem(ItemPedido itensPedido) {
		this.itensPedido.add(itensPedido);
	}
	
	public ArrayList<ItemPedido> getItensPedido() {
		return this.itensPedido;
	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		
		for (ItemPedido item : itensPedido) {
			valorTotal += item.getValorTotal();
		}
		return valorTotal;
	}
}
