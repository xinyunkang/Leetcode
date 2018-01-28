import java.util.*;

public class BullsandCows {
	public String getHint(String secret, String guess) {
        int[] count= new int[10];
        int bulls=0;
        int cows=0;
        for(int i=0;i<secret.length();i++){
            int s=secret.charAt(i)-'0'; //cast to int
            int g=guess.charAt(i)-'0';
            if(s==g){
                bulls++;
                continue;
            }else{
                if(count[s]<0){ //it was guessed.
                    cows++;
                }
                if(count[g]>0){ //it was in secret.
                    cows++;
                }
                count[s]++;  //roll back by 1
                count[g]--;
            }
            
        }
        return bulls+"A"+cows+"B";  //will cast to string directly.
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BullsandCows b = new BullsandCows();
		System.out.println(b.getHint("1234", "0111"));
	}

}
