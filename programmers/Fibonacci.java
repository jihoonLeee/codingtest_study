package algorithm.liam_Algorithm.programmers;

// Link :  https://school.programmers.co.kr/learn/courses/30/lessons/12945?itm_content=course14743
// 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

// 예를들어

// F(2) = F(0) + F(1) = 0 + 1 = 1
// F(3) = F(1) + F(2) = 1 + 1 = 2
// F(4) = F(2) + F(3) = 1 + 2 = 3
// F(5) = F(3) + F(4) = 2 + 3 = 5
// 와 같이 이어집니다.

// 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.

// 제한 사항
// n은 2 이상 100,000 이하인 자연수입니다.
public class Fibonacci{
    public static void main(String[] args) {
        System.out.println(solution(100000));
    }
    public static int solution(int n) {
        return fibo(n);
    }

    public static int fibo(int n){
      int fiboData[] = new int[n+1];
      fiboData[0] = 0;
      fiboData[1] = 1;
      for (int i=2; i<=n; i++){
        fiboData[i] = (fiboData[i - 1] + fiboData[i - 2])%1234567;
      }
        
      return fiboData[n];
    }


/** 처음 작성한 코드 **/
/*테스트 7번부터 에러가 떴다*/
/* 일부 언어는 재귀 호출을 하는 횟수에 제한이 있기때문에 for문을 통해 반복에 제한을 두어야한다.!!*/
    public int mysolution(int n) {
        return fibo(n);
    }
    public static int myfibo(int n){
      int fiboData[] = new int[n+1];
        
      if (n<=2) {
           return 1;
      }
      if (fiboData[n]==0){
        fiboData[n] = (fibo(n-1) + fibo(n-2))%1234567;
      }

      return fiboData[n];
    }
}
