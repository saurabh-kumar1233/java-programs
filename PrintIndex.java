public class PrintIndex {

    public static int printindex(int arr[],int i, int key)
    {
        // base case 

        if(key==arr.length)
        {
            return ;
        }
            if(key==arr[i])
            {
                printindex(i);
            }

        }

    }
    public static void main(String args[]){

        int arr[]={3,2,4,5,6,2,7,2};
        printindex(arr[],0,2);
    }
}

