package assignment5;

/**
 * An open question where you have to type in the answer.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class OpenVraag extends Vraag {
    /**
     * Constructor method.
     *
     * @param q The question
     * @param solution The answer
     * @param weight The weight of the question
     */
    public OpenVraag (String q, String solution, int weight) {
        super(q, solution, weight);
    }

    /**
     * Constructor method.
     *
     * @param q The question
     * @param solution The answer
     */
    public OpenVraag (String q, String solution) {
        super(q, solution);
    }
}
