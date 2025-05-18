public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";

         System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        return solution(s, 0, s.length()-1);
    }
    public static boolean solution(String s, int l, int r){
        if(l >= r) return true;
        char ch1 = s.charAt(l);
        char ch2 = s.charAt(r);

        if(!Character.isDigit(ch1) && !Character.isLetter(ch1)) return solution(s, l+1, r);
        if(!Character.isDigit(ch2) && !Character.isLetter(ch2)) return solution(s, l, r-1);

        return Character.toLowerCase(ch1) == Character.toLowerCase(ch2) && solution(s, l + 1, r - 1);
    }
}
