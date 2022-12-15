import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> answers = new ArrayList<>();    
        for (int i : numbers) {
            answers.add(i*2);
        }
        
        return answers;
    }
}