/**
 * kakao_character_lv1
 */
public class kakao_character_lv1 {

    class Solution {
        public String solution(String[] survey, int[] choices) {
            String answer = "";
            //나만의 카카오 성격
            // 총 16가지 가능
            // 7가지 선택지 1~7  choice
            // survey 왼쪽 오른쪽 마다 차이 있음
            //같은 점수면 왼쪽거로
            //1~3 이면 왼쪽거
            //5~7 이면 오른쪽거 
            int lv1=0;
            int lv2=0;
            int lv3=0;
            int lv4=0;
            
            for(int i =0;i<survey.length;i++){
                int score = choices[i];
                String character = survey[i];
                if(character.equals("RT")){
                    if(score<=7 &&score>=5){
                       lv1 += score-4;
                    }else if(score<=3 &&score>=1){
                       lv1 -= 4-score;
                    }
                }else if(character.equals("TR")){
                     if(score<=7 &&score>=5){
                       lv1 -= score-4;
                    }else if(score<=3 &&score>=1){
                       lv1 += 4-score;
                    }
                }else if(character.equals("CF")){
                    if(score<=7 &&score>=5){
                       lv2 += score-4;
                    }else if(score<=3 &&score>=1){
                       lv2 -= 4-score;
                    }
                }else if(character.equals("FC")){
                    if(score<=7 &&score>=5){
                       lv2 -= score-4;
                    }else if(score<=3 &&score>=1){
                       
                        lv2 += 4-score;
                    }
                }else if(character.equals("JM")){
                    if(score<=7 &&score>=5){
                       lv3 += score-4;
                    }else if(score<=3 &&score>=1){
                       lv3 -= 4-score;
                    }
                }else if(character.equals("MJ")){
                    if(score<=7 &&score>=5){
                        lv3 -= score-4;
                    }else if(score<=3 &&score>=1){
                        lv3 += 4-score;
                    }
                }
                else if(character.equals("NA")){
                    if(score<=7 &&score>=5){
                        lv4 -= score-4;
                    }else if(score<=3 &&score>=1){
                       lv4 += 4-score;
                    }
                }else{
                    if(score<=7 &&score>=5){
                       lv4 += score-4;
                    }else if(score<=3 &&score>=1){
                       lv4 -= 4-score;
                    }
                }
                
            }
            
            System.out.println(lv1 +" " + lv2 + " "+ lv3 + " "+ " "+ lv4);
            if(lv1<=0){
                answer+="R";
            }else{
                answer+="T";
            }
            if(lv2<=0){
                answer+="C";
            }else{
                answer+="F";
            }
            if(lv3<=0){
                answer+="J";
            }else{
                answer+="M";
            }
            if(lv4<=0){
                answer+="A";
            }else{
                answer+="N";
            }
            
            return answer;
        }
        
      
    }
}

/** 아래는 다른사람 코드 더 마음에 드는 것도 있었는데 이게 간편하고 이해하기 편해보여서 복사해옴! */
// import java.util.HashMap;

// class Solution {
//     public String solution(String[] survey, int[] choices) {
//         String answer = "";
//         HashMap<Character, Integer> map = new HashMap<>();
//         map.put('R', 0);map.put('T', 0);
//         map.put('C', 0);map.put('F', 0);
//         map.put('J', 0);map.put('M', 0);
//         map.put('A', 0);map.put('N', 0);

//         for (int i = 0; i < survey.length; i++) {
//             if (choices[i] > 4)
//                 map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
//             else if (choices[i] < 4) {
//                 map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
//             }
//         }


//         if (map.get('R') >= map.get('T'))
//             answer = "R";
//         else
//             answer = "T";

//         if (map.get('C') >= map.get('F'))
//             answer += "C";
//         else
//             answer += "F";

//         if (map.get('J') >= map.get('M'))
//             answer += "J";
//         else
//             answer += "M";

//         if (map.get('A') >= map.get('N'))
//             answer += "A";
//         else
//             answer += "N";

//         return answer;
//     }
// }