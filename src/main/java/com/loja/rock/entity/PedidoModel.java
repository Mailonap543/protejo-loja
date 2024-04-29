package com.loja.rock.entity;

import java.util.ArrayList;
import java.util.List;

public class PedidoModel {
   
    private int idPedido;
    private List<DetalhesPedidoModel> detalhesPedido;
    private double valorTotal;

  
    public PedidoModel(int idPedido) {
        this.idPedido = idPedido;
        this.detalhesPedido = new ArrayList<>();
        this.valorTotal = 0.0;
    }

   
    public int getIdPedido() {
        return idPedido;
    }

    public List<DetalhesPedidoModel> getDetalhesPedido() {
        return detalhesPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }


}
