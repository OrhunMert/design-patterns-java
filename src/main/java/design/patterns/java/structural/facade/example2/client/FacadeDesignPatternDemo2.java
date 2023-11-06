package design.patterns.java.structural.facade.example2.client;


import design.patterns.java.structural.facade.example2.facade.MobileShopFacade;

public class FacadeDesignPatternDemo2 {
    public static void main(String[] args) {
        MobileShopFacade mobileShopFacade = new MobileShopFacade();

        mobileShopFacade.saleSamsungMobilePhone();
        mobileShopFacade.saleHuaweiMobilePhone();
    }
}