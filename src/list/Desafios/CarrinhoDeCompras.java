package list.Desafios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> produtoLista;

    public CarrinhoDeCompras(){
        this.produtoLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, String descricao){
        produtoLista.add(new Item(nome, descricao));
    }

    public int obterTotaDeProdutos(){
        return produtoLista.size();
    }

    public void obterInfomacaoDoProduto(){
        System.out.println(produtoLista);
    }

    public void removerItem(String produto){
        List<Item> itensParaRemover = new ArrayList<>();
        for( Item p : produtoLista){
            if(p.getProduto().equalsIgnoreCase(produto)){
                itensParaRemover.add(p);
            }
        }
        produtoLista.removeAll(itensParaRemover);
    }


    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Total de produtos cadastrados: " +  carrinhoDeCompras.obterTotaDeProdutos());

        carrinhoDeCompras.adicionarItem("feijão gama lopes", "tipo I");
        carrinhoDeCompras.adicionarItem("feijão gama lopes", "tipo II");
        carrinhoDeCompras.adicionarItem("Arroz Fazenda", "parbolizado");
        carrinhoDeCompras.adicionarItem("leite desnatado", "menos calorias");
        carrinhoDeCompras.adicionarItem("Açucar Cristal", "refinado");
        carrinhoDeCompras.adicionarItem("Sabão grosso", "azul");
        System.out.println("Total de produtos cadastrados: " +  carrinhoDeCompras.obterTotaDeProdutos());


        carrinhoDeCompras.removerItem("feijão gama lopes");

        System.out.println("Total de produtos cadastrados: " +  carrinhoDeCompras.obterTotaDeProdutos());

        carrinhoDeCompras.obterInfomacaoDoProduto();

        System.out.println("Total de produtos cadastrados: " +  carrinhoDeCompras.obterTotaDeProdutos());

    }



}
