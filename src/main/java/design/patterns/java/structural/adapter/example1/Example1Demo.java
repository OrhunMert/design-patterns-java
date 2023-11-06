package design.patterns.java.structural.adapter.example1;

import design.patterns.java.structural.adapter.example1.adapter.SquarePegAdapter;
import design.patterns.java.structural.adapter.example1.round.RoundHoles;
import design.patterns.java.structural.adapter.example1.round.RoundPeg;
import design.patterns.java.structural.adapter.example1.square.SquarePeg;

public class Example1Demo {
    public static void main(String[] args) {
        RoundHoles roundHoles = new RoundHoles(10);
        RoundPeg roundPeg = new RoundPeg(5);

        boolean isFit = roundHoles.fits(roundPeg);

        System.out.println("isFit:" + isFit);

        SquarePeg squarePeg = new SquarePeg(27);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg.getWidth(), squarePeg);

        double width = squarePegAdapter.getWidth();

        System.out.println("Square width:" + width);
    }
}