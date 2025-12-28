public class arraySortedandRotated {

    public static boolean check(int nums[]) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;   
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 1, 2};
        boolean obj = check(arr);

        if (obj == true) {
            System.out.println("Array is sorted and rotated");
        } else {
            System.out.println("Array is NOT sorted and rotated");
        }
    }
}
