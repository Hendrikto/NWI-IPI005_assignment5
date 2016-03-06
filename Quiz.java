package assignment5;

/**
 * Quizzes the user, repeating incorrectly answered questions.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Quiz {
    private final int limit;
    private Questionnaire questionnaire;
    private int round = 1;

    /**
     * Constructor method.
     *
     * @param q A questionnaire to quiz the user about
     * @param limit The round limit
     */
    public Quiz (Questionnaire q, int limit) {
        this.questionnaire = q;
        this.limit = limit;
    }

    /**
     * Start the Quiz.
     */
    public void start () {
        while (round <= limit) {
            announceRound();
            this.questionnaire.start();
            this.questionnaire.showInfo();
            if (this.questionnaire.getIncorrect().isEmpty()) {
                break;
            }
            this.questionnaire = new Spel(this.questionnaire.getIncorrect());
        }
    }

    /**
     * Announce with round we're in.
     */
    private void announceRound () {
        System.out.println(String.format("=========\n Round %d \n=========", this.round++));
    }
}
