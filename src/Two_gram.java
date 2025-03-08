import java.util.*;
public class Two_gram {
    public static void main(String[] args) {
         HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String max = "";
        for(int i = 0; i < n-1; i++){
            String temp = s.substring(i,i+2);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            max = (map.getOrDefault(max, 0)<map.get(temp))?max = temp:max;
        }
        System.out.println(max);
    }
}
