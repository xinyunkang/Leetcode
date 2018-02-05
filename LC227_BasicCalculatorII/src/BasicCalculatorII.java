
public class BasicCalculatorII {
public int calculate(String s) {
        
        //time O(n)  Space O(1)
        if(s==null||s.length()==0) return 0;
        s=s.trim().replaceAll(" +",""); //need to use s=
        int res=0;
        int prev=0;
        char sign='+';
        int i=0;
        while (i < s.length()) {
            int cur=0;
            while(i<s.length()&&Character.isDigit(s.charAt(i))){
                cur=cur*10+s.charAt(i)-'0';  //don't forget -'0'
                i++;
            }
            if(sign=='+'){
                res+=prev;
                prev=cur;
            }else if(sign=='-'){
                res+=prev;
                prev=-cur;
            }else if(sign=='*'){               
                prev=prev*cur;
            }else if(sign=='/'){               
                prev=prev/cur;
            }
            if (i < s.length()) {
                sign = s.charAt(i); //assign current sign to be used in next loop.
                i++;
            }
        }
        res+=prev; //add the last prev
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
