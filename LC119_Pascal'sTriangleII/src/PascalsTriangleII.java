import java.util.*;

public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> res= new ArrayList<>();
        rowIndex+=1; //rowIndex in 119 is 1 larger than 118
        for(int i=0;i<rowIndex;i++){
            res.add(0,1);
            for(int j=1;j<res.size()-1;j++){  //NOT rowIndex-1
                res.set(j,res.get(j)+res.get(j+1));
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
