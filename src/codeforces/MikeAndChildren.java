package codeforces;
// Problem URL : https://codeforces.com/group/uOFUDw8ZO5/contest/463319/problem/A
import java.util.ArrayList;
import java.util.Scanner;

public class MikeAndChildren {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sweetNumber = input.nextInt();
        int [] sweetSizes = new int[sweetNumber];
        for(int i=0; i<sweetNumber; i++){
            sweetSizes[i] = input.nextInt();
        }
        ArrayList<Integer> sums = new ArrayList<>();
        for(int i=0; i<sweetNumber -1 ; i++){
            for(int j=i+1; j<sweetNumber; j++){
                sums.add(sweetSizes[i] + sweetSizes[j]);
            }
        }

        int [] frequency = new int[300_000];
        for(int possibleSum : sums){
            frequency[possibleSum]++;
        }
        int maximumStudentNumber = 0;
        for(int i=0; i<frequency.length; i++){
            maximumStudentNumber = Math.max(maximumStudentNumber, frequency[i]);
        }
        System.out.println(maximumStudentNumber);
    }
}
