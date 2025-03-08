import java.util.*;
public class potions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            pq.add(a);
            sum += a;
        }
        while (sum < 0 && n>0) {
            sum -= pq.poll();
            n--;
        }
        System.out.println(n);
    }
}