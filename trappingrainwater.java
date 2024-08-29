import java.util.*;
public class trappingrainwater 
{
    public static int trappedrainwater(int height[])
    {
// to find left max boundary
    int leftmax[]= new int[n];
    int leftmax[0]= height[0];
    for ( int i=1;i<=height.length;i++)
    {
        leftmax[i]=math.max(height[i],leftmax[i-1]);
    }
  // to find right max bounday
  int rightmax[]= new int[n];
   int rightmax[height.length-1]= height[height.length-1];
   for(int i=height.length-2; i>=0;i--){
   rightmax[i]=math.max(height[i],right[i+1]);

    }
    int trappedwater=0;
    for(i=0;i<n;i++)
    {
        int waterlevel=math.min(leftmax[i],rightmax[i]);
        trappedwater+=waterlevel-height[i];

    }
    return trappedwater;

}
public static void main(String args[])
{
int height[]={2,4,5,7,8,9,6,3};
System.out.println(trappedrainwater[height]);
}
}
