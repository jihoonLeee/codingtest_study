public class kako_cache_lv2 {
    
}
import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
      
//         Queue<String> cache = new LinkedList<String>();
//         Set<String> cacheSet =new HashSet<String>();
//         int timer = 0;
        
//         for(String c : cities){
//             String city = c.toLowerCase();
            
//             if(cacheSet.add(city)){
//                 timer += 5;
//                 if(cache.size() >= cacheSize){
//                     String oldCity = cache.poll();
//                     cacheSet.remove(oldCity);
//                 }
//                 cache.add(city);
//             }else{
//                 timer += 1;
//             }
//         }
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        Queue<String> cache = new LinkedList<>();
        Set<String> cacheSet = new HashSet<>();
        int timer = 0;

        for (String city : cities) {
            String lowerCaseCity = city.toLowerCase();

            if (!cacheSet.contains(lowerCaseCity)) {
                timer += 5;
                if (cache.size() >= cacheSize) {
                    String oldestCity = cache.poll();
                    cacheSet.remove(oldestCity);
                }
                cache.add(lowerCaseCity);
                cacheSet.add(lowerCaseCity);
            } else {
                timer += 1;
                cache.remove(lowerCaseCity);
                cache.add(lowerCaseCity);
            }
        }
        return timer;
    }
}