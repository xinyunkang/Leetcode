
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0||x!=0&&x%10==0) return false; //negative, 1000
        int ori=x;
        int rev=0;
        
        while(x>0){              //get the reverse string
            rev=10*rev+x%10;
            x=x/10;
        }
        return rev==ori;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
