import java.util.Scanner;


public class Calc {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
        try{
            if (b==0) throw new ArithmeticException("Zero Division Error!");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        return (double)a/b;
    }

    public static void main(String[] args){
        Scanner ip= new Scanner(System.in);
        while(true) {
            System.out.print("Enter value for x:");
            int x = ip.nextInt();
            System.out.print("Enter value for y:");
            int y = ip.nextInt();
            System.out.print("Enter operation[+,-,*,/]:");
            String op = ip.next();
            double result;
            switch (op) {
                case "+":
                    result = Calc.add(x, y);
                    System.out.printf("Sum : %d\n", (int)result);
                    break;
                case "-":
                    result = Calc.sub(x, y);
                    System.out.printf("Difference : %d\n", (int)result);
                    break;
                case "*":
                    result = Calc.mul(x, y);
                    System.out.printf("Product : %d\n", (int)result);
                    break;
                case "/":
                    result = Calc.div(x, y);
                    System.out.printf("Reminder : %.2f\n", result);
                    break;
                default:
                    System.out.println("Invalid Operator!");
            }
            System.out.print("Continue?[y/n]:");
            String l=ip.next();
            if (l.equalsIgnoreCase("n")) {
                System.out.println("Bye bye!");
                break;
            }
        }
        ip.close();
    }
}

