package bd.daos;

import java.sql.*;
import bd.*;
import bd.core.*;
import bd.dbos.*;

/**
A classe Designers acessa dados da tabela Designers, no Banco de Dados, na linguagem SQL
Não há atributos nessa classe e os métodos são todos estáticos, assim como todas as DAOs.
Métodos dessa classe permitem verificar, atualizar, inserir, deletar e selecionar dados do/no Banco de Dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Designers
{
    /**
    Verifica se a designer desejado existe na tabela Designers.
    @param codigo Código do designer a ser consultada.
    @return Retorna verdadeiro se existe e falso se não existe.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static boolean existeDesigner (int codigo) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM DESIGNERS " +
                  "WHERE CODCLIENTE = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first(); 
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar designer");
        }

        return retorno;
    }

    /**
    Seleciona um designer desejado da tabela Designers.
    @param codigo Código do designer a ser selecionada.
    @return Retorna um objeto da classe Designer, com as informações que foram retornadas do Banco de Dados.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static Designer getDesigner (int codigo) throws Exception
    {
        Designer designer = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM DESIGNERS " +
                  "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Designer não existente");

            designer = new Designer (resultado.getInt   ("CODIGO"),
                               resultado.getString("NOME"),
                               resultado.getString("ESPECIALIZACAO"),
                               resultado.getString("EMAIL"),
                               resultado.getString("CEP"),
                               resultado.getString("TELEFONE"),
                               resultado.getString("COMPLEMENTO"),
                               resultado.getInt   ("NUMERO"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar designer");
        }

        return designer;
    }
    /**
     * Altera uma linha da tabela
     * @param designer o designer a ser alterado, onde o atributo "codigo" ficara intocado
     * @throws Exception se o parametro for nulo, o codigo do designer passado como parametro não estiver cadastrado ou se ocorrer erro ao se relacionar ao banco de dados
     */
    public static void alterar (Designer designer) throws Exception
    {
        if (designer==null)
            throw new Exception ("Designer nao fornecido");

        if (!existeDesigner (designer.getCodigo()))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "UPDATE DESIGNERS SET NOME = ? , ESPECIALIZACAO = ?, EMAIL = ?, CEP = ?, TELEFONE = ?, COMPLEMENTO = ?, NUMERO = ? WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, designer.getNome ());
            BDSQLServer.COMANDO.setString (2, designer.getEspecializacao ());
            BDSQLServer.COMANDO.setString (3, designer.getEmail ());
            BDSQLServer.COMANDO.setString (4, designer.getCep ());
            BDSQLServer.COMANDO.setString (5, designer.getTelefone ());
            BDSQLServer.COMANDO.setString (6, designer.getComplemento ());
            BDSQLServer.COMANDO.setInt    (7, designer.getNumero ());
            BDSQLServer.COMANDO.setInt    (8, designer.getCodigo ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados do designer");
        }
    }
    /**
     * Busca e retorna todos as linhas da tabela no formato "MeuResultSet"
     * @return todas as linhas da tabela no formato "MeuResultSet"
     * @throws Exception se ocorrer erro ao se relacionar ao banco de dados
     */
    public static MeuResultSet getDesigners () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM DESIGNERS";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar designers");
        }

        return resultado;
    }
    /**
     * Exclui uma linha da tabela
     * @param codigo o codigo referente a linha a ser excluida
     * @throws Exception se ocorrer erro ao se relacionar ao banco de dados
     */
    public static void excluir (int codigo) throws Exception
    {
        if (!existeDesigner (codigo))
            throw new Exception ("Designer não cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM DESIGNERS " +
                  "WHERE CODIGO=?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir designer");
        }
    }

    

}