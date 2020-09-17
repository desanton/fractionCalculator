import java.util.*; 

/**
 * Calculates fractions.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FracCalc {

    /**
     * Runs a fraction calculator.
     * 
     * @param args Not used
     */
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);
        String inputLine = inputScanner.nextLine();
        System.out.println(produceAnswer(inputLine));
    }

    /**
     * ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.
     * This function will be used to test your code
     * This function takes a String 'input' and produces the result
     * 
     * @param input A fraction string that needs to be evaluated.
     * For your program, this will be the user input.
     *     e.g. input ==> "1/2 + 3/4"
     * @return The result of the fraction after it has been calculated
     *     e.g. return ==> "1_1/4"
     */
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input

        return "";
    }

    // TODO: Fill in the space below with any helper methods

    /**
     * GCF
     * 
     * @param p first int
     * @param q second int
     * @return The GCF
     */
    public static int gcf(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

}

