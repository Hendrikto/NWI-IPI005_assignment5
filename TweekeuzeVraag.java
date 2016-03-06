package assignment5;

/**
 * A special case of a multiple choice question
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class TweekeuzeVraag extends MeerkeuzeVraag {
    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param option1 The first answer option
     * @param option2 The second answer option
     * @param answer The index of the correct answer
     * @param weight The weight of the question
     */
    public TweekeuzeVraag (String question, String option1, String option2, int answer, int weight) {
        super(
                question,
                new String[] {option1, option2},
                new String[] {option1, option2}[answer],
                weight
        );
    }

    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param option1 The first answer option
     * @param option2 The second answer option
     * @param answer The index of the correct answer
     */
    public TweekeuzeVraag (String question, String option1, String option2, int answer) {
        super(
                question,
                new String[] {option1, option2},
                new String[] {option1, option2}[answer]
        );
    }

    @Override
    public String toString() {
        return String.format("%s / %s: %s (weight: %d)", this.options[0], this.options[1], this.text, this.weight);
    }
}
