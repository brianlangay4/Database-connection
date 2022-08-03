
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

      //needs to be surrounded by try catch block in case of sqlException error
        try {
            //used connection to obtain the sql connection
            //used a DriverManager  for our sql connection from project lib dependency
            Connection dbs = DriverManager.getConnection("jdbc:mysql://root@127.0.0.1:3306/user", "root", "toor");
           //Statement used for the connection
            Statement statement = dbs.createStatement();
            //Result set  to obtain the query in our schema
            ResultSet resultSet = statement.executeQuery("select * from logs");
            //looped to obtain all the items in the table selected
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        }
        //last e catch the Exception to complete the code
        catch (Exception e){
            e.printStackTrace();
        }
    }
}