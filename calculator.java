            // CALCULATOR
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int A = sc.nextInt();
        System.out.println("enter b: ");
        int B = sc.nextInt();
        System.out.println("enter operator: ");
        char operator = sc.next().charAt(0);


        switch(operator){
            case '+': System.out.println(A+B);
            break;
            case '-': System.out.println(A-B);
            break;
            case '*': System.out.println(A*B);
            break;
            case '/': System.out.println(A/B);
            break;
            case '%': System.out.println(A%B);
            break;
            default: System.out.println("invalid choice");
                
        }

     
    }
}
