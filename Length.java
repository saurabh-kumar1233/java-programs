public class Length {
    public static int printlength(String str){
        // base case
        if(str.length()==0)
        {
            return ;

        }
        // learn 
        int length=str.length();
        printlength(str); 

    }    
    public static void main(String args[])
    {
        printlength("alpna");
    }
}
