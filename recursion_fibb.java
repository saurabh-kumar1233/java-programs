public class recursion_fibb {
    public static void  printfibb(int n){
        if(n==0||n==1)
        return 1;
    }
    int f1=fib(n-1);
    int f2=fib(n-2);
    fn=f1+f2;
    return fn;
}
public static void main(String args[])
{
    int n=10;
    printfibb();
}
