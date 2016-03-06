package assignment5;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class implements the Questionnaire interface.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Spel implements Questionnaire {
    private final Scanner scanner = new Scanner(System.in);
    private final LinkedList<Vraag> questions;
    private final LinkedList<Vraag> incorrect = new LinkedList<>();
    private int correct = 0;
    private int points = 0;

    /**
     * Constructor method.
     *
     * @param c A collection of questions
     */
    public Spel (Collection<Vraag> c) {
        this.questions = new LinkedList<>(c);
    }

    /**
     * Constructor method.
     *
     * @param vs An Array of questions
     */
    public Spel (Vraag[] vs) {
        this.questions = new LinkedList<>(Arrays.asList(vs));
    }

    /**
     * Constructor method.
     */
    public Spel () {
        this.questions = new LinkedList<>();
    }

    /**
     * Add a Vraag to this Spel.
     *
     * @param v The Vraag to add
     */
    @Override
    public void add (Vraag v) {
        this.questions.add(v);
    }

    /**
     * Start the questioning.
     */
    @Override
    public void start () {
        for (Vraag v: this.questions) {
            if (this.ask(v)) {
                this.setCorrect(v);
            } else {
                this.setIncorrect(v);
            }
        }
    }

    /**
     * Show information about how the game went.
     */
    @Override
    public void showInfo () {
        System.out.println(
            String.format(
                "You answered %d out of %d questions correctly and got %d points.",
                this.correct,
                this.questions.size(),
                this.points
            )
        );
    }

    /**
     * Return a List of incorrectly answered questions.
     *
     * @return A List of incorrectly answered questions
     */
    @Override
    public LinkedList<Vraag> getIncorrect () {
        return this.incorrect;
    }

    /**
     * Ask the user a Vraag.
     *
     * @param v The Vraag to ask the user
     * @return Whether the Vraag was correctly answered
     */
    private boolean ask (Vraag v) {
        System.out.println(v);
        System.out.print("Your answer: ");
        return v.isCorrect(scanner.nextLine());
    }

    /**
     * Do housekeeping after correctly answering a Vraag.
     *
     * @param v The Vraag that has been correctly answered
     */
    private void setCorrect (Vraag v) {
        this.correct++;
        this.points += v.getWeight();
        System.out.println("Your answer was correct.");
    }

    /**
     * Do housekeeping after incorrectly answering a Vraag.
     *
     * @param v The Vraag that has been incorrectly answered
     */
    private void setIncorrect (Vraag v) {
        this.incorrect.add(v.duplicate());
        System.out.println(
            String.format(
                "Your answer was incorrect. The correct answer is %s.",
                v.juisteAntwoord()
            )
        );
    }
}
