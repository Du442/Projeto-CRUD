package dao;

import connection.Conexao;
import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class ProdutoDAO {
    
    // ============================
    //     C   R   U   D
    // ============================

    // CREATE
    public void adicionarProduto(Produto produto) {
        String sql = "INSERT INTO produtos (nome_produto, descricao_produto, quantidade_estoque, preco) " +
                     "VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, produto.getNome_produto());
            pst.setString(2, produto.getDescricao_produto());
            pst.setInt(3, produto.getQuantidade_estoque());
            pst.setBigDecimal(4, produto.getPreco());

            pst.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");

        } catch(SQLException e) {
            System.err.println("Erro ao cadastrar o produto: " + e.getMessage());
        }
    }

    // READ
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
                p.setData_alteracao(rs.getTimestamp("data_alteracao"));
                produtos.add(p);
            }

        } catch(SQLException e) {
            System.err.println("Erro ao listar os produtos: " + e.getMessage());
        }

        return produtos;
    }
    
    public List<Produto> listarProdutosUltimoMes() {
        
        String sql = "SELECT * FROM produtos WHERE data_cadastro >= DATE_SUB(NOW(), INTERVAL 1 MONTH)";
        
        List <Produto> produtos = new ArrayList<>();
        
        try {
            
            Connection conn = Conexao.getConexao();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                Produto p = new Produto();
                p.setId_produto(rs.getInt("id_produto"));
                p.setNome_produto(rs.getString("nome_produto"));
                p.setDescricao_produto(rs.getString("descricao_produto"));
                p.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                p.setPreco(rs.getBigDecimal("preco"));
                p.setData_cadastro(rs.getTimestamp("data_cadastro"));
                p.setData_alteracao(rs.getTimestamp("data_alteracao"));
              
                produtos.add(p);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    
    public List<Produto> listarProdutosComFiltro(int tipoOrdenacao) {
        
        String sql = "SELECT * FROM produtos ORDER BY ";
        
        switch (tipoOrdenacao) {
            case 3: sql += "preco ASC"; break;              
            case 4: sql += "preco DESC"; break;             
            case 2: sql += "quantidade_estoque DESC"; break; 
            case 1: sql += "data_cadastro DESC"; break;     
            default: sql += "nome_produto ASC"; break;      
        }
        
        java.util.List<Produto> produtos = new java.util.ArrayList<>();

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
                p.setData_alteracao(rs.getTimestamp("data_alteracao"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    
    public boolean existeProdutoComNome(String nome, int idParaIgnorar) {
        String sql = "SELECT COUNT(*) FROM produtos WHERE nome_produto = ? AND id_produto != ?";
        
        try (java.sql.Connection conn = connection.Conexao.getConexao();
             java.sql.PreparedStatement pst = conn.prepareStatement(sql)) {
            
            pst.setString(1, nome);
            pst.setInt(2, idParaIgnorar);
            
            java.sql.ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // UPDATE
    public boolean atualizarProduto(Produto produto) {
        String sql = "UPDATE produtos SET nome_produto = ?, descricao_produto = ?, quantidade_estoque = ?, preco = ?, data_alteracao = NOW() " +
                     "WHERE id_produto = ?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, produto.getNome_produto());
            pst.setString(2, produto.getDescricao_produto());
            pst.setInt(3, produto.getQuantidade_estoque());
            pst.setBigDecimal(4, produto.getPreco());
            pst.setInt(5, produto.getId_produto());

            pst.executeUpdate();

            System.out.println("Produto atualizado com sucesso!");

        } catch(SQLException e) {
            System.err.println("Erro ao atualizar o produto: " + e.getMessage());
        }
        return false;
    }

    // DELETE
    public boolean removerProduto(int id) {
    String sql = "DELETE FROM produtos WHERE id_produto = ?";

    try (Connection conn = Conexao.getConexao();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setInt(1, id);
        int linhasAfetadas = pst.executeUpdate();

        if (linhasAfetadas > 0) {
            System.out.println("Produto removido com sucesso!");
            return true;
        } else {
            System.out.println("Nenhum produto encontrado com esse ID.");
            return false;
        }

    } catch(SQLException e) {
        System.err.println("Erro ao remover o produto: " + e.getMessage());
        return false;
    }}}



    

