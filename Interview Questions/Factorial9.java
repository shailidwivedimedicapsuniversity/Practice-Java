public class Factorial9 {

    public static int findFact(int n){
        // using recursion
        if(n == 0 || n==1){
            return 1;
        }
        return n*findFact(n-1);
    }

    public static int findFactorial(int n){
        // using loops
        if(n==1 || n==0){
            return 1;
        }
        int fact = 1;
        for(int i=1; i<= n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
        System.out.println(findFact(5));
    }
}
