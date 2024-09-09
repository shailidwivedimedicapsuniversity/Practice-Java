public class ArmNum8 {

    public static boolean checkArmNum(int num){
        int n = num;
        double armNum = 0;
        while (n!=0) {
            armNum = armNum + Math.pow(n%10, 3);
            n /= 10;
        }
        if(armNum != num){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        // 153 = 1^3 + 5^3 + 3^3
        int num = 153;
        System.out.println(checkArmNum(num));
        
    }
}
