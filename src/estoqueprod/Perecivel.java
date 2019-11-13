package estoqueprod;
import java.time.LocalDate;

public class Perecivel extends Produto {
    private LocalDate validade;
    private boolean refrigerado;
    
    public Perecivel() {
    }
        
    public Perecivel(int codigo, String nome, String fabricante, int quantidade, double precoUnitario, int tipoCodigo, LocalDate validade, boolean refrigerado) {
        super(codigo, nome, fabricante, quantidade, precoUnitario, tipoCodigo);
        this.validade = validade;
        this.refrigerado = refrigerado;
    }
    
    public String imprimir() {
        String str = "";
        str += "\n|_________________________";
        str += "\n|Codigo: " + getCodigo();
        str += "\n|Produto: " + getNome();
        str += "\n|Fabricado por: " + getFabricante();
        str += "\n|Quantidade em estoque: " + getQuantidadeEstoque();
        str += "\n|Preço: " + getPrecoUnitario() + ".";
        str += "\n|Validade: " + validade;
        if(refrigerado == true){
            str += "\n|Refrigerado: SIM";
        } else{
            str += "\n|Refrigerado: NÃO";
        }
        
        return str;
    }
    
    public String imprimir2() {
        String str = "";
        
        str += "|&nbsp; Código : &nbsp;" + getCodigo() + "&nbsp;|&nbsp;";
        str += "Produto : &nbsp;" + getNome() + "&nbsp;|&nbsp;";
        str += "Fabricante : &nbsp;" + getFabricante() + "&nbsp;|&nbsp;";
        str += "Quantidade : &nbsp;" + getQuantidadeEstoque() + "&nbsp;|&nbsp;";
        str += "Preço : &nbsp;" + getPrecoUnitario() + "&nbsp;|&nbsp;";
        str += "Validade : &nbsp;" + validade + "&nbsp;|&nbsp;";
        if(refrigerado == true){
            str += "Refrigerado:&nbsp; SIM &nbsp;|&nbsp; <br><br>";
        } else{
            str += "Refrigerado:&nbsp; NÃO &nbsp;|&nbsp; <br><br>";
        }
        
        return str;
    }
    
    public String imprimirSoPereciveis() {
        String str = "";
        
        str += "|&nbsp; Código : &nbsp;" + getCodigo() + "&nbsp;|&nbsp;";
        str += "Produto : &nbsp;" + getNome() + "&nbsp;|&nbsp;";
        str += "Fabricante : &nbsp;" + getFabricante() + "&nbsp;|&nbsp;";
        str += "Quantidade : &nbsp;" + getQuantidadeEstoque() + "&nbsp;|&nbsp;";
        str += "Preço : &nbsp;" + getPrecoUnitario() + "&nbsp;|&nbsp;";
        str += "Validade : &nbsp;" + validade + "&nbsp;|&nbsp;";
        if(refrigerado == true){
            str += "Refrigerado:&nbsp; SIM &nbsp;|&nbsp; <br><br>";
        } else{
            str += "Refrigerado:&nbsp; NÃO &nbsp;|&nbsp; <br><br>";
        }
        
        return str;
    }
    
    public String imprimirTable() {
        String str = "";
        
        str += getCodigo() + ",";
        str += getNome() + ",";
        str += getFabricante() + ",";
        str += getQuantidadeEstoque() + ",";
        str += getPrecoUnitario() + ", , , ,";
        str += validade + ",";
        if(refrigerado == true){
            str += "sim, ";
        } else{
            str += "não, ";
        }
        str += ",3";
        
        return str;
    }
    
    public void setValidade(LocalDate validade){
        this.validade = validade;
    }
    public LocalDate getValidade(){
        return this.validade;
    }
    
    public void setRefrigerado(boolean refrigerado){
        this.refrigerado = refrigerado;
    }
    public boolean getRefrigerado(){
        return this.refrigerado;
    }
    
}
