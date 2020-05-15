package aula20200515.pedido;

public class ItemPedido {
	//- quantidade : double
	private double quantidade;
	
	//- preco : double
	private double preco;
	
	//- produto (atributo de associação) 
	private Produto produto;
	
	//+ getQuantidade() : double
	public double getQuantidade() {
		return quantidade;
	}
	
	//+ getpreco() : double
	public double getPreco() {
		return preco;
	}
	
	//+ getProduto() : Produto
	public Produto getProduto() {
		return produto;
	}
	
	//+ ItemPedido(produto : Produto, quantidade : double, preco : double)
	public ItemPedido(Produto produto, double quantidade, double preco) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public double getValorTotal() {
		return this.preco * this.quantidade;
	}
}