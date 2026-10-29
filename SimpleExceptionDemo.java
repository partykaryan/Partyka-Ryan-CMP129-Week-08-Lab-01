public class SimpleExceptionDemo {

    public static void safeDivide(int numerator, int denominator){
        
        System.out.println("Attempting to divide " + numerator + " by " + denominator);

        try{
            int result = (numerator / denominator);
            System.out.println("Answer: " + result);
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }finally{
            System.out.println("Division operation is complete");
            System.out.println();
        }
    
    }//end of safeDivide method
    
    public static void main(String[] args) {
    //Testing safeDivide() method with exception handling
        
        //Test 1: Dividing with two valid positive integers
        safeDivide(45, 9);
        
        //Test 2: Dividing by 0, Error message expected
        safeDivide(12, 0);
        
        //Test 3: Dividing negative numerator and valid denominator
        safeDivide(-84, 12);

    }//end of main method
}//end of public class
