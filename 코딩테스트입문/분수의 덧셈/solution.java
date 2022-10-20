class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int num=0;
        int denum=0;
        int lcm=0;

        int i=0;
        while(lcm==0){
            if(i%num1==0&&i%num2==0){
                lcm=i;
            }
            i++;
        }
        
        num=lcm;
        denum=denum1*(lcm/num1)+denum2*(lcm/num2);
        
        for(int j=lcm;j>=2;j--){
            if(num%j==0&&denum%j==0){
                
            num/=j;
            denum/=j;
            }
                
        }   
        int[] answer = {denum,num};

        return answer;
    }
}