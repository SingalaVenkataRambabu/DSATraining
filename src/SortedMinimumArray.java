public class SortedMinimumArray {
    public static void main(String[] args){

        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int minElement = findMinNumber(arr1);
        System.out.println("The minimum element is: " + minElement);
    }
    private static int findMinNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] < nums[right]) {
            return nums[left];
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid] >= nums[left]) {

                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}













