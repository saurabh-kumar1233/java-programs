public class Binstring {
    public static void  printbinstring(int n, int lastplace, string str){
        // base case
        if(n==0)
        {
            System.out.println(str);
        }

        //kaam

        printbinstring(n-1,0,str.append("0"));
        if(lastplace==0)
        {
            printbinstring(n-1,1,str.append("1"));
        }
    }
    public static void  main(String args[]){
        printbinstring(3,0,"");
    }
}
