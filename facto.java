import java.util.*;

class facto {
   public static void main(String args[])
   {
    int i,f=1,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number ");
    n= sc.nextInt();
    for(i=1;i<=n;i++){
        f=f*i;
    }
    System.out.println("the factorial of a number is "+f);
   }
}

