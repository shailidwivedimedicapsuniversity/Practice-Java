package Arrays;

public class ConsecutiveOneZero {
    // Maximum consecutive one’s (or zeros) in a binary array
    public static int consecutiveOne(int arr[]) {
        int count1 = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else {
                count1 = 0;
            }
            maxCount = Math.max(maxCount, count1);
        }
        return maxCount;
    }

    public static int consecutiveZero(int arr[]) {
        // Maximum consecutive zeros in a binary array
        int count0 = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else {
                count0 = 0;
            }
            maxCount = Math.max(maxCount, count0);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        System.out.println(consecutiveOne(arr));
        System.out.println(consecutiveZero(arr));
    }
}
