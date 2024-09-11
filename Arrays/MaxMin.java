//find max , min , largest , smallest , secondlargest,thirdlargest, kthlargest element
// Maximum and minimum of an array using minimum number of comparisons

package Arrays;

import java.util.Arrays;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MaxMin {

    public static Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here for pair class
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        Pair p = new Pair(min, max);
        return p;
    }

    public static int findLargest(int arr[]) {
        // max element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findMin(int arr[]) {
        // min element
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void findMaxMin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max element is " + max + " and min element is " + min);
    }

    public static int findSecondLargest(int arr[]) {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static int findThirdLargest(int[] nums) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements.");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have enough distinct elements.");
        }

        return third;
    }


    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); 
        // in place of this , we can write any sorting algorithm then sort the array
        return nums[nums.length - k];
    }
    public static void main(String[] args) {
        int[] nums = {2,4,5,9,7,8,10,-32};
        System.out.println("Largest element in array : "+findLargest(nums));
        System.out.println("Minimum element in array : " + findMin(nums));
        findMaxMin(nums);
        System.out.println("second largest element is : "+ findSecondLargest(nums));

    }
}
