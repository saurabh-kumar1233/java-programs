import java.util.*;
public class even {
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
            n = sc.nextInt();

        if (n%2==0)
        {
            System.out.println("number is even"+n);
        }
        else{
            System.out.println("number is odd"+n);
        }

    }}

