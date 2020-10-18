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
        
        if(firstNum.charAt(0) == '-')
        {
            firstNegative = true;
            firstNum = firstNum.substring(1, firstNum.length() );
        }
        
        for(int i = 0; i < firstNum.length(); i++)
        {
            if(firstNum.charAt(i) == '/')
            {
                //if there's a fraction, there must be a /
                firstFracExists = true;
                
                //if it detects a / before it detects a _, there won't be a wholenumber, so we can just break
                break;
            }
            
            if(firstNum.charAt(i) == '_')
            {
                //if there's both a whole number and a fraction, there must be a _
                
                firstWhole = Integer.parseInt( firstNum.substring(0, i) );
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
        boolean secondNegative = false;
        
        int secondNumerator = 0;
        int secondDenominator = 1;
        
        boolean secondFracExists = false;
        
        if(secondNum.charAt(0) == '-')
        {
            //checks if negative. If so, stores neg as true and removes - sign to avoid further confusion
            
            secondNegative = true;
            secondNum = secondNum.substring(1, secondNum.length() );
        }
        
        for(int i = 0; i < secondNum.length(); i++)
        {
            if(secondNum.charAt(i) == '/')
            {
                //if there's a fraction, there must be a /
                secondFracExists = true;
                
                //if it detects a / before it detects a _, there won't be a wholenumber, so we can just break
                break;
            }
            
            if(secondNum.charAt(i) == '_')
            {
                //if there's both a whole number and a fraction, there must be a _
                
                secondWhole = Integer.parseInt( secondNum.substring(0, i) );
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
        System.out.println();
        
//========Calculation================================================================
        /*
        Test input: -22_3/7 - -33_9/14
        
        system
            adding/subtracting
                if second number is neg, reverse operation
                
                for frac
                    Find GCF
                    Multiply denom1 by GCF = newDenom
                    Multiply denom2 by GCF
                    Multiply Numer1 by GCF
                    Multiply numer2 by GCF
                    
                    add numer1 + numer2 = numerResult
                    
                    return numerResult and newDenom
                
                for whole
                    add/subtract
                    
                    return whole
                
                return whole_numer/denom
                    
                    
            multiplying
                
                multiply numers and denoms
                multiply whole numbers
                
                return whole_numer/denom
            
            dividing
                Turn both numbers into frac
                    whole1 * denom1 = yeah
                    numer1 + yeah = newNumerator1
                    
                    print newFrac1 = newNumerator1 / denom1
                    
                    whole2 * denom2 = yee
                    numer2 + yee = newNumerator2
                    
                    print newFrac2 = newNumerator2 / denom2
                    
                After turning both numbers into frac
                    num1      *       denom2
                    denom1            num2
                    
                    ( (num1 * denom2) ) = newNumerator
                    ( (denom1 * num2) ) = newDenominator
        */
        
        String totalAnswer = "";
        String wholeAnswer = "";
        String fracAnswer = "";
        
        
        if( (operator.equals("+") ) || (operator.equals("-") ) )
        {
            //if second number negative, reverse operation
            if(secondNegative)
            {
                if(operator.equals("+") )
                {
                    operator = "-";
                }
                else
                {
                    operator = "+";
                }
            }
            
            //Fraction calculation
            if( firstFracExists && secondFracExists )
            {
                int newDenominator = secondDenominator * firstDenominator;
                int newNumerator1 = secondDenominator * firstNumerator;
                int newNumerator2 = firstDenominator * secondNumerator;
                
                if(firstNegative)
                {
                    newNumerator1 *= -1;
                }
                
                int result = 0;
                
                if(operator.equals("+"))
                {
                    result = newNumerator1 + newNumerator2;
                }
                else
                {
                    result = newNumerator1 - newNumerator2;
                }
                
                fracAnswer = result + "/" + newDenominator;
                
                
            }
            else
            {
                if(firstFracExists)
                {
                    fracAnswer = firstNumerator + "/" + firstDenominator;
                }
                else
                {
                    fracAnswer = secondNumerator + "/" + secondDenominator;
                }
            }
            
            System.out.println("frac: " + fracAnswer);
            
            //Whole number calculation
            if(firstNegative)
            {
                firstWhole *= -1;
            }
            
            int ree = 0;
            
            if(operator.equals("+"))
            {
                ree = firstWhole + secondWhole;
            }
            else
            {
                ree = firstWhole - secondWhole;
            }
            
            wholeAnswer = Integer.toString(ree);
            
            totalAnswer = wholeAnswer + "_" + fracAnswer;
            
            System.out.println("answer: " + totalAnswer);
            
        }
        else if( (operator.equals("*")) )
        {
            int newNumerator = firstNumerator * secondNumerator;
            int newDenominator = firstDenominator * secondDenominator;
            
            
        }
        else
        {
            
        }
        
        
        return "poop funny haha";
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

