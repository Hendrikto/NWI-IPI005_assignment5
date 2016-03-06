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
        Vraag v1 = new OpenVraag("How many constructors are mandatory in Java?", "0", 2);
        Vraag v2 = new MeerkeuzeVraag(
            "How do you print a line with \"Hello world\" in Java?",
            new String[] {
                "System.out.print(\"Hello world\");",
                "System.out.println(\"Hello world\");",
                "cout << \"Hello world\";"
            },
            1
        );
        Vraag v3 = new TweekeuzeVraag("Is there a maximum of how many constructors you can add?", "Yes", "No", 1, 5);
        Vraag v4 = new OpenVraag("What is the time complexity of binary search?", "O(log N)");
        new Quiz(new Spel(v1, v2, v3, v4), 2).start();
    }
}
