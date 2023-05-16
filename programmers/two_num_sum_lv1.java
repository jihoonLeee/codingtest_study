public class two_num_sum_lv1 {
    
}

import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        // 서로다른 인덱스에 있는 두개를 뽑아 더해서 만들 수 있는 모든 수
        // 오름차순 asc 
        // 중복 없이 하려면 set?
        
      
        int len = numbers.length;
        Set<Integer> numberSet = new HashSet<Integer>();
        for(int i =0; i <len-1; i++){
            for(int j =i+1;j<len ; j++){
                numberSet.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] answer = numberSet.toArray(new Integer[0]);
        
        Arrays.sort(answer);
        return answer;
    }
}