public class memory_score_lv1 {
    
}
//https://school.programmers.co.kr/learn/courses/30/lessons/176963
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
       
        int photoCount = photo.length;
        int[] answer = new int[photoCount];
        for(int i = 0 ; i<photoCount; i ++) {
            int result = 0;
            for(String photoName : photo[i]){
                for(int j = 0 ;j<name.length;j++){
                    if(name[j].equals(photoName)){
                        result += yearning[j];
                    }
                }
            }
            answer[i]=result;
        };
        return answer;
    }
}


///
// 다른사람 Stream 을 이용한 풀이
// import java.util.*;
// import java.util.stream.*;

// class Solution {
//     public int[] solution(String[] name, int[] yearning, String[][] photo) {
//         Map<String, Integer> map = IntStream.range(0, name.length).mapToObj(operand -> Map.entry(name[operand], yearning[operand])).collect(Collectors.toSet()).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//         return Arrays.stream(photo).mapToInt(strings -> Arrays.stream(strings).mapToInt(value -> map.getOrDefault(value, 0)).sum()).toArray();
//     }
// }