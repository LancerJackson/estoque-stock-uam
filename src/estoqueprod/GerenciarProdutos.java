package estoqueprod;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GerenciarProdutos {

    private static ArrayList<Produto> produtos = new ArrayList();
    
    public static ArrayList<Produto> getListaProutos() {
        return produtos;
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }
    
    public boolean remover(int codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == codigo){
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }

    public Produto buscarPorCodigo(int codigo) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
    
    public String listarEletronicos() {
        String saida = "<html><body>";
        if (produtos.isEmpty()) {
            saida = "Nenhuma produto cadastro.";
        } else {
            for (Produto produto : produtos) {
                if(produto instanceof Eletronico){
                    saida += produto.imprimirSoEletronicos();
               }
            }
            saida += "</body></html>";
        }
        return saida;
    }

    public String listarPereciveis() {
        String saida = "<html><body>";
        if (produtos.isEmpty()) {
            saida = "Nenhuma produto cadastro.";
        } else {
            for (Produto produto : produtos) {
                if(produto instanceof Perecivel){
                    saida += produto.imprimirSoPereciveis();
               }
            }
            saida += "</body></html>";
        }
        return saida;
    }

    public String listarMoveis() {
        String saida = "<html><body>";
        if (produtos.isEmpty()) {
            saida = "Nenhuma produto cadastro.";
        } else {
            for (Produto produto : produtos) {
                if(produto instanceof Movel){
                    saida += produto.imprimirSoMoveis();
               }
            }
            saida += "</body></html>";
        }
        return saida;
    }

    public String listarEstoqueMenorQue(int quantidadeMinima) {
        String saida = "<html><body>";
        if (produtos.isEmpty()) {
            saida = "Nenhuma produto cadastro.";
        } else {
            for (Produto produto : produtos) {
                if(produto.getQuantidadeEstoque() < quantidadeMinima){
                    saida += produto.imprimir2();
               }
            }
            saida += "</body></html>";
        }
        return saida;
    }
    
    public String listarEstoqueVazio() {
        String saida = "<html><body>";
        if (produtos.isEmpty()) {
            saida = "Nenhuma produto cadastro.";
        } else {
            for (Produto produto : produtos) {
                if(produto.getQuantidadeEstoque() == 0){
                    saida += produto.imprimir2();
               }
            }
            saida += "</body></html>";
        }
        return saida;
    }
    
    public String listarPorFabricante(String fabricante) {
        String saida = "<html><body>";
        if (produtos.isEmpty()) {
            saida = "Nenhuma produto cadastro.";
        } else {
            for (Produto produto : produtos) {
                if(produto.getFabricante().equals(fabricante)){
                    saida += produto.imprimir2();
               }
            }
            saida += "</body></html>";
        }
        return saida;
    }

    public String listarPorValidade(LocalDate validade) {
        String saida = "<html><body>";
        if (produtos.isEmpty()) {
            saida = "Nenhuma produto cadastro.";
        } else {
            for (Produto produto : produtos) {
                if(produto instanceof Perecivel){
                    Perecivel perecivel = (Perecivel) produto;
                    if(perecivel.getValidade().compareTo(validade) == 0){
                        saida += produto.imprimir2();
                    }
               }
            }
            saida += "</body></html>";
        }
        return saida;
    }
    
    public double venderProduto(int codigoProduto, int quantidade) {
        double valorTotal = -1;
        for(Produto p : produtos) {
            if(p.getCodigo() == codigoProduto) {

                int quantidadeDisponivel = p.getQuantidadeEstoque();
                
                if(quantidade < quantidadeDisponivel || quantidadeDisponivel != 0){
                    quantidadeDisponivel -= quantidade;
                    valorTotal = p.vender(quantidade);
                } else{
                    throw new IllegalStateException("Quantidade indisponivel no estoque, por favor tente novamente com uma quantidade menor, ou selecione outro produto.");
                }
            }
        }
        return valorTotal;
    }

    public boolean comprarProduto(int codigoProduto, int quantidade) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigoProduto) {
                p.comprar(quantidade);
                return true;
            }
        }
        return false;
    }

    public String listarTudo() {
        String str = "";
        if(!produtos.isEmpty()){
            for(int i = 0; i < produtos.size(); i++){
                str += produtos.get(i).imprimirTable();
            }
            return str;
        }
        return null;
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    
    public String listarTudoTabela() {
        String str = "";
        if(!produtos.isEmpty()){
            for(int i = 0; i < produtos.size(); i++){
                str += "{" + produtos.get(i).imprimirTable() + "},";
            }
            return str;
        }
        return null;
    }
    
    public int tamanhoLista() {
        int i = 0;
        if(produtos.size() > 0){
            i = produtos.get(produtos.size()-1).getCodigo();
            return i;
        }else {
            return i;
        }
    }
    
    public void preencherTabelaTodos(){
        ArrayList dados = new ArrayList();
        String[] colunas = new String []{"Código","Nome", "Fabricante", "Quantidade", "Preco Unitario"};
        this.listarTudo();
        for (int i = 0; i < produtos.size(); i++) {
            dados.add(new Object[]{produtos.get(i).getCodigo(), produtos.get(i).getNome(), produtos.get(i).getFabricante(), produtos.get(i).getQuantidadeEstoque(), produtos.get(i).getPrecoUnitario()});
        }
        
    
    }
    
}
