package assignment5;

import java.util.Random;

/**
 * A multiple choice question where you can choose between "a", "b", "c" etc.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class MeerkeuzeVraag extends Vraag {
    protected final String[] options;

    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param options The answer options
     * @param answer The index of the right answer in the options argument
     * @param weight The weight of the question
     */
    public MeerkeuzeVraag(String question, String[] options, int answer, int weight) {
        super(question, getLetter(answer), weight);
        this.options = options;
    }

    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param options The answer options
     * @param answer The index of the right answer in the options argument
     */
    public MeerkeuzeVraag(String question, String[] options, int answer) {
        super(question, getLetter(answer));
        this.options = options;
    }

    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param options The answer options
     * @param answer The right answer
     * @param weight The weight of the question
     */
    public MeerkeuzeVraag(String question, String[] options, String answer, int weight) {
        super(question, answer, weight);
        this.options = options;
    }

    /**
     * Constructor method.
     *
     * @param question The text of the question
     * @param options The answer options
     * @param answer The right answer
     */
    public MeerkeuzeVraag(String question, String[] options, String answer) {
        super(question, answer);
        this.options = options;
    }

    /**
     * Return a duplicate of this MeerkeuzeVraag.
     *
     * @return a duplicate of this MeerkeuzeVraag
     */
    @Override
    public MeerkeuzeVraag duplicate() {
        int shift = new Random().nextInt(options.length - 1);
        String[] newOptions = new String[options.length];
        for (int i = 0; i < options.length; i++) {
            newOptions[(i + shift) % options.length] = options[i];
        }
        return new MeerkeuzeVraag(
                text,
                newOptions,
                getLetter((solution.charAt(0) - 97 + shift) % options.length),
                weight
        );
    }

    /**
     * Get a String representation of this question.
     *
     * @return A String representation of this question
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        char index = 'a';
        sb.append(String.format("%s (weight: %d)\n", text, weight));
        for (String s : options) {
            sb.append(String.format("  %c) %s\n", index++, s));
        }
        return sb.toString();
    }

    /**
     * Get an alphabet based index from a number.
     *
     * @param a The index as a number
     * @return The index as a letter
     */
    private static String getLetter(int a) {
        return String.valueOf((char) ('a' + a));
    }
}
