package list.Desafios;

public class Item {
    private String produto;
    private String descicao;

    public Item(String produto, String descicao) {
        this.produto = produto;
        this.descicao = descicao;
    }

    public String getProduto() {
        return produto;
    }



    @Override
    public String toString() {
        return "\nProduto: " + produto + ", Descrição: " + descicao;
    }
}
