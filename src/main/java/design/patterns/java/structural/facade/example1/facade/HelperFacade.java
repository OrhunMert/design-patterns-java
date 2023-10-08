package design.patterns.java.structural.facade.example1.facade;

import design.patterns.java.structural.facade.example1.subsystems.MySQLHelper;
import design.patterns.java.structural.facade.example1.subsystems.OracleHelper;

import java.sql.Connection;

public class HelperFacade {

    private MySQLHelper mySQLHelper;
    private OracleHelper oracleHelper;

    public HelperFacade() {
        this.mySQLHelper = new MySQLHelper();
        this.oracleHelper = new OracleHelper();
    }

    public void generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
        Connection con = null;
        switch (dbType){
            case MYSQL:
                switch(reportType){
                    case HTML:
                        mySQLHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                    case PDF:
                        mySQLHelper.generateMySqlPDFReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                switch(reportType){
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, con);
                        break;
                }
                break;
        }
    }

    public enum DBTypes {
        MYSQL,ORACLE;
    }

    public enum ReportTypes{
        HTML,PDF;
    }
}