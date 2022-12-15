class Solution {
    public int solution(int slice, int n) {
        int answer = slice/n;
        if(slice%n!=0){
            answer++;
        }
        return answer;
    }
}