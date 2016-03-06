package assignment5;

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
    public MeerkeuzeVraag (String question, String[] options, int answer, int weight) {
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
    public MeerkeuzeVraag (String question, String[] options, int answer) {
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
    public MeerkeuzeVraag (String question, String[] options, String answer, int weight) {
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
    public MeerkeuzeVraag (String question, String[] options, String answer) {
        super(question, answer);
        this.options = options;
    }
    
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        char index = 'a';
        sb.append(String.format("%s (weight: %d)\n", this.text, this.weight));
        for (String s: this.options) {
            sb.append(String.format("  %c) %s\n", index++, s));
        }
        return sb.toString();
    }
    
    private static String getLetter (int a) {
        return String.valueOf((char)('a' + a));
    }
}