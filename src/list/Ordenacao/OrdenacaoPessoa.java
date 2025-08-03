package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public  List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return  pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordp = new OrdenacaoPessoa();
        ordp.adicionarPessoa("Carla", 22, 1.70);
        ordp.adicionarPessoa("Carlos", 26, 1.60);
        ordp.adicionarPessoa("Marta", 33, 1.65);
        ordp.adicionarPessoa("João", 55, 1.80);

       System.out.println("Ordenação por altura: ");
        for(Pessoa p : ordp.ordenarPorAltura()){
            System.out.println(p);
        }
        System.out.println("***********************");

        System.out.println("Ordenação por idade: ");
        for(Pessoa p : ordp.ordenarPorIdade()){
            System.out.println(p);
        }
    }
}
