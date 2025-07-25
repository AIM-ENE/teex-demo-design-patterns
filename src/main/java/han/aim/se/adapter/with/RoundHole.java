package han.aim.se.adapter.with;

/**
 * RoundHoles are compatible with RoundPegs.
 * Consider this class to be unchangeable (third-party, library, etc.).
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
