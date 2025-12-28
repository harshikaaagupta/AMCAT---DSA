public class checkArraySorted {
    public static boolean arraySorted(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1] < arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7};
        boolean sort = arraySorted(arr);
        if(sort == true){
            System.out.println("The given array is sorted");
        }
        else{
            System.out.println("The given array is not sorted.");
        }
        
    }
}
