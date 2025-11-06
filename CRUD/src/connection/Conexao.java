
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    //url de acesso:
    private static final String URL = "\"jdbc:mysql://localhost:3306/estoque_db?useSSL=false&serverTimezone=UTC\";";
    
    //usuario de acesso:
    private static final String USUARIO = "root";
    
    //senha de acesso:
    private static final String SENHA = "Du44xdoda@";
    
    //driver que eu baixei:
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static Connection getConexao(){
        try {
            
            //o try tenta conectar ao banco de dados caso dê erro ele da catch
            
            //essa linha faz com que carregue o dicionacio do sql na memoria
            Class.forName(DRIVER);
            
            //o drivermanager tenta abrir a porta usando o endereco, o usuario e a senha
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            //aqui deu boa
            return conexao;
            
        } catch (ClassNotFoundException | SQLException e) {
            
            //se algo der errado como senha errada ou coisa assim o programa da um catch
            System.err.println("Erro na conexão com o Banco de Dados:");
            
            //printa o erro
            e.printStackTrace();
            
            //se da erro retorna null
            return null;
        }
    }
    
}
