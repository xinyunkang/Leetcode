
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int result=0;
        while(left<right){
            result=Math.max(result,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater cwm= new ContainerWithMostWater();
		int[] input= new int[] {1,1};
		System.out.println(cwm.maxArea(input));
	}

}
