package atcoder;
// URL : https://atcoder.jp/contests/arc087/tasks/arc087_a

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GoodSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int numberOfElements = input.nextInt();
        int temp = 0;
        for(int i=0; i<numberOfElements; ++i){
            temp = input.nextInt();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        int minRemovals = 0;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getKey() > mp.getValue()){
                minRemovals += mp.getValue();
            }
            else if (mp.getKey() < mp.getValue()) {
                minRemovals += mp.getValue() - mp.getKey();
            }
        }
        System.out.println(minRemovals);

    }
}
