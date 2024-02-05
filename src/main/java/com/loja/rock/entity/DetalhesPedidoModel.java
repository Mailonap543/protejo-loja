package com.loja.rock.entity;

public class DetalhesPedidoModel {

  private long idPedido;
  private long idProduto;
  private int quantidade;

  public long getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(long idPedido) {
    this.idPedido = idPedido;
  }

  public long getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(long idProduto) {
    this.idProduto = idProduto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public int calcularTotal(){
    //TODO: IMPLEMENTAR ESSA FUNÇÃO
    return 0;
  }
}
