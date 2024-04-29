package com.loja.rock.entity;

public class ProdutoModel {
   
    private int idProduto;
    private String nome;
    private String descricao;
    private double preco;

   
    public ProdutoModel(int idProduto, String nome, String descricao, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}