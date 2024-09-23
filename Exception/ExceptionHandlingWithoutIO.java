package com.Exception;

class CustomCheckedException extends Exception {     
    public CustomCheckedException(String message) {
        super(message);     
    } 
} // Custom unchecked exceptionclass 
class CustomUncheckedException extends RuntimeException {     
    public CustomUncheckedException(String message) {         
        super(message);
    }
}    

public class ExceptionHandlingWithoutIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {             // Simulate some operations           
            int result = performOperations("5");           
            // Display the result          
            System.out.println("Result: " + result);  
        } 
        catch (CustomUncheckedException e) {       
            System.out.println("Caught CustomUncheckedException: " + e.getMessage());     
        } catch (ArithmeticException e) {            
            System.out.println("Caught ArithmeticException: " + e.getMessage());      
        } catch (Exception e) {           
            System.out.println("Caught generic Exception: " + e.getMessage());       
        } finally {          
            System.out.println("Inside finally block: Cleanup code or final operations.");         }     }

    private static int performOperations(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	

}
