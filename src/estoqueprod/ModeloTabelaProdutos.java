    package estoqueprod;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaProdutos extends AbstractTableModel {
    private String colunas[] = {"codigo", "nome", "fabricante", "quantidade", "preco unit."};
    private ArrayList<Produto> produtos;
    private final int COLUNA_CODIGO = 0;
    private final int COLUNA_NOME = 1;
    private final int COLUNA_FABRICANTE = 2;
    private final int COLUNA_QUANTIDADE = 3;
    private final int COLUNA_PRECO = 4;

    public ModeloTabelaProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    
    @Override
    public int getRowCount() {
        return produtos.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int indice) {
        return colunas[indice];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COLUNA_CODIGO:
                return Integer.class;
            case COLUNA_NOME:
                return String.class;
            case COLUNA_FABRICANTE:
                return String.class;
            case COLUNA_QUANTIDADE:
                return Integer.class;
            case COLUNA_PRECO:
                return Double.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = this.produtos.get(rowIndex);

        switch (columnIndex) {
            case COLUNA_CODIGO:
                return produto.getCodigo();
            case COLUNA_NOME:
                return produto.getNome();
            case COLUNA_FABRICANTE:
                return produto.getFabricante();
            case COLUNA_QUANTIDADE:
                return produto.getQuantidadeEstoque();
            case COLUNA_PRECO:
                return produto.getPrecoUnitario();
        }
        return null;
    }
}
