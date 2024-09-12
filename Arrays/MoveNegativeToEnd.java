// Move all negative elements to end
// order maintained
package Arrays;

public class MoveNegativeToEnd {
    public static void segregateElements(int arr[])
    {   
        // TC = O(n) SC= O(n)
        int n = arr.length;
        int ans[] = new int[n];
        int idx = 0;
        for(int i=0; i<n; i++){
            //step 1 store all positive integer at start
            if(arr[i]>=0){
                ans[idx] = arr[i];
                idx++;
            }
        } 
        for(int i=0; i<n; i++){
            //step 2 store all negative integer at end
             if(arr[i]<0){
                 ans[idx] = arr[i];
                 idx++;
             }
        }
        for(int i=0; i<n; i++){
        arr[i] = ans[i];
        }
        for(int i=0 ;i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String[] args) {
      int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
      segregateElements(arr);
    }
}
