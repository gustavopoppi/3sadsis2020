package aula20200518.pedido;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		temp = Double.doubleToLongBits(quantidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (Double.doubleToLongBits(quantidade) != Double.doubleToLongBits(other.quantidade))
			return false;
		return true;
	}
}