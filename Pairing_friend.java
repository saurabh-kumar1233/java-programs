public class Pairing_friend {

    public static int pairing(int n){
     if(n==1||n==2)
     return n;
     }

     int pn1= pairing(n-1);
     int pn2=pairing(n-2);
     pn=pn1*pn2;
     return pn1+pn;
     public static void main(String args[]){
    System.out.println(pairing(5));
     } 
}
