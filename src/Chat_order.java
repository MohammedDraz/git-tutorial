  import java.util.*;
  public class Chat_order {
      public static void main(String[] args) {
          Stack<Character> st = new Stack<>();
          Scanner sc = new Scanner(System.in);
          String s = sc.next();
          //  boolean z =true;
          int count = 0;
          int max = 0;
          int scount = 0;
          for (int i = 0; i < s.length(); i++) {
              char c = s.charAt(i);
              if (c == ')') {
                  if(!st.isEmpty()){
                      scount++;
                      st.pop(); }
                  if(st.isEmpty()) {
                      max = (scount > max) ? scount : max;
                      if (scount > 0) count++;
                      scount = 0;
                  }
              }
                  if (c == '(')
                      st.push(c);
              }
        /*if(max==0 && count==0)
            System.out.println("0 1");
        else8*/
              System.out.println(2 * max + " " + count);

      }
  }
