public class H-Index_lv2 {
    
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        // n 편중 h번 이상 인용된 논문이 h편 이상
        // 나머지 논문이 h번 이하인용이면 h의 최댓값이 이 고학자의 H-index
        
        // 중간값을구해
        // 0부터 최댓값까지 반복하면서 i = h
        // 0번 이상 인용된 논문이 0편이상 나머지가 0 이하
        // 1번 이상 인용된 논문이 1편이상 n에서 갯수 뺀 것이  1이하 면 h 는 i
        int max = 0 ;
        for(int i : citations){
            if(i>=max){
                max=i;
            }
        }
        
        // for(int i = 1;i<=max;i++){
        //     int h = i;
        //     int count = 0;
        //     for(int cit : citations){
        //         if(h<=cit){
        //             count ++;
        //         }
        //     }
        //     System.out.println(count + " "+ n + " " + h);
        //     if(count==h&&count>=h&&n-h<=h){
        //         answer = count;
        //         break;
        //     }
        // }  << 내가 한건데 너무 복잡하게 생각한듯..?
       for (int h = max; h >= 0; h--) {
            int count = 0;
            for (int cit : citations) {
                if (cit >= h) {
                    count++;
                }
            }

            if (count >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}