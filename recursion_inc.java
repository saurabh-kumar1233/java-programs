public class recursion_inc {

    public static void printinc(int n){
    if(n==1){
        System.out.print(1);
        return;
    }
    printinc(n-1);
    System.out.println(n+"");
    }


    public static void main(String args[]){
int n=10;
printinc(n);
    }
}
