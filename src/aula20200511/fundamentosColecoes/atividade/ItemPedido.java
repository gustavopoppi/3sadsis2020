package aula20200511.fundamentosColecoes.atividade;

public class ItemPedido {
	private double quantidade;
	private double preco;
	private Produto produto;	
	
	public ItemPedido(Produto produto, double quantidade, double preco) {
		//super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public double getQuantidade() {
		return this.quantidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public double getValorTotal() {
		return this.quantidade * this.preco;
	}
	
}
