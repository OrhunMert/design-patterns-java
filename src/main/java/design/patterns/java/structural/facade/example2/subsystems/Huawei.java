package design.patterns.java.structural.facade.example2.subsystems;

public class Huawei implements MobileShop {
    @Override
    public void modelNoe() {
        System.out.println("Huawei mobile phone");
    }

    @Override
    public void price() {
        System.out.println("27000 TL");
    }
}
