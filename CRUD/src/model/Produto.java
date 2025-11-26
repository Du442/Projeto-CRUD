package model;

import dao.ProdutoDAO;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Produto {

    // Atributos (iguais à tabela)
    private int id_produto;
    private String nome_produto;
    private String descricao_produto;
    private int quantidade_estoque;
    private BigDecimal preco;
    private Date data_cadastro;
    private Date data_alteracao;

    // DAO (igual funciona na classe Aluno)
    private final ProdutoDAO dao;

    // Construtor vazio
    public Produto() {
        this.dao = new ProdutoDAO();
    }

    // Construtor básico
    public Produto(String nome, String descricao, int quantidade, BigDecimal preco) {
        this.nome_produto = nome;
        this.descricao_produto = descricao;
        this.quantidade_estoque = quantidade;
        this.preco = preco;
        this.dao = new ProdutoDAO();
    }

    // Construtor completo
    public Produto(int id, String nome, String descricao, int quantidade, BigDecimal preco, Date dataCadastro) {
        this.id_produto = id;
        this.nome_produto = nome;
        this.descricao_produto = descricao;
        this.quantidade_estoque = quantidade;
        this.preco = preco;
        this.data_cadastro = dataCadastro;
        this.dao = new ProdutoDAO();
    }

    // ------------------------
    // GETTERS E SETTERS
    // ------------------------

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

public Date getData_alteracao() {
    return data_alteracao;
}

public void setData_alteracao(Date data_alteracao) {
    this.data_alteracao = data_alteracao;
}

    @Override
    public String toString() {
        return "\n ID: " + this.id_produto
                + "\n Nome: " + this.nome_produto
                + "\n Descrição: " + this.descricao_produto
                + "\n Quantidade: " + this.quantidade_estoque
                + "\n Preço: " + this.preco
                + "\n -----------";
    }

    // ======================================================
    //  MÉTODOS ESTILO ALUNO — SÓ QUE PARA PRODUTO
    // ======================================================

    // Retorna lista de produtos
    public List<Produto> getMinhaLista() {
        return dao.listarProdutos();
    }

    // Insere novo produto
    public boolean InsertProdutoBD(String nome, String descricao, int quantidade, BigDecimal preco) throws SQLException {
        int id = this.maiorID() + 1;

        Produto p = new Produto();
        p.setId_produto(id);
        p.setNome_produto(nome);
        p.setDescricao_produto(descricao);
        p.setQuantidade_estoque(quantidade);
        p.setPreco(preco);

        dao.adicionarProduto(p);
        return true;
    }

    // Deleta um produto pelo ID
    public boolean DeleteProdutoBD(int id) {
        return dao.removerProduto(id);
    }

    // Atualiza produto
    public boolean UpdateProdutoBD(int id, String nome, String descricao, int quantidade, BigDecimal preco) {
        Produto p = new Produto();
        p.setId_produto(id);
        p.setNome_produto(nome);
        p.setDescricao_produto(descricao);
        p.setQuantidade_estoque(quantidade);
        p.setPreco(preco);

        return dao.atualizarProduto(p);
    }

    // Carrega um produto específico pelo ID
    public Produto carregaProduto(int id) {

        for (Produto p : dao.listarProdutos()) {
            if (p.getId_produto() == id) {
                return p;
            }
        }

        return null;
    }

    // Retorna o maior ID atual
    public int maiorID() {

        int maior = 0;

        for (Produto p : dao.listarProdutos()) {
            if (p.getId_produto() > maior) {
                maior = p.getId_produto();
            }
        }

        return maior;
    }
}
