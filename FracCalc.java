import java.util.*; 

/**
 * Calculates fractions.
 *
 * @author Tony Fernandes and Ara Esfar something
 * @version 9/21/20
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
        /*
        produceAnswer breaks up that line of input into three Strings: the first operand (fraction), the
        operator (+ - * /), and the second operand (fraction). Each of these Strings should be stored in
        variables inside produceAnswer.
        */
        
        String numerator1 = "";
        String denominator1 = "";
        
        String operator = "";
        
        String numerator2 = "";
        String denominator2 = "";
        
        for(int i = 0; i < input.length; i++){
            if(input.charAt(i) == ' ')
            {
                numerator1 = input.subString(0, i);
                // add parsing for denoms and stuff
                
                operator = input.charAt(i);
                numerator2 = 
            }
            
        }
        
       
        
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

