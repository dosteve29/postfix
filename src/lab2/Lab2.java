import java.util.Scanner;

/**
 *
 * @author Steve
 * @param <T>
 */

//this class will implement the linked list for stack and its operations
public class Lab2<T> {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        
        System.out.println("Enter a postfix expression: ");
        Scanner kb = new Scanner(System.in); 
        //post-fix expression is split up and stored in string array
        String[] result = kb.nextLine().split("\\s");
        
        for (int i = 0; i < result.length; i++){
            if (isValue(result[i])){ //if token is a value
                stack.push(result[i]); //push into stack
            }
            else if (isOperator(result[i])){ //if token is a operator
                if (stack.getSize() < 2){ 
                    System.out.println("Not enough values in stack");
                    System.exit(1);
                }
                else{ //the successful path of operation
                    double value1 = 0.0;
                    double value2 = 0.0;
                    String newValue = "";
                    
                    //pop two values
                    value2 = Double.parseDouble(stack.pop());
                    value1 = Double.parseDouble(stack.pop());
                    
                    newValue += evalute(value1, value2, result[i]);
                    stack.push(newValue);
                }
            }
            else { //invalid input. neither value nor operator
                System.out.println("Invalid Input.");
                System.exit(1);
            }
        }
        
        if (stack.getSize() == 1){
            System.out.println("Result: " + stack.pop());
        }
        else {
            System.out.println("Too many values put into expression");
            System.exit(1);
        }
    }
    
    public static boolean isValue(String s){
        try{
            Double.parseDouble(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean isOperator(String s){
        switch(s){
            case "+":
            case "-":
            case "*":
            case "x":
            case "/":
                return true;
            default:
                return false;
        }
    }
    
    public static double evalute(double v1, double v2, String operator){
        switch (operator) {
            case "+":
                //addition
                return v1 + v2;
            case "-":
                //subtraction
                return v1 - v2;
            case "x":
            case "*":
                //multiplication
                return v1 * v2;
            default:
                //division
                return v1 / v2;
        }
    }
}
