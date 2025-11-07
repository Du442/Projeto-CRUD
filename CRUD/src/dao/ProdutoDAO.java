
package dao;


import connection.Conexao;

import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
    
    public void adicionarProduto(Produto produto) {
        
        String sql = "INSERT INTO produtos (nome_produto, quantidade_estoque, preco) VALUES (?, ?, ?, ?)";
        
    }
    
}
