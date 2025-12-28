public class searchRotatedArray {
    public static int searchRotated(int arr[] , int target){
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,2,0,1,3};
        int target = 0;
        int idx = searchRotated(arr, target);
        System.out.println("The target is found at index : "+idx);

    }
}
