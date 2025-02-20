package DB;



import java.sql.*;


public class DB 
{
    public static Connection Con()
    {
        Connection con=null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/block_chain_medical","root","");
        }
        catch (ClassNotFoundException | SQLException e) 
        { 
            System.out.println(e);
        }
        return con;
    }
}
