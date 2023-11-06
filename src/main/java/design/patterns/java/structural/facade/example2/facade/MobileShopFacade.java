package design.patterns.java.structural.facade.example2.facade;


import design.patterns.java.structural.facade.example2.subsystems.Huawei;
import design.patterns.java.structural.facade.example2.subsystems.MobileShop;
import design.patterns.java.structural.facade.example2.subsystems.Samsung;

public class MobileShopFacade {
    private MobileShop samsung;
    private MobileShop huawei;

    public MobileShopFacade() {
        this.samsung = new Samsung();
        this.huawei = new Huawei();
    }

    public void saleSamsungMobilePhone() {
        samsung.modelNoe();
        samsung.price();
    }

    public void saleHuaweiMobilePhone() {
        huawei.modelNoe();
        huawei.price();
    }
}
