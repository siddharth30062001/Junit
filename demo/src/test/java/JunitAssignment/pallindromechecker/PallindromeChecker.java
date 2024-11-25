package JunitAssignment.pallindromechecker;

public class PallindromeChecker {

    public boolean isPallindrome(String s){
        String temp=s.replaceAll("\\s", "").toLowerCase();
        String temp1=new StringBuilder(s).reverse().toString();

        return temp.equals(temp1);

    }
    
}
