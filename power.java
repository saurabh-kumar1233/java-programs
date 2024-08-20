public class power {
    public static int powweofc (int x, int n){
        if (n==0){
        return 0;
    }
    int xm1= powweofc(x,n-1);
    int xm=x*xm1;
    return xm;
}
public static void main(String args[])
{
powweofc(2,5);
System.out.println(powweofc(2,5));
}}

