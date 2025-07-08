package han.aim.se.adapter.without;

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

        // Compile-time errors
        /*
        if (hole.fits(smallSqPeg)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPeg)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
        */
    }
}
