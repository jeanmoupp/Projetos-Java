package com.mycompany.pp1;

class Produto {

    private final String nomeProduto;
    private final double precoProduto;

    Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        
    }

    public String getNome() {
        return nomeProduto;
    }

    public double getPreco() {
        return precoProduto;
    }

    
}
