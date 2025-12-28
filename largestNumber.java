public class largestNumber {
    public static int largestNumber(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++){
            if(large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        int largestNum = largestNumber(arr);
        System.out.println("The largest number present in our array is : "+largestNum);
    }
}
