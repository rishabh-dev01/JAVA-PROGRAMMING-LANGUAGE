import java.util.*;
public class do_while_question {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int n;
        do {
            System.out.println("enter your number");
            n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);

    }
}
