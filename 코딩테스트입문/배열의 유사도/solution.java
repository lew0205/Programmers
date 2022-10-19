class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s1 : s1){
            for (String s2 : s2){
                if(s1==s2)
                answer++;
            }
        }
        return answer;
    }
}