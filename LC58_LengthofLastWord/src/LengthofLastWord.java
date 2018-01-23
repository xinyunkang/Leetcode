
public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
        // if(s==null||s.length()==0||s==" "){
        //     return 0;
        // } 
        // s=s.trim();
        // int res=0;
        // for (int i=s.length()-1; i>=0;i--){
        //     if(s.charAt(i)!=' '){
        //         res++;
        //     }else{
        //         break;
        //     }    
        // } 
        // return res;
        
        //Time: O(1)
        //Space: O(1)
        
        return s.trim().length()-1-s.trim().lastIndexOf(' ');
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
