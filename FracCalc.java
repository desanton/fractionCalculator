import java.util.*; 

/**
 * Calculates fractions.
 *
 * @author Tony Fernandes and Ara Esfarjani something
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
        System.out.println("helllloo");
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
        System.out.println("Raw Input: " + input);
        
        /*
        Test input: -22_3/7 + -33_9/2
        
        system
            for fractions
                adding/subtracting
                    
                    multiply denoms together so they're the same = new denom
                    multiply numerators by same value
                    result = add/subtract numerators
                    
                    return result/new denom
                
                multiplying/dividing
                for dividing, just reverse the second number, then multiply
                    nResult = numerator * other numerator
                    dResult = denominator * other denominator
                    
                    return nResult/dResult
            
            for whole numbers
                adding/subtracting/multiplying
                    just add/subtract/multiply
                
                dividing
                    if divisible
                        just divide
                    else
                        make into fraction
                        simplify
                        add to other fraction
        
        
        */
        
        

//========PARSING================================================================

        //Separates input into first num, operator, and second num
        String firstNum = "";
        String operator = "";
        String secondNum = "";
        
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' ')
            {
                firstNum = input.substring(0, i);
                operator = input.substring( (i + 1), (i + 2) );
                secondNum = input.substring((i + 3));
                
                break;
            }
            
        }
        
        System.out.println("First Num: " + firstNum + ",operator: " + operator + ", second num: " + secondNum);
        
        
        //Separates first num into whole, numerator, denominator. Stores positive/negative value
        int firstWhole = 0;
        int firstWholeEndIndex = 0;
        boolean firstNegative = false;
        
        int firstNumerator = 0;
        int firstDenominator = 1;
        
        boolean firstFracExists = false;
        
        for(int i = 0; i < firstNum.length(); i++)
        {
            if(firstNum.charAt(i) == '/')
            {
                //if there's a fraction, there must be a /
                firstFracExists = true;
                
                //if there's no fraction, there won't be a _, so we can just break
                break;
            }
            
            if(firstNum.charAt(i) == '_')
            {
                //if there's both a whole number and a fraction, there must be a _
                
                firstWhole = Integer.parseInt( firstNum.substring(0, i) );
                
                if(firstWhole < 0)
                {
                    firstNegative = true;
                    firstWhole *= -1;
                }    
                firstWholeEndIndex = i;
            }
        }
        
        if(firstFracExists == false)
        {
            //if there's no fraction, the second number is just the whole number
            firstWhole = Integer.parseInt(firstNum);
        }
        else
        {
            for(int i = 0; i < firstNum.length(); i++)
            {
                if(firstNum.charAt(i) == '/')
                {
                    if(firstWhole == 0)
                    {
                        //we check if whole num is 0, because that means that there's no whole number
                        // if there's no whole number, numerator is just everyting before /
                        //and denominator is just everything after /
                        
                        String yee = firstNum.substring(0, i);
                        String eey = firstNum.substring(i + 1);
                        
                        firstNumerator = Integer.parseInt(yee);
                        firstDenominator = Integer.parseInt(eey);
                    }
                    else
                    {
                        //everything before the / and after the whole number is numerator
                        //everyting after the / is the denominator
                        String yee = firstNum.substring((firstWholeEndIndex + 1), i);
                        String eey = firstNum.substring(i + 1);
                        
                        firstNumerator = Integer.parseInt(yee);
                        firstDenominator = Integer.parseInt(eey);
                    }
                }
            }
        }
        
        System.out.println();
        System.out.println("First number: ");
        System.out.println("whole: " + firstWhole + ", numerator: " + firstNumerator + ", denominator: " + firstDenominator);
        
        //Separates second num into whole, numerator, denominator. Stores positive/negative value
        int secondWhole = 0;
        int secondWholeEndIndex = 0;
        boolean secondNegative;
        
        int secondNumerator = 0;
        int secondDenominator = 1;
        
        boolean secondFracExists = false;
        
        for(int i = 0; i < secondNum.length(); i++)
        {
            if(secondNum.charAt(i) == '/')
            {
                //if there's a fraction, there must be a /
                secondFracExists = true;
            }
            
            if(secondNum.charAt(i) == '_')
            {
                //if there's both a whole number and a fraction, there must be a _
                
                secondWhole = Integer.parseInt( secondNum.substring(0, i) );
                
                if(secondWhole < 0)
                {
                    secondNegative = true;
                    secondWhole *= -1;
                }    
                secondWholeEndIndex = i;
            }
        }
        
        if(secondFracExists == false)
        {
            //if there's no fraction, the second number is just the whole number
            secondWhole = Integer.parseInt( secondNum );
        }
        else
        {
            
            for(int i = 0; i < secondNum.length(); i++)
            {
                if(secondNum.charAt(i) == '/')
                {
                    
                    if(secondWhole == 0)
                    {
                        //we check if whole num is 0, because that means that there's no whole number
                        // if there's no whole number, numerator is just everyting before /
                        //and denominator is just everything after /
                        
                        String yee = secondNum.substring(0, i);
                        String eey = secondNum.substring(i + 1);
                        
                        secondNumerator = Integer.parseInt(yee);
                        secondDenominator = Integer.parseInt(eey);
                    }
                    else
                    {
                        //everything before the / and after the whole number is numerator
                        //everyting after the / is the denominator
                        String yee = secondNum.substring((secondWholeEndIndex + 1), i);
                        String eey = secondNum.substring(i + 1);
                        
                        secondNumerator = Integer.parseInt(yee);
                        secondDenominator = Integer.parseInt(eey);
                    }
                    
                }
            } 
        }
        
        
        
        System.out.println();
        System.out.println("Second Number: ");
        System.out.println("whole:" + secondWhole + " numerator:" + secondNumerator + " denominator:" + secondDenominator);
        
        
        
        
        return ("whole:" + secondWhole + " numerator:" + secondNumerator + " denominator:" + secondDenominator);
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

