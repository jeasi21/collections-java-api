package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){
       List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesqusaPorInteraloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);

                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args){
        CatalogoLivros catalagoLivros = new CatalogoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor1", 2020);
        catalagoLivros.adicionarLivro("Livro 1", "Autor2", 2021);
        catalagoLivros.adicionarLivro("Livro 2", "Autor2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor4", 2000);
        catalagoLivros.adicionarLivro("Livro 5", "Autor1", 2001);


        System.out.println(catalagoLivros.pesquisarPorAutor("Autor1"));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));
        System.out.println(catalagoLivros.pesqusaPorInteraloAnos(2000, 2001));


    }
}
