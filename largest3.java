        // largest of. 3 number
import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>B && A>C){
            System.out.println("A is greatest");
        }
        else if( B>=C){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }
    }
    
}
