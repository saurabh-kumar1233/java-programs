public class Swap_string {
 public static void main(String[] args) {
    String str="saura", nstr="";
    char ch;
    
    // to find a lenth of a string 
    System.out.println(str.length());

 // to swap a string 

    for (int i=0;i<=str.length();i++)
    {
        ch=str.charAt(i);
        nstr=ch+nstr;

    }
    System.out.println(""+nstr);
    
   
}}
