import java.util.Scanner;

import.java.util.*;
public class calculater{

public static int calculate(int a , int b){
int choice;
Scanner sc=new Scanner(System.in);
choice=sc.nextInt();
switch(choice){
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
    System.out.println("please enter your valid choice");
}

}

    public static void main(String args[])
    {
        calculate(2,4);
    }
    
}