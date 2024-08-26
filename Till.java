public class Till {
    
    public static int tillingproblem(int n){
if(n==0||n==1)
{
    return 1;
}

//kaam
//vertical tilling

 int verticaltillling=(n-1);
// horizointel
 int horizointel=(n-2);
 int tt=verticaltillling+horizointel;
 return tt;

    }
    public static void main(String args[]){
 System.out.println(tillingproblem(3));
    }
}
