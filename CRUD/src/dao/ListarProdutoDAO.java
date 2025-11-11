
package dao;

import connection.Conexao;
import java.math.BigDecimal;
import model.Produto;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListarProdutoDAO {
    
    public List<Produto> listarProdutos() {
        String sql = "SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<>();

        try (Connection conn = Conexao.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                
                Produto p = new Produto();
                p.setId_produto(rs.getInt("id_produto"));
                p.setNome_produto(rs.getString("nome_produto"));
                p.setDescricao_produto(rs.getString("descricao_produto"));
                p.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                p.setPreco(rs.getBigDecimal("preco"));
                p.setData_cadastro(rs.getTimestamp("data_cadastro"));

                produtos.add(p);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar os produtos: " + e.getMessage());
            e.printStackTrace();
        }
        return produtos;
    }
    
}
