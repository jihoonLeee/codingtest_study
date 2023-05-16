public class kakao2022_lv1 {
    
}

// https://school.programmers.co.kr/learn/courses/30/lessons/92334

import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // int[] answer = new int [id_list.length];
        // 불량 이용자를 신고하고 처리 결과를 메일 발송
        // 한번에 한명 신고 가능
        // 신고 횟수 제한 없음
        // 한 유저를 여러번 신고해도 동일한 유저면 1회로 처리
        // k번 이상은 정지
        // 정지당한 유저의 정지 사실을 메일로 발송
        // 마지막에 한꺼번에 정지를 시키면서 정지 메일 발송
        // id_list 중복 안됨
        // report 에서 split[0] 은 신고자 split[1]은 피 신고자 
        // 신고당한 유저 cnt 
        // 유저별 신고한 유저 list
        // k번 이상 신고당한 사람이 있으면 list 만들고
        // 그 리스트에서 신고한 사람이 있으면 cnt 
//         Map<String,Integer> blackList = new HashMap<>();
//         for(String id : id_list){
//             blackList.put(id,0);
//         }
        
//         for(int i = 0 ;i<report.length;i++){
//             String badBoy = report[i].split(" ")[1];
//             blackList.replace(badBoy,blackList.get(badBoy)+1);
//             for(int j = i+1; j<report.length;j++){
//                 if(report[i].equals(report[j])){
//                      blackList.replace(badBoy,blackList.get(badBoy)-1);
//                 }
//             }
//         }
        
//         for(int i = 0 ;i<report.length;i++){
//            for(int j = 0 ;j<id_list.length;j++){
//                int sendCnt = 0;
//                 if(blackList.get(id_list[j]) >= k ){
//                     if(report[i].split(" ")[1].equals(id_list[j])){
//                         for(int w =0;w<id_list.length;w++){
//                             if(report[i].split(" ")[0].equals(id_list[w])){
//                                 ++sendCnt;
//                                 answer[w] += sendCnt;
//                             }
//                         }
//                     }
                    
//                 }
//              }
//         }
     
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportedBy = new HashMap<>();
        Map<String, Integer> blackList = new HashMap<>();

        for (String id : id_list) {
            reportedBy.put(id, new HashSet<>());
            blackList.put(id, 0);
        }

        for (String rep : report) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            reportedBy.get(reporter).add(reported);
        }

        for (Set<String> reportedSet : reportedBy.values()) {
            for (String rep : reportedSet) {
                blackList.put(rep, blackList.get(rep) + 1);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            String reporter = id_list[i];
            for (String reported : reportedBy.get(reporter)) {
                if (blackList.get(reported) >= k) {
                    answer[i]++;
                }
            }
        }

        return answer;

        
        
    }
}