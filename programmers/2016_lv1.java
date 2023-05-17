public class 2016_lv1 {
    
}
//https://school.programmers.co.kr/learn/courses/30/lessons/12901#
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int date = 0;
        String [] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        // 31일 : 1 ,3, 5,7,8,10,12
        // 30일 : 4,6,9,11
        // 29일 : 2
        
        for(int i=1;i<a;i++){
            if(i==2){
                date += 29 ;   
            }else if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                date += 31;    
            }else if(i==4||i==6||i==9||i==11){
                date += 30;
            }
        }
        date += b;
        int point = date%day.length ==0 ? 6 : date%day.length-1;
        answer = day[point];
        
        return answer;
    }
}