package assignment5;

/**
 * A special case of a multiple choice question with only two possible answers.
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

    /**
     * Return a duplicate of this TweekeuzeVraag.
     *
     * @return A duplicate of this TweekeuzeVraag
     */
    @Override
    public TweekeuzeVraag duplicate () {
        return new TweekeuzeVraag(
                this.text,
                this.options[0],
                this.options[1],
                this.solution.equals(this.options[0]) ? 0 : 1
        );
    }

    /**
     * Get a String representation of this question.
     *
     * @return A String representation of this question
     */
    @Override
    public String toString() {
        return String.format("%s / %s: %s (weight: %d)", this.options[0], this.options[1], this.text, this.weight);
    }
}
