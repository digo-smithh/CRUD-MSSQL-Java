package bd;

import bd.core.*;
import bd.daos.*;

import javax.swing.JOptionPane;

public class BDSQLServer
{
    public static final MeuPreparedStatement COMANDO;

    static
    {
    	MeuPreparedStatement comando = null;

    	try
        {
            comando = new MeuPreparedStatement (
            "com.microsoft.sqlserver.jdbc.SQLServerDriver",
            "jdbc:sqlserver://servidor;databasename=nome-do-banco-de-dados",
            "login-sql-server", "senha-sql-server");
        }
        catch (Exception erro)
        {
            System.err.println(erro);
            JOptionPane.showMessageDialog(null,"Problemas de conexão com o Banco de Dados!"," Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        COMANDO = comando;
    }
}