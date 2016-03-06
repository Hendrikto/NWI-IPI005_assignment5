package assignment5;

/**
 * An abstract model of a question.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public abstract class Vraag {
    protected final String text;
    protected final int weight;
    private final String solution;

    public Vraag (String question, String answer, int weight) {
        this.text = question;
        this.solution = answer;
        if (isValidWeight(weight)) {
            this.weight = weight;
        } else {
            this.weight = 3;
        }
    }

    public Vraag (String q, String solution) {
        this(q, solution, 3);
    }

    /**
     * Determine whether an answer is correct.
     *
     * @param s the answer to check
     * @return whether s was the correct answer
     */
    public final boolean isCorrect (String s) {
        return s.equals(this.solution);
    }

    /**
     * Return the correct answer.
     *
     * @return
     */
    public final String juisteAntwoord () {
        return this.solution;
    }

    @Override
    public String toString () {
        return String.format("%s (weight: %d)", this.text, this.weight);
    }

    private static boolean isValidWeight (int w) {
        return w >= 1 && w <= 5;
    }
}
