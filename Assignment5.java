package assignment5;

/**
 * Contains the main method
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Assignment5 {

    /**
     * Entry point.
     *
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Vraag v1 = new OpenVraag("Answer?", "42");
        Vraag v2 = new MeerkeuzeVraag("true, false, false?", new String[] {"true", "false", "false"}, 0);
        Vraag v3 = new TweekeuzeVraag("This question has an answer.", "true", "false", 0, 5);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v3.isCorrect("true"));
        System.out.println(v3.juisteAntwoord());
    }
}
