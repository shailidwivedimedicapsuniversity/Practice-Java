// not clear
package ArraysAndArrayList;

public class MinimumJumps {
    static int minJumps(int arr[]) {
        // base cases
        if (arr.length == 1)
            return 0;

        // if not possible to jump
        if (arr[0] == 0)
            return -1;

        // initialization
        int maxReach = arr[0]; // range to reach max distance
        int step = arr[0];
        int jump = 1; // can take jump from 1 to arr[i]

        // Start traversing array
        for (int i = 1; i < arr.length; i++) {
            // Check if we have reached the end of the array
            if (i == arr.length - 1)
                return jump;

            // updating maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // we use a step to get to the current index
            step--;
            // If no further steps left
            if (step == 0) {
                // we must have used a jump
                jump++;

                // Check if the current index/position or lesser index
                // is the maximum reach point from the previous indexes
                if (i >= maxReach)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(minJumps(arr));
    }

}
