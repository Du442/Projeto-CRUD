
package dao;

import connection.Conexao;
import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AtualizarProdutoDAO {
    
    public void atualizarProdutos(Produto produto) {
        
        String sql = "UPDATE produtos SET nome_produto = ?, descricao_produto = ?, quantidade_estoque = ?, preco = ?, WHERE id_produto = ?";
        
        try{
            Connection conn = Conexao.getConexao();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, produto.getNome_produto());
            pst.setString(2, produto.getDescricao_produto());
            pst.setInt(3, produto.getQuantidade_estoque());
            pst.setBigDecimal(4, produto.getPreco());
            pst.setInt(5, produto.getId_produto());

            pst.executeUpdate();
            System.out.println("Produto atualizado com sucesso!");
            
        } catch(SQLException e) {
            System.err.println("Não foi possivel atualizar seu produto: " + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
