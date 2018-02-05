import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] paths= path.split("/+"); // means one or more /
        for(String str: paths){
            if(str.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else if(!str.equals(".")&&!str.equals("")){
                s.push(str);
            }
        }
        String res="";
        while(!s.isEmpty()){
            res="/"+s.pop()+res; //res is at the end.
        }
        if(res.length()==0){
            res="/";
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
