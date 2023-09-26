package lv2.stack_queue;

/*
문제 분석 
기능 개선작업 수행중
진도가 100%일때 반영가능
개발 속도는 다 다름
뒤에 있는 기능은 ****앞에 있는 기능이 배포될 때 함께 배포****

작업의 개수 100개이하
진도 100미만의 자연수
속도 100이하의 자연수
배포는 하루에 한번만 가능, 하루 끝에 이루어짐

progresses [93,30,55]
speeds [1,30,5]
return [2,1]

첫번째 기능은 93% 속도 1%니까 7일작업 후
두번째 기능은 30% 하루에 30%니깐 3일 후 
세번째 기능은 55% 속도 5%니깐 7일 후 
7일 째에 2개 9일 째에 1개



*/

import java.util.*;

public class 기능개발 {
    class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> resultList = new ArrayList<>();

        int day = 0;

        while (day < len) {
            for (int i = day; i < len; i++) {
                progresses[i] += speeds[i];
            }

            while (day < len && progresses[day] >= 100) {
                day++;
                q.add(day); 
            }

            if (!q.isEmpty()) {
                resultList.add(q.size());
                q.clear();
            }
            
        }

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
}

