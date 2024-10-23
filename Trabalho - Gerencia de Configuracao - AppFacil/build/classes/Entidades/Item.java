package Entidades;

public class Item {
    private int id;
    private String nomeItem;
    private double preco;
    private String descricao;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String item) {
        this.nomeItem = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}