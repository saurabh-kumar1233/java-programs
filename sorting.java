public class sorting {
    public static void main(String args[])
    {
        int arr1[]={4,5,7,2,1,3};
        for(int i=0;i<=arr1.length;i++)
        {
            if (arr1[i]<arr1[i+1])
            {
                int temp=arr1[i];
                arr1[i]=arr1[i+1];
                arr1[i+1]=temp;
                for ( i = 0; i < arr1.length; i++) {
                    
                }
            System.out.println(arr1[i]);
        }

            }
            
    }
}
