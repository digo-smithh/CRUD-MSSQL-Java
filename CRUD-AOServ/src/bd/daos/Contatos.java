package bd.daos;

import java.sql.*;
import bd.*;
import bd.core.*;
import static bd.daos.Produtos.cadastrado;
import bd.dbos.*;

/**
A classe Contatos acessa dados da tabela Contatos, no Banco de Dados, na linguagem SQL
Não há atributos nessa classe e os métodos são todos estáticos, assim como todas as DAOs.
Métodos dessa classe permitem verificar, deletar e selecionar dados do/no Banco de Dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Contatos
{
    /**
    Verifica se o contato desejado existe na tabela Contatos.
    @param codigo Código do contato a ser consultado.
    @return Retorna verdadeiro se existe e falso se não existe.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static boolean existe (int codigo) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * FROM CONTATOS WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first(); 
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar contato");
        }

        return retorno;
    }
    
    /**
    Exclui um contato da tabela Contatos.
    @param codigo Código do contato a ser excluído.
    @throws SQLException Se houve algum erro de conexão.
    */ 
    public static void excluir (int codigo) throws Exception
    {
        if (!existe (codigo))
            throw new Exception ("Contato não existente");

        try
        {
            String sql;

            sql = "DELETE FROM CONTATOS " +
                  "WHERE CODIGO=?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();       
        }       
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir contato");
        }
    }
    
    /**
    Altera o nome de uma mensagem da tabela contato.
    @param contato Objeto da classe Contato, que contém o código original e o novo nome.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static void alterar (Contato contato) throws Exception
    {
        if (contato==null)
            throw new Exception ("Contato não fornecido");

        if (!existe (contato.getCodigo()))
            throw new Exception ("Contato não cadastrado");

        try
        {
            String sql;

            sql = "UPDATE CONTATOS SET NOME=? WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, contato.getNome ());
            BDSQLServer.COMANDO.setInt    (2, contato.getCodigo ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados de contato");
        }
    }
    
    /**
    Seleciona um contato desejado da tabela Contatos.
    @param codigo Código do contato a ser selecionado.
    @return Retorna um objeto da classe Contato, com as informações que foram retornadas do Banco de Dados.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static Contato getContato (int codigo) throws Exception
    {
        Contato contato = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM CONTATOS " +
                  "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Contato não existente");

            contato = new Contato (resultado.getInt   ("CODIGO"),
                                   resultado.getString ("NOME"),
                                   resultado.getString ("EMAIL"),
                                   resultado.getString ("TELEFONE"),
                                   resultado.getString ("ASSUNTO"),
                                   resultado.getString ("MENSAGEM"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar contato");
        }

        return contato;
    }

    /**
    Seleciona todos os contatos da tabela Contatos.
    @return um Objeto da classe MeuResultSet, contendo o resultado de todos os SELECTs.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static MeuResultSet getContatos () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM CONTATOS";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar contatos");
        }

        return resultado;
    }
    
    /**
    Conta quantos contatos há na tabela Contatos.
    @return Retorna um inteiro que representa quantos contatos há na tabela.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static int qtosContatos () throws Exception
    {
        MeuResultSet resultado = null;
        
        int qtd = 0;
       
        try
        {
            String sql;
                   
            sql = "SELECT COUNT(*) FROM CONTATOS";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery (); 
            
            while (resultado.next())
            {
                qtd = resultado.getInt(1);
            }

        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao contar contatos");
        }

        return qtd;
    }
    
    /**
    Conta quantos contatos respondidos há na tabela Contatos.
    @return Retorna um inteiro que representa quantos contatos respondidos há na tabela.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static int qtosContatosRespondidos () throws Exception
    {
        MeuResultSet resultado = null;
        
        int qtd = 0;
       
        try
        {
            String sql;
                   
            sql = "SELECT COUNT(*) FROM CONTATOS WHERE NOME LIKE '%(respondido)'";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery (); 
            
            while (resultado.next())
            {
                qtd = resultado.getInt(1);
            }

        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao contar contatos");
        }

        return qtd;
    }
}