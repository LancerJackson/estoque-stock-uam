package estoqueprod;

public class Movel extends Produto {

    private String materialTipo;
    
    public Movel() {
    }
    
    public Movel(int codigo, String nome, String fabricante, int quantidade, double precoUnitario, int tipoCodigo, String materialTipo) {
        super(codigo, nome, fabricante, quantidade, precoUnitario, tipoCodigo);
        this.materialTipo = materialTipo;
    }
    
    public String imprimir() {
        String str = "";
        str += "\n|Codigo: " + getCodigo();
        str += "\n|Produto: " + getNome();
        str += "\n|Fabricado por: " + getFabricante();
        str += "\n|Quantidade em estoque: " + getQuantidadeEstoque();
        str += "\n|Preço: " + getPrecoUnitario() + ".";
        str += "\n|Material: " + materialTipo;
        
        return str;
    }
    
    public String imprimir2() {
        String str = "";
        
        str += "|&nbsp; Código : &nbsp;" + getCodigo() + "&nbsp;|&nbsp;";
        str += "Produto : &nbsp;" + getNome() + "&nbsp;|&nbsp;";
        str += "Fabricante : &nbsp;" + getFabricante() + "&nbsp;|&nbsp;";
        str += "Quantidade : &nbsp;" + getQuantidadeEstoque() + "&nbsp;|&nbsp;";
        str += "Preço : &nbsp;" + getPrecoUnitario() + "&nbsp;|&nbsp;";
        str += "Material : &nbsp;" + materialTipo + "&nbsp;|&nbsp; <br><br>";
        
        return str;
    }
    
    public String imprimirSoMoveis() {
        String str = "";
        
        str += "|&nbsp; Código : &nbsp;" + getCodigo() + "&nbsp;|&nbsp;";
        str += "Produto : &nbsp;" + getNome() + "&nbsp;|&nbsp;";
        str += "Fabricante : &nbsp;" + getFabricante() + "&nbsp;|&nbsp;";
        str += "Quantidade : &nbsp;" + getQuantidadeEstoque() + "&nbsp;|&nbsp;";
        str += "Preço : &nbsp;" + getPrecoUnitario() + "&nbsp;|&nbsp;";
        str += "Material : &nbsp;" + materialTipo + "&nbsp;|&nbsp; <br><br>";
        
        return str;
    }
    
    public String imprimirTable() {
        String str = "";
        
        str += getCodigo() + ",";
        str += getNome() + ",";
        str += getFabricante() + ",";
        str += getQuantidadeEstoque() + ",";
        str += getPrecoUnitario() + ",";
        str += ",,,,," + materialTipo + ",2";
        
        return str;
    }
    
}
