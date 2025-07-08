package han.aim.se.adapter.with;

public class Main {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        // No Compile-time errors anymore :)
        if (hole.fits(new SquarePegAdapter(smallSqPeg))) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(new SquarePegAdapter(largeSqPeg))) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
