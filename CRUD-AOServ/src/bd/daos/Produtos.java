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
public class Produtos
{
    /**
    Verifica se o produto desejado existe na tabela Produtos.
    @param codigo Código do produto a ser consultado.
    @return Retorna verdadeiro se está cadastrado e falso se não está.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static boolean cadastrado (int codigo) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM PRODUTOS " +
                  "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first(); 
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar produto");
        }

        return retorno;
    }
    
    /**
    Inclui um produto na tabela Produtos.
    @param produto Objeto da classe Produto, que contém todas as informações do novo produto.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static void incluir (Produto produto) throws Exception
    {
        if (produto==null)
            throw new Exception ("Produto não fornecido");

        try
        {
            String sql;

            sql = "INSERT INTO PRODUTOS " +
                  "(CODIGO,NOME,CATEGORIA,DESCRICAO,PRECO,QTDE) " +
                  "VALUES " +
                  "(?,?,?,?,?,?)";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt    (1, produto.getCodigo ());
            BDSQLServer.COMANDO.setString (2, produto.getNome ());
            BDSQLServer.COMANDO.setString (3, produto.getCategoria ());
            BDSQLServer.COMANDO.setString (4, produto.getDescricao ());
            BDSQLServer.COMANDO.setFloat  (5, produto.getPreco ());
            BDSQLServer.COMANDO.setInt    (6, produto.getQtde ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao inserir produto");
        }
    }
    
    /**
    Exclui um produto da tabela Produtos.
    @param codigo Código do produto a ser excluído.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static void excluir (int codigo) throws Exception
    {
        if (!cadastrado (codigo))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM PRODUTOS " +
                  "WHERE CODIGO=?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();       
        }       
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir produto");
        }
    }
    
    /**
    Altera todos os dados (exceto o código) de um produto da tabelda Produtos.
    @param produto Objeto da classe Produto, que contém o código original e as novas informações.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static void alterar (Produto produto) throws Exception
    {
        if (produto==null)
            throw new Exception ("Produto não fornecido");

        if (!cadastrado (produto.getCodigo()))
            throw new Exception ("Produto não cadastrado");

        try
        {
            String sql;

            sql = "UPDATE PRODUTOS SET NOME=?, CATEGORIA=?, DESCRICAO=?, PRECO=?, QTDE=? WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, produto.getNome ());
            BDSQLServer.COMANDO.setString (2, produto.getCategoria ());
            BDSQLServer.COMANDO.setString (3, produto.getDescricao ());
            BDSQLServer.COMANDO.setFloat  (4, produto.getPreco ());
            BDSQLServer.COMANDO.setInt    (5, produto.getQtde ());
            BDSQLServer.COMANDO.setInt    (6, produto.getCodigo ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados de produto");
        }
    }
    
    /**
    Seleciona um produto desejado da tabela Produtos.
    @param codigo Código do produto a ser selecionado.
    @return Retorna um objeto da classe Produto, com as informações que foram retornadas do Banco de Dados.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static Produto getProduto (int codigo) throws Exception
    {
        Produto produto = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM PRODUTOS " +
                  "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Produto não cadastrado");

            produto = new Produto (resultado.getInt   ("CODIGO"),
                                   resultado.getString("NOME"),
                                   resultado.getString("CATEGORIA"),
                                   resultado.getString("DESCRICAO"),
                                   resultado.getFloat ("PRECO"),
                                   resultado.getInt   ("QTDE"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar produto");
        }

        return produto;
    }
    
    /**
    Seleciona todos os produtos da tabela Produtos.
    @return um Objeto da classe MeuResultSet, contendo o resultado de todos os SELECTs.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static MeuResultSet getProdutos () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM PRODUTOS";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar produtos");
        }

        return resultado;
    }
    
    /**
    Seleciona todos os produtos da tabela Produtos, ordenados crescentemente por nome.
    @return um Objeto da classe MeuResultSet, contendo o resultado de todos os SELECTs.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static MeuResultSet getProdutosPorNome () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * FROM PRODUTOS ORDER BY NOME";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar produtos");
        }

        return resultado;
    }
    
    /**
    Seleciona todos os produtos da tabela Produtos, ordenados decrecrescentemente por nome.
    @return um Objeto da classe MeuResultSet, contendo o resultado de todos os SELECTs.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static MeuResultSet getProdutosPorNomeDec () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * FROM PRODUTOS ORDER BY NOME DESC";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar produtos");
        }

        return resultado;
    }
    
    /**
    Seleciona todos os produtos da tabela Produtos, ordenados pelos mais vendidos.
    @return um Objeto da classe MeuResultSet, contendo o resultado de todos os SELECTs.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static MeuResultSet getProdutosMaisVendidos () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "select p.codigo, p.nome, p.categoria, p.descricao, p.preco, p.qtde, sum(v.qtde) as 'qtd'\n" +
                  "from Produtos p, Vendas v \n" +
                  "where p.codigo = v.codProduto \n" +
                  "group by p.codigo, p.nome, p.categoria, p.descricao, p.preco, p.qtde\n" +
                  "order by qtd desc";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar produtos");
        }

        return resultado;
    }
    
    /**
    Conta quantos produtos há na tabela Produtos.
    @return Retorna um inteiro que representa quantos produtos há na tabela.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static int qtosProdutos () throws Exception
    {
        MeuResultSet resultado = null;
        
        int qtd = 0;
       
        try
        {
            String sql;
                   
            sql = "SELECT COUNT(*) FROM PRODUTOS";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery (); 
            
            while (resultado.next())
            {
                qtd = resultado.getInt(1);
            }
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao contar produtos");
        }

        return qtd;
    }
    
    /**
    Conta quantos produtos já vendidos há na tabela Produtos, porém estão excluídos.
    @return Retorna um inteiro que representa quantos produtos há na tabela.
    @throws SQLException Se houve algum erro de conexão.
    */
    public static int qtosProdutosExcluidos () throws Exception
    {
        MeuResultSet resultado = null;
        
        int qtd = 0;
       
        try
        {
            String sql;
                   
            sql = "SELECT COUNT(*) FROM PRODUTOS WHERE NOME LIKE '(excluído)%'";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery (); 
            
            while (resultado.next())
            {
                qtd = resultado.getInt(1);
            }
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao contar produtos");
        }

        return qtd;
    }
}