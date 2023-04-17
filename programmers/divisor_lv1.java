public class divisor_lv1 {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            
            for(int i = left ; i<=right;i++){
                if(isEvenDivisor(i)){
                    answer+=i;
                }else{
                    answer-=i;
                }
            }
    
            return answer;
        }
        private boolean isEvenDivisor(int num){
            int cnt = 0;
            for(int i =1;i<=num;i++){
                if(num%i==0){
                    cnt++;
                }
            }
            if(cnt%2==0 ){
                return true;
            }else{
                return false;
            }
        }
        
        //         for (int i=left;i<=right;i++) {
    //             //제곱수인 경우 약수의 개수가 홀수
    //              System.out.println(i +" "+Math.sqrt(i));
    //             if (i % Math.sqrt(i) == 0) {
                 
    //                 answer -= i;
    //             }
    //             //제곱수가 아닌 경우 약수의 개수가 짝수
    //             else {
    //                 answer += i;
    //             }
    //         }
    }
    
}