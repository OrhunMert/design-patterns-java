package design.patterns.java.structural.adapter.example1.adapter;

import design.patterns.java.structural.adapter.example1.round.RoundPeg;
import design.patterns.java.structural.adapter.example1.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(double width, SquarePeg squarePeg) {
        super(width);
        this.squarePeg = squarePeg;
    }

    @Override
    public double getWidth() {
        return Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}
