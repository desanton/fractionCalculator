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
        
        
        /*
        Test input: 1_2/3 + 4_5/6
        
        Input possibilities
        
        Number:
        - Can only be whole: 2
            Should say "whole: 2, num: 0, denom: 0"
        - Can only be frac: 2/3
            Should say "whole: 0, num: 2, denom: 3"
        - Can be mixed: 2_2/3
            Should say "whole: 2, num: 2, denom: 3"
        - Can be nothing: 
            Should say "whole: 0, num: 0, denom: 0"
        
        
        */
        
        String firstNum = "";
        String operator = "";
        String secondNum = "";
        
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' ')
            {
                firstNum = input.substring(0, i);
                operator = input.substring( (i + 1), (i + 2) );
                secondNum = input.substring((i + 3));
                
                System.out.println("firstNum: " + firstNum);
                System.out.println("operator: " + operator);
                System.out.println("secondNum: " + secondNum);
                break;
            }
            
        }
        
        int wholeFirst = 0;
        int wholeFirstEndIndex = 0;
        
        for(int i = 0; i < firstNum.length(); i++)
        {
            if(firstNum.charAt(i) == '_')
            {
                wholeFirst = Integer.parseInt( firstNum.substring(0, i) );
                wholeFirstEndIndex = i;
            }
        }
        
        
        int numeratorFirst = 0;
        
        int denominatorFirst = 0;
        
        for(int i = 0; i < firstNum.length(); i++)
        {
            if(firstNum.charAt(i) == '/')
            {
                String yee = firstNum.substring((wholeFirstEndIndex + 1), i);
                String eey = firstNum.substring(i + 1);
                
                numeratorFirst = Integer.parseInt(yee);
                denominatorFirst = Integer.parseInt(eey);
            }
        }
        
        
        System.out.println();
        System.out.println("First Number");
        System.out.println("whole: " + wholeFirst + ", numerator: " + numeratorFirst + ", denominator: " + denominatorFirst);
        
        //second number time
        
        int wholeSecond = 0;
        int wholeSecondEndIndex = 0;
        
        for(int i = 0; i < secondNum.length(); i++)
        {
            if(secondNum.charAt(i) == '_')
            {
                wholeSecond = Integer.parseInt( secondNum.substring(0, i) );
                wholeSecondEndIndex = i;
            }
        }
        
        
        int numeratorSecond = 0;
        
        int denominatorSecond = 0;
        
        for(int i = 0; i < secondNum.length(); i++)
        {
            if(secondNum.charAt(i) == '/')
            {
                String yee = secondNum.substring((wholeSecondEndIndex + 1), i);
                String eey = secondNum.substring(i + 1);
                
                numeratorSecond = Integer.parseInt(yee);
                denominatorSecond = Integer.parseInt(eey);
            }
        }
        
        
        System.out.println();
        System.out.println("Second Number");
        System.out.println("whole: " + wholeSecond + ", numerator: " + numeratorSecond + ", denominator: " + denominatorSecond);        
        
        
        return ("whole: " + wholeSecond + ", numerator: " + numeratorSecond + ", denominator: " + denominatorSecond);
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

