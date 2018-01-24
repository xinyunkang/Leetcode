
public class MinimumWindowSubstring {
	 public String minWindow(String s, String t) {
	        //Slide Window
	        //initial count array with t = 1.
	        int[] count= new int[128];
	        for(int i=0;i<t.length();i++){
	            count[t.charAt(i)]++;
	        }
	        
	        int from=0;
	        int min=Integer.MAX_VALUE;
	        int total=t.length();
	        for(int i=0, j=0;i<s.length();i++){
	            if(count[s.charAt(i)]-->0){ // -- for every char //>0 means one of t
	                total--;
	            }
	            while(total==0){  //include t
	                if(i-j+1<min){
	                    min=i-j+1;
	                    from=j;
	                }
	                if(++count[s.charAt(j++)]>0){  //if current j is one of t, current count +1 and j+1
	                    total++; //total +1, for j is moved.
	                }
	            }
	        }
	        return (min==Integer.MAX_VALUE)?"":s.substring(from,from+min);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumWindowSubstring mws = new MinimumWindowSubstring();
		System.out.println(mws.minWindow("a", "a"));
	}

}
