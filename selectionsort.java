public class selectionsort {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for (int j=j+1;j<arr.length-1;j++){
                if (arr[minpos]>arr[i]){
                    minpos=j;
                }
            }
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
    }
}
public static void main(String args[]){
    int arr[]={2,8,6,7,1};
    selection_sort(arr);
    printarr(arr);
}
