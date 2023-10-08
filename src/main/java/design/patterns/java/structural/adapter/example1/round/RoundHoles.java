package design.patterns.java.structural.adapter.example1.round;

public class RoundHoles {
    private double radius;

    public RoundHoles(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.getRadius() >= roundPeg.getWidth();
    }
}
