package design.patterns.java.structural.facade.example1.client;

import design.patterns.java.structural.facade.example1.facade.HelperFacade;

public class FacadeDesignPatternDemo1 {
    public static void main(String[] args) {
        HelperFacade helperFacade = new HelperFacade();
        helperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.PDF, "orhun");
    }
}