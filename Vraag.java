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

    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param answer The answer to the question
     * @param weight The weight of the question
     */
    public Vraag (String question, String answer, int weight) {
        this.text = question;
        this.solution = answer;
        if (isValidWeight(weight)) {
            this.weight = weight;
        } else {
            this.weight = 3;
        }
    }

    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param answer The answer to the question
     */
    public Vraag (String question, String answer) {
        this(question, answer, 3);
    }

    /**
     * Determine whether an answer is correct.
     *
     * @param s the answer to check
     * @return whether s was the correct answer (case insensitive)
     */
    public final boolean isCorrect (String s) {
        return s.equalsIgnoreCase(this.solution);
    }

    /**
     * Return the correct answer.
     *
     * @return the correct answer
     */
    public final String juisteAntwoord () {
        return this.solution;
    }

    /**
     * Return a duplicate of this Vraag.
     *
     * @return A duplicate of this Vraag
     */
    abstract public Vraag duplicate ();

    /**
     * Get a String representation of this question.
     *
     * @return A String representation of this question
     */
    @Override
    public String toString () {
        return String.format("%s (weight: %d)", this.text, this.weight);
    }

    /**
     * Check if a weight is valid.
     *
     * @param w The weight to check
     * @return Whether the weight is valid
     */
    private static boolean isValidWeight (int w) {
        return w >= 1 && w <= 5;
    }
}
