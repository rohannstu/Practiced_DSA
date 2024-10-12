import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        List<Integer> arr = new ArrayList<>();
        Map<Character, Integer> mp = new HashMap<>();
        int curr = 0;

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(s.charAt(i)) && (i - mp.get(s.charAt(i))) <= curr) {
                arr.add(curr);
                curr = i - mp.get(s.charAt(i));
            }
            curr++;
            mp.put(s.charAt(i), i);
        }

        arr.add(curr);
        Collections.sort(arr);
        System.out.println(arr.get(arr.size() - 1));
    }
}
