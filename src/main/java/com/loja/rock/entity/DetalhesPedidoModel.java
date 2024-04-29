package com.loja.rock.entity;

public class DetalhesPedidoModel {
private Long id;
private Long idPedido;
private Long idProduto;
private int quantidade;

public double calcularTotal() {
	return 0;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getIdPedido() {
	return idPedido;
}

public void setIdPedido(Long idPedido) {
	this.idPedido = idPedido;
}

public Long getIdProduto() {
	return idProduto;
}

public void setIdProduto(Long idProduto) {
	this.idProduto = idProduto;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
}
