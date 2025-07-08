package han.aim.se.adapter.with;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        var squareRadius = peg.getWidth() / 2;
        //Pythagoras: 1:1:√2 driehoek.
        var equivalentRoundRadius = squareRadius * Math.sqrt(2);
        return equivalentRoundRadius;

        // result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        // return result;
    }
}
