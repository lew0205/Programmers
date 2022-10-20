class Solution {
    public int[] solution(int money) {
        int coffee=5500;
        // int num=0;

        // while(money>=coffee){
        //     num++;
        //     money-=coffee;
        // }
        // int[] answer = {num,money};
        // return answer;

        return new int[] {money/coffee,money%coffee};
    }
}