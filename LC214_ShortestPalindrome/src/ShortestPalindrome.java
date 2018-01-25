
public class ShortestPalindrome {
	public String shortestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        int e=j;  //e record how many characters need to be reversed.
        char[] arr= s.toCharArray(); //quicker than use string directly.
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else{
                i=0;
                e--;
                j=e;
            }
        }
        return new StringBuilder(s.substring(e+1)).reverse().toString()+s; //e+1
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
