import java.util.Scanner;
import java.util.InputMismatchException;

class Calculator{
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot be divided bt ZERO!!!");
            return Double.NaN;
        }
        return (double) a / b;
    }
}

public class Calc {
    public static Scanner ip= new Scanner(System.in);



    public static boolean continueLoop(Scanner ip){
        while(true){
            System.out.print("Continue?[y/n]:");
            String l=ip.next();
            if (l.equalsIgnoreCase("y")) {
                System.out.println();
                return true;
            } else if(l.equalsIgnoreCase("n")) {
                System.out.println("Bye bye!");
                return false;
            }else{
                System.out.println("Please enter either y/n!");
            }
        }
    }

    public static String getValidOp(Scanner ip){
        while(true){
            System.out.print("Enter operation[+,-,*,/]:");
            String op = ip.next();
            if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")){
                return op;
            }
            else{
                System.out.println("Invalid Operator!");
            }
        }
    }

    public static double getValidNo(String prompt){
        while(true){
            try{
                System.out.print(prompt);
                return ip.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid input! Enter a number!!");
                ip.next();
            }
        }
    }


    public static void main(String[] args){
        boolean continueCalc = true;
        while(continueCalc) {
            double x=getValidNo("Enter value for x:");
            double y=getValidNo("Enter value for y:");

            String op = getValidOp(ip);
            double result;
            switch (op) {
                case "+":
                    result = Calculator.add(x, y);
                    System.out.printf("Sum :  %.2f\n", result);
                    break;
                case "-":
                    result = Calculator.sub(x, y);
                    System.out.printf("Difference :  %.2f\n", result);
                    break;
                case "*":
                    result = Calculator.mul(x, y);
                    System.out.printf("Product : %.2f\n", result);
                    break;
                case "/":
                    result = Calculator.div(x, y);
                    System.out.printf("Quotient : %.2f\n", result);
                    break;
                default:
                    System.out.println("Invalid Operator!");
            }
            continueCalc=continueLoop(ip);
        }
        ip.close();
    }
}

