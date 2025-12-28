public class secondLargestNumber {
    public static int secondLargest(int a[]){
        int max1 = a[0] , max2 = a[0];
        if(a[1]>a[0]){
            max1 = a[1];
            max2 = a[0];
        }
        else{
            max2 = a[1];
            max1 = a[0];
        }
        for(int i = 2;i<a.length;i++){
            if(a[i]>max1){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] > max2){
                max2 = a[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[] ={ 1,2,3,6,7,4};
        int second = secondLargest(arr);
        System.out.println("The second largest number is : " +second);

    }
}
