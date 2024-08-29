public class otomizedpower {
    
    public static int power(int a, int n){

        if(n==0)
        return 1;
    }
    int halfoptimixedpowersq= power(a , n/2)*power(a,n/2);
    if(n%2!=0)
    {
        halfoptimixedpowersq= a *halfoptimixedpowersq;
    }
    return halfoptimixedpowersq;
}
public static void main(String args[])
{
    int a=2;
    int n=5;
    System.out.println(power(a,n));
}

}