package design.patterns.java.structural.facade.example1.subsystems;

import java.sql.Connection;

public class MySQLHelper {

    public static void getMySqlDBConnection(){
        System.out.println("MySQL Connection");
    }

    public void generateMySqlPDFReport(String tableName, Connection connection){
        System.out.println("MySQL database pdf report:\ntableName: " + tableName);
        System.out.println("Connection:" + connection);
    }

    public void generateMySqlHTMLReport(String tableName, Connection connection){
        System.out.println("MySQL database html report:\ntableName: " + tableName);
        System.out.println("Connection:" + connection);
    }
}
