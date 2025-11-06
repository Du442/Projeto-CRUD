
package main;

import connection.Conexao;

public class Main {

    public static void main(String[] args) {
        var teste = Conexao.getConexao();
        if (teste != null) {
            System.out.println("SUCESSO! Conectado ao banco!");
        } else {
            System.out.println("FALHA! Verifique o console de erro.");
        }
    }
    
}
