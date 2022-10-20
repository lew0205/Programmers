class Solution {
    public String solution(String my_string) {

        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
// String answer="";
// for(int i=1;i<=my_string.length();i++){
//     answer+=my_string.charAt(my_string.length()-i);
// }        

        return sb.toString();
    }
}