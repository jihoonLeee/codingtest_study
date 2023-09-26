package lv3;



// 위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다. 아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다. 예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.

// 삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 거쳐간 숫자의 최댓값을 return 하도록 solution 함수를 완성하세요.

// 제한사항
// 삼각형의 높이는 1 이상 500 이하입니다.
// 삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수입니다.
// 입출력 예
// triangle	result
// [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]	30
// public interface DP_lv3 {
//     //정수 삼각형
// }


import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
 

        int depth = triangle.length;
        int[][] dp  = new int[depth][depth];
        
        dp[0][0]= triangle[0][0];
        int max = -1;
        for(int i =1 ; i<depth;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(i > 0 && j > 0){
                    if(dp[i-1][j] < dp[i-1][j-1]){
                       dp[i][j] = triangle[i][j]+ dp[i-1][j-1];
                    }else{
                       dp[i][j] = triangle[i][j]+ dp[i-1][j]; 
                    }
                }else{
                    dp[i][j] = triangle[i][j]+ dp[i-1][j];
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        
        return max;
        // 위 코드는 동적 계획법을 다시 공부하고 풀어본 결과
        

        
/*=================================================== */

               
        // 0 이면 0 또는 1
        // 1 이면 1 또는 2
        // 2 이면 2 또는 3
        // 양쪽중 큰거로만 가면
        // int depth = triangle.length;
//         int flag = 0;
//         for(int i = 0;i< depth-1;i++){
//             for(int j =0;j< triangle[i].length;j++){
//                 if(triangle[i+1][flag] <= triangle[i+1][flag+1]){
//                     flag = flag+1;
//                     next += triangle[i+1][flag];
//                     break;
//                 }else{
//                     flag = flag;
//                     next += triangle[i+1][flag];
//                     break;
//                 }

//             }
//         }
        // 위 코드는 양쪽중 무조건 큰 숫자로만 더하는 
        // 나의 아주짧은 생각을 보여준다.. 
/*=================================================== */


//         int depth = triangle.length;
//         int[] dp = new int[depth];
//         dp[0] = triangle[0][0];
//         int max = -1;

//         for (int i = 1; i < depth; i++) {
//             for (int j = i; j >= 0; j--) {
//                 if (j == 0) {
//                     dp[j] = triangle[i][j] + dp[j];
//                 } else if (j == i) {
//                     dp[j] = triangle[i][j] + dp[j - 1];
//                 } else {
//                     dp[j] = triangle[i][j] + Math.max(dp[j - 1], dp[j]);
//                 }
//                 max = Math.max(max, dp[j]);
//             }
//         }

        // return max;
//위 코드는 공간 복잡도를 줄인 코드
        /*=================================================== */
    }
}