import java.util.*;
public class area_circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        float area = 3.14f * r * r ; // float wali value as a double lene ke liye uske aage f lga dena hota hai
        System.out.println(area);
    }
    
}
