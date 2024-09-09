public class LeapYear {

    public static boolean checkLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 ==0){
                if(year % 400==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print("check leap year : ");
         System.out.println(checkLeapYear(2000));
    }
}
