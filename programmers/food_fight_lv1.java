public class food_fight_lv1 {
    
}
//https://school.programmers.co.kr/learn/courses/30/lessons/134240
class Solution {
    public String solution(int[] food) {
        // 1대1
        // 매 대결마다 음식종류 양 바뀜
        // 1명 왼-> 오
        // 1명 오-> 왼
        // 짝수만 가능
        // i 번 음식의 갯수
        StringBuilder sb = new StringBuilder();
        for(int i =1 ; i<food.length;i++){
            for(int j =0;j<food[i]/2;j++){
                sb.append(i);
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(sb);
        result.append(0);
        result.append(sb.reverse());        
        return result.toString();
    }
}


// 다른사람 풀이...

// class Solution {
//     public String solution(int[] food) {
//         String answer = "0";

//         for (int i = food.length - 1; i > 0; i--) {
//             for (int j = 0; j < food[i] / 2; j++) {
//                 answer = i + answer + i; 
//             }
//         }

//         return answer;
//     }
// }
