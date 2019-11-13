package estoqueprod;

import java.util.ArrayList;

public abstract class Produto implements Comparable {

    private int codigo;
    private String nome;
    private String fabricante;
    private int quantidadeEstoque;
    private double precoUnitario;
    private int tipoCodigo;
 
    public int compareTo(Object obj){
        Produto aux = (Produto) obj;
        if(this.nome.charAt(0) < aux.nome.charAt(0)){
            return -1;
        }else if (this.nome.charAt(0) > aux.nome.charAt(0)){
            return 1;
        }    
        return 0;
    }
    
    public Produto(){
    }
    
    public Produto(int codigo, String nome, String fabricante, int quantidadeEstoque, double precoUnitario, int tipoCodigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoUnitario = precoUnitario;
        this.tipoCodigo = tipoCodigo;
    }
    
    public double vender(int quantidade) {
        if(this.quantidadeEstoque > quantidade ){
            this.quantidadeEstoque -= quantidade;
            return quantidade * this.precoUnitario;
        } else{
            return -1;
        }
    }
    
    public void comprar(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
    
    public String imprimir() {
        String str = "";
        str += "\n|_________________________";
        str += "\n|Codigo: " + codigo;
        str += "\n|Produto: " + nome;
        str += "\n|Fabricado por: " + fabricante;
        str += "\n|Quantidade em estoque: " + quantidadeEstoque;
        str += "\n|Preço: " + precoUnitario + ".";
        
        return str;
    }
    
    public String imprimir2() {
        String str = "";
        
        str += codigo + ",";
        str += nome + ",";
        str += fabricante + ",";
        str += quantidadeEstoque + ",";
        str += precoUnitario;
        
        return str;
    }
    
    public String imprimirSoEletronicos() {
        String str = "";
        
        str += codigo + ",";
        str += nome + ",";
        str += fabricante + ",";
        str += quantidadeEstoque + ",";
        str += precoUnitario;
        
        return str;
    }
    
    public String imprimirSoMoveis() {
        String str = "";
        
        str += codigo + ",";
        str += nome + ",";
        str += fabricante + ",";
        str += quantidadeEstoque + ",";
        str += precoUnitario;
        
        return str;
    }
    
    public String imprimirSoPereciveis() {
        String str = "";
        
        str += codigo + ",";
        str += nome + ",";
        str += fabricante + ",";
        str += quantidadeEstoque + ",";
        str += precoUnitario;
        
        return str;
    }
    
    public String imprimirTable() {
        String str = "";
        str += codigo + ",";
        str += nome + ",";
        str += fabricante + ",";
        str += quantidadeEstoque + ",";
        str += precoUnitario + ",,,,,,,";
        
        return str;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getFabricante() {
        return this.fabricante;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public double getPrecoUnitario() {
        return this.precoUnitario;
    }
    
    public void setTipoCodigo(int tipoCodigo){
        this.tipoCodigo = tipoCodigo;
    }
    public double getTipoCodigo(){
        return this.tipoCodigo;
    }
    
}