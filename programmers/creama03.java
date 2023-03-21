
//크리마랩 코딩테스트
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // 주어진 배열
        int k = 9; // 주어진 임의의 숫자 k

        int maxLength = 0; // 가장 긴 하위 배열의 길이를 저장할 변수 초기화
        int sum = 0; // 하위 배열의 요소 합을 저장할 변수 초기화
        int start = 0; // 하위 배열의 시작 인덱스를 저장할 변수 초기화

        // 배열을 탐색하면서 하위 배열의 요소 합이 k보다 작거나 같을 때 가장 긴 하위 배열의 길이 구하기
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end]; // 하위 배열의 요소 합 갱신
            
            // 하위 배열의 요소 합이 k보다 크면 시작 인덱스를 오른쪽으로 이동시켜서 하위 배열의 요소 합을 줄임
            while (sum > k) {
                sum -= arr[start];
                start++;
            }

            // 현재까지의 가장 긴 하위 배열의 길이와 비교하여 더 큰 값을 저장
            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println("Max length of subarray: " + maxLength); // 결과 출력
    }
}
위 코드에서 arr 배열은 주어진 배열을 나타내며, k 변수는 주어진 임의의 숫자 k를 나타냅니다. maxLength 변수는 가장 긴 하위 배열의 길이를 저장할 변수이며, sum 변수는 현재까지 탐색한 하위 배열의 요소 합을 저장할 변수입니다. start 변수는 하위 배열의 시작 인덱스를 저장할 변수입니다.

배열을 탐색하면서 sum 변수를 업데이트하고, sum 변수가 k보다 크면 start 변수를 오른쪽으로 이동시켜서 하위 배열의 요소 합을 줄입니다. 이후 현재까지의 가장 긴 하위 배열의 길이와 비교하여 더 큰 값을 maxLength 변수에 저장합니다. 마지막으로 maxLength 변수의 값을 출력하여 가장 긴 하위 배열의 길이를 구할 수 있습니다.





