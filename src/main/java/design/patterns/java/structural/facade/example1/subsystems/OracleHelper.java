package design.patterns.java.structural.facade.example1.subsystems;

import java.sql.Connection;

public class OracleHelper {

    public static void getOracleDBConnection(){
        System.out.println("Oracle Connection");
    }

    public void generateOraclePDFReport(String tableName, Connection connection){
        System.out.println("Oracle database pdf report:\ntableName: " + tableName);
        System.out.println("Connection:" + connection);
    }

    public void generateOracleHTMLReport(String tableName, Connection connection){
        System.out.println("Oracle database html report:\ntableName: " + tableName);
        System.out.println("Connection:" + connection);
    }
}
