
package dao;

//add
import connection.Conexao;
import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//add
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class ProdutoDAO {
    
    public void adicionarProduto(Produto produto) {
        
        String sql = "INSERT INTO produtos (nome_produto, descricao_produto, quantidade_estoque, preco) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            
            // O resto do seu código está perfeito
            pst.setString(1, produto.getNome_produto());
            pst.setString(2, produto.getDescricao_produto());
            pst.setInt(3, produto.getQuantidade_estoque());
            pst.setBigDecimal(4, produto.getPreco());
            
            pst.executeUpdate();
            
            System.out.println("Produto cadastrado com sucesso!");
            
        } catch(SQLException e) {
            
            System.err.println("Erro ao cadastrar o produto: " + e.getMessage());
            e.printStackTrace();
            
        } 
       
    }
    
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
    
    public void atualizarProduto(Produto produto) {
        
        String sql = "UPDATE produtos SET nome_produto = ?, descricao_produto = ?, quantidade_estoque = ?, preco = ? WHERE id_produto = ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, produto.getNome_produto());
            pst.setString(2, produto.getDescricao_produto());
            pst.setInt(3, produto.getQuantidade_estoque());
            pst.setBigDecimal(4, produto.getPreco());
            
            pst.setInt(5, produto.getId_produto());

            pst.executeUpdate();
            
            System.out.println("Produto atualizado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar o produto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void removerProduto(int id) {
        
        String sql = "DELETE FROM produtos WHERE id_produto = ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, id);

            pst.executeUpdate();
            
            System.out.println("Produto removido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao remover o produto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
