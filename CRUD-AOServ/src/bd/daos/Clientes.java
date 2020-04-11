package bd.daos;

import java.sql.*;
import bd.*;
import bd.core.*;
import bd.dbos.*;

/**
A classe Clientes acessa dados da tabela Clientes, no Banco de Dados, na linguagem SQL
Não há atributos nessa classe e os métodos são todos estáticos, assim como todas as DAOs.
Métodos dessa classe permitem verificar, atualizar, inserir, deletar e selecionar dados do/no Banco de Dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Clientes
{
    /**
    Verifica se o cliente desejado existe na tabela Clientes.
    @param codigo Código do cliente a ser consultado.
    @return Retorna verdadeiro se está cadastrado e falso se não está.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static boolean cadastrado (int codigo) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * FROM CLIENTES WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar cliente");
        }

        return retorno;
    }

    /**
    Inclui um cliente na tabela Clientes.
    @param cliente Objeto da classe Cliente, que contém todas as informações do novo cliente.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static void incluir (Cliente cliente) throws Exception
    {
        if (cliente == null)
            throw new Exception ("Cliente não fornecido");

        try
        {
            String sql;

            sql = "INSERT INTO CLIENTES (CODIGO,NOME,SEXO,DATANASCIMENTO,TELEFONE,CPF,EMAIL,SENHA) VALUES (0,?,?,?,?,?,?,?)";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, cliente.getNome ());
            BDSQLServer.COMANDO.setString (2, cliente.getSexo ());
            BDSQLServer.COMANDO.setString (3, cliente.getDataNascimento ());
            BDSQLServer.COMANDO.setString (4, cliente.getTelefone ());
            BDSQLServer.COMANDO.setString (5, cliente.getCpf ());
            BDSQLServer.COMANDO.setString (6, cliente.getEmail ());
            BDSQLServer.COMANDO.setString (7, cliente.getSenha ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao cadastrar cliente");
        }
    }

    /**
    Exclui um cliente da tabela Clientes.
    @param codigo Código do cliente a ser excluído.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static void excluir (int codigo) throws Exception
    {
        if (!cadastrado (codigo))
            throw new Exception ("Cliente não cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM CLIENTES WHERE CODIGO=?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir cliente");
        }
    }

    /**
    Altera todos os dados (exceto o código) de um cliente da tabelda Clientes.
    @param cliente Objeto da classe Cliente, que contém o código original e as novas informações.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static void alterar (Cliente cliente) throws Exception
    {
        if (cliente == null)
            throw new Exception ("Cliente não fornecido");

        if (!cadastrado (cliente.getCodigo()))
            throw new Exception ("Cliente não cadastrado");

        try
        {

            String sql;

            sql = "UPDATE CLIENTES SET NOME=?, SEXO=?, DATANASCIMENTO=?, TELEFONE=?, CPF=?, EMAIL=? WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, cliente.getNome ());
            BDSQLServer.COMANDO.setString (2, cliente.getSexo ());
            BDSQLServer.COMANDO.setString (3, cliente.getDataNascimento ());
            BDSQLServer.COMANDO.setString (4, cliente.getTelefone ());
            BDSQLServer.COMANDO.setString (5, cliente.getCpf ());
            BDSQLServer.COMANDO.setString (6, cliente.getEmail ());
            BDSQLServer.COMANDO.setInt    (7, cliente.getCodigo ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados de cliente");
        }
    }

    /**
    Seleciona um cliente desejado da tabela Clientes.
    @param codigo Código do cliente a ser selecionado.
    @return Retorna um objeto da classe Cliente, com as informações que foram retornadas do Banco de Dados.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static Cliente getCliente (int codigo) throws Exception
    {
        Cliente cliente = null;

        try
        {
            String sql;

            sql = "SELECT * FROM CLIENTES WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Cliente não cadastrado");

            cliente = new Cliente (resultado.getInt    ("CODIGO"),
                                   resultado.getString ("NOME"),
                                   resultado.getString ("SEXO"),
                                   resultado.getString ("DATANASCIMENTO"),
                                   resultado.getString ("TELEFONE"),
                                   resultado.getString ("CPF"),
                                   resultado.getString ("EMAIL"),
                                   resultado.getString ("SENHA"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar cliente");
        }

        return cliente;
    }

    /**
    Seleciona todos os clientes da tabela Clientes.
    @return um Objeto da classe MeuResultSet, contendo o resultado de todos os SELECTs.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static MeuResultSet getClientes () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * FROM CLIENTES";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar clientes");
        }

        return resultado;
    }

    /**
    Conta quantos clientes há na tabela Clientes.
    @return Retorna um inteiro que representa quantos clientes há na tabela.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static int qtosClientes () throws Exception
    {
        int qtd = 0;

        try
        {
            String sql;

            sql = "SELECT COUNT(*) FROM CLIENTES";

            BDSQLServer.COMANDO.prepareStatement (sql);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            while (resultado.next())
            {
                qtd = resultado.getInt(1);
            }

        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao contar clientes");
        }

        return qtd;
    }
}
