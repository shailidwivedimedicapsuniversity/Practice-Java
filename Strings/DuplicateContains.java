package Strings;

public class DuplicateContains {

    public static boolean containsDuplicate(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str[] = { "java", "c", "c++", "python", new String("java") };
        System.out.println(containsDuplicate(str));
    }
}
