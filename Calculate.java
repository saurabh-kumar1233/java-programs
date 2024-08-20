import java.util.*;
public class Calculate {
    
    public static void main(String args[]){
        int a=5,b=6;
        Scanner sc= new Scanner(System.in);
         int choice=sc.nextInt();
        switch (choice){
            case 1:
            System.out.println(a+b);
            break;

            case 2:
            System.out.println(a-b);
            break;
        
            case 3:
            System.out.println(a*b);
            break;

            case 4:
            System.out.println(a/b);
            break;

            default:
            System.out.println("sorry please enter your choice");

        }
    }
}
