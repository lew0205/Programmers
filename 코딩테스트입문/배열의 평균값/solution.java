import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
        // double answer = 0;
        // int sum=0;
        // for(int i:numbers){
        //     sum+=i;
        // }
        // answer=(double)sum/numbers.length;
        // return answer;
    }
}