package estoqueprod;

public class Eletronico extends Produto {

    private String voltagem;
    private String potencia;
    private char eficienciaClassificacao;
    
    public Eletronico() {
    }
    
    public Eletronico(int codigo, String nome, String fabricante, int quantidade, double precoUnitario, int tipoCodigo, String voltagem, String potencia, char eficienciaClassificacao) {
        super(codigo, nome, fabricante, quantidade, precoUnitario, tipoCodigo);
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.eficienciaClassificacao = eficienciaClassificacao;
    }
    
    public String imprimir() {
        String str = "";
        str += "\n|Codigo: " + getCodigo();
        str += "\n|Produto: " + getNome();
        str += "\n|Fabricado por: " + getFabricante();
        str += "\n|Quantidade em estoque: " + getQuantidadeEstoque();
        str += "\n|Preço: " + getPrecoUnitario() + ".";
        str += "\n|Voltagem: " + voltagem;
        str += "\n|Potência: " + potencia;
        str += "\n|Classificação de Eficiência: " + eficienciaClassificacao;
        
        return str;
    }
    
    public String imprimir2() {
        String str = "";
        
        str += "|&nbsp; Código : &nbsp;" + getCodigo() + "&nbsp;|&nbsp;";
        str += "Produto : &nbsp;" + getNome() + "&nbsp;|&nbsp;";
        str += "Fabricante : &nbsp;" + getFabricante() + "&nbsp;|&nbsp;";
        str += "Quantidade : &nbsp;" + getQuantidadeEstoque() + "&nbsp;|&nbsp;";
        str += "Preço : &nbsp;" + getPrecoUnitario() + "&nbsp;|&nbsp;";
        str += "Voltagem : &nbsp;" + voltagem + "&nbsp;|&nbsp;";
        str += "Potência : &nbsp;" + potencia + "&nbsp;|&nbsp;";
        str += "Classificação : &nbsp;" + eficienciaClassificacao + "&nbsp;|&nbsp; <br><br>";
        
        return str;
    }
    
    public String imprimirSoEletronicos() {
        String str = "";
        
        str += "|&nbsp; Código : &nbsp;" + getCodigo() + "&nbsp;|&nbsp;";
        str += "Produto : &nbsp;" + getNome() + "&nbsp;|&nbsp;";
        str += "Fabricante : &nbsp;" + getFabricante() + "&nbsp;|&nbsp;";
        str += "Quantidade : &nbsp;" + getQuantidadeEstoque() + "&nbsp;|&nbsp;";
        str += "Preço : &nbsp;" + getPrecoUnitario() + "&nbsp;|&nbsp;";
        str += "Voltagem : &nbsp;" + voltagem + "&nbsp;|&nbsp;";
        str += "Potência : &nbsp;" + potencia + "&nbsp;|&nbsp;";
        str += "Classificação : &nbsp;" + eficienciaClassificacao + "&nbsp;|&nbsp; <br><br>";
        
        return str;
    }
    
    public String imprimirTable() {
        String str = "";
        
        str += getCodigo() + ",";
        str += getNome() + ",";
        str += getFabricante() + ",";
        str += getQuantidadeEstoque() + ",";
        str += getPrecoUnitario() + ",";
        str += voltagem + ",";
        str += potencia + ",";
        str += eficienciaClassificacao + ",,,,1";
        
        return str;
    }
    
}
