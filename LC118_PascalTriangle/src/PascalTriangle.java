import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> rows= new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<numRows;i++) {
			row.add(0,1);
			for(int j=1;j<row.size()-1;j++) {  //j<row.size()-1, NOT row.size()
				row.set(j, row.get(j)+row.get(j+1));
			}
			//rows.add(row); //WRONG, row value will be updated in each loop. like ([1,1], [1,1])
			rows.add(new ArrayList<Integer>(row));
		}
		return rows;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(2);
	}

}
