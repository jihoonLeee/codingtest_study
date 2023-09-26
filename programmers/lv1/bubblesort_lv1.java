public class bubblesort_lv1 {
    
}
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
       
        // n번째 글자를 기준으로 오름차순 asc
        // 크면 앞으로
        String temp = "";
        for(int i = 0 ; i < strings.length;i++){
            for(int j = i+1 ; j< strings.length;j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    temp = strings[i];
                    strings[i] = strings[j] ;
                    strings[j] = temp;
                }else if(strings[i].charAt(n) == strings[j].charAt(n)){
                    if(strings[i].compareTo(strings[j]) > 0 ){
                        temp = strings[i];
                        strings[i] = strings[j] ;
                        strings[j] = temp;
                    }
                }
            }
        }

        return strings;
    }
}