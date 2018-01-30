import java.util.Arrays;

public class HIndex {
	public int hIndex(int[] citations) {
        //Time: O(nlogn)  Space: O(1)
        Arrays.sort(citations);
        int res=0;
        while(res<citations.length && citations[citations.length-1-res]>res){            
                res++;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
