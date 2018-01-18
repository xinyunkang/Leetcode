import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0) return res;
        for(int i=1; i<=n; i++){  //from i=1 to =n, not <n
            if(i%15==0){
                res.add("FizzBuzz");
            }else if(i%5==0){
                res.add("Buzz");
            }else if(i%3==0){
                res.add("Fizz");
            }else{
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb = new FizzBuzz();
		System.out.println(fb.fizzBuzz(1));
	}

}
