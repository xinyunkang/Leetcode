
public class HIndexII {
	public int hIndex(int[] citations) {
        //Binary Search Time: O(logn) Space: O(1)
        int left=0;
        int right=citations.length-1;
        int len=citations.length;
        while(left<=right){
            int mid=(left-right)/2+right;
            if(citations[mid]==len-mid){ //len-mid represents the number of papers meets request.
                return len-mid;
            }else if(citations[mid]<len-mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
                
        }
        
        return len-left;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
