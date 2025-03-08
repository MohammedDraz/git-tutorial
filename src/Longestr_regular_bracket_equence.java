import java.util.*;
public class Longestr_regular_bracket_equence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count =0;
        int mincount=0;
        int max=0;
        boolean z =false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c==')'){
                if(!st.isEmpty()){
                    st.pop();
                    mincount+=2;
                    if (st.isEmpty()) {
                        count++;
                        max = (mincount > max) ? mincount : max;
                        mincount =0;
                    }
                }
            }
            else{
                st.push(c);
            }

        }
        if(max==0)
            System.out.println("0 1");
        else
            System.out.println(max+" "+count);
    }
}
