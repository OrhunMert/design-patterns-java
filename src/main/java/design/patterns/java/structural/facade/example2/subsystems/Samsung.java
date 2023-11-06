package design.patterns.java.structural.facade.example2.subsystems;

public class Samsung implements MobileShop {
    @Override
    public void modelNoe() {
        System.out.println("Samsung mobile phone");
    }

    @Override
    public void price() {
        System.out.println("5000 TL");
    }
}
