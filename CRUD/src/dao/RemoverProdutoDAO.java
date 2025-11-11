
package dao;

import connection.Conexao;
import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoverProdutoDAO {
    
    public void removerProduto(int id) {
    
        String sql = "DELETE FROM produtos WHERE id_produto = ?";
        
        try {
            
            Connection conn = Conexao.getConexao();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Produto removido com sucesso!");
            
        } catch(SQLException e){
            System.err.println("Erro ao remover seu produto: " + e.getMessage());
            e.printStackTrace();
        }
    
    }
    
}
