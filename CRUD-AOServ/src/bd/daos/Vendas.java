package bd.daos;

import java.sql.*;
import bd.*;
import bd.core.*;
import bd.dbos.*;

/**
A classe Vendas acessa dados da tabela Vendas, no Banco de Dados, na linguagem SQL
Não há atributos nessa classe e os métodos são todos estáticos, assim como todas as DAOs.
Métodos dessa classe permitem verificar, atualizar, inserir, deletar e selecionar dados do/no Banco de Dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Vendas
{
    /**
    Verifica se a venda desejado existe na tabela Vendas.
    @param codigo Código da venda a ser consultada.
    @return Retorna verdadeiro se existe e falso se não existe.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static boolean existeVenda (int codigo) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM VENDAS " +
                  "WHERE CODCLIENTE = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first(); 
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar venda");
        }

        return retorno;
    }
    
    /**
    Verifica se o produto desejado existe na tabela Vendas.
    @param codProduto Código do produto a ser consultado.
    @return Retorna verdadeiro se existe e falso se não existe.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static boolean existeVendaComProduto (int codProduto) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM VENDAS " +
                  "WHERE CODPRODUTO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codProduto);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first(); 
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar venda");
        }

        return retorno;
    }   

    /**
    Seleciona uma venda desejada da tabela Vendas.
    @param codigo Código da venda a ser selecionada.
    @return Retorna um objeto da classe Venda, com as informações que foram retornadas do Banco de Dados.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static Venda getVenda (int codigo) throws Exception
    {
        Venda venda = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM VENDAS " +
                  "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Venda não existente");

            venda = new Venda (resultado.getInt   ("CODIGO"),
            		       resultado.getInt   ("CODCLIENTE"),
            		       resultado.getInt   ("CODPRODUTO"),
            		       resultado.getInt   ("QTDE"),
                               resultado.getString("DATAVENDA"),
                               resultado.getString("CEP"),
                               resultado.getString("ENDERECO"),
                               resultado.getString("BAIRRO"),
                               resultado.getInt   ("NUMERO"),
                               resultado.getString("COMPLEMENTO"),
                               resultado.getFloat ("TOTAL"),
                               resultado.getString("PAGAMENTO"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar venda");
        }

        return venda;
    }  
    
    /**
    Seleciona todas as compras de determinado cliente.
    @param codigo Código do cliente a ser consultado.
    @return Retorna um objeto da classe MeuResultSet, com as informações que foram retornadas do Banco de Dados.
    @throws SQLException Se houve algum erro de conexão.
    */
     public static MeuResultSet getVendasPorCliente (int codigo) throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * FROM VENDAS WHERE CODCLIENTE = ? ORDER BY DATAVENDA";

            BDSQLServer.COMANDO.prepareStatement (sql);
            
            BDSQLServer.COMANDO.setInt (1, codigo);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar vendas");
        }

        return resultado;
    }
     
     /**
    Conta quantas vendas foram feitas a determinado cliente
    @param codigo Código do cliente a ser consultado.
    @return Retorna um inteiro que representa quantas compras esse cliente realizou.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static int qtasVendasPorCliente (int codigo) throws Exception
    {
        MeuResultSet resultado = null;
        
        int qtd = 0;
       
        try
        {
            String sql;
                   
            sql = "SELECT COUNT(*) FROM VENDAS WHERE CODCLIENTE = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);
            
            BDSQLServer.COMANDO.setInt (1, codigo);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery (); 
            
            while (resultado.next())
            {
                qtd = resultado.getInt(1);
            }
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao contar vendas");
        }

        return qtd;
    }
}