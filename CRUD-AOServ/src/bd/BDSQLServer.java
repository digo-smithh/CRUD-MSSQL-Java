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
            "jdbc:sqlserver://regulus.cotuca.unicamp.br:1433;databasename=BD19197",
            "BD19197", "Glausilvinhamor10");
        }
        catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Problemas de conexão com o Banco de Dados!"," Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0); 
        }
        
        COMANDO = comando;
    }
}