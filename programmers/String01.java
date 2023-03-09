package algorithm.liam_Algorithm.programmers;

// 문제 설명
// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

// 제한 사항
// s는 길이 1 이상, 길이 8 이하인 문자열입니다.
// s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
public class String01 {
    public boolean solution(String s) {
        int temp =0;
        int cnt = 0;
        int size =s.length();
        for(int i =0;i<size;i++){
            temp = (int) s.charAt(i);
            if(temp<=122&&temp>=65){
                cnt++;
            }
        }
        // 처음에 s의 길이가 4혹은6이라는 내용을 고려 안했어서 에러가 떴었다..!
        if(size!=4&&size!=6){
            return false;
        }
        
        if(cnt>0){
            return false;
        }else{
            return true;
        }
    }
    
}