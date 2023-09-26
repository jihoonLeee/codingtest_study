// 가장 큰 수
import java.util.Arrays;
import java.util.Comparator;

public class quickSort_lv2 {
    public String solution(int[] numbers) {
        String answer = "";

        int len = numbers.length;
        String[] strNumbers = new String[len];

        for (int i = 0; i < len; i++) {
            strNumbers[i] = Integer.toString(numbers[i]);
        }

        // Arrays.sort(strNumbers, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return (o2 + o1).compareTo(o1 + o2);
        //     }
        // }); 
        /* ===================================================================================== */
         /*  라이브러리도 좋지만 직접 알고리즘을 구현해서 적합한 알고리즘이 무엇일지 생각해보도록 하자*/
         /*  =================================================================================== */
        quickSort(strNumbers);  

        if (strNumbers[0].equals("0")) {
            return "0";
        }

        for (int i = 0; i < len; i++) {
            answer += strNumbers[i];
        }

        return answer;
    }
    
    private void quickSort(String[] arr){
        quickSort(arr,0,arr.length-1);
    }
    private void quickSort(String[] arr,int start,int end){
        if(start>=end)return;
        int part = partition(arr,start,end);
        if(start < part - 1){
            quickSort(arr,start,part-1);
        }
        if(part < end){
            quickSort(arr,part,end);
        }
    }
    private int partition(String[] arr,int start,int end){
        String pivot= arr[(start+end)/2];
        while(start<=end){
            while(Integer.parseInt(arr[start]+pivot)>Integer.parseInt(pivot+arr[start]))start++;  // ex 10 , 3 일때 그냥 비교하면 당연히 10이 크니깐
            while(Integer.parseInt(arr[end]+pivot)<Integer.parseInt(pivot+arr[end]))end--;            // 두개를 합쳐서 각각 103인큰지 310이 큰지 비교
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }
    
    private void swap(String[] arr,int start,int end){
        String temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
