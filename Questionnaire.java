package assignment5;

import java.util.Collection;

/**
 * An interface for a questionnaire.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public interface Questionnaire {
    /**
     * Add a Vraag.
     *
     * @param v The Vraag to add.
     */
    public void add (Vraag v);

    /**
     * Start the questionnaire.
     */
    public void start ();

    /**
     * Show information about the game.
     */
    public void showInfo ();

    /**
     * Get the questions that have been answered incorrectly.
     *
     * @return The questions which have been answered incorrectly
     */
    public Collection<Vraag> getIncorrect ();
}
