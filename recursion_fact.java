public class recursion_fact {
    public static int  printfact(int n){
        if(n==0);{
        return 1;

    }
    int fact nm1=fact(n-1);
    fact n=n*fact(n-1);
    return n;

}

    public static int main(String args[]){
 int n=5;
 System.out.println(fact(n));
    }
}
