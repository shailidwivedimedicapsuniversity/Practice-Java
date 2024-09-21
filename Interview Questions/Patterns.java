public class Patterns {
    // palindrome
    public static void palindrome(int n){ 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //diamond
    public static void diamond(int n){
        n = n/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");  
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");  
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindrome(5);
        diamond(8);
    }

}
