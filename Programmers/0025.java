class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                arr[i] = arr[i+1];
            }
        }
//        arr = remove(arr, arr.length-1);
            
        if(arr.length == 0){
            answer[0] = -1;
        }else
            answer = arr;
        }

    return answer;
}}
